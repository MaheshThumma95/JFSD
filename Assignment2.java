public class Assignment2 {
    public static void main(String[] args) {
		int n=5;
		
		for(int i=0; i<n-1;i++) {
			for(int j=0; j<n-1; j++) {
				
				if(i==0) {
					System.out.print(" 1");	
				}
				if(i==1) {
					System.out.print(" 2");	
				}
				if(i==2) {
					System.out.print(" 3");
				}
				if(i==3) {
					System.out.print(" 4");
				}			
				
			}
			System.out.println();
		}
	}
}
