//package DataFormat;
//
//public class LocalTime {
//	
//	public String expectedLocalTime(String time, String local){
//		
//		String[] ts=time.split(":");
//		
//		int b = Integer.parseInt(ts[0]);
//		
//		String exp = time;
//		
//		if(local.equalsIgnoreCase("zh_CN")){
//			
//			if(b >12){
//				
//				exp= "下午" + (b-12) + ":" + ts[1] + ":" + ts[2];
//				
//			}else{
//				
//				exp= "上午" + b + ":" + ts[1] + ":" + ts[2];
//				
//			}
//			
//		}else if(local.equalsIgnoreCase("zh_TW")){
//			
//			if(b >12){
//				
//				exp= "下午" + (b-12) + ":" + ts[1] + ":" + ts[2];
//				
//			}else{
//				
//				exp= "上午" + b + ":" + ts[1] + ":" + ts[2];
//				
//			}
//		}else if(local.equalsIgnoreCase("ko_KO")){
//			
//			if(b >12){
//				
//				exp= "오후" + (b-12) + ":" + ts[1] + ":" + ts[2];
//				
//			}else{
//				
//				exp= "오전" + b + ":" + ts[1] + ":" + ts[2];
//				
//			}
//		}
//
//	
//		//System.out.println(exp);
//		
//		
//		
//		return exp;
//		
//	}
//
//}
