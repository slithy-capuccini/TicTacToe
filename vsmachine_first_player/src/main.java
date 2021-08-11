import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pos=-1;
		int contador=0;
		String[] posiciones_true=new String[9];
		for (int i=0;i<posiciones_true.length;i++) {
			posiciones_true[i]=Integer.toString(i);
		}
		print_panel(posiciones_true);
		boolean partida_terminada=false;
		while(partida_terminada!=true) {
			if(contador%2==0) {
				boolean falso=false;
				while(falso!=true) {
					System.out.println("Put the number where you want to place the X");
			        pos = sc.nextInt();
			        if(posiciones_true[pos]=="X" ||posiciones_true[pos]=="O") {
			        	System.out.println("Put a number that is not taken");
			        }else {
			        	falso=true;
			        }
				}
				posiciones_true[pos]="X";
		   
			}else {
				int jugada=comp_move(posiciones_true);
				System.out.println(jugada);
				posiciones_true[jugada]="O";
			}
			print_panel(posiciones_true);
			partida_terminada=check_win(posiciones_true);
			contador+=1;
			if(contador==10) {
				System.out.println("End in tie");
				partida_terminada=true;
				
			}
		}
	}
	public static int comp_move(String[] posiciones_true) {
		Random rand = new Random();
		//win the game
		//TOP LINE
		if((posiciones_true[0]=="O"&&posiciones_true[1]=="O")&&posiciones_true[2]!="X") {
			return 2;
		}else if((posiciones_true[0]=="O"&&posiciones_true[2]=="O")&&posiciones_true[1]!="X"){
			return 1;
		}else if((posiciones_true[1]=="O"&&posiciones_true[2]=="O")&&posiciones_true[0]!="X"){
			return 0;
		//MID LINE
		}else if((posiciones_true[3]=="O"&&posiciones_true[4]=="O")&&posiciones_true[5]!="X"){
			return 5;
		}else if((posiciones_true[3]=="O"&&posiciones_true[5]=="O")&&posiciones_true[4]!="X"){
			return 4;
		}else if((posiciones_true[4]=="O"&&posiciones_true[5]=="O")&&posiciones_true[3]!="X"){
			return 3;
		//BOT LANE
		}else if((posiciones_true[6]=="O"&&posiciones_true[7]=="O")&&posiciones_true[8]!="X"){
			return 8;
		}else if((posiciones_true[6]=="O"&&posiciones_true[8]=="O")&&posiciones_true[7]!="X"){
			return 7;
		}else if((posiciones_true[7]=="O"&&posiciones_true[8]=="O")&&posiciones_true[6]!="X"){
			return 6;
		//Left lane
		}else if((posiciones_true[0]=="O"&&posiciones_true[3]=="O")&&posiciones_true[6]!="X"){
			return 6;
		}else if((posiciones_true[0]=="O"&&posiciones_true[6]=="O")&&posiciones_true[3]!="X"){
			return 3;
		}else if((posiciones_true[3]=="O"&&posiciones_true[6]=="O")&&posiciones_true[0]!="X"){
			return 0;
		//mid lane
		}else if((posiciones_true[1]=="O"&&posiciones_true[4]=="O")&&posiciones_true[7]!="X"){
			return 7;
		}else if((posiciones_true[1]=="O"&&posiciones_true[7]=="O")&&posiciones_true[4]!="X"){
			return 4;
		}else if((posiciones_true[4]=="O"&&posiciones_true[7]=="O")&&posiciones_true[1]!="X"){
			return 1;
		//rigth lane
		}else if((posiciones_true[2]=="O"&&posiciones_true[5]=="O")&&posiciones_true[8]!="X"){
			return 8;
		}else if((posiciones_true[2]=="O"&&posiciones_true[8]=="O")&&posiciones_true[5]!="X"){
			return 5;
		}else if((posiciones_true[5]=="O"&&posiciones_true[8]=="O")&&posiciones_true[2]!="X"){
			return 2;
		//diagonal to rigth
		}else if((posiciones_true[0]=="O"&&posiciones_true[4]=="O")&&posiciones_true[8]!="X"){
			return 8;
		}else if((posiciones_true[0]=="O"&&posiciones_true[8]=="O")&&posiciones_true[4]!="X"){
			return 4;
		}else if((posiciones_true[4]=="O"&&posiciones_true[8]=="O")&&posiciones_true[0]!="X"){
			return 0;
		//diagonal to left
		}else if((posiciones_true[2]=="O"&&posiciones_true[4]=="O")&&posiciones_true[6]!="X"){
			return 6;
		}else if((posiciones_true[2]=="O"&&posiciones_true[6]=="O")&&posiciones_true[4]!="X"){
			return 4;
		}else if((posiciones_true[4]=="O"&&posiciones_true[6]=="O")&&posiciones_true[2]!="X"){
			return 2;
			
			
			
			
			
		//TOP LINE
		}else if((posiciones_true[0]=="X"&&posiciones_true[1]=="X")&&posiciones_true[2]!="O") {
			return 2;
		}else if((posiciones_true[0]=="X"&&posiciones_true[2]=="X")&&posiciones_true[1]!="O"){
			return 1;
		}else if((posiciones_true[1]=="X"&&posiciones_true[2]=="X")&&posiciones_true[0]!="O"){
			return 0;
		//MID LINE
		}else if((posiciones_true[3]=="X"&&posiciones_true[4]=="X")&&posiciones_true[5]!="O"){
			return 5;
		}else if((posiciones_true[3]=="X"&&posiciones_true[5]=="X")&&posiciones_true[4]!="O"){
			return 4;
		}else if((posiciones_true[4]=="X"&&posiciones_true[5]=="X")&&posiciones_true[3]!="O"){
			return 3;
		//BOT LANE
		}else if((posiciones_true[6]=="X"&&posiciones_true[7]=="X")&&posiciones_true[8]!="O"){
			return 8;
		}else if((posiciones_true[6]=="X"&&posiciones_true[8]=="X")&&posiciones_true[7]!="O"){
			return 7;
		}else if((posiciones_true[7]=="X"&&posiciones_true[8]=="X")&&posiciones_true[6]!="O"){
			return 6;
		//Left lane
		}else if((posiciones_true[0]=="X"&&posiciones_true[3]=="X")&&posiciones_true[6]!="O"){
			return 6;
		}else if((posiciones_true[0]=="X"&&posiciones_true[6]=="X")&&posiciones_true[3]!="O"){
			return 3;
		}else if((posiciones_true[3]=="X"&&posiciones_true[6]=="X")&&posiciones_true[0]!="O"){
			return 0;
		//mid lane
		}else if((posiciones_true[1]=="X"&&posiciones_true[4]=="X")&&posiciones_true[7]!="O"){
			return 7;
		}else if((posiciones_true[1]=="X"&&posiciones_true[7]=="X")&&posiciones_true[4]!="O"){
			return 4;
		}else if((posiciones_true[4]=="X"&&posiciones_true[7]=="X")&&posiciones_true[1]!="O"){
			return 1;
		//rigth lane
		}else if((posiciones_true[2]=="X"&&posiciones_true[5]=="X")&&posiciones_true[8]!="O"){
			return 8;
		}else if((posiciones_true[2]=="X"&&posiciones_true[8]=="X")&&posiciones_true[5]!="O"){
			return 5;
		}else if((posiciones_true[5]=="X"&&posiciones_true[8]=="X")&&posiciones_true[2]!="O"){
			return 2;
		//diagonal to rigth
		}else if((posiciones_true[0]=="X"&&posiciones_true[4]=="X")&&posiciones_true[8]!="O"){
			return 8;
		}else if((posiciones_true[0]=="X"&&posiciones_true[8]=="X")&&posiciones_true[4]!="O"){
			return 4;
		}else if((posiciones_true[4]=="X"&&posiciones_true[8]=="X")&&posiciones_true[0]!="O"){
			return 0;
		//diagonal to left
		}else if((posiciones_true[2]=="X"&&posiciones_true[4]=="X")&&posiciones_true[6]!="O"){
			return 6;
		}else if((posiciones_true[2]=="X"&&posiciones_true[6]=="X")&&posiciones_true[4]!="O"){
			return 4;
		}else if((posiciones_true[4]=="X"&&posiciones_true[6]=="X")&&posiciones_true[2]!="O"){
			return 2;
		//take a corner up-left
		}else if(posiciones_true[0]!="X" &&posiciones_true[0]!="O") {
			return 0;
		//take a corner up-right
		}else if(posiciones_true[2]!="X" &&posiciones_true[2]!="O") {
			return 2;
		//take a corner down-left
		}else if(posiciones_true[6]!="X" &&posiciones_true[6]!="O") {
			return 6;
		//take a corner down-right
		}else if(posiciones_true[8]!="X" &&posiciones_true[8]!="O") {
			return 8;
		//take center
		}else if(posiciones_true[4]!="X" &&posiciones_true[4]!="O") {
			return 4;
		//take a edge random
		}else {
			boolean falsete=false;
			int contadore=0;
			int random = 0;
			while(falsete!=true) {
				random=rand.nextInt(4);
				if(posiciones_true[random]!="X"||posiciones_true[random]!="O") {
					falsete=true;
					contadore++;
				}else if(contadore==5) {
					System.out.println("Game end in tie");
					falsete=true;
				}
			}					
			return random;


		}
	}
	public static void print_panel(String[] posiciones_true) {
        System.out.println("|¯¯¯|¯¯¯|¯¯¯|");
		System.out.println("| "+posiciones_true[0]+" | "+posiciones_true[1]+" | "+posiciones_true[2]+" |");
		System.out.println("|   |   |   |");
		System.out.println("|¯¯¯|¯¯¯|¯¯¯|");
		System.out.println("| "+posiciones_true[3]+" | "+posiciones_true[4]+" | "+posiciones_true[5]+" |");
		System.out.println("|   |   |   |");
		System.out.println("|¯¯¯|¯¯¯|¯¯¯|");
		System.out.println("| "+posiciones_true[6]+" | "+posiciones_true[7]+" | "+posiciones_true[8]+" |");
		System.out.println("|   |   |   |");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯");
	}
	public static boolean check_win(String[] posiciones_true) {
        if (posiciones_true[0]=="X" && posiciones_true[1]=="X" && posiciones_true[2]=="X") {
        	System.out.println("X WIN with 0,1,2");
        	return true;
        }
        if(posiciones_true[3]=="X" && posiciones_true[4]=="X" &&posiciones_true[5]=="X"){
        	System.out.println("X WIN with 3,4,5");
        	return true;
        }
        if(posiciones_true[6]=="X" && posiciones_true[7]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("X WIN with 6,7,8");
        	return true;
        }
        if(posiciones_true[0]=="X" && posiciones_true[3]=="X" &&posiciones_true[6]=="X"){
        	System.out.println("X WIN with 0,3,6");
        	return true;
        }
        if(posiciones_true[1]=="X" && posiciones_true[4]=="X" &&posiciones_true[7]=="X"){
        	System.out.println("X WIN with 1,4,7");
        	return true;
        }
        if(posiciones_true[2]=="X" && posiciones_true[5]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("X WIN with 2,5,8");
        	return true;
        }
        if(posiciones_true[0]=="X" && posiciones_true[4]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("X WIN with 0,4,8");
        	return true;
        }
        if(posiciones_true[2]=="X" && posiciones_true[4]=="X" &&posiciones_true[6]=="X"){
        	System.out.println("X WIN with 2,4,6");
        	return true;
        }
        if (posiciones_true[0]=="O" && posiciones_true[1]=="O" && posiciones_true[2]=="O") {
        	System.out.println("O WIN with 0,1,2");
        	return true;
        }
        if(posiciones_true[3]=="O" && posiciones_true[4]=="O" &&posiciones_true[5]=="O"){
        	System.out.println("O WIN with 3,4,5");
        	return true;
        }
        if(posiciones_true[6]=="O" && posiciones_true[7]=="O" &&posiciones_true[8]=="O"){
        	System.out.println("O WIN with 6,7,8");
        	return true;
        }
        if(posiciones_true[0]=="O" && posiciones_true[3]=="O" &&posiciones_true[6]=="O"){
        	System.out.println("O WIN with 0,3,6");
        	return true;
        }
        if(posiciones_true[1]=="O" && posiciones_true[4]=="O" &&posiciones_true[7]=="O"){
        	System.out.println("O WIN with 1,4,7");
        	return true;
        }
        if(posiciones_true[2]=="O" && posiciones_true[5]=="O" &&posiciones_true[8]=="O"){
        	System.out.println("O WIN with 2,5,8");
        	return true;
        }
        if(posiciones_true[0]=="O" && posiciones_true[4]=="O" &&posiciones_true[8]=="O"){
        	System.out.println("O WIN with 0,4,8");
        	return true;
        }
        if(posiciones_true[2]=="O" && posiciones_true[4]=="O" &&posiciones_true[6]=="O"){
        	System.out.println("O WIN with 2,4,6");
        	return true;
        }
        
		return false;
	}

}