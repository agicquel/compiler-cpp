/*
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WhileDslStandaloneSetup extends WhileDslStandaloneSetupGenerated {

	def static void doSetup() {
		new WhileDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
