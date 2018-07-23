 


	 package packaged;




	import java.text.ParseException;
    import java.text.SimpleDateFormat;
	import java.util.Date;

	public class Data {

		public static void main(String[] args) throws ParseException {
			
			
			Date date=new Date();
			
			//把当前时间转换为long类型
			long time=date.getTime();
			
			//System.out.println(time);
			
			//把long类型的time转换为Date类型输出
			//System.out.println(new Date(time));
			
			SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			String d=sd.format(date);
			
			System.out.println(d);
			 Date mydate=sd.parse(d);  //通过parse方法 转换
			 
			 System.out.println(mydate);
			

		
	}}
