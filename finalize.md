
	package packaged;
	
	public class Gc {
	public static void main(String[] args) {
		Person person =new Person();
		person=null;
		System.gc();
	}


	}
	class Person{
	public Person() {
		
		
		System.out.println("出生了 地动山摇 满天乌云 代表妖孽出生了");
	}

	@Override
	public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("我真的还想在活500年");
	}
	}

