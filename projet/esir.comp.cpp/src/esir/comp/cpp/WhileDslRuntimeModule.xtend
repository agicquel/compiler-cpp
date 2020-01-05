package esir.comp.cpp

import esir.comp.cpp.generator.WhileDslGenerator

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class WhileDslRuntimeModule extends AbstractWhileDslRuntimeModule {
	
	override bindIGenerator2() {
		return WhileDslGenerator
	}
	
}
