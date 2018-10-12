package com.qa.Maventest;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Delegate> peeps = new ArrayList<>();
		Delegate d1 = new Delegate("Barry", 24, "Window cleaner", peeps);
		Delegate d2 = new Delegate("Bob", 24, "Performer", peeps);
		Delegate d3 = new Delegate("Bob", 24, "Performer", peeps);
		System.out.println(d2.equals(d3));
		System.out.println(peeps.stream().anyMatch(x -> x.getName().equals(d2.getName())));
		// d2.remove(peeps);
		// d2 = null;
		// System.gc();
		// System.out.println(d2.getName());
		peeps.stream().forEach(System.out::print);
	}

	public Delegate search(String name, List<Delegate> peeps) {

		return null;

	}

}