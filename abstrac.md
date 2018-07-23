public class TestDemo04
{

	public static void main(String[]args){
	
		Actions a=new Dog();

		a.select(Actions.EAT);
		a.run();
	}

}


abstract class Actions
{

	//人的行为： 吃饭  睡觉 跑步，学习

	//马的行为： 跑步 输出

	//猫的行为： 睡觉 吃饭 跑步


	public final static int EAT=1; //吃


	public final static int OUT=2;//输出

	
	public final static int SLEEP=3; //代表睡觉

	public final static int LEARN=4;//学习

	public final static int RUN=5; //跑步


	public void select(int flag){
	
		switch(flag){
		
			case EAT:
				this.eat();  //吃饭
				break; 
			case OUT:
				this.out();
				break;
			case SLEEP:
				this.sleep();
				break;
			case LEARN:

				this.learn(); 
				break;
			case RUN:
				this.run();
				break;
		}

	}




	//定义吃饭的行为
	public abstract void eat();

	
	//定义跑步的行为
	public abstract void run();

	
	//输出的行为
	public abstract void out();

	
	//定义学习的行为
	public abstract void learn();


	//睡觉的行为
	public abstract void sleep();


}

class Dog extends Actions
{
	
	//定义吃饭的行为
	public void eat(){
	
		System.out.println("eat");
	}

	
	//定义跑步的行为
	public  void run(){System.out.println("run");}

	
	//输出的行为
	public  void out(){}

	
	//定义学习的行为
	public  void learn(){}


	//睡觉的行为
	public void sleep(){}
}

这告诉我们父类可以直接调用子类方法实现静态 this.F(); F方法父类未实现(abstra),子类实现,然后在父类的方法中就可以实现子类实现的父类的方法;