import java.util.ArrayList;
import java.util.List;

import game.pieces.Position;
import game.pieces.Queen;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Queen queen = new Queen();
        queen.setPosition(new Position(4, 2));

        List<Position> positions = new ArrayList<>();
        positions.add(new Position(4, 7));
        positions.add(new Position(0, 3));
        positions.add(new Position(3, 0));
        positions.add(new Position(6, 3));
        positions.add(new Position(4, 3));

        for (Position position : positions) {

            // System.out.println("Position: " + queen.getPosition().toString());
            // System.out.println("move: " + position.toString());
            // System.out.println("is valid: " + queen.isValidMove(position));

            System.out.println("Chess");
            System.out.println("Position: " + queen.getPosition().toString());
            System.out.println();

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (queen.getPosition().getRow() == i && queen.getPosition().getColumn() == j) {
                        System.out.print("O ");
                    } else {
                        System.out.print("+ ");
                    }
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();

            if (queen.isValidMove(position)) {
                queen.setPosition(position);
            }
        }

        System.out.println("Chess");
        System.out.println("final position: " + queen.getPosition().toString());
        System.out.println();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queen.getPosition().getRow() == i && queen.getPosition().getColumn() == j) {
                    System.out.print("O ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }

    }
}
