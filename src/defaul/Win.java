package defaul;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Win {
	static boolean gameEnd = false;
	public static boolean checkWin(String entity, int[][] clicks) {
		if (entity.equals("player1")) {
	        // println("fewbfei")
	        //  println(clicks[0][0]);
	        //  println(clicks[0][1]);
	        //  println(clicks[0][2]);
	        if (clicks[0][0] == 1 && clicks[0][1] == 1 && clicks[0][2] == 1) {
	            //println("e");
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][0] == 1 && clicks[1][0] == 1 && clicks[2][0] == 1) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[1][0] == 1 && clicks[1][1] == 1 && clicks[1][2] == 1) {
	           // s = 1;
	            return true;
	        }
	        else if (clicks[0][1] == 1 && clicks[1][1] == 1 && clicks[2][1] == 1) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[2][0] == 1 && clicks[2][1] == 1 && clicks[2][2] == 1) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][2] == 1 && clicks[1][2] == 1 && clicks[2][2] == 1) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][0] == 1 && clicks[1][1] == 1 && clicks[2][2] == 1) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][2] == 1 && clicks[1][1] == 1 && clicks[2][0] == 1) {
	            //s = 1;
	            return true;
	        }
	        return false;
	    }
	    else if (entity.equals("player2")) {
	        if (clicks[0][0] == 2 && clicks[0][1] == 2 && clicks[0][2] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][0] == 2 && clicks[1][0] == 2 && clicks[2][0] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[1][0] == 2 && clicks[1][1] == 2 && clicks[1][2] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][1] == 2 && clicks[1][1] == 2 && clicks[2][1] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[2][0] == 2 && clicks[2][1] == 2 && clicks[2][2] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][2] == 2 && clicks[1][2] == 2 && clicks[2][2] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][0] == 2 && clicks[1][1] == 2 && clicks[2][2] == 2) {
	            //s = 1;
	            return true;
	        }
	        else if (clicks[0][2] == 2 && clicks[1][1] == 2 && clicks[2][0] == 2) {
	           // s = 1;
	            return true;
	        }
//	        if (clicks[0][0] != 0 && clicks[1][0] != 0 && clicks[2][0] != 0 && clicks[0][1] != 0 && clicks[1][1] != 0 && clicks[2][1] != 0 && clicks[0][2] != 0 && clicks[1][2] != 0 && clicks[2][2] != 0) {
//	        println("ITS A TIE");
//	        s = 1;
//	        if (entity == "player") {
//	            println("COMPUTER WON");
//	        }
//	        else if (entity == "computer") {
//	            println("PLAYER WON");
//	        }
//	    }
	        return false;
	    }
		return false;
	}

}
