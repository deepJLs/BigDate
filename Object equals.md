//
//任务2  编写一个 equals方法 实现自定义类的内容比较
//
//
//目前接触的到两个功能
//1 toString() 取得对象信息
//
//2 equals() 对象比较
//
//
//既然Object类是所有类的父类 ，所有类都可以向上转型 ，Object可以接收所有的类
//
//
//编写类与类之间的关系
package denglu;
public class Teacher {
    private String name;
    private int age;


    /**
     * 重写toString
     */
    public String toString(){
        return name;
    }
    /**
     * 重写equals
     * 用于判断当前对象与给定对象“长的像不像”
     * 比较的是内容（属性name）
     */
    public boolean equals(Object obj){
        if(obj == null){//传进来的对象是否为空
            return false;
        }
        if(obj == this){//传进来的对象是否是自己
            return true;
        }
        if(obj instanceof Teacher){//传进来的对象是否是同一类型的  if(this.getClass() != x.getClass())
            Teacher t = (Teacher)obj;
            return t.name.equals(this.name)
                    &&
                    t.age == this.age;
        }
        return false;
    }

    public static void main(String[] args) {
        Teacher tea = new Teacher();
        tea.name = "wang";
        tea.age = 31;
        System.out.println(tea);//wang println()中调用toString方法

        Teacher tea1 = new Teacher();
        tea1.name = "wang";
        tea1.age = 31;
        System.out.println(tea==tea1);//false双等于比较的是是否为同一对象
        System.out.println(tea.equals(tea1));//true

    }

}