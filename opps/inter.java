package opps;

public class inter {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        boat b = new boat();
        b.moves();
    }
}
 interface ChessPlayer {
void moves();
    
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all direction)" );
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right,diagonal");
    }
}
class boat implements ChessPlayer{
    public void moves(){
        System.out.println("top one step");
    }
}