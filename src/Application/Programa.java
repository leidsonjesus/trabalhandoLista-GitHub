package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------remove DA LISTA TODA PALAVRA INICIADA COM  M POSIÇÃO ZERO-----------1");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
				System.out.println(x);
		}
		
		System.out.println("---------BUSCA NA LISTA UMA VARIAVEL 0U INDEX------------2");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------fILTRA DA LISTA TODA PALAVRA INICIADA COM  A POSIÇÃO ZERO--------------3");		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		 	for (String x : result) {
		 		System.out.println(x);
		 	}
		 	
		System.out.println("-----bUSCA A PRIMEIRA PALAVRA NA LISTA INICIADO COM A, SENÃO ENCONTRAR RETORNA NULL----------------4");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		}
}

	