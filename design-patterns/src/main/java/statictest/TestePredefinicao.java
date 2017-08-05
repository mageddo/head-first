package statictest;

import java.util.ArrayList;
import java.util.List;

public class TestePredefinicao {
	
	private static List nomes = new ArrayList<String>();
	
	static{
		nomes.add("voce");
		
	}
	static{
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
		nomes.add("Ola mundo");
	}
	
	
	
	public TestePredefinicao() {
		System.out.println(nomes.get(1));
	}
}
