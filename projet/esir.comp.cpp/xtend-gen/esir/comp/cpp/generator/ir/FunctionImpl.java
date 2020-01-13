package esir.comp.cpp.generator.ir;

import esir.comp.cpp.generator.ir.Env;
import esir.comp.cpp.generator.ir.Quad;
import esir.comp.cpp.whileDsl.Function;
import java.util.ArrayList;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;

@Data
@SuppressWarnings("all")
public class FunctionImpl {
  private final Env _env;
  
  private final ArrayList<Quad> _quads;
  
  private final ArrayList<Quad> _inputs;
  
  private final ArrayList<Quad> _outputs;
  
  private final String _functionName;
  
  private final Function _function;
  
  @Override
  public String toString() {
    String _functionName = this.getFunctionName();
    String res = ("Function : " + _functionName);
    String _res = res;
    int _inputCounter = this.getEnv().getInputCounter();
    String _plus = ("\nEnv : I" + Integer.valueOf(_inputCounter));
    String _plus_1 = (_plus + " | O");
    int _outputCounter = this.getEnv().getOutputCounter();
    String _plus_2 = (_plus_1 + Integer.valueOf(_outputCounter));
    String _plus_3 = (_plus_2 + " | L");
    int _labelCounter = this.getEnv().getLabelCounter();
    String _plus_4 = (_plus_3 + Integer.valueOf(_labelCounter));
    res = (_res + _plus_4);
    String _res_1 = res;
    int _variableCounter = this.getEnv().getVariableCounter();
    String _plus_5 = (" | V" + Integer.valueOf(_variableCounter));
    String _plus_6 = (_plus_5 + " | S");
    int _symbolCounter = this.getEnv().getSymbolCounter();
    String _plus_7 = (_plus_6 + Integer.valueOf(_symbolCounter));
    res = (_res_1 + _plus_7);
    String _res_2 = res;
    res = (_res_2 + "\nCode : \n");
    ArrayList<Quad> _quads = this.getQuads();
    for (final Quad quad : _quads) {
      String _res_3 = res;
      String _string = quad.toString();
      String _plus_8 = ("\t" + _string);
      String _plus_9 = (_plus_8 + "\n");
      res = (_res_3 + _plus_9);
    }
    return res;
  }
  
  public FunctionImpl(final Env env, final ArrayList<Quad> quads, final ArrayList<Quad> inputs, final ArrayList<Quad> outputs, final String functionName, final Function function) {
    super();
    this._env = env;
    this._quads = quads;
    this._inputs = inputs;
    this._outputs = outputs;
    this._functionName = functionName;
    this._function = function;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._env== null) ? 0 : this._env.hashCode());
    result = prime * result + ((this._quads== null) ? 0 : this._quads.hashCode());
    result = prime * result + ((this._inputs== null) ? 0 : this._inputs.hashCode());
    result = prime * result + ((this._outputs== null) ? 0 : this._outputs.hashCode());
    result = prime * result + ((this._functionName== null) ? 0 : this._functionName.hashCode());
    return prime * result + ((this._function== null) ? 0 : this._function.hashCode());
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
    FunctionImpl other = (FunctionImpl) obj;
    if (this._env == null) {
      if (other._env != null)
        return false;
    } else if (!this._env.equals(other._env))
      return false;
    if (this._quads == null) {
      if (other._quads != null)
        return false;
    } else if (!this._quads.equals(other._quads))
      return false;
    if (this._inputs == null) {
      if (other._inputs != null)
        return false;
    } else if (!this._inputs.equals(other._inputs))
      return false;
    if (this._outputs == null) {
      if (other._outputs != null)
        return false;
    } else if (!this._outputs.equals(other._outputs))
      return false;
    if (this._functionName == null) {
      if (other._functionName != null)
        return false;
    } else if (!this._functionName.equals(other._functionName))
      return false;
    if (this._function == null) {
      if (other._function != null)
        return false;
    } else if (!this._function.equals(other._function))
      return false;
    return true;
  }
  
  @Pure
  public Env getEnv() {
    return this._env;
  }
  
  @Pure
  public ArrayList<Quad> getQuads() {
    return this._quads;
  }
  
  @Pure
  public ArrayList<Quad> getInputs() {
    return this._inputs;
  }
  
  @Pure
  public ArrayList<Quad> getOutputs() {
    return this._outputs;
  }
  
  @Pure
  public String getFunctionName() {
    return this._functionName;
  }
  
  @Pure
  public Function getFunction() {
    return this._function;
  }
}
