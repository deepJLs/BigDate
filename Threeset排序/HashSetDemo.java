package Threeset排序;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


class Person implements Comparable<Person>{
	
	private String name;
	
	private int age;
	
	
	public Person(String name, int age) {
		
		this.name=name;
		
		this.age=age;
	}
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		if(this.age>o.age) {
			
			return 1;
		}else if(this.age<o.age) {
			
			return -1;
		}else {
			
			return this.name.compareTo(o.name);
		}
		
		
	}
	
}

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		
		Set<Person> all=new TreeSet<>();
		
		all.add(new Person("张三",20));
		
		all.add(new Person("李四",10));
		
		all.add(new Person("薛哲",78));
		
		all.add(new Person("李哲",18)); 
		
		all.forEach((per)->{
			
			System.out.println(per);
		});
	}

}

