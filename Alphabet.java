/*ALPHABET PATTERN IN INCREASING ORDER AS************************************************************
A
BC
DEF
GHIJ   LIKEWISE. 
INCLUDE ON GLOBAL VARIABLE AS K.
FOR LOOP WILL RUN 7 TIMES.AS LENGTH OF PATTERN IS FIXED.
TYPECASTING THE VALUE OF 'A' AND K TO CHAR.		*/
import java.io.*;
class Alphabet{
	public static void main(String args[]){
		int k=0;
		for(int i=0;i<8;i++){
			for (int j=1;j<=i ;j++ ) {
				if(k<26){
					System.out.print((char)+('A'+k));				
				k++;	
				}
			}
			System.out.println("\n");
		}
	}
}