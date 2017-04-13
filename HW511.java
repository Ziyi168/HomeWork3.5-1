
public class HW511 {
	public static void main (String[]args){
		
		double resultPower = h(2.0) ;
		System.out.println(resultPower);
		
		double returnAdd = f (3.0, 5.0);
		System.out.println(returnAdd);
		
		
		double returnG = g(9, 5, 3);
		System.out.println(returnG);
		

}               //h(x) = x^10
				static double h(double x){
					        double product = 1;
							for (int i =1; i <= 10; i++){	
							product = product*x;	
							}
							return product;
				}
					
				//f(x,y) = x + y
				static double f(double x,double y){
					return x+y;
				}

				// g(x,y,z) = squrt(x) + absolute(y) + z^y
				static double g (double x, int y, double z){
             					
					double result;
					
					result = squrt(x) + abs(y) + pow(z, y);
				
					System.out.println("squrt(x):" + squrt(x));
					System.out.println("abs(y):" + abs(y));
					System.out.println("pow(z, y):" + pow(z, y));

					return result;
				
				
				}
				
				private static double squrt(double myNumber) {
					
					double result1;
					double result2;
					 
					
					result1 = myNumber / 2.0;
					result2= (result1 + (myNumber / result1)) / 2.0;
					  
					while(abs(result1 - result2) >= 0.000000001) {
					    
						result1 = result2;
						
						result2 = (result1 + (myNumber / result1)) / 2.0;
					}
					
					return result2;
					  
				}
				
				
				private static double abs(double myNumber) {
					
					if(myNumber < 0){
						
						myNumber = myNumber * -1;
					}

					
					return myNumber;
				}
				
				private static double pow(double myNumber, int degree) {
					
					double result;
					
					result = 1;
					
					if(degree == 0){
						
						result = 1;
					}else if(degree > 0){
					
					
						for(int i=0; i<degree; i++){
							
							result = result * myNumber;
							
						}
						
					}else{
						
						for(int i=0; i<abs(degree); i++){
							
							result = result / myNumber;
							
						}
					}
					
					return result;
				}
				
// 2.Implement a java program to use Math.pow, Math.sqrt, Math.abs, Math.random, Math.max, Math.min,  Math.round, Math.ceil, Math.floor from Math Class Javadoc.
}