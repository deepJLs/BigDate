package Fanxing7_23;

public interface List {

	//获得链表的长度
	public int size();
	
	
	//判断链表是否为空
	public boolean isEmpty();
	
	
	//增加元素
	public void add(int index,Object obj)throws Exception;
	
	//删除元素
	public void delte(int index)throws Exception;
	
	//获得指定元素
	public Object get(int index)throws Exception;
	
	
	
}
