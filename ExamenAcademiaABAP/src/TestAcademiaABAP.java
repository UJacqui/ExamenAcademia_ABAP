import java.util.HashMap;
import java.util.Map;

public class TestAcademiaABAP {

	public static void main(String[] args) {
		
		
		Map<Integer, String> lista1 = new HashMap();
		lista1.put(1,"A");
		lista1.put(2,"B");
		lista1.put(3,"C");
		lista1.put(4,"D");
		lista1.put(6,"G");
		
		Map<Integer, String> lista2 = new HashMap();
		lista2.put(1,"A");
		lista2.put(2,"B");
		lista2.put(3,"C");
		lista2.put(5,"E");
		lista2.put(6,"F");
		
		
	//1.	Listado de coincidencias.	
		
		Map<Integer, String> listaCoincidencias = new HashMap();
		
		 for (Map.Entry<Integer, String> entry1 : lista1.entrySet()) {
		      Integer key = entry1.getKey();                    
		      
		      if(lista2.containsKey(key)){
		          String value1 = entry1.getValue();
		          String value2 = lista2.get(key); 
		        System.out.println ("Se encontro similar key con valor : " + key); 
		        listaCoincidencias.put(key, value2);
		      }
		    }
		 
	 //2.Listado de elementos presentes en la Lista1 y faltantes de la Lista2.
		
		 Map<Integer, String> elementoslista1yNoEn2 = new HashMap();
			
		 for (Map.Entry<Integer, String> entry1 : lista1.entrySet()) {
		      Integer key = entry1.getKey();                    
		      
		      if(!lista2.containsKey(key)){
		          String value1 = entry1.getValue();
		          String value2 = lista2.get(key); 
	       System.out.println ("Elementos de la lista1 que no estan en la lista2 : " + key); 
		        elementoslista1yNoEn2.put(key, value2);
		      }
		    }
		 
	//3.Listado de elementos presentes en la Lista2 y faltantes de la Lista1
		 
		 Map<Integer, String> elementoslista2yNoEn1 = new HashMap();
			
		 for (Map.Entry<Integer, String> entry1 : lista2.entrySet()) {
		      Integer key = entry1.getKey();                    
		      
		      if(!lista1.containsKey(key)){
		          String value1 = entry1.getValue();
		          String value2 = lista1.get(key); 
	     System.out.println ("Elementos de la lista2 que no estan en la lista1 : " + key); 
		        elementoslista2yNoEn1.put(key, value2);
		      }
		    }
		 
	//4.Elementos en conflicto, es decir, elementos que existen en ambas listas, pero con distintos valores.
		 Map<Integer, String> conflictos = new HashMap();
			
		 for (Map.Entry<Integer, String> entry1 : lista2.entrySet()) {
		      Integer key = entry1.getKey();                    
		      String value = entry1.getValue();
		      
		      if(lista1.containsKey(key) && !lista1.containsValue(value)){
		          String value1 = entry1.getValue();
		          String value2 = lista1.get(key); 
	       System.out.println ("Elementos en ambas listas con distintos valores : " + key); 
		        conflictos.put(key, value2);
		      }
		    }
	}
}
