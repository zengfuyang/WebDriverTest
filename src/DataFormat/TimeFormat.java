//package DataFormat;
//
//
//import java.io.IOException;
//import java.sql.Time;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import org.apache.james.mime4j.field.datetime.DateTime;
//
//import com.google.common.base.Verify;
//import com.ibm.icu.util.ULocale;
//import com.ibm.icu.text.ChineseDateFormat;
//import com.ibm.icu.text.DateFormat;
//import com.ibm.icu.util.Calendar;
//import com.ibm.icu.util.TimeZone;
//
//public class TimeFormat{
//
//	public static void main(String[] args) throws ParseException, IOException{
//		
//		String datetime="13-mag-2015 1.25.16";
//		
//		String[] data=datetime.split(" ");
//		
//		String date=data[0];
//		String time=data[1];
//		
//		String local="it_IT";
//		
//		LocalTime lt=new LocalTime();
//		String excptime=lt.expectedLocalTime(time, local);
//		
//		String d=DateTransform.PaserDate(date, local);
//		String t=DateTransform.PaserTime(time, local);
//		
//		System.out.println("期望时间是： " + date + " " + excptime);
//		
//		System.out.println("实际时间是： " + d + " "+ t);
////#########################################################################
////		String[] ts=time.split(":");
////		
////		int b = Integer.parseInt(ts[0]);
////		String exp = "";
////		if(b >12 & local.equalsIgnoreCase("zh_CN")){
////			
////			exp= "下午" + (b-12) + ":" + ts[1] + ":" + ts[2];
////			
////		}
//		
//		//System.out.println(t);
////		ULocale l=new ULocale("zh_Hans_CN");
////		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, l);
////		
////		Date dd=df.parse("2015-5-13");
//////		
////		//String d=df.format(new Date());
//////		Date dd=df.parse(d);
////		System.out.println(dd);
////		ULocale[] loc=DateFormat.getAvailableULocales();
////		
////		for(int i=0;i<loc.length;i++){
////			System.out.println(loc[i]);
////		}
////		
//		
//		
////		String s=df.format(dd);
////		System.out.println(dd);
////		System.out.println(s);
//		Locale locale=new Locale(local);
////		
////		int dstyle=DateTransform.getDateStyle(date);
////		int tstyle=DateTransform.getTimeStyle(time);
////		
////		DateFormat df = DateFormat.getDateInstance(dstyle, DateLocale.dataLocal());
////		DateFormat tf = DateFormat.getTimeInstance(tstyle, DateLocale.dataLocal());
////		
////		Date dd=df.parse(date);
////		Date dt=tf.parse(time);
////		
////		String ds=DateTransform.GetDateByLocal(dd, dstyle, locale);
////		String ts=DateTransform.GetTimeByLocal(dt, tstyle, locale);
////		
////		System.out.println(ds + ts);
////		DateFormat df=DateFormat.getTimeInstance(DateFormat.MEDIUM,ULocale.ENGLISH);
////		//df.parse("13:57:13");
////		int tstyle=DateTransform.getTimeStyle("13:57:13");
////		System.out.println(tstyle);
//		
//		
////		int style=getEnstyle(date);
////		System.out.println(style);
////		Locale locle=new Locale(local);
////        DateFormat df = DateFormat.getDateInstance(style, DateLocale.dataLocal());
////        Date date1=df.parse(date);
////		System.out.println(GetDateByLocal(date1,style,locle));
////		//Calendar cal = Calendar.getInstance();
////		
////		//DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, ULocale.CHINESE);
////		DateFormat df1 = DateFormat.getTimeInstance(DateFormat.MEDIUM, ULocale.CHINA);
////
////		//String d=df.format(new Date());
////		Date d=df1.parse(time);
////		System.out.println(GetTimeByLocal(d, DateFormat.MEDIUM, locle));
////		System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
////		System.out.println(d.getMinutes());
////		System.out.println(d.getSeconds());
////		
//	}
//	
////	public static int getEnstyle(String enDate) throws IOException{
////		
////		DateFormat df;
////		df=DateFormat.getDateInstance(DateFormat.MEDIUM,DateLocale.dataLocal());
////		try{
////		df.parse(enDate);
////		return DateFormat.MEDIUM;
////		}catch(Exception e){
////		//e.printStackTrace();
////		}
////		df=DateFormat.getDateInstance(DateFormat.LONG,DateLocale.dataLocal());
////		try{
////		df.parse(enDate);
////		return DateFormat.LONG;
////		}catch(Exception e){
////		//e.printStackTrace();
////		}
////		df=DateFormat.getDateInstance(DateFormat.FULL,DateLocale.dataLocal());
////		try{
////		df.parse(enDate);
////		return DateFormat.FULL;
////		}catch(Exception e){
////		//e.printStackTrace();
////		}
////		df=DateFormat.getDateInstance(DateFormat.SHORT,DateLocale.dataLocal());
////		try{
////		      df.parse(enDate);
////		return DateFormat.SHORT;
////		}catch(Exception e){
////		//e.printStackTrace();
////		}
////		return -1;
////		//if return -1, English date format is wrong.
////		}
////	
////	 public static String GetDateByLocal(Date date,int style,Locale locale){ 
////		 DateFormat df; 
////		 if(locale.equals(Locale.CHINA)) 
////		 df = DateFormat.getDateInstance(style, ULocale.CHINA); 
////		 else 
////		 df = DateFormat.getDateInstance(style, locale); 
////		 return df.format(date); 
////		     } 
////	 
////	 public static String GetTimeByLocal(Date time,int style,Locale locale){ 
////		 DateFormat df; 
////		 if(locale.equals(Locale.CHINA)) 
////			  df = DateFormat.getTimeInstance(DateFormat.MEDIUM, ULocale.CHINA);
////		 //df = DateFormat.getDateInstance(style, ULocale.CHINA); 
////		 else 
////			  df = DateFormat.getTimeInstance(DateFormat.MEDIUM, locale); 
////		 return df.format(time); 
////		     } 
//	 
//	 
////	 public static String DateFormatTransform(String sDate,int OrignStyle,int targetStyle,Locale locale){ 
////			    DateFormat df; 
////			 java.util.Date dt = null; 
////			 String longDate = ""; 
////			 if(locale.equals(Locale.CHINA)) 
////			 df = DateFormat.getDateInstance(OrignStyle, ULocale.CHINA);
////			 if(locale.equals(Locale.JAPAN)) 
////				 df = DateFormat.getDateInstance(OrignStyle, ULocale.JAPAN);
////			 if(locale.equals(Locale.GERMAN)) 
////				 df = DateFormat.getDateInstance(OrignStyle, ULocale.GERMAN);
////			 if(locale.equals(Locale.FRANCE)) 
////				 df = DateFormat.getDateInstance(OrignStyle, ULocale.FRANCE);
////			 if(locale.equals(Locale.KOREA)) 
////				 df = DateFormat.getDateInstance(OrignStyle, ULocale.KOREA);
////			 if(locale.equals(Locale.US)) 
////				 df = DateFormat.getDateInstance(OrignStyle, ULocale.US);
////			 else
////			 df = DateFormat.getDateInstance(OrignStyle, locale); 
////			 try { 
////			    dt = df.parse(sDate); 
////			 } catch (ParseException e) { 
////			    e.printStackTrace(); 
////			         } 
////			 if(dt!=null) 
////			 longDate = TimeFormat.GetDateByLocal(dt,targetStyle, locale); 
////			 return longDate; 
////			     } 
//}
