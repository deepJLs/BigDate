package Fanxing7_23;

public class LinkList implements List{

	
	Node head; //头指针
	
	Node current; //当前节点
	
	int size; //节点的个数
	
	//初始化空链表
	
	public LinkList() {
		
		//初始化
		this.head=current=new Node(null);
		this.size=0;
	}
	
	
	//定位操作函数，实现操纵当前对象
	
	public void index(int index)throws Exception{
		
		if(index<-1||index>size-1) {
			
			throw new Exception("参数错误");
		}
		
		if(index==-1) {
			
			return  ;
		}
		// 当前节点的下一个节点
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
			
			throw new Exception("参数错误");
		}
		//增加之前先定位找到当前节点
		index(index-1);  //找到当前节点的前一个节点
		
		// 1 3 4  5  6
		current.setNext(new Node(obj,current.next));
		
		size++;
	}

	@Override
	public void delte(int index)throws Exception {
		// TODO Auto-generated method stub
		
		if(this.isEmpty()) {
			
			throw new Exception("空链表");
		}
		
		if(index<0||index>size) {
			
			throw new Exception("参数不正确");
		}
		
		//删除之前要定位节点
		index(index-1); //定位前一个节点
		
		current.setNext(current.next.next);
		
		size--;
		
	}

	@Override
	public Object get(int index)throws Exception {
		// TODO Auto-generated method stub
		if(index<-1||index>size-1) {
			
			throw new Exception("参数错误");
		}
		
		//找到当前节点
		index(index);
		
		return current.getData();
	}

	
}

