package Fanxing7_23;
public class Node {

	Object data; //���������
	
	Node next; //�����ָ��
	
	
	//ͷ�ڵ�Ĺ��췽��
	public Node(Node nextval) {
		
		this.next=nextval;
	}
	
	//��ͷ�ڵ�Ĺ��췽��
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

