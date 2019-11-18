package esir.comp.cpp.generator.prettyprinter

import org.eclipse.xtend.lib.annotations.Data;

@Data class PrettyPrinterGeneratorParameters {
	String indentationWhile;
	String indentationFor;
	String indentationIf;
	String indentationForEach;
}