package esir.comp.cpp.generator

import esir.comp.cpp.WhileDslStandaloneSetupGenerated

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class WhileCompilerStandaloneSetup extends WhileDslStandaloneSetupGenerated {

	def static void doSetup() {
		new WhileCompilerStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
