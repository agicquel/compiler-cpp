package esir.comp.cpp.generator
import esir.comp.cpp.AbstractWhileDslRuntimeModule
import com.google.inject.Binder

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class WhileCompilerRuntimeModule extends AbstractWhileDslRuntimeModule {
	
	override configure(Binder binder) {
		super.configure(binder)
		binder.bind(WhileCompilerGenerator).to(WhileCompilerGenerator)
	}
	
}
