# getInstance
Day_to_Day
new和getinstance的区别
getinstance()在大比例模式下使用。
单例模式：所谓单例模式就是一个类有且只有一个实例，不像object ob=new object();的这种方式去实例化后去使用。
GetInstance与new区别：
new的使用:如Object _object = new Object()，这时候，就必须要知道有第二个Object的存在，而第二个Object也常常是在当前的应用程序域中的，可以被直接调用的
GetInstance的使用:在主函数开始时调用，返回一个实例化对象，此对象是static的，在内存中保留着它的引用，即内存中有一块区域专门用来存放静态方法和变量，可以直接使用，调用多次返回同一个对象。
两者区别对照:
大部分类(非抽象类/接口/屏蔽了constructor的类)都可以用new，new就是通过生产一个新的实例对象，或者在栈上声明一个对象 ，每部分的调用用的都是一个新的对象。
getInstance是少部分类才有的一个方法，各自的实现也不同。getInstance在单例模式(保证一个类仅有一个实例，并提供一个访问它的全局访问点)的类中常见，用来生成唯一的实例，getInstance往往是static的。
(1) 对象使用之前通过getinstance得到而不需要自己定义，用完之后不需要delete；
(2)new 一定要生成一个新对象，分配内存；getInstance() 则不一定要再次创建，它可以把一个已存在的引用给你使用，这在效能上优于new；
(3) new创建后只能当次使用，而getInstance()可以跨栈区域使用，或者远程跨区域使用。所以getInstance()通常是创建static静态实例方法的。