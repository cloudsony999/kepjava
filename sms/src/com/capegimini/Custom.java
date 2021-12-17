package com.capegimini;

import static java.lang.System.out;

record Custom(int id, String name) {
	public static void main(String... args) {
		Custom s = new Custom(11, "amitava");
		out.println(s.id() + "   " + s.name());
	}

}
