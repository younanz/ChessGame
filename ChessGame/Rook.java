
public class Rook extends Piece
{
    static int count = 0;
    String name = "Rook";
    private Rook(String color,int X, int Y)
    {
        super(color,X,Y);
    }
    static public Rook factory(String color,int X, int Y){
        count++;
        if(count>5){
            throw new Error("You could only initialize 4.");
        }
        return new Rook(color, X, Y);
    }
    public boolean move(int x, int y){
        boolean inBoard = true;
        boolean towardBackward = true;
        boolean leftRight = true;
        if((x>8&&x<0)&&(y>8&&y<0))inBoard = false;
        if(!(X!=x && Y==y))towardBackward = false;
        if(!(X==x && Y!=y))leftRight = false;
        if(((towardBackward = true)&&(inBoard = true))||(((leftRight = true)&&(inBoard = true)))){
            this.X = x;
            this.Y = y;
            return true;
        }
        return false;
    }
    public String toString(){
        return super.color+this.name.substring(0,1);
    }
}
