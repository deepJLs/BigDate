System.arraycopy(b,0,v, 0, b.length);![](https://i.imgur.com/e8nMp9P.png)
    
		package packaged;
        public class TestDemo{
    	public static void main(String[] args) {
    	Runtime runtime=Runtime.getRuntime();
    	System.out.println(runtime.maxMemory());//最大可用内存(有扩展区)
    	System.out.println(runtime.freeMemory());//闲置内存
    	System.out.println(runtime.totalMemory());//总共内存
    	int b[]= {1,2,3,5,9};
    	int v[]	=new int[10];
    	System.arraycopy(b,0,v, 0, b.length);//把b的元素给v
    	for(int z:v)
    	System.out.println(z);
    	}
    }