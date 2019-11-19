package esir.comp.cpp.generator.prettyprinter;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class PrettyPrinterGeneratorParameters {
  private final String indentationWhile;
  
  private final String indentationFor;
  
  private final String indentationIf;
  
  private final String indentationForEach;
  
  private final String indentationFunction;
  
  public PrettyPrinterGeneratorParameters(final String indentationWhile, final String indentationFor, final String indentationIf, final String indentationForEach, final String indentationFunction) {
    super();
    this.indentationWhile = indentationWhile;
    this.indentationFor = indentationFor;
    this.indentationIf = indentationIf;
    this.indentationForEach = indentationForEach;
    this.indentationFunction = indentationFunction;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.indentationWhile== null) ? 0 : this.indentationWhile.hashCode());
    result = prime * result + ((this.indentationFor== null) ? 0 : this.indentationFor.hashCode());
    result = prime * result + ((this.indentationIf== null) ? 0 : this.indentationIf.hashCode());
    result = prime * result + ((this.indentationForEach== null) ? 0 : this.indentationForEach.hashCode());
    return prime * result + ((this.indentationFunction== null) ? 0 : this.indentationFunction.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    PrettyPrinterGeneratorParameters other = (PrettyPrinterGeneratorParameters) obj;
    if (this.indentationWhile == null) {
      if (other.indentationWhile != null)
        return false;
    } else if (!this.indentationWhile.equals(other.indentationWhile))
      return false;
    if (this.indentationFor == null) {
      if (other.indentationFor != null)
        return false;
    } else if (!this.indentationFor.equals(other.indentationFor))
      return false;
    if (this.indentationIf == null) {
      if (other.indentationIf != null)
        return false;
    } else if (!this.indentationIf.equals(other.indentationIf))
      return false;
    if (this.indentationForEach == null) {
      if (other.indentationForEach != null)
        return false;
    } else if (!this.indentationForEach.equals(other.indentationForEach))
      return false;
    if (this.indentationFunction == null) {
      if (other.indentationFunction != null)
        return false;
    } else if (!this.indentationFunction.equals(other.indentationFunction))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("indentationWhile", this.indentationWhile);
    b.add("indentationFor", this.indentationFor);
    b.add("indentationIf", this.indentationIf);
    b.add("indentationForEach", this.indentationForEach);
    b.add("indentationFunction", this.indentationFunction);
    return b.toString();
  }
  
  @Pure
  public String getIndentationWhile() {
    return this.indentationWhile;
  }
  
  @Pure
  public String getIndentationFor() {
    return this.indentationFor;
  }
  
  @Pure
  public String getIndentationIf() {
    return this.indentationIf;
  }
  
  @Pure
  public String getIndentationForEach() {
    return this.indentationForEach;
  }
  
  @Pure
  public String getIndentationFunction() {
    return this.indentationFunction;
  }
}
