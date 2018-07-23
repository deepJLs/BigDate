Java之String中删除指定元素

有时候我们想删除String中的某个元素（如“abcdefg"中的”b"），但又发现Java的String给的方法中并没有remove这个选项。我们可以写一个简单的函数来解决这个问题，如下：

>public class StringRemove {
public static String removeChar(int index,String Str){
	Str=Str.substring(0,index)+Str.substring(index+1,Str.length());//substring的取值范围是:[,)
	return Str;}
>
public static void main(String[]args)//测试
{
 String myStr="abcdefg";
myStr=removeChar(1,myStr);
System.out.println(myStr);
}
}
