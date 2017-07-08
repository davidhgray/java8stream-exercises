package com.technologyconversations.java8exercises.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Kids {

//    public static Set<String> getKidNames7(List<Person> people) {
//        Set<String> kids = new HashSet<String>();
//        for (Person person : people) {
//            if (person.getAge() < 18) {
//                kids.add(person.getName());
//            }
//        }
//        return kids;
//    }
//
	
	public static Set<String> getKidNames(List<Person> people) {
		return people.stream()
//				filter by age
					 .filter(person -> person.getAge() < 18)
//					 once filtered, retrieve person name using one of these MAP operations
//					 .map(Person::getName)
					 .map(x -> x.getName())
//					 pass person's name to new collection
					 .collect(Collectors.toSet())
					 ;
	}
	
	
	
	
//	
//    public static Set<String> getKidNames(List<Person> people) {
//        return people.stream().filter((person) -> person.getAge() < 18)
//        		.map(Person::getName)
//        		.collect(toSet());
//    }
//
}
