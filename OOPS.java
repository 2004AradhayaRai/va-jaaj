public class OOPS {
    public static void main(String[] args) {
        Queen q = new Queen();
        Rook r= new Rook();
        King k= new King(); 
        q.moves();
        r.moves();
        k.moves();
   
    }
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all 4 dir)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right(1 step)");
    }
}
