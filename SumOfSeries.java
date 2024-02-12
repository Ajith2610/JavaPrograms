package programs;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int sum=0;
		int num=5;
		for(int i=0;i<=num;i++){
			a=a*10+1;
			System.out.println(a+" ");
			sum=sum+a;
		}
			System.out.println();
			System.out.println(sum);
	}

}
