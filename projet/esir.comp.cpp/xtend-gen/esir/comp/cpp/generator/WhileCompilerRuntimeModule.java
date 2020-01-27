package esir.comp.cpp.generator;

import com.google.inject.Binder;
import esir.comp.cpp.AbstractWhileDslRuntimeModule;
import esir.comp.cpp.generator.WhileCompilerGenerator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class WhileCompilerRuntimeModule extends AbstractWhileDslRuntimeModule {
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<WhileCompilerGenerator>bind(WhileCompilerGenerator.class).to(WhileCompilerGenerator.class);
  }
}
