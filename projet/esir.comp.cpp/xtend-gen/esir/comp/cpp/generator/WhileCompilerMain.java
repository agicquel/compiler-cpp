package esir.comp.cpp.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import esir.comp.cpp.WhileDslStandaloneSetup;
import esir.comp.cpp.generator.WhileCompilerGenerator;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class WhileCompilerMain {
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private WhileCompilerGenerator generator;
  
  @Inject
  private JavaIoFileSystemAccess fileAccess;
  
  public static void main(final String[] args) {
    boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
    if (_isEmpty) {
      System.err.println("No source file provided!");
      return;
    }
    final Injector injector = new WhileDslStandaloneSetup().createInjectorAndDoEMFRegistration();
    final WhileCompilerMain main = injector.<WhileCompilerMain>getInstance(WhileCompilerMain.class);
    main.runGenerator(args[0], (args[0]).replace(".wh", ".cpp"));
  }
  
  protected void runGenerator(final String intput, final String output) {
    final ResourceSet set = this.resourceSetProvider.get();
    final Resource resource = set.getResource(URI.createFileURI(intput), true);
    final List<Issue> issues = this.validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
    boolean _isEmpty = issues.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      InputOutput.<String>println("Erreur : Le fichier source est invalide.");
      final Consumer<Issue> _function = (Issue it) -> {
        System.err.println(("\t" + it));
      };
      issues.forEach(_function);
      return;
    }
    this.fileAccess.setOutputPath("./");
    GeneratorContext _generatorContext = new GeneratorContext();
    final Procedure1<GeneratorContext> _function_1 = (GeneratorContext it) -> {
      it.setCancelIndicator(CancelIndicator.NullImpl);
    };
    final GeneratorContext context = ObjectExtensions.<GeneratorContext>operator_doubleArrow(_generatorContext, _function_1);
    this.generator.setOutputFile(output);
    InputOutput.<String>println("Compilation...");
    this.generator.doGenerate(resource, this.fileAccess, context);
    InputOutput.<String>println("Compilation exécuté avec succès.");
  }
}
