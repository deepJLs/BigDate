#JAVA中int转String类型有三种方法 
1>String.valueOf(i)

2> Integer.toString(i)

3> i+""

#在 Java 中要将 String 类型转化为 int  类型时,需要使用 Integer 类中的 parseInt() 方法或者 valueOf() 方法进行转换.

例1:


String str = "123";
try {
    int a = Integer.parseInt(str);
} catch (NumberFormatException e) {
    e.printStackTrace();
}

例2:

String str = "123";
try {
    int b = Integer.valueOf(str).intValue()
} catch (NumberFormatException e) {
    e.printStackTrace();
}



#intValue（）
如Integer类型，就回有intValue（）方法意识是说，把Integer类型转化为Int类型。其他类似，都是一个意思
#valueOf（）
如String就有valueOf（）方法，意识是说，要把参数中给的值，转化为String类型，Integer的valueOf（）就是把参数给的值，转化为Integer类型。其他类似，都是一个意思。