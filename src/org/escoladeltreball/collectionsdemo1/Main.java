/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author iaw46994355
 *
 */
public class Main {
	
	/**
	 * 
	 * @param list
	 * @param expressio
	 * @return llista dels elements que contenen l'expressió
	 */
	public static List<String> subLlista(List<String> list, String expressio) {
		List<String> rlist = new LinkedList<>();
		for (String element : list) {
			if ( element.startsWith(expressio) ) {
				rlist.add(element);
			}
		}
		return rlist;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list = new ArrayList(); // També List<String> list = new ArrayList<String>(); però és redundant
		List<String> list = new LinkedList<>(); // Les dues llistes, ArrayList i LinkedList, funcionen
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		list.add("Albacete");
		list.add("Alava");
		
		list.remove("Charlie");
		
		Collections.sort(list);
		
		for (String string: list) {
			System.out.println(string);
		}
		
		System.out.println("==== SUBLLISTA ====");
		System.out.println(subLlista(list,"al").toString());
	}

}
