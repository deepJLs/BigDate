package ���Ĵ���С��Ϸ;

import Fanxing7_23.LinkList;
import Fanxing7_23.Node;

public class Game {

	//����ѭ������
	
	LinkList  list=new LinkList();
	
	int num; //������
	
	int key ; //�˳���ֵ
	
	
	//��Ϸ�ĳ�ʼ��
	public Game(int num, int key) {
		
		this.num=num;
		
		this.key=key;
	}
	
	//��ķ���
	public void play()throws Exception{
		
		for(int i=0;i<num;i++) {
			
			list.add(i, i+1);
		}
		
		System.out.println("��Ϸ��ʼ֮ǰ-----------------");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("��Ϸ��ʼ------------------");
		
		int jcount=num;  //��Ϸ��ʼ����������������
		
		int j=0; //�ۼ��� �ж��ܷ�key����
		
		Node node=list.head;  //��ͷ�ڵ㿪ʼ
		
		while(jcount!=1) {
			
			
			if(node.getData()!=null&&Integer.parseInt(node.getData().toString())!=-1) {
				
				j++;
				
				if(j%key==0) {
					
					node.setData(-1);
					jcount--;
					System.out.println();
					
					for(int i=0;i<list.size();i++) {
						
						System.out.print(list.get(i)+" ");
					}
				}
			}
			
			node=node.next;
		}
		System.out.println();
		System.out.println("��Ϸ����------------");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+" ");
		}
		
	}

	
}
