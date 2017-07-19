//package DataFormat;
//
//import java.io.IOException;
//import java.text.ParseException;
//import java.util.Date;
//import java.util.Properties;
//
//import com.ibm.icu.text.DateFormat;
//import com.ibm.icu.util.Calendar;
//import com.ibm.icu.util.ULocale;
//
//public class DateLocale {
//	
//	public static ULocale dataLocale(String locale) throws IOException{
//		
//		if(locale.contentEquals("en_US")){
//			
//			ULocale english=ULocale.ENGLISH;
//			return english;
//		}if(locale.contentEquals("zh_CN")){
//			
//			ULocale china=ULocale.CHINA;
//			return china;
//		}if(locale.contentEquals("ja_JP")){
//			
//			ULocale japan=ULocale.JAPANESE;
//			return japan;
//		}if(locale.contentEquals("zh_TW")){
//			
//			ULocale taiwan=ULocale.TAIWAN;
//			return taiwan;
//		}if(locale.contentEquals("ko_KO")){
//			
//			ULocale korea=ULocale.KOREA;
//			return korea;
//		}if(locale.contentEquals("de_DE")){
//			
//			ULocale german=ULocale.GERMANY;
//			return german;
//		}if(locale.contentEquals("fr_FR")){
//			
//			ULocale france=ULocale.FRANCE;
//			return france;
//		}if(locale.contentEquals("es_ES")){
//			
////			ULocale Spain=new ULocale("es_ES");
////			return Spain;
//		}
//		
//		System.out.println("The locale isn't corrent!");
//		return null;
//	}
//	
//	public static void main(String[] args) throws ParseException{
//		
//		Date date=new Date();
//		
//		DateFormat zh = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("zh_CN"));
//		DateFormat tw = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("zh_TW"));
//		DateFormat ja = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("ja_JP"));
//		DateFormat en = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("en_US"));
//		DateFormat de = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("de_DE"));
//		DateFormat fr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("fr_FR"));
//		DateFormat ko = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("ko_KO"));
//		DateFormat es = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, new ULocale("es_ES"));
//		
//		Calendar cal= de.getCalendar();
//		
//		
//		//Date d=yest.parse("May 5, 2015");
//
//		
//		
//		
//		
//		String zhd=zh.format(date);
//		String twd=tw.format(date);
//		String jad=ja.format(date);
//		String end=en.format(date);
//		String ded=de.format(date);
//		String frd=fr.format(date);
//		String kod=ko.format(date);
//		String esd=es.format(date);
//		
//		
//		//Date dd=df.parse(d);
//		System.out.println("zh: " + zhd);
//		System.out.println("tw: " + twd);
//		System.out.println("ja: " + jad);
//		System.out.println("en: " + end);
//		System.out.println("de: " + ded);
//		System.out.println("fr: " + frd);
//		System.out.println("ko: " + kod);
//		System.out.println("es: " + esd);
//		
//	}
//
//
//}
