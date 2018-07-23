Java Calendar类的使用总结

　　在实际项目当中，我们经常会涉及到对时间的处理，例如登陆网站，我们会看到网站首页显示XXX，欢迎您！今天是XXXX年。。。。某些网站会记录下用户登陆的时间，比如银行的一些网站，对于这些经常需要处理的问题，Java中提供了Calendar这个专门用于对日期进行操作的类，那么这个类有什么特殊的地方呢，首先我们来看Calendar的声明

public abstract class Calendar extends Objectimplements Serializable, Cloneable, Comparable<Calendar>
　　该类被abstract所修饰，说明不能通过new的方式来获得实例，对此，Calendar提供了一个类方法getInstance，以获得此类型的一个通用的对象，getInstance方法返回一个Calendar对象（该对象为Calendar的子类对象），其日历字段已由当前日期和时间初始化：

Calendar rightNow = Calendar.getInstance();
　　为什么说返回的是Calendar的子类对象呢，因为每个国家地区都有自己的一套日历算法，比如西方国家的第一个星期大部分为星期日，而中国则为星期一，我们来看看getInstance方法获取实例的源码

复制代码

	     1 /**
	     2  * Gets a calendar using the default time zone and locale. The
	     3  * <code>Calendar</code> returned is based on the current time
	     4  * in the default time zone with the default locale.
	     5  *
	     6  * @return a Calendar.
	     7  */
	     8 public static Calendar getInstance()
	     9 {
	    10 Calendar cal = createCalendar(TimeZone.getDefaultRef(), 	Locale.getDefault(Locale.Category.FORMAT));
	    11 cal.sharedZone = true;
	    12 return cal;
	    13 }

复制代码
其中createCalendar方法就是根据不同国家地区返回对应的日期子类

复制代码

	 1 private static Calendar createCalendar(TimeZone zone,
	 2                                            Locale aLocale)
	 3     {
	 4         Calendar cal = null;
	 5 
	 6         String caltype = aLocale.getUnicodeLocaleType("ca");
	 7         if (caltype == null) {
	 8             // Calendar type is not specified.
	 9             // If the specified locale is a Thai locale,
	10             // returns a BuddhistCalendar instance.
	11             if ("th".equals(aLocale.getLanguage())
	12                     && ("TH".equals(aLocale.getCountry()))) {
	13                 cal = new BuddhistCalendar(zone, aLocale);
	14             } else {
	15                 cal = new GregorianCalendar(zone, aLocale);
	16             }
	17         } else if (caltype.equals("japanese")) {
	18             cal = new JapaneseImperialCalendar(zone, aLocale);
	19         } else if (caltype.equals("buddhist")) {
	20             cal = new BuddhistCalendar(zone, aLocale);
	21         } else {
	22             // Unsupported calendar type.
	23             // Use Gregorian calendar as a fallback.
	24             cal = new GregorianCalendar(zone, aLocale);
	25         }
	26 
	27         return cal;
	28     }
复制代码
　　为了更加便捷的对日期进行操作，Calendar类对YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。瞬间可用毫秒值来表示，它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高利历）的偏移量。

下面看看Calendar常用的方法

复制代码

	 1 package com.test.calendar;
	 2 
	 3 import java.util.Calendar;
	 4 
	 5 import org.junit.Before;
	 6 import org.junit.Test;
	 7 
	 8 public class CalendarDemo {
	 9     Calendar calendar = null;
	10 
	11     @Before
	12     public void test() {
	13         calendar = Calendar.getInstance();
	14     }
	15 
	16     // 基本用法，获取年月日时分秒星期
	17     @Test
	18     public void test1() {
	19         // 获取年
	20         int year = calendar.get(Calendar.YEAR);
	21 
	22         // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
	23         int month = calendar.get(Calendar.MONTH) + 1;
	24 
	25         // 获取日
	26         int day = calendar.get(Calendar.DAY_OF_MONTH);
	27 
	28         // 获取时
	29         int hour = calendar.get(Calendar.HOUR);
	30         // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示
	31 
	32         // 获取分
	33         int minute = calendar.get(Calendar.MINUTE);
	34 
	35         // 获取秒
	36         int second = calendar.get(Calendar.SECOND);
	37 
	38         // 星期，英语国家星期从星期日开始计算
	39         int weekday = calendar.get(Calendar.DAY_OF_WEEK);
	40 
	41         System.out.println("现在是" + year + "年" + month + "月" + day + "日" + hour
	42                 + "时" + minute + "分" + second + "秒" + "星期" + weekday);
	43     }
	44 
	45     // 一年后的今天
	46     @Test
	47     public void test2() {
	48         // 同理换成下个月的今天calendar.add(Calendar.MONTH, 1);
	49         calendar.add(Calendar.YEAR, 1);
	50 
	51         // 获取年
	52         int year = calendar.get(Calendar.YEAR);
	53 
	54         // 获取月
	55         int month = calendar.get(Calendar.MONTH) + 1;
	56 
	57         // 获取日
	58         int day = calendar.get(Calendar.DAY_OF_MONTH);
	59 
	60         System.out.println("一年后的今天：" + year + "年" + month + "月" + day + "日");
	61     }
	62 
	63     // 获取任意一个月的最后一天
	64     @Test
	65     public void test3() {
	66         // 假设求6月的最后一天
	67         int currentMonth = 6;
	68         // 先求出7月份的第一天，实际中这里6为外部传递进来的currentMonth变量
	69         // 1
	70         calendar.set(calendar.get(Calendar.YEAR), currentMonth, 1);
	71 
	72         calendar.add(Calendar.DATE, -1);
	73 
	74         // 获取日
	75         int day = calendar.get(Calendar.DAY_OF_MONTH);
	76 
	77         System.out.println("6月份的最后一天为" + day + "号");
	78     }
	79 
	80     // 设置日期
	81     @Test
	82     public void test4() {
	83         calendar.set(Calendar.YEAR, 2000);
	84         System.out.println("现在是" + calendar.get(Calendar.YEAR) + "年");
	85 
	86         calendar.set(2008, 8, 8);
	87         // 获取年
	88         int year = calendar.get(Calendar.YEAR);
	89 
	90         // 获取月
	91         int month = calendar.get(Calendar.MONTH);
	92 
	93         // 获取日
	94         int day = calendar.get(Calendar.DAY_OF_MONTH);
	95 
	96         System.out.println("现在是" + year + "年" + month + "月" + day + "日");
	97     }
	98 }