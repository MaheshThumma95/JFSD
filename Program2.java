/*
2. Write A Program to Print 

 1 1 1 1
 2 2 2 2
 3 3 3 3
 4 4 4 4 

 * 
 */

public class Program2 {
    public static void main(String[] args) {
		//Solution -1
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


		//Solution-2
		/*
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-1; j++) {
			
				for(int k=1;k<=n-1;k++) {
					if(k==i) {
						System.out.print(" "+i);
					}
					
				}				
			}
			System.out.println();
		}
		 */
	}
}

