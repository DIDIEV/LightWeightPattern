package Factories;

import java.util.Map;
import java.util.HashMap;


public class PawnFactory {
    private static Map<String, Pawn> pool = new HashMap<>();
    
    public static Pawn getPawn(String color) {
        pool.putIfAbsent(color, new Pawn(color));
        return pool.get(color);
    }
}
