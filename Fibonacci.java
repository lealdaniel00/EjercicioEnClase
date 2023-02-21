public class Fibonacci{
	private int fiboACalcular;
Fibonacci(int a){
		fiboACalcular=a;
	}
	
	public int getFibo(){
		return calcularFibo(fiboACalcular);
	}
	private int calcularFibo(int a){
		if(a==1)
			return 0;
		if(a==2)
			return 1;
		return calcularFibo(a-1)+calcularFibo(a-2);
	}
	
}