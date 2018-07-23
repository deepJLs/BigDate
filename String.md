java中String的常用方法

1、length()字符串的长度

例：char chars[]={'a','b'.'c'};

String s=new String(chars);

int len=s.length();

2、charAt()截取一个字符

例：char ch;

ch="abc".charAt(1); 返回'b'

3、 getChars()截取多个字符

void getChars(int sourceStart,int sourceEnd,char target[],int targetStart)

sourceStart指定了子串开始字符的下标，sourceEnd指定了子串结束后的下一个字符的下标。因此， 子串包含从sourceStart到sourceEnd-1的字符。接收字符的数组由target指定，target中开始复制子串的下标值是targetStart。

例：String s="this is a demo of the getChars method.";

char buf[]=new char[20];

s.getChars(10,14,buf,0);

4、getBytes()

替代getChars()的一种方法是将字符存储在字节数组中，该方法即getBytes()。

5、toCharArray()

6、equals()和equalsIgnoreCase()比较两个字符串

7、regionMatches()用于比较一个字符串中特定区域与另一特定区域，它有一个重载的形式允许在比较中忽略大小写。

boolean regionMatches(int startIndex,String str2,int str2StartIndex,int numChars)

boolean regionMatches(boolean ignoreCase,int startIndex,String str2,int str2StartIndex,int numChars)

8、startsWith()和endsWith()startsWith()方法决定是否以特定字符串开始，endWith()方法决定是否以特定字符串结束

9、equals()和==

equals()方法比较字符串对象中的字符，==运算符比较两个对象是否引用同一实例。

例：String s1="Hello";

String s2=new String(s1);

s1.eauals(s2); //true

s1==s2;//false

10、compareTo()和compareToIgnoreCase()比较字符串

11、indexOf()和lastIndexOf()

indexOf() 查找字符或者子串第一次出现的地方。

lastIndexOf() 查找字符或者子串是后一次出现的地方。

12、substring()它有两种形式，第一种是：String substring(int startIndex)

第二种是：String substring(int startIndex,int endIndex)

13、concat()连接两个字符串

14 、replace()替换

它有两种形式，第一种形式用一个字符在调用字符串中所有出现某个字符的地方进行替换，形式如下：

String replace(char original,char replacement)

例如：String s="Hello".replace('l','w');

第二种形式是用一个字符序列替换另一个字符序列，形式如下：

String replace(CharSequence original,CharSequence replacement)

15、trim()去掉起始和结尾的空格

16、valueOf()转换为字符串

17、toLowerCase()转换为小写

18、toUpperCase()转换为大写

19、StringBuffer构造函数

StringBuffer定义了三个构造函数：

StringBuffer()

StringBuffer(int size)

StringBuffer(String str)

StringBuffer(CharSequence chars)

(1)、length()和capacity()一个StringBuffer当前长度可通过length()方法得到,而整个可分配空间通过capacity()方法得到。

(2)、ensureCapacity()设置缓冲区的大小

void ensureCapacity(int capacity)

(3)、setLength()设置缓冲区的长度

void setLength(int len)

(4)、charAt()和setCharAt()

char charAt(int where)

void setCharAt(int where,char ch)

(5)、getChars()

void getChars(int sourceStart,int sourceEnd,char target[],int targetStart)

(6)、append()可把任何类型数据的字符串表示连接到调用的StringBuffer对象的末尾。

例：int a=42;

StringBuffer sb=new StringBuffer(40);

String s=sb.append("a=").append(a).append("!").toString();

(7)、insert() 插入字符串

StringBuffer insert(int index,String str)

StringBuffer insert(int index,char ch)

StringBuffer insert(int index,Object obj)

index指定将字符串插入到StringBuffer对象中的位置的下标。

(8)、reverse() 颠倒StringBuffer对象中的字符

StringBuffer reverse()

(9)、delete()和deleteCharAt() 删除字符

StringBuffer delete(int startIndex,int endIndex)

StringBuffer deleteCharAt(int loc)

(10)、replace() 替换

StringBuffer replace(int startIndex,int endIndex,String str)

(11)、substring() 截取子串

String substring(int startIndex)

String substring(int startIndex,int endIndex)

例子：

//String所给出的方法均可以直接调用

public class Test{

public static void main(String[] args){

String s = "Welcome to Java World!";

String s1 = " sun java ";

System.out.println(s.startsWith("Welcome"));//字符串以Welcome开头

System.out.println(s.endsWith("World"));//字符串以World结尾

String sL = s.toLowerCase();//全部转换成小写

String sU = s.toUpperCase();//全部转换成大写

System.out.println(sL);

System.out.println(sU);

String b = s.substring(11);//从第十一位开始

System.out.println(b);

String c = s.substring(8,11);//从第八位开始在第十一位结束

System.out.println(c);

String d = s1.trim();//去掉首尾的空格

System.out.println(d);

String s2 = "我是程序员，我在学java";

String e = s2.replace("我","你");

System.out.println(e);

int f = 5;

String s3 = String.valueOf(f);

System.out.println(s3);

String s4 = "我是,这的,大王";

String[] g = s4.split(",");

System.out.println(g[0]);

当把字符串转换成基本类型时，例如，int，integer.praseInt(String s)

当把基本类型转换成字符串时，例如，static String valueOf(int i)



一、构造函数

String(byte[ ]bytes)：通过byte数组构造字符串对象。

String(char[ ]value)：通过char数组构造字符串对象。

String(Stingoriginal)：构造一个original的副本。即：拷贝一个original。

String(StringBufferbuffer)：通过StringBuffer数组构造字符串对象。

例如：

byte[] b = {'a','b','c','d','e','f','g','h','i','j'};

char[] c = {'0','1','2','3','4','5','6','7','8','9'};

String sb = new String(b);                 //abcdefghij

String sb_sub = new String(b,3,2);     //de

String sc = new String(c);                  //0123456789

String sc_sub = new String(c,3,2);    //34

String sb_copy = new String(sb);       //abcdefghij

System.out.println("sb:"+sb);

System.out.println("sb_sub:"+sb_sub);

System.out.println("sc:"+sc);

System.out.println("sc_sub:"+sc_sub);

System.out.println("sb_copy:"+sb_copy);

输出结果：sb:abcdefghij

sb_sub:de

sc:0123456789

sc_sub:34

sb_copy:abcdefghij

二、方法：

说明：①、所有方法均为public。

②、书写格式： [修饰符] <返回类型><方法名([参数列表])>

例如：static int parseInt(String s)

表示此方法(parseInt)为类方法(static),返回类型为(int),方法所需要为String类型。

1.charcharAt(int index)：取字符串中的某一个字符，其中的参数index指的是字符串中序数。字符串的序数从0开始到length()-1 。

例如：String s = new String("abcdefghijklmnopqrstuvwxyz");

System.out.println("s.charAt(5): " + s.charAt(5) );

结果为： s.charAt(5): f

2.int compareTo(String anotherString)：当前String对象与anotherString比较。相等关系返回０；不相等时，从两个字符串第0个字符开始比较，返回第一个不相等的字符差，另一种情况，较长字符串的前面部分恰巧是较短的字符串，返回它们的长度差。

3.int compareTo(Object o)：如果o是String对象，和2的功能一样；否则抛出ClassCastException异常。

例如:String s1 = new String("abcdefghijklmn");

String s2 = new String("abcdefghij");

String s3 = new String("abcdefghijalmn");

System.out.println("s1.compareTo(s2): " + s1.compareTo(s2) ); //返回长度差

System.out.println("s1.compareTo(s3): " + s1.compareTo(s3) ); //返回'k'-'a'的差

结果为：s1.compareTo(s2): 4

s1.compareTo(s3): 10

4.String concat(String str)：将该String对象与str连接在一起。

5.boolean contentEquals(StringBuffer sb)：将该String对象与StringBuffer对象sb进行比较。

6.static String copyValueOf(char[] data)：

7.static String copyValueOf(char[] data, int offset, int count)：这两个方法将char数组转换成String，与其中一个构造函数类似。

8.boolean endsWith(String suffix)：该String对象是否以suffix结尾。

例如：String s1 = new String("abcdefghij");

String s2 = new String("ghij");

System.out.println("s1.endsWith(s2): " + s1.endsWith(s2) );

结果为：s1.endsWith(s2): true

9.boolean equals(Object anObject)：当anObject不为空并且与当前String对象一样，返回true；否则，返回false。

10.byte[] getBytes()：将该String对象转换成byte数组。

11.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)：该方法将字符串拷贝到字符数组中。其中，srcBegin为拷贝的起始位置、srcEnd为拷贝的结束位置、字符串数值dst为目标字符数组、dstBegin为目标字符数组的拷贝起始位置。

例如：char[] s1 = {'I',' ','l','o','v','e',' ','h','e','r','!'};//s1=I love her!

String s2 = new String("you!"); s2.getChars(0,3,s1,7); //s1=I love you!

System.out.println( s1 );

结果为：I love you!

12.int hashCode()：返回当前字符的哈希表码。

13.int indexOf(int ch)：只找第一个匹配字符位置。

14.int indexOf(int ch, intfromIndex)：从fromIndex开始找第一个匹配字符位置。

15.int indexOf(String str)：只找第一个匹配字符串位置。

16.int indexOf(String str, int fromIndex)：从fromIndex开始找第一个匹配字符串位置。

例如：String s = new String("write once, run anywhere!");

String ss = new String("run");

System.out.println("s.indexOf('r'): " + s.indexOf('r') );

System.out.println("s.indexOf('r',2): " + s.indexOf('r',2) );

System.out.println("s.indexOf(ss): " + s.indexOf(ss) );

结果为：s.indexOf('r'): 1

s.indexOf('r',2): 12

s.indexOf(ss): 12

17.int lastIndexOf(int ch)18.int lastIndexOf(int ch, int fromIndex)19.int lastIndexOf(String str)20.int lastIndexOf(String str, int fromIndex)以上四个方法与13、14、15、16类似，不同的是：找最后一个匹配的内容。

public class CompareToDemo {

public static void main (String[] args) {

String s1 = new String("acbdebfg");

System.out.println(s1.lastIndexOf((int)'b',7));

}

}

运行结果：5

（其中fromIndex的参数为7，是从字符串acbdebfg的最后一个字符g开始往前数的位数。既是从字符c开始匹配，寻找最后一个匹配b的位置。所以结果为5）

21.int length()：返回当前字符串长度。

22.String replace(charoldChar, charnewChar)：将字符号串中第一个oldChar替换成newChar。

23.boolean startsWith(String prefix)：该String对象是否以prefix开始。

24.boolean startsWith(Stringprefix, inttoffset)：该String对象从toffset位置算起，是否以prefix开始。

例如：String s = new String("write once, run anywhere!");

String ss = new String("write");

String sss = new String("once");

System.out.println("s.startsWith(ss): " + s.startsWith(ss) );

System.out.println("s.startsWith(sss,6): " + s.startsWith(sss,6) );

结果为：s.startsWith(ss): true

s.startsWith(sss,6): true

25.String substring(int beginIndex)：取从beginIndex位置开始到结束的子字符串。

26.String substring(int beginIndex, int endIndex)：取从beginIndex位置开始到endIndex位置的子字符串。

27.char[ ] toCharArray()：将该String对象转换成char数组。

28.String toLowerCase()：将字符串转换成小写。

29.String toUpperCase()：将字符串转换成大写。

例如：String s = new String("java.lang.Class String");

System.out.println("s.toUpperCase(): " + s.toUpperCase() );

System.out.println("s.toLowerCase(): " + s.toLowerCase() );

结果为：s.toUpperCase(): JAVA.LANG.CLASS STRING

s.toLowerCase(): java.lang.class string

30.static String valueOf(boolean b)31.static String valueOf(char c)32.static String valueOf(char[] data)33.static String valueOf(char[] data, int offset, int count)34.static String valueOf(double d)35.static String valueOf(float f)

36.static String valueOf(int i)37.static String valueOf(long l)38.static String valueOf(Object obj)以上方法用于将各种不同类型转换成Java字符型。这些都是类方法。

Java中String类的常用方法:

public char charAt(int index)

返回字符串中第index个字符；

public int length()返回字符串的长度；

public int indexOf(String str)返回字符串中第一次出现str的位置；

public int indexOf(String str,int fromIndex)返回字符串从fromIndex开始第一次出现str的位置；

public boolean equalsIgnoreCase(String another)

比较字符串与another是否一样（忽略大小写）；

public String replace(char oldchar,char newChar)

在字符串中用newChar字符替换oldChar字符

public boolean startsWith(String prefix)

判断字符串是否以prefix字符串开头；

public boolean endsWith(String suffix)判断一个字符串是否以suffix字符串结尾；

public String toUpperCase()

返回一个字符串为该字符串的大写形式；

public String toLowerCase()返回一个字符串为该字符串的小写形式

public String substring(int beginIndex)返回该字符串从beginIndex开始到结尾的子字符串；

public String substring(int beginIndex,int endIndex)

返回该字符串从beginIndex开始到endsIndex结尾的子字符串

public String trim()返回该字符串去掉开头和结尾空格后的字符串

public String[] split(String regex)

将一个字符串按照指定的分隔符分隔，返回分隔后的字符串数组

实例：

public classSplitDemo{

public static void main (String[] args) {

Stringdate= "2008/09/10";

String[ ]dateAfterSplit= new String[3];

dateAfterSplit=date.split("/");//以“/”作为分隔符来分割date字符串，并把结果放入3个字符串中。

for(int i=0;i<dateAfterSplit.length;i++)

System.out.print(dateAfterSplit[i]+" ");

}

}

运行结果：2008 09 10          //结果为分割后的3个字符串

实例：

TestString1.java:

程序代码

public class TestString1

{

public static void main(String args[]) {

String s1 = "Hello World" ;

String s2 = "hello world" ;

System.out.println(s1.charAt(1)) ;

System.out.println(s2.length()) ;

System.out.println(s1.indexOf("World")) ;

System.out.println(s2.indexOf("World")) ;

System.out.println(s1.equals(s2)) ;

System.out.println(s1.equalsIgnoreCase(s2)) ;

String s = "我是J2EE程序员" ;

String sr = s.replace('我','你') ;

System.out.println(sr) ;

}

}

TestString2.java:

程序代码

public class TestString2

{

public static void main(String args[]) {

String s = "Welcome to Java World!" ;

String s2 = "   magci   " ;

System.out.println(s.startsWith("Welcome")) ;

System.out.println(s.endsWith("World")) ;

String sL = s.toLowerCase() ;

String sU = s.toUpperCase() ;

System.out.println(sL) ;

System.out.println(sU) ;

String subS = s.substring(11) ;

System.out.println(subS) ;

String s1NoSp = s2.trim() ;

System.out.println(s1NoSp) ;

}

JAVA的String 类【转】 - 火之光 - 博客园

www.runoob.com/java/java-string.html

Java中String类的方法及说明 - 吴勇寿 - 博客园

深入理解Java：String - 牛奶、不加糖 - 博客园

www.runoob.com/java/java-stringbuffer.html（Java StringBuffer和StringBuilder类）

作者：赤赤有名
链接：https://www.jianshu.com/p/9214f806c3f5
來源：简书
简书著作权归作者所有，任何形式的转载都请联系作者获得授权并注明出处。