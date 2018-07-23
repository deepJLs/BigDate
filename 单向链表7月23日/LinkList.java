package Fanxing7_23;

public class LinkList implements List{

	
	Node head; //ͷָ��
	
	Node current; //��ǰ�ڵ�
	
	int size; //�ڵ�ĸ���
	
	//��ʼ��������
	
	public LinkList() {
		
		//��ʼ��
		this.head=current=new Node(null);
		this.size=0;
	}
	
	
	//��λ����������ʵ�ֲ��ݵ�ǰ����
	
	public void index(int index)throws Exception{
		
		if(index<-1||index>size-1) {
			
			throw new Exception("��������");
		}
		
		if(index==-1) {
			
			return  ;
		}
		// ��ǰ�ڵ����һ���ڵ�
		current=head.next;
		
		int j=0;
		
		while(current!=null&&j<index) {
			
			current=current.next;
			j++;
		}
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size==0;
	}

	@Override
	public void add(int index, Object obj)throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>size) {
			
			throw new Exception("��������");
		}
		//����֮ǰ�ȶ�λ�ҵ���ǰ�ڵ�
		index(index-1);  //�ҵ���ǰ�ڵ��ǰһ���ڵ�
		
		// 1 3 4  5  6
		current.setNext(new Node(obj,current.next));
		
		size++;
	}

	@Override
	public void delte(int index)throws Exception {
		// TODO Auto-generated method stub
		
		if(this.isEmpty()) {
			
			throw new Exception("������");
		}
		
		if(index<0||index>size) {
			
			throw new Exception("��������ȷ");
		}
		
		//ɾ��֮ǰҪ��λ�ڵ�
		index(index-1); //��λǰһ���ڵ�
		
		current.setNext(current.next.next);
		
		size--;
		
	}

	@Override
	public Object get(int index)throws Exception {
		// TODO Auto-generated method stub
		if(index<-1||index>size-1) {
			
			throw new Exception("��������");
		}
		
		//�ҵ���ǰ�ڵ�
		index(index);
		
		return current.getData();
	}

	
}

