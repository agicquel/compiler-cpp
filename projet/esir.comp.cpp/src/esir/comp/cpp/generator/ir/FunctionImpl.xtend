package esir.comp.cpp.generator.ir

import java.util.ArrayList
import esir.comp.cpp.whileDsl.Function

@Data
class FunctionImpl {
	Env env
	ArrayList<Quad> quads
	ArrayList<Quad> inputs
	ArrayList<Quad> outputs
	Function function
	
	override String toString() {
		var res = "Function : " + function.functionName
		res += "\nEnv : I" + env.inputCounter + " | O" + env.outputCounter + " | L" + env.labelCounter
		res += " | V" + env.variableCounter + " | S" + env.symbolCounter
		res += "\nCode : \n"
		for(quad : quads) {
			res += "\t" + quad.toString() + "\n"
		}
		
		return res
	}
}

