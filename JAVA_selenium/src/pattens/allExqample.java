package pattens;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.testng.internal.annotations.IDataProvidable;

public class allExqample {
public static void main(String[] args) {
	
	
	int n ;
	pattens1( n=4);
	pattens2( n=4);
	pattens3( n=4);
	pattens4( n=4);
	pattens(n=5);
	pattens28(n=5);
}



static void pattens28(int n) {
	for( int row =0;row < 2*n;row++) {
		int totalColumInRow=row>n?2*n-row:row;
		
		int noOFSpaces=n-totalColumInRow;
		
		for( int s=0;s<noOFSpaces;s++) {
			System.out.print(" ");
			}
		
		for( int col =0;col<totalColumInRow;col++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	System.out.println("______________________");
}










static void pattens3(int n) {
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <=n-row+1; col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("______________________");
  }




static void pattens4(int n) {
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <=row; col++) {
			System.out.print( col+" ");
		}
		System.out.println();
	}
	System.out.println("______________________");
  }


static void pattens2(int n) {
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <=n; col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("______________________");
  }



static void pattens(int n) {
	for( int row =1;row < 2*n;row++) {
		int totalColumInRow=row>n?2*n-row:row;
		for( int col =0;col<totalColumInRow;col++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
	System.out.println("______________________");
}









static void pattens1(int n) {
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <=row; col++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("______________________");
  }
 }
