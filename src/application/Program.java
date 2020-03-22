package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces(), null);
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

		// ChessMatch chessMatch = new ChessMatch();
		// UI.printBoard(chessMatch.getPieces());

		// Board board = new Board(8,8);

		/*
		 * teste01 System.out.println("Hello, world! \r\n" +
		 * "here it is Chess System. Good Look!"); teste02 Position pos = new
		 * Position(3,5); System.out.println(pos);
		 */

	}

}
