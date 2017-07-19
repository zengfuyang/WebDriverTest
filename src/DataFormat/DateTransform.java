//package DataFormat;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import com.ibm.icu.text.DateFormat;
//import com.ibm.icu.util.ULocale;
//
//public class DateTransform {
//	
//	public static int getDateStyle(String enDate,String locale) throws IOException{
//		
//		DateFormat df;
//		
//		df=DateFormat.getDateInstance(DateFormat.MEDIUM,DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.MEDIUM;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df=DateFormat.getDateInstance(DateFormat.LONG,DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.LONG;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df=DateFormat.getDateInstance(DateFormat.FULL,DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.FULL;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df=DateFormat.getDateInstance(DateFormat.SHORT,DateLocale.dataLocale(locale));
//		try{
//		    df.parse(enDate);
//		    return DateFormat.SHORT;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		
//		
//		
//		System.out.println("The DateFormat cannot be parsed");
//		return -1;
//		//if return -1, English date format is wrong.
//		}
//	
//	public static int getTimeStyle(String enDate,String locale) throws IOException{
//		
//		DateFormat df;
//		df = DateFormat.getTimeInstance(DateFormat.MEDIUM, DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.MEDIUM;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df = DateFormat.getTimeInstance(DateFormat.LONG, DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.LONG;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df = DateFormat.getTimeInstance(DateFormat.FULL, DateLocale.dataLocale(locale));
//		try{
//			df.parse(enDate);
//			return DateFormat.FULL;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		df = DateFormat.getTimeInstance(DateFormat.SHORT, DateLocale.dataLocale(locale));
//		try{
//		      df.parse(enDate);
//		      return DateFormat.SHORT;
//		}catch(Exception e){
//		//e.printStackTrace();
//		}
//		System.out.println("The DateFormat cannot be parsed");
//		return -1;
//		//if return -1, English date format is wrong.
//		}
//	
//	
//	 public static String GetDateByLocal(Date date,int style,Locale locale){
//		 
//		 DateFormat df= DateFormat.getDateInstance(style, locale); 
//		 return df.format(date);
//		} 
//	 
//	 
//	 public static String GetTimeByLocal(Date time,int style,Locale locale){
//		 
//		 DateFormat df = DateFormat.getTimeInstance(style, locale); 
//		 return df.format(time); 
//		} 
//	 
//	 //解析日期
//	 public static String PaserDate(String date,String local) throws IOException, ParseException{
//		 
//		Locale locale=new Locale(local);
//			
//		int dstyle=getDateStyle(date, local);
//		
////		if(dstyle == -1){
////			DateFormatParse.parse(date);
////		}
//			
//		DateFormat df = DateFormat.getDateInstance(dstyle, DateLocale.dataLocale(local));
//			
//		Date dd=df.parse(date);
//			
//		String ds=DateTransform.GetDateByLocal(dd, dstyle, locale);
//			
//		//System.out.println(ds);
//		
//		return ds;
//		 
//	 }
//	 
//	 //解析时间
//	 public static String PaserTime(String time,String local) throws IOException, ParseException{
//		 
//		Locale locale=new Locale(local);
//			
//		int tstyle=getTimeStyle(time, local);
//		
//		DateFormat tf = DateFormat.getTimeInstance(tstyle, DateLocale.dataLocale(local));
//		
//		Date dt=tf.parse(time);
//		
//		dt.getHours();
//		
//		String ts=DateTransform.GetTimeByLocal(dt, tstyle, locale);
//			
//		//System.out.println(dt.getHours());
//		return ts;
//		 
//	 }
//	 
//	 public static Date getHours(String time,String local) throws IOException, ParseException{
//			
//		int tstyle=getTimeStyle(time, local);
//		DateFormat tf = DateFormat.getTimeInstance(tstyle, DateLocale.dataLocale(local));
//			
//		Date dt=tf.parse(time);
//		 
//		return dt;
//		 
//	 }
//
//}
