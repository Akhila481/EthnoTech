public class prod_except_self {
	public static void main(String[]args) {
		int[]a= {1,2,3};
		for(int i=0;i<a.length;i++) {
			int p=1;
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					p=p*a[j];
				}
			}
			System.out.print(p+" ");
		}
	}
}