import java.util.Scanner;

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
			        if(posiciones_true[pos]=="X" ||posiciones_true[pos]=="0") {
			        	System.out.println("Put a number that is not taken");
			        	System.out.println(contador);
			        }else {
			        	falso=true;
			        }
				}
				posiciones_true[pos]="X";
		   
			}else {
				boolean falso=false;
				while(falso!=true) {
					System.out.println("Put the number where you want to place the 0");
			        pos = sc.nextInt();
			        if(posiciones_true[pos]=="X" ||posiciones_true[pos]=="0") {
			        	System.out.println("Put a number that is not taken");
			        }else {
			        	falso=true;
			        }
				}
				posiciones_true[pos]="0";
		   
				
			}
			print_panel(posiciones_true);
			partida_terminada=check_win(posiciones_true);
			contador+=1;
			if(contador==9) {
				System.out.println("End in tie");
				partida_terminada=true;
			}
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
        	System.out.println("End with 0,1,2");
        	return true;
        }
        if(posiciones_true[3]=="X" && posiciones_true[4]=="X" &&posiciones_true[5]=="X"){
        	System.out.println("End with 3,4,5");
        	return true;
        }
        if(posiciones_true[6]=="X" && posiciones_true[7]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("End with 6,7,8");
        	return true;
        }
        if(posiciones_true[0]=="X" && posiciones_true[3]=="X" &&posiciones_true[6]=="X"){
        	System.out.println("End with 0,3,6");
        	return true;
        }
        if(posiciones_true[1]=="X" && posiciones_true[4]=="X" &&posiciones_true[7]=="X"){
        	System.out.println("End with 1,4,7");
        	return true;
        }
        if(posiciones_true[2]=="X" && posiciones_true[5]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("End with 2,5,8");
        	return true;
        }
        if(posiciones_true[0]=="X" && posiciones_true[4]=="X" &&posiciones_true[8]=="X"){
        	System.out.println("End with 0,4,8");
        	return true;
        }
        if(posiciones_true[2]=="X" && posiciones_true[4]=="X" &&posiciones_true[6]=="X"){
        	System.out.println("End with 2,4,6");
        	return true;
        }
        if (posiciones_true[0]=="0" && posiciones_true[1]=="0" && posiciones_true[2]=="0") {
        	System.out.println("End with 0,1,2");
        	return true;
        }
        if(posiciones_true[3]=="0" && posiciones_true[4]=="0" &&posiciones_true[5]=="0"){
        	System.out.println("End with 3,4,5");
        	return true;
        }
        if(posiciones_true[6]=="0" && posiciones_true[7]=="0" &&posiciones_true[8]=="0"){
        	System.out.println("End with 6,7,8");
        	return true;
        }
        if(posiciones_true[0]=="0" && posiciones_true[3]=="0" &&posiciones_true[6]=="0"){
        	System.out.println("End with 0,3,6");
        	return true;
        }
        if(posiciones_true[1]=="0" && posiciones_true[4]=="0" &&posiciones_true[7]=="0"){
        	System.out.println("End with 1,4,7");
        	return true;
        }
        if(posiciones_true[2]=="0" && posiciones_true[5]=="0" &&posiciones_true[8]=="0"){
        	System.out.println("End with 2,5,8");
        	return true;
        }
        if(posiciones_true[0]=="0" && posiciones_true[4]=="0" &&posiciones_true[8]=="0"){
        	System.out.println("End with 0,4,8");
        	return true;
        }
        if(posiciones_true[2]=="0" && posiciones_true[4]=="0" &&posiciones_true[6]=="0"){
        	System.out.println("End with 2,4,6");
        	return true;
        }
        
		return false;
	}

}
