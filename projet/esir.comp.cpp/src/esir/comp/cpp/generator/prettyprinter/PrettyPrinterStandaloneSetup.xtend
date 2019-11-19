package esir.comp.cpp.generator.prettyprinter

import esir.comp.cpp.WhileDslStandaloneSetupGenerated

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PrettyPrinterStandaloneSetup extends WhileDslStandaloneSetupGenerated {

	def static void doSetup() {
		new PrettyPrinterStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
