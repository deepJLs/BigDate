package 击鼓传花小游戏;

import Fanxing7_23.LinkList;
import Fanxing7_23.Node;

public class Game {

	//单向循环链表
	
	LinkList  list=new LinkList();
	
	int num; //总人数
	
	int key ; //退出的值
	
	
	//游戏的初始化
	public Game(int num, int key) {
		
		this.num=num;
		
		this.key=key;
	}
	
	//玩的方法
	public void play()throws Exception{
		
		for(int i=0;i<num;i++) {
			
			list.add(i, i+1);
		}
		
		System.out.println("游戏开始之前-----------------");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println("游戏开始------------------");
		
		int jcount=num;  //游戏开始的人数等于总人数
		
		int j=0; //累加器 判断能否被key整除
		
		Node node=list.head;  //从头节点开始
		
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
		System.out.println("游戏结束------------");
		
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+" ");
		}
		
	}

	
}
