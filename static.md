# static
静态方法不能调用非静态方法的原因
2017年04月08日 16:46:10
阅读数：6745
静态方法是属于类的，即静态方法是随着类的加载而加载的，在加载类时，程序就会为静态方法分配内存，而非静态方法是属于对象的，对象是在类加载之后创建的，也就是说静态方法先于对象存在，当你创建一个对象时，程序为其在堆中分配内存，一般是通过this指针来指向该对象。静态方法不依赖于对象的调用，它是通过‘类名.静态方法名’这样的方式来调用的。而对于非静态方法，在对象创建的时候程序才会为其分配内存，然后通过类的对象去访问非静态方法。因此在对象未存在时非静态方法也不存在，静态方法自然不能调用一个不存在的方法。



延伸一个相似的例子吧，在做一个笔试的时候遇到的问题：

有下面这样的程序：

public class Test{

private static void Print(){
System.out.println("Print()");
}

public static void main(String[] args) {

((Test)null).Print();

}

}

问输出什么？

//输出是Print()

当时看到这道题的时候真的是万脸懵逼，为什么类名那里还要加一个null，为什么不是直接Test.Print()，还以为这样写会报错，然而并不是。经过查资料和某人的帮助，终于明白啦。

（1）首先，我们可以试一下去掉static，这里不会编译错误，但是运行时会抛出空指针异常，原因是什么呢，原因就是类似于上面说的静态方法不能调用非静态方法的原因了。我们很容易被null转移了视线，这里与null的关系不大（这是因为是静态方法，null没有影响），null是为了告诉我们这里的引用没有指向任何地方或者说还未初始化，也就是说对象未创建，从上面对象的创建过程可以知道，如果对象还未创建，则不会有this指针的引用，因此会报空指针异常。

（2）这里用null的话（即(Test)null）是将Test引用强制转换为Test对象，这样也可以调用静态方法，其实不需要null，也是可以调用静态方法的，即Test.Print()。



另外补充一下我觉得很有必要知道的null的知识：

（1）null可以被强制转换为任何引用类型。

（2）任何含有null值的包装类在自动拆箱成基本数据类型时都会抛出一个空指针异常

（3）不能用一个值为null的引用类型变量来调用非静态方法，这样会抛出空指针异常，但是静态方法可以被一个值为null的引用类型变量调用而不会抛出空指针异常。这和对象的创建和静态方法以及非静态方法之间的关系有关。也就是上面说的那些。

下面这个链接是对null的一些解析，挺好的。

http://www.importnew.com/14229.html

下面这个链接是那道笔试题的一些讨论

https://www.nowcoder.com/questionTerminal/e252668ee94947bea07edd7300340115