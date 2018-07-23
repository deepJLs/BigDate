	package packaged;
	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	
	public class Runtimeclass {

	public static void main(String[] args) throws ParseException {
		long l = Runtime.getRuntime().freeMemory();
		l = Runtime.getRuntime().totalMemory();
		l = Runtime.getRuntime().maxMemory();
		System.out.println(l);
		StringBuilder stringBuilder = new StringBuilder();

		StringBuilder sbd = new StringBuilder("hello");
		sbd.append("sdsd");

		System.out.println(sbd);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("dfs");
		System.out.println(stringBuffer);
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
		String iString = simpleDateFormat.format(date);
		System.out.println(iString);
		System.out.println(simpleDateFormat.parse(iString));
	}

}
