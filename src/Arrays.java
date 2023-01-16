import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a= new int[5];
		int[] b= {1,2,3,4,5,6};
		a[3]=3;
		a[4]=4;
		a[0]=0;
		a[1]=1;
		a[2]=2;
		int j=a.length;
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[j-1]);
//			j--;
//		}
		for (int k:a) {
			if(k%2==0) {
			System.out.println(k);
			}
		}
		
		ArrayList c=new ArrayList();
		c.add(2);
		c.add(3);

		System.out.println(c.get(1));
		
		

	}

}
