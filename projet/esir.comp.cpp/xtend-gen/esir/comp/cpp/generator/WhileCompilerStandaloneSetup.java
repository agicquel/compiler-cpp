package esir.comp.cpp.generator;

import esir.comp.cpp.WhileDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class WhileCompilerStandaloneSetup extends WhileDslStandaloneSetupGenerated {
  public static void doSetup() {
    new WhileCompilerStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
