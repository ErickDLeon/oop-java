package game.pieces;

public class Piece {
    private Position position;

    public boolean isValidMove(Position position) {
        boolean positionGreatherThanZero = position.getRow() > 0 && position.getColumn() > 0;
        boolean positionSmallerThanBoard = position.getRow() < 8 && position.getColumn() < 8;

        return positionGreatherThanZero && positionSmallerThanBoard;
    }

    public Piece() {
    }

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Piece position(Position position) {
        setPosition(position);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
                " position='" + getPosition() + "'" +
                "}";
    }

}
