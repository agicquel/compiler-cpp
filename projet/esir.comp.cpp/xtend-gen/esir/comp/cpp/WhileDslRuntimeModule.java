package esir.comp.cpp;

import esir.comp.cpp.AbstractWhileDslRuntimeModule;
import esir.comp.cpp.generator.WhileDslGenerator;
import org.eclipse.xtext.generator.IGenerator2;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class WhileDslRuntimeModule extends AbstractWhileDslRuntimeModule {
  @Override
  public Class<? extends IGenerator2> bindIGenerator2() {
    return WhileDslGenerator.class;
  }
}
