import java.util.HashMap;
import java.util.Scanner;

public class Interact {
	
	static HashMap<Integer, String> pieces = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		initPieces();
		printCube();
		String rotate = "y";
		String face;
		int direction;
		Scanner i = new Scanner(System.in);
		
		System.out.println("F = FRONT, L = LEFT, R = RIGHT, B = BACK, T = TOP, B = BACK, U = BOTTOM/UNDER");
		System.out.println("1 = RIGHT, 0 = LEFT");
		
		while (rotate.equals("y")) {
			System.out.println("Which face would you like to rotate?");
			face = i.nextLine();
			
			System.out.println("Which direction?");
			direction = i.nextInt();

			rotateFace(face, direction);
			printCube();
			
			System.out.println("Rotate again? (y/n)");
			rotate = i.nextLine();
		}
	}
	
	public static void printCube() {

		System.out.println(pieces.get(0));
		
		for (int i = 1; i < 9; i++) {
			System.out.print(pieces.get(i) + " ");
		}
		System.out.println();
		for (int i = 9; i < 17; i++) {
			System.out.print(pieces.get(i) + " ");
		}
		System.out.println();
		for (int i = 17; i < 25; i++) {
			System.out.print(pieces.get(i) + " ");
		}
		System.out.println();
		System.out.println(pieces.get(25));
	}

	public static void initPieces() {
		String[] pieceID = {"T", "TLB", "TL", "TLF", "TF", "TFR", "TR", "TRB", "TB", "BL", "L", "LF", "F", "FR", "R", "RB", "B", "BLU", "LU", "FLU", "FU", "FRU", "RU", "RBU", "BU", "U"};
		
		for (int i = 0; i < 26; i++) {
			pieces.put(i, pieceID[i]);
		}
	}

	public static void rotateFace(String face, int direction) {
		if (face.equals("F")) {
			String topEdge = pieces.get(4);
			String rightEdge = pieces.get(13);
			String botEdge = pieces.get(20);
			String leftEdge = pieces.get(11);
			
			String topLeftCorner = pieces.get(3);
			String topRightCorner = pieces.get(5);
			String botRightCorner = pieces.get(21);
			String botLeftCorner = pieces.get(19);
			
			if (direction == 1) {
				pieces.put(4, leftEdge);
				pieces.put(13, topEdge);
				pieces.put(20, rightEdge);
				pieces.put(11, botEdge);
				
				pieces.put(3, botLeftCorner);
				pieces.put(5, topLeftCorner);
				pieces.put(19, botRightCorner);
				pieces.put(21, topRightCorner);
			} else {
				pieces.put(4, rightEdge);
				pieces.put(13, botEdge);
				pieces.put(20, leftEdge);
				pieces.put(11, topEdge);
				
				pieces.put(3, topRightCorner);
				pieces.put(5, botRightCorner);
				pieces.put(19, topLeftCorner);
				pieces.put(21, botLeftCorner);
			}
		} else if (face.equals("L")) {
			String topEdge = pieces.get(2);
			String rightEdge = pieces.get(11);
			String botEdge = pieces.get(18);
			String leftEdge = pieces.get(9);
			
			String topLeftCorner = pieces.get(1);
			String topRightCorner = pieces.get(3);
			String botRightCorner = pieces.get(19);
			String botLeftCorner = pieces.get(17);
			
			if (direction == 1) {
				pieces.put(2, leftEdge);
				pieces.put(11, topEdge);
				pieces.put(18, rightEdge);
				pieces.put(9, botEdge);
				
				pieces.put(1, botLeftCorner);
				pieces.put(3, topLeftCorner);
				pieces.put(19, botRightCorner);
				pieces.put(17, topRightCorner);
			} else {
				pieces.put(2, rightEdge);
				pieces.put(11, botEdge);
				pieces.put(18, leftEdge);
				pieces.put(9, topEdge);
				
				pieces.put(1, topRightCorner);
				pieces.put(3, botRightCorner);
				pieces.put(19, topLeftCorner);
				pieces.put(17, botLeftCorner);
			}
		} else if (face.equals("R")) {
			String topEdge = pieces.get(6);
			String leftEdge = pieces.get(13);
			String rightEdge = pieces.get(15);
			String botEdge = pieces.get(22);
			
			String topLeftCorner = pieces.get(5);
			String topRightCorner = pieces.get(7);
			String botLeftCorner = pieces.get(21);
			String botRightCorner = pieces.get(23);
			
			if (direction == 1) {
				pieces.put(6, leftEdge);
				pieces.put(13, botEdge);
				pieces.put(15, topEdge);
				pieces.put(22, rightEdge);
				
				pieces.put(5, botLeftCorner);
				pieces.put(7, topLeftCorner);
				pieces.put(21, botRightCorner);
				pieces.put(23, topRightCorner);
			} else {
				pieces.put(6, rightEdge);
				pieces.put(13, topEdge);
				pieces.put(15, botEdge);
				pieces.put(22, leftEdge);
				
				pieces.put(5, topRightCorner);
				pieces.put(7, botRightCorner);
				pieces.put(21, topLeftCorner);
				pieces.put(23, botLeftCorner);
			}
		} else if (face.equals("B")) {
			String topEdge = pieces.get(8);
			String leftEdge = pieces.get(15);
			String rightEdge = pieces.get(9);
			String botEdge = pieces.get(24);
			
			String topLeftCorner = pieces.get(7);
			String botLeftCorner = pieces.get(23);
			String topRightCorner = pieces.get(1);
			String botRightCorner = pieces.get(17);
			
			if (direction == 1) {
				pieces.put(8, leftEdge);
				pieces.put(15, botEdge);
				pieces.put(9, topEdge);
				pieces.put(24, rightEdge);
				
				pieces.put(7, botLeftCorner);
				pieces.put(23, botRightCorner);
				pieces.put(1, topLeftCorner);
				pieces.put(17, topRightCorner);
			} else {
				pieces.put(8, rightEdge);
				pieces.put(15, topEdge);
				pieces.put(9, botEdge);
				pieces.put(24, leftEdge);
				
				pieces.put(7, topRightCorner);
				pieces.put(23, topLeftCorner);
				pieces.put(1, botRightCorner);
				pieces.put(17, botLeftCorner);
			}
		} else if (face.equals("T")) {
			if (direction == 1) {
				String a = pieces.get(8);
				
				for (int i = 2; i < 9; i++) {
					pieces.put(i, pieces.get(i-1));
				}
				
				pieces.put(1, a);
			} else {
				String a = pieces.get(1);
				
				for (int i = 7; i > 0; i--) {
					pieces.put(i, pieces.get(i+1));
				}
				
				pieces.put(8, a);
			}
		} else {
			if (direction == 1) {
				String a = pieces.get(24);
				
				for (int i = 18; i < 25; i++) {
					pieces.put(i, pieces.get(i-1));
				}
				
				pieces.put(17, a);
			} else {
				String a = pieces.get(17);
				
				for (int i = 23; i > 16; i--) {
					pieces.put(i, pieces.get(i+1));
				}
				
				pieces.put(24, a);
			}
		}
	}
}