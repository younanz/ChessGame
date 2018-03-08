
public class Queen extends Piece
{   
    static int count = 0;
    String name = "Queen";
    private Queen(String color,int X,int Y)
    {
        super(color,X,Y);
    }
    static public Queen factory(String color,int X, int Y){
        count++;
        if(count>1){
            throw new Error("You could only initialize 1 Queen.");
        }
        return new Queen(color, X, Y);
    }
    public void move(int x, int y)
    {
    }
    public String toString(){
        return super.color+this.name.substring(0,1);
    }
}
