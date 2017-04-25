package UNUSED_old;

public class Server {
    public static void main( String[] args ) {
        Board b = new Board();

        b.set(1,'x');

        b.set(1,'o');
        b.set(1,'o');
        b.set(1,'x');
        b.set(1,'o');

        b.set(1,'x');

        b.set(2,'x');

        b.set(4,'x');

        b.set(3,'o');

        b.set(0,'o');
        b.set(0,'o');
        b.set(0,'x');
        b.set(0,'o');
        b.set(0,'x');
        b.set(0,'x');

        b.set(5,'o');
        b.set(5,'o');
        b.set(5,'x');
        b.set(5,'o');

        b.set(2,'o');
        b.set(3,'x');

        b.set(2,'o');
        b.set(3,'x');
        b.set(2,'x');
        b.set(3,'o');
        b.set(2,'o');
        b.set(3,'x');

        b.set(2,'x');
        b.set(3,'x');

        b.printBoard();

        System.out.println( b.isGameOver() );
    }
}