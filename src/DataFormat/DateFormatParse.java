package DataFormat;

import java.sql.Time;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.util.Calendar;
import com.ibm.icu.util.ULocale;

public class DateFormatParse {
	
	public static String CNDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年M月d日 下午H时mm分ss秒", Locale.CHINA);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy年M月d日 上午H时mm分ss秒", Locale.CHINA);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-M-d H:mm:ss", Locale.CHINA);
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy年M月d日 EEEE 上午HH时mm分ss秒 zzz", Locale.CHINA);
		SimpleDateFormat format4 = new SimpleDateFormat("yyyy年M月d日 EEEE 下午HH时mm分ss秒 zzz", Locale.CHINA);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("zh_CN"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("zh_CN"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("zh_CN"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("zh_CN"));
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format2.parse(date);
			return format2.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format3.parse(date);
			return format3.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format4.parse(date);
			return format4.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String TWDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年M月d日 上午HH時mm分ss秒",Locale.CHINA);
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy年M月d日 下午HH時mm分ss秒",Locale.CHINA);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy年M月d日 EEEE 上午HH時mm分ss秒 zzz",Locale.CHINA);
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy年M月d日 EEEE 下午HH時mm分ss秒 zzz",Locale.CHINA);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("zh_TW"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("zh_TW"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("zh_TW"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("zh_TW"));
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format2.parse(date);
			return format2.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format3.parse(date);
			return format3.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String JADateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年M月d日 HH時mm分ss秒 zzz",Locale.JAPAN);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("ja_JP"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("ja_JP"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("ja_JP"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("ja_JP"));
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String KODateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("yy. MM. dd 아침 H:mm", Locale.KOREA);
		SimpleDateFormat format1 = new SimpleDateFormat("yy. MM. dd 오후 H:mm", Locale.KOREA);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy. MM. dd 아침 H:mm:ss", Locale.KOREA);
		SimpleDateFormat format3 = new SimpleDateFormat("yyyy. MM. dd 오후 H:mm:ss", Locale.KOREA);
		SimpleDateFormat format4 = new SimpleDateFormat("yyyy년M월d일 (월) 아침 H시mm분ss초", Locale.KOREA);
		SimpleDateFormat format5 = new SimpleDateFormat("yyyy년M월d일 (월) 오후 H시mm분ss초", Locale.KOREA);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("ko-KO"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("ko_KO"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("ko_KO"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("ko_KO"));
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format2.parse(date);
			return format2.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format3.parse(date);
			return format3.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format4.parse(date);
			return format4.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format5.parse(date);
			return format5.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String DEDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("EEEE, d. MMMM y HH:mm 'Uhr' zzz", Locale.GERMANY);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("de_DE"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("de_DE"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,new ULocale("de_DE"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("de_DE"));
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String FRDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("EEEE dd MMMM yyyy HH 'h' mm zzz", Locale.FRANCE);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("fr_FR"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("fr_FR"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("fr_FR"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("fr_FR"));
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String ITDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy H.mm",Locale.ITALIAN);
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy H.mm.ss",Locale.ITALIAN);
		SimpleDateFormat format2 = new SimpleDateFormat("dd MMMM yyyy H.mm.ss zzz", Locale.ITALIAN);
		SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd MMMM yyyy H.mm.ss zzz", Locale.ITALIAN);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("it_IT"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("it_IT"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("it_IT"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("it_IT"));
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format2.parse(date);
			return format2.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format3.parse(date);
			return format3.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String ESDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss",Locale.forLanguageTag("es_ES"));
		
		SimpleDateFormat format1 = new SimpleDateFormat("EEEE dd 'de' MMM 'de' yyyy H'H'mm zzz",Locale.forLanguageTag("es_ES"));
		//目前不支持西班牙FULL的日期格式
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("es_ES"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("es_ES"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("es_ES"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("es_ES"));
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
	}
	
	public static String ENDateParse(String date) throws ParseException{
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy H:mm", Locale.ENGLISH);
		SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy H:mm:ss", Locale.ENGLISH);
		SimpleDateFormat format2 = new SimpleDateFormat("dd MMMM yyyy H:mm:ss zzz", Locale.ENGLISH);
		SimpleDateFormat format3 = new SimpleDateFormat("EEEE dd MMMM yyyy H:mm:ss zzz", Locale.ENGLISH);
		
		DateFormat lformat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG, new ULocale("en_US"));
		DateFormat fformat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, new ULocale("en_US"));
		DateFormat sformat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT, new ULocale("en_US"));
		DateFormat mformat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM, new ULocale("en_US"));
		
		try{
			Date d=fformat.parse(date);
			return fformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=lformat.parse(date);
			return lformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=mformat.parse(date);
			return mformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=sformat.parse(date);
			return sformat.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format.parse(date);
			return format.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format1.parse(date);
			return format1.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format2.parse(date);
			return format2.format(d);
		}catch(Exception e){}
		
		try{
			Date d=format3.parse(date);
			return format3.format(d);
		}catch(Exception e){}
		
		//System.out.println("Cannot Parse the Date String, Please check it manually!");
		return null;
		
	}
	
	public static String ParseDate(String date,String locale) throws ParseException{
		
		String time="";
		switch(locale){
			case("zh_CN"):
				time=CNDateParse(date);break;
			case("zh_TW"):
				time=TWDateParse(date);break;
			case("ja_JP"):
				time=JADateParse(date);break;
			case("ko_KO"):
				time=KODateParse(date);break;
			case("de_DE"):
				time=DEDateParse(date);break;
			case("fr_FR"):
				time=FRDateParse(date);break;
			case("es_ES"):
				time=ESDateParse(date);break;
			case("it_IT"):
				time=ITDateParse(date);break;
			case("en_US"):
				time=ENDateParse(date);break;
		}
		
		if(time==null){
			
			throw new RuntimeException("The Date String cannot be Parse, Please check it by manual!");
		}
		
		return time;
	}
	
	public static void main(String[] args) throws ParseException{
	
		String sh=ParseDate("2011/3/14 下午 3:08", "zh_TW");
		String medium=ParseDate("2011/3/14 下午 03:08:00", "zh_TW");
		String lo=ParseDate("2011年3月14日 下午03時08分00秒", "zh_TW");
		String full=ParseDate("2011年3月14日 星期一 下午03時08分00秒 CST", "zh_TW");
		
		System.out.println(sh);
		System.out.println(medium);
		System.out.println(lo);
		System.out.println(full);
	}
	

}
