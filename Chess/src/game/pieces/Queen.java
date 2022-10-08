package game.pieces;

public class Queen extends Piece {

    public Queen() {
        super();
    }

    @Override
    public boolean isValidMove(Position position) {

        if (!super.isValidMove(position)) {
            System.out.println("Movimiento invalido");
            return false;
        }

        boolean positionHorizontal = position.getRow() == getPosition().getRow();

        boolean positionVertical = position.getColumn() == getPosition().getColumn();

        int positionDiagonallyColumnAbs = Math.abs(position.getColumn() - getPosition().getColumn());
        int positionDiagonallRowAbs = Math.abs(position.getRow() - getPosition().getRow());
        boolean positionDiagonally = positionDiagonallyColumnAbs == positionDiagonallRowAbs;

        if (positionHorizontal && positionVertical) {
            System.out.println("No se movio");
            return false;
        }
        
        if (positionHorizontal) {
            System.out.println("horizontal");
            return true;
        }

        if (positionVertical) {
            System.out.println("vertical");
            return true;
        }

        if (positionDiagonally) {
            System.out.println("Diagonal");
            return true;
        } else {
            return false;
        }

    }
}
