import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashonExample {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		// TODO Auto-generated method stub

		  ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
	      ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
	      engine.eval(new FileReader("C://Users//Admin//Desktop//Sumit//Day3//WebContent//WEB-INF//sample.js"));
	      
	      
	      Invocable invocable = (Invocable) engine;
	      Object response= invocable.invokeFunction("func1", "sumit");
	      System.out.println("Response is "+response);
		
	}

}
