package esir.comp.cpp.generator.ir

import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors

class IR {
	@Accessors String place
	@Accessors ArrayList<Quad> code
	
	new(String place, Quad code) {
		this.place = place
		this.code = newArrayList()
		this.code.add(code)
	}
	
	new(String place, ArrayList<Quad> code) {
		this.place = place
		this.code = code
	}
	
	new() {
		this.place = ""
		this.code = newArrayList()
	}
	
	override String toString() {
		var res = "\nplace = " + place + " | code : \n"
		for(Quad q : code) {
			res += "\t" + q.toString() + "\n"
		}
		return res 
	}
	
}