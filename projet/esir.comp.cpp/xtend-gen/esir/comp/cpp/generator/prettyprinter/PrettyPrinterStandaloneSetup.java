package esir.comp.cpp.generator.prettyprinter;

import esir.comp.cpp.WhileDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PrettyPrinterStandaloneSetup extends WhileDslStandaloneSetupGenerated {
  public static void doSetup() {
    new PrettyPrinterStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
