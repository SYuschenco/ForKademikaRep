public class TimeOutput {

	public static void main (String[] args){
		
		
			long sec = System.currentTimeMillis()/1000;
			
			int day= (int)sec/(60*60*24);
			int hour = (int)sec/(60*60)-(day*24);
			int min = (int)((sec/60)-(day*24*60)-(hour*60));
		//	int sec1= (int)(sec-((day*24*60*60)-(hour*60*60)-(min*60)));   - почему скобки здесь влияют на результат?
			int sec1= (int)(sec-(day*24*60*60)-(hour*60*60)-(min*60));
			
		
		System.out.println(day+":"+hour+":"+min+":"+sec1);
		

		}
}
