package esir.comp.cpp.generator.prettyprinter

import com.google.inject.Inject
import com.google.inject.Provider
import java.io.BufferedReader
import java.io.File
import java.io.FileInputStream
import java.io.InputStreamReader
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.GeneratorContext
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator

class PrettyPrinterMain {

	@Inject Provider<ResourceSet> resourceSetProvider
	@Inject IResourceValidator validator
	@Inject PrettyPrinterGenerator generator
	@Inject JavaIoFileSystemAccess fileAccess
	
	def static main(String[] args) {
		if(args.contains("-help")) {
			println("Affiche de l'aide ici...")
			var fileHelp = new File("../help.txt");
			var buf = new BufferedReader(new InputStreamReader(new FileInputStream(fileHelp), "UTF-8"));
			var line = buf.readLine();
			while(line != null) {
				System.out.println(line);
				line = buf.readLine();
			}
			return
		}
		else if (args.empty) {
			println("Erreur : Aucun fichier source en paramètre.")
			return
		}
		else {
				var indentationWhile = "  "
				var indentationFor = "  "
				var indentationIf = "  "
				var indentationForEach = "  "
				var indentationFunction = "  "
				var outputFile = ""
				try {
					outputFile = generateDefaultOutputFile(args.get(0)) 
					
					if(args.contains("-all")) {
						val allValIndex = args.indexOf("-all") + 1
						indentationWhile = 
							indentationFor = 
							indentationIf = 
							indentationForEach = 
							indentationFunction = convertParamToSpace(Integer::parseInt(args.get(allValIndex)))
					}
					
					for(var i = 0; i < args.length; i++) {
						switch args.get(i) {
							case "-while" : indentationWhile = convertParamToSpace(Integer::parseInt(args.get(i + 1)))
							case "-for" : indentationFor = convertParamToSpace(Integer::parseInt(args.get(i + 1)))
							case "-if" : indentationIf = convertParamToSpace(Integer::parseInt(args.get(i + 1)))
							case "-foreach" : indentationForEach = convertParamToSpace(Integer::parseInt(args.get(i + 1)))
							case "-function" : indentationFunction = convertParamToSpace(Integer::parseInt(args.get(i + 1)))
							case "-o" : outputFile = args.get(i + 1)
						}
					}
				} catch(Exception err) {
					println("Erreur : Les paramètres saisis sont incorrects.")
					println("Essayer -help pour davanatage d'informations.")
					return
				}
				
				val generatorParameters = new PrettyPrinterGeneratorParameters(indentationWhile, indentationFor, indentationIf, indentationForEach, indentationFunction)
				val injector = new PrettyPrinterStandaloneSetup().createInjectorAndDoEMFRegistration
				val main = injector.getInstance(PrettyPrinterMain)
				main.runGenerator(args.get(0), outputFile, generatorParameters)
		}
	}
	
	def static String convertParamToSpace(int count) {
		return convertParamToSpace(count, "")
	}
	
	def static String convertParamToSpace(int count, String param) {
		if(count <= 0) {
			return param
		}
		else {
			return convertParamToSpace(count - 1, param + " ")
		}
	}
	
	def static String generateDefaultOutputFile(String nameFile) {
		var newName = nameFile
		while(newName.contains('/'))
			newName = newName.substring(newName.indexOf('/') + 1, newName.length)
		return newName + "pp"
	}

	def protected runGenerator(String intput, String output, PrettyPrinterGeneratorParameters params) {
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
		generator.parameters = params
		
		println('Formatage en cours...')
		generator.doGenerate(resource, fileAccess, context)
		println('Formatage exécuté avec succès.')
	}
}
