package Main;

import java.util.Scanner;

public class TicTacToe {
	public static String ticTacBoard[][]= {{"00","01","02"},{"10","11","12"},{"20","21","22"}};
	public static int playerCount=0;
	
	public static void print() {
		for(int i =0;i<ticTacBoard.length;i++) {
			for(int j=0;j<ticTacBoard[i].length;j++) {
				System.out.print(ticTacBoard[i][j]+" | ");
			}
			System.out.println();
		}
	}
	public static void greetingMessage(Scanner sc){
		int x=0;
		int y=0;
		System.out.println(playerCount%2==0 ? "Player X" : "Player O" );
		System.out.print("Enter the X value : ");
		x=sc.nextInt();
		System.out.print("Enter the Y value : ");
		y=sc.nextInt();
		System.out.println(insert(x,y,playerCount%2==0?"X":"O"));
	}
	public static String insert(int x , int y, String playerName) {
		if((x<3&&x>=0)&&(y<3&&y>=0)){
			if(!ticTacBoard[x][y].equals("X")&&!ticTacBoard[x][y].equals("O")){
				ticTacBoard[x][y]=playerName;
				print();
				return "Inserted";
			}
			else {
				return "Already Occupied";
			}
				}
		return "Unexpected Place";
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		print();
		greetingMessage(sc);
	}
}

