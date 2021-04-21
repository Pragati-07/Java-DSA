/*
 * Problem Description: Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. 
 * The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). 
 * The rules are :
    1) Only one disk can be moved at a time.
    2) A disk can be moved only if it is on the top of a rod.
    3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.
 * */

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		towerOfHanoi(n,'a','c','b');
		sc.close();

	}

	private static void towerOfHanoi(int n, char A, char C, char B) {
		if(n==1) {
			System.out.println(A+" "+C);
			return;
		}
		towerOfHanoi(n-1,A,B,C);
		System.out.println(A+" "+C);
		towerOfHanoi(n-1,B,C,A);
	}

}
