
public class LessonsKademika {
	
	
	public static void main (String[] args){
		double m=10.0;
		System.out.println(square(m));
		
		int n=100;
		System.out.println(square(n));
		}
	
		static double square(double a){
			double n = a*a;
			return n;
		}
		
		@Override
		static int square(int a){
			int m = Math.pow(a, 2);
			return m;
		}

}
