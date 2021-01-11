package day17;

public enum ChessPiece {
    KING_WHITE(100.0, "\u2654"),
    KING_BLACK(100.0, "\u265A"),
    QUEEN_WHITE(9.0, "\u2655"),
    QUEEN_BLACK(9.0, "\u265B"),
    ROOK_WHITE(5.0, "\u2656"),
    ROOK_BLACK(5.0, "\u265C"),
    BISHOP_WHITE(3.5, "\u2657"),
    BISHOP_BLACK(3.5, "\u265D"),
    KNIGHT_WHITE(3.0, "\u2658"),
    KNIGHT_BLACK(3.0, "\u265E"),
    PAWN_WHITE(1.0, "\u2659"),
    PAWN_BLACK(1.0, "\u265F"),
    EMPTY(-1.0, "_");

    private Double value;
    private String name;

    ChessPiece(Double value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
