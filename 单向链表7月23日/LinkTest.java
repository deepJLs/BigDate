package Fanxing7_23;

public class LinkTest {

	public static void main(String[] args) throws Exception {
		
		
		LinkList list=new LinkList();
		
		
		for(int i=0;i<10;i++) {
			
			list.add(i, "index"+i);
		}
		
		list.delte(3);
		
		System.out.println(list.get(3));
		
	}
}

