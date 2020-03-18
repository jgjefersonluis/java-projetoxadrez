package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

		// Board board = new Board(8,8);

		/*
		 * teste01 System.out.println("Hello, world! \r\n" +
		 * "here it is Chess System. Good Look!"); teste02 Position pos = new
		 * Position(3,5); System.out.println(pos);
		 */

	}

}
