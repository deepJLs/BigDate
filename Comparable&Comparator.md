排序比较 

Compareable  comparator  

#Comparable 接口

接口代表一种标准 或者约定 Comparable接口进行对象的排序，如果一个类想要进行排序就必须实现这个接口
    package org.wubo.test;

	import java.util.Arrays;
	
	class Person implements Comparable{

	
	private int age;
	
	private String name;
	
	public Person(String name,int age) {
		
		this.name=name;
		
		this.age=age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}



	@Override
	public int compareTo(Object o) {  //该方法只需要反回3个值 0 -1  1 
		// TODO Auto-generated method stub
		Person p=null;
		if(o instanceof Person) {
			
			p=(Person)o;
		}
		
		if(this.age>p.age) {
			
			return 1;
		}else if(this.age<p.age) {
			
			return -1;
		}
		
		return 0;
	}
	
	
	}
	
	public class CompareTest {
		
	public static void main(String[] args) {
		
		Person per[]=new Person[] {new Person("张三",60),new Person("李四",70),new Person("隔壁薛哲",18)};
		Arrays.sort(per);
		
		
	    System.out.println(Arrays.toString(per));
	}
	}


#Comparator

如果一个类已经编写完成，但是在设计之初没有考虑到排序的情况，但是这个类已经编写好了，不太方便进行再次修改，又想完成排序的功能
    package org.wubo.test;

	import java.util.Arrays;
	import java.util.Comparator;
	
	class Person{

	
	private int age;
	
	private String name;
	
	public Person(String name,int age) {
		
		this.name=name;
		
		this.age=age;
	}
	
	
	
	
	
	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	
	
	}
	
	class PersonCompare implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Person p1=null,p2=null;
		if(o1 instanceof Person && o2 instanceof Person) {
			
			p1=(Person)o1;
			
			p2=(Person)o2;
		}
		
		if(p1.getAge()>p2.getAge()) {
			
			return 1;
		}else if(p1.getAge()<p2.getAge()) {
			
			return -1;
		}
		
		return 0;
	}
	
	
	}
	
	public class CompareTest {
	
	public static void main(String[] args) {
		
		Person per[]=new Person[] {new Person("张三",60),new Person("李四",70),new Person("隔壁薛哲",18)};
		Arrays.sort(per,new PersonCompare());
		
		System.out.println(Arrays.toString(per));
		
	}
	}


