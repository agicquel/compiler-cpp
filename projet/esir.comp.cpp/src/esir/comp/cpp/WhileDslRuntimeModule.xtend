/*
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp

import esir.comp.cpp.generator.prettyprinter.PrettyPrinterGenerator

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class WhileDslRuntimeModule extends AbstractWhileDslRuntimeModule {
	
	override bindIGenerator2() {
		return PrettyPrinterGenerator;
	}
	
}
