Pubic Date(long time) 把long类型的时间转换为Date类型

Public long getTime() 把Date类型的时间转换为long类型

范例：

	public static void main(String[] args) {
		
		
		Date date=new Date();
		
		//把当前时间转换为long类型
		long time=date.getTime();
		
		System.out.println(time);
		
		//把long类型的time转换为Date类型输出
		System.out.println(new Date(time));
		
	}
