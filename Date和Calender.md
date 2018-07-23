2.Calendar和Date的转化

(1) Calendar转化为Date
Calendar cal=Calendar.getInstance();
Date date=cal.getTime();

(2) Date转化为Calendar
	
	Date date=new Date();
	Calendar cal=Calendar.getInstance();
	cal.setTime(date);

3.格式化输出日期时间 （这个用的比较多）

	Date date=new Date();
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String time=df.format(date);
	System.out.println(time);

4.计算一年中的第几星期

(1)计算某一天是一年中的第几星期
	
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.YEAR, 2006);
	cal.set(Calendar.MONTH, 8);
	cal.set(Calendar.DAY_OF_MONTH, 3);
	int weekno=cal.get(Calendar.WEEK_OF_YEAR);

(2)计算一年中的第几星期是几号
	
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.YEAR, 2006);
	cal.set(Calendar.WEEK_OF_YEAR, 1);
	cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	System.out.println(df.format(cal.getTime()));
输出:
2006-01-02
