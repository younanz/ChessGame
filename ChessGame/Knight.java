
public class Knight extends Piece
{

    static int count = 0;
    String name = "Knight";
    private Knight(Board b,String color,int X, int Y)
    {
        super(b,color,X,Y);
    }
    static public Knight factory(Board b,String color,int X, int Y){
        count++;
        if(count>4){
            throw new Error("You could only initialize 4 Knights.");
        }
        return new Knight(b,color, X, Y);
    }
    public boolean move(int x, int y)
    {
        boolean outBoard = (x>8&&x<0)&&(y>8&&y<0);
        boolean fowardLeft = y==this.Y+2 && x==this.X-1;
        boolean fowardRight = y==this.Y+2 && x==this.X+1;
        boolean leftFoward = y==this.Y+1 && x==this.X-2;
        boolean leftBackward = y==this.Y-1 && x==this.X-2;
        boolean rightFoward = y==this.Y+1 && x==this.X+2;
        boolean rightBackward = y==this.Y-1 && x==this.X+2;
        boolean backwardLeft = y==this.Y-2 && x==this.X-1;
        boolean backwardRight = y==this.Y-2 && x==this.X+1;
        if(outBoard){
            System.out.println("can not move out of board!");
        }
        else if(fowardLeft||fowardRight||leftFoward||leftBackward
                ||rightFoward||rightBackward||backwardLeft||backwardRight){
            this.X = x;
            this.Y = y;
        }
        else{
            System.out.println("Knight can not move to there.");
        }
        return true;//modify latter
    }
    public String toString(){
        return super.color+this.name.substring(0,2);
    }
}
