package UNUSED_old;

public class Board {
    private static final int DEPTH = 6;
    private static final int BREDTH = 7;
    private char[][] theBoard = new char[DEPTH][BREDTH];

    public Board(){
        for( int i = 0; i < 6; i++ ) {
            for( int j = 0; j < 7; j++ ) {
                theBoard[i][j] = ' ';
            }
        }
    }

    public char get( int row, int column ) {
        return theBoard[row][column];
    }

    public boolean set( int column, char val ) {
        int availRowSpot = firstEmptySpot( column );

        if( availRowSpot != -1 ) {
            theBoard[availRowSpot][column] = val;
            return true;
        }

        return false;
    }

    private int firstEmptySpot( int column ) {
        for( int i = DEPTH - 1; i >= 0; i-- ) {
            if( get(i, column) == ' ' ) {
                return i;
            }
        }

        return -1;
    }

    public boolean isGameOver() {
        int count = 0;
        char current = theBoard[0][0];

        //Check vertical
        for( int i = 0; i < DEPTH; i++ ) {
            for( int j = 0; j < BREDTH; j++ ) {
                if( current != ' ' && current == theBoard[i][j] ) {
                    count++;
                } else {
                    count = 1;
                    current = theBoard[i][j];
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        count = 1;
        current = theBoard[0][0];

        //Check horizontal
        for( int i = 0; i < BREDTH; i++ ) {
            for( int j = 0; j < DEPTH; j++ ) {
                if( current != ' ' && current == theBoard[j][i] ) {
                    count++;
                } else {
                    count = 1;
                    current = theBoard[j][i];
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        return false;
    }

    public void printBoard() {
        for( int i = 0; i < DEPTH; i++ ) {

            System.out.print( "|" );

            for( int j = 0; j < BREDTH; j++ ) {
                System.out.print( theBoard[i][j] + "|" );
            }

            System.out.println();
        }
    }
}
