/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class WhileDslStandaloneSetup extends WhileDslStandaloneSetupGenerated {
  public static void doSetup() {
    new WhileDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
