package Fanxing7_23;

public interface List {

	//�������ĳ���
	public int size();
	
	
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty();
	
	
	//����Ԫ��
	public void add(int index,Object obj)throws Exception;
	
	//ɾ��Ԫ��
	public void delte(int index)throws Exception;
	
	//���ָ��Ԫ��
	public Object get(int index)throws Exception;
	
	
	
}
