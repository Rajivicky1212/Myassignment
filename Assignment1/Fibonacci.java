package Assignment1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=7;
		long[] series=new long[limit];
		series[0]=1;
		series[1]=1;
		for(int i=2;i<limit;i++) {
			series[i]=series[i-1]+series[i-2];
		}
			System.out.println("print Fibonacci series upto"+limit);
		
			for(int i=0;i<limit;i++) {
				System.out.println(series[i]+"");
				
			}
		}
		
		

	}



