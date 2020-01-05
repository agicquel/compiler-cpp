package esir.comp.cpp.generator.prettyprinter;

import com.google.inject.Binder;

import esir.comp.cpp.AbstractWhileDslRuntimeModule;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class PrettyPrinterRuntimeModule extends AbstractWhileDslRuntimeModule {
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<PrettyPrinterGenerator>bind(PrettyPrinterGenerator.class).to(PrettyPrinterGenerator.class);
  }
}
