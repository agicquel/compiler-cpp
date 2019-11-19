package esir.comp.cpp.generator.prettyprinter

import esir.comp.cpp.AbstractWhileDslRuntimeModule
import com.google.inject.Binder

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class PrettyPrinterRuntimeModule extends AbstractWhileDslRuntimeModule {
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(PrettyPrinterGenerator).to(PrettyPrinterGenerator)
	}
	
}
