package esir.comp.cpp.generator.ir

import java.util.ArrayList
import esir.comp.cpp.whileDsl.Function

@Data
class FunctionImpl {
	Env env
	ArrayList<Quad> quads
	String functionName
	Function function
	
	override String toString() {
		var res = "Function : " + functionName
		res += "\nEnv : I" + env.inputCounter + " | O" + env.outputCounter
		res += " | L" + env.labelCounter + " | V" + env.variableCounter
		res += "\nCode : \n"
		for(quad : quads) {
			res += "\t" + quad.toString() + "\n"
		}
		
		return res
	}
}

