public class Rock extends Piece {
    public Rock(){
        super(); // calls parent's constructor
        this.name = "rock";
    }
    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(position)) {
            return false;
        }

        if (newPosition.column == this.column || newPosition.row == this.row) {
            return true;
        } else {
            return false;
        }
    }
}
