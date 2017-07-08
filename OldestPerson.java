package com.technologyconversations.java8exercises.streams;

import java.util.Comparator;
import java.util.List;

public class OldestPerson {

//	public static Person getOldestPerson7(List<Person> people) {
//		Person oldestPerson = new Person("", 0);
//		for (Person person : people) {
//			if (person.getAge() > oldestPerson.getAge()) {
//				oldestPerson = person;
//			}
//		}
//		return oldestPerson;
//	}

	public static Person getOldestPerson(List<Person> people) {
//build a comparator first
//here are two working comparators, just use one of them:
//		Comparator <Person> comparator = (person1, person2) -> Integer.compare(person1.getAge(), person2.getAge());
		Comparator <Person> comparator = Comparator.comparing(Person::getAge);
//then perform the operation to get the oldest person
		return people.stream()
//				using the comparator each time through
					 .max(comparator)
//					 then get the max value of the comparator results
					 .get();
	
	
	
	
	
	
//	public static Person getOldestPerson(List<Person> people) {
//		return people.stream() // Convert collection to Stream
//				.max((a, b) -> {
//					int x = a.getAge();
//					int y = b.getAge();
//					if (x == y) {
//						return 0;
//					} else if (x < y) {
//						return -1;
//					} else {  // x > y
//						return +1;
//					}
//				}).get();

		// .max(Comparator.comparing(Person::getAge)) 
		// .get(); 

	}

}
