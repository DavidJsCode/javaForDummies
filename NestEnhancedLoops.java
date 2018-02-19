import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

// Enhanced loops, nested
//The problem is to show all possible combinations of 3 wheeled, 6 entry slot machine
public class NestEnhancedLoops {
	
	enum Symbol {
		cherry, lemon, apple, banana
	}
	
		public static void main(String[] args) {
	// typename varname : values method of enum's typename 
	// the loop is akin to int 0 : int.array maybe? either wy, it loops thorugha ll values and prints until the end
			for (Symbol leftReel : Symbol.values()) {
		//nested enhanced loop
				for (Symbol middleReel : Symbol.values()) {
			//nested enhanced loop
					for (Symbol rightReel : Symbol.values()) {
			//prints out all avail combinations
			out.print(leftReel + " ");		
			out.print(middleReel + " ");
			out.println(rightReel);

					}
				}
			}
		}
	}

