package esir.comp.cpp.generator

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import esir.comp.cpp.WhileDslStandaloneSetup

class WhileCompilerMain {
	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject IResourceValidator validator
	@Inject WhileCompilerGenerator generator
	@Inject JavaIoFileSystemAccess fileAccess

	def static main(String[] args) {
		if (args.empty) {
			System::err.println('No source file provided!')
			return
		}
		val injector = new WhileDslStandaloneSetup().createInjectorAndDoEMFRegistration
		val main = injector.getInstance(WhileCompilerMain)
		main.runGenerator(args.get(0), args.get(0).replace(".wh", ".cpp"))
	}

	def protected runGenerator(String intput, String output) {
		// Load the resource
		val set = resourceSetProvider.get
		val resource = set.getResource(URI.createFileURI(intput), true)

		// Validate the resource
		val issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl)
		if (!issues.empty) {
			println("Erreur : Le fichier source est invalide.")
			issues.forEach[System.err.println("\t" + it)]
			return
		}

		// Configure and start the generator
		fileAccess.outputPath = './'
		val context = new GeneratorContext => [
			cancelIndicator = CancelIndicator.NullImpl
		]
		generator.outputFile = output
		
		println('Compilation...')
		generator.doGenerate(resource, fileAccess, context)
		println('Compilation exécuté avec succès.')
	}
}
