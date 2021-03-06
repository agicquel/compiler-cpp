/*
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import esir.comp.cpp.WhileDslStandaloneSetup
import esir.comp.cpp.WhileDslRuntimeModule

/**
 * Initialization support for running Xtext languages as language servers.
 */
class WhileDslIdeSetup extends WhileDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new WhileDslRuntimeModule, new WhileDslIdeModule))
	}
	
}
