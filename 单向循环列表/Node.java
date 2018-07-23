package Fanxing7_23;
public class Node {

	Object data; //保存的数据
	
	Node next; //保存的指针
	
	
	//头节点的构造方法
	public Node(Node nextval) {
		
		this.next=nextval;
	}
	
	//非头节点的构造方法
	public Node(Object obj,Node nextval) {
		
		this.data=obj;
		
		this.next=nextval;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}

