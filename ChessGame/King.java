
public class King extends Piece
{
    static int count = 0;
    String name = "King";
    private King(String color,int X, int Y)
    {
        super(color,X,Y);
    }
    static public King factory(String color,int X, int Y){
        count++;
        if(count>2){
            throw new Error("You could only initialize 2 King.");
        }
        return new King(color, X, Y);
    }
    public boolean move(int y, int x,Piece[][] b)
    {
        if(Math.abs(x-X)>1||Math.abs(y-Y)>1){
            throw new RuntimeException("You cannot do this! Move again!");
        }
        this.X=x;
        this.Y=y;
        return true;
    }
    public String toString(){
        return super.color+this.name.substring(0,2);
    }
}
