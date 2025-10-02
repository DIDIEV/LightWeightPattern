package Factories;

public class Pawn implements ChessPiece {
    private String color;
    
    
    public Pawn(String color) {
        this.color = color;
    }
    
    @Override
    public void draw(int xPos, int yPos) {
        System.out.println("Drawing a " + color + " pawn at position (" + xPos + ", " + yPos + ")");
    }
    
}
