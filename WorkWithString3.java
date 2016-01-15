public class WorkWithString {

	public static void main (String[] args){
		
	double value=25.6;
	String sv= String.valueOf(value);
	
	int it=sv.indexOf(".");
	
		
	System.out.println(sv.substring(0, it)+"\n"+sv.substring(it+1));
			
	}
}
