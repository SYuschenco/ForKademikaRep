public class TimeOutput {

	public static void main (String[] args){
		
		
			long sec = System.currentTimeMillis()/1000;
			int min=(int)sec/60;
			int hour=min/60;
			int day=hour/24;
			int year=day/365;
		
		System.out.println(day+":"+hour+":"+min+":"+sec);
		
		System.out.println("Прошло лет с 1970 года - "+year);
		
		System.out.println("Проверка 2016-1970 =     "+(2016-1970));
		

		}
}
