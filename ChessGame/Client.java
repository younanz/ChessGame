
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    public static void h(){
        Board a = Board.factory();
        Player p1 = Player.factory("Eason",a);
        p1.movePiece("B1","A3");
        //System.out.println(a);
        //a.movePiece(1,0,2,0);
        //a.movePiece(1,4,2,5);
        System.out.println(a);
    }
}

