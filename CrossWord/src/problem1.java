import java.util.Scanner;

public class problem1 {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str1 = "CAT";
	String str2 = "BALL";
	
	int row = 1 ;
	int col = 2 ;
	
	char arr[][] = new char[10][10];
	//Loop to find the position
	for(int i = 0 ; i <arr.length ; i++ ) {
		
		for(int j = 0 ; j < arr.length ; j++) {
			
			
			for(int l = row , m = 0 ; l < str1.length()+1 ; l++ , m++){
				arr[l][col] = str1.charAt(m);
				
			}
						
			if( i != row && j !=col || i != row+1) {
				arr[i][j] ='*';
			}
			
		}
	}
	
	
	
	//Loop to find the match element in str1 and str2
	char match = 0;
	for(int i = 0 ; i<=str1.length()-1 ; i++) {
		for(int j = 0 ; j < str2.length() -1; j++) {
			
			if(str1.charAt(i) == str2.charAt(j)) {
				match = str1.charAt(i);
//				System.out.println(match);
			}
		}
	}
	// To place the element horizontally where it matches
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					
					if(arr[i][j] == match) {
						int a = 0 ;
						for(int l = 0 ; l<str2.length();l++){
							if(str2.charAt(l)== match) {
								a = l ;
								
							}
						}
						for(int b=0 ; b<str2.length();b++) {
							arr[i][col-a] = str2.charAt(b);
							--a ;
						}
									
					}
				}

			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
}
}
