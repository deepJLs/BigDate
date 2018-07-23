#1 拼接字符串
String类的方法：

①利用运算符"+"

②public String concat(String str)进行字符串的拼接操作

StringBuffer的方法：

①public StringBuffer append(String str)将str添加到当前字符串缓冲区的字符序列的末尾

②public StringBuffer insert(int offset,String str)在当前字符串缓冲区的字符序列的下标

索引offset插入str。如果offset等于旧长度，则str添加在字符串缓冲区的尾部

3   StringBuilder
        StringBuilder str=new StringBuilder("Hello");
    str.append("word");

#2 使用String中的valueOf()方法完成
   		   
int n=5;

String str=String.valueOf(n);

System.out.println(str);

#3.Stringuilder
    StringBuilder str=new StringBuilder("Hello");
    str.append("word");
    
#4.
	`Integer  n=new Integer(5);  //装箱`

	`System.out.println(n.intValue());  //拆箱`

#5 把一个字符串转换为一个int类型


			String  str="1234567890";
			int n=Integer.parseInt(str);

			System.out.println(n);
