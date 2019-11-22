package esir.comp.cpp.generator.prettyprinter;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import esir.comp.cpp.generator.prettyprinter.PrettyPrinterGenerator;
import esir.comp.cpp.generator.prettyprinter.PrettyPrinterGeneratorParameters;
import esir.comp.cpp.generator.prettyprinter.PrettyPrinterStandaloneSetup;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
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
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class PrettyPrinterMain {
  private static final String HELP_FILE_LOCATION = "help_whpp.txt";
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Inject
  private IResourceValidator validator;
  
  @Inject
  private PrettyPrinterGenerator generator;
  
  @Inject
  private JavaIoFileSystemAccess fileAccess;
  
  public static void main(final String[] args) {
    try {
      boolean _contains = ((List<String>)Conversions.doWrapArray(args)).contains("-help");
      if (_contains) {
        InputStream is = PrettyPrinterMain.class.getResourceAsStream(PrettyPrinterMain.HELP_FILE_LOCATION);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader buf = new BufferedReader(isr);
        String line = buf.readLine();
        while ((line != null)) {
          {
            InputOutput.<String>println(line);
            line = buf.readLine();
          }
        }
      } else {
        boolean _isEmpty = ((List<String>)Conversions.doWrapArray(args)).isEmpty();
        if (_isEmpty) {
          InputOutput.<String>println("Erreur : Aucun fichier source en paramètre.");
        } else {
          String indentationWhile = "  ";
          String indentationFor = "  ";
          String indentationIf = "  ";
          String indentationForEach = "  ";
          String indentationFunction = "  ";
          String outputFile = "";
          try {
            outputFile = PrettyPrinterMain.generateDefaultOutputFile(args[0]);
            boolean _contains_1 = ((List<String>)Conversions.doWrapArray(args)).contains("-all");
            if (_contains_1) {
              int _indexOf = ((List<String>)Conversions.doWrapArray(args)).indexOf("-all");
              final int allValIndex = (_indexOf + 1);
              indentationWhile = (indentationFor = (indentationIf = (indentationForEach = (indentationFunction = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[allValIndex]))))));
            }
            for (int i = 0; (i < args.length); i++) {
              String _get = args[i];
              if (_get != null) {
                switch (_get) {
                  case "-while":
                    indentationWhile = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[(i + 1)]));
                    break;
                  case "-for":
                    indentationFor = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[(i + 1)]));
                    break;
                  case "-if":
                    indentationIf = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[(i + 1)]));
                    break;
                  case "-foreach":
                    indentationForEach = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[(i + 1)]));
                    break;
                  case "-function":
                    indentationFunction = PrettyPrinterMain.convertParamToSpace(Integer.parseInt(args[(i + 1)]));
                    break;
                  case "-o":
                    outputFile = args[(i + 1)];
                    break;
                }
              }
            }
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              InputOutput.<String>println("Erreur : Les paramètres saisis sont incorrects.");
              InputOutput.<String>println("Essayer -help pour davanatage d\'informations.");
              return;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          final PrettyPrinterGeneratorParameters generatorParameters = new PrettyPrinterGeneratorParameters(indentationWhile, indentationFor, indentationIf, indentationForEach, indentationFunction);
          final Injector injector = new PrettyPrinterStandaloneSetup().createInjectorAndDoEMFRegistration();
          final PrettyPrinterMain main = injector.<PrettyPrinterMain>getInstance(PrettyPrinterMain.class);
          main.runGenerator(args[0], outputFile, generatorParameters);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static String convertParamToSpace(final int count) {
    return PrettyPrinterMain.convertParamToSpace(count, "");
  }
  
  public static String convertParamToSpace(final int count, final String param) {
    if ((count <= 0)) {
      return param;
    } else {
      return PrettyPrinterMain.convertParamToSpace((count - 1), (param + " "));
    }
  }
  
  public static String generateDefaultOutputFile(final String nameFile) {
    String newName = nameFile;
    while (newName.contains("/")) {
      int _indexOf = newName.indexOf("/");
      int _plus = (_indexOf + 1);
      newName = newName.substring(_plus, newName.length());
    }
    return (newName + "pp");
  }
  
  protected void runGenerator(final String intput, final String output, final PrettyPrinterGeneratorParameters params) {
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
    this.generator.setParameters(params);
    InputOutput.<String>println("Formatage en cours...");
    this.generator.doGenerate(resource, this.fileAccess, context);
    InputOutput.<String>println("Formatage exécuté avec succès.");
  }
}
