package com.capegimini;

class Logic {

	static void takeClass(Student s) {
		System.out.println(
				"the taecher will teach the student of roll no " + s.getRollno() + " and the name is " + s.getName());

	}

	static void giveClass(Teacher t) {
		System.out.println(
				"the student is taking class in the subject " + t.getSubject() + " and the teacher is " + t.getTname());
	}

}
