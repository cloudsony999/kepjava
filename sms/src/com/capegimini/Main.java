package com.capegimini;

import lombok.Data;

@Data
class Main {
	String name;

	public static void main(String... args) {
		// TODO Auto-generated method stub

		businness();
		Main m = new Main();
		m.setName("aaa");
		System.out.println(m.getName());

	}

	static void businness() {
		Teacher t1 = new Teacher();
		t1.setTname("amitava");
		t1.setSubject("eclipse");
		System.out.println(t1);
		Student s1 = new Student();
		s1.setName("sumit");
		s1.setRollno(1);
		Logic.takeClass(s1);
		Logic.giveClass(t1);

		System.out.println("-----------2nd approach-----------");
		Teacher tt1 = new Teacher("oracle", "vivek");
		System.out.println(tt1);
		Student ss1 = new Student("bina", 2);
		Logic.takeClass(ss1);
		Logic.giveClass(tt1);
	}

}
