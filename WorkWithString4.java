public class WorkWithString {

	public static void main (String[] args){
		
	String s= "Education is the most powerful weapon which you can use to change the world";
	
	String t= "An investment i knowledge pays the best interst";

	
	System.out.println((s.substring(s.lastIndexOf("use"),s.lastIndexOf("use")+"use".length()))+" "+
			(t.substring(t.lastIndexOf("knowledge"),t.lastIndexOf("knowledge")+"knowledge".length()))+" "+
			(s.substring(s.lastIndexOf("to change the world"),s.lastIndexOf("to change the world")+
			"to change the world".length())));
			
	}
}
