StringBuffer支持并发操作，线性安全的，适合多线程中使用。

StringBuilder不支持并发操作，线性不安全的，不适合多线程中使用。新引入的StringBuilder类不是线程安全的，但其在单线程中的性能比 StringBuffer高。

三者在执行速度方面的比较：StringBuilder >  StringBuffer  >  String

由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。