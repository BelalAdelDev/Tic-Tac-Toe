package TicTacToeModule.classes;
import java.util.ArrayList;
public class Node {
    Node parent;
    ArrayList<Node> children = new ArrayList<>();
    boolean formerPlayerX;
    int value = Integer.MIN_VALUE;
    char[] board;
    public Node(int position, Node parent){ // Child constructor
        this.board = copyArray(parent.board);
        this.formerPlayerX = !parent.formerPlayerX;
        if (formerPlayerX){ //update board
            board[position] = 'X';
        }
        else{
            board[position] = 'O';
        }
        this.parent = parent;
        parent.children.add(this);
    }

    public Node(char[] newBoard,boolean formerPlayerX){ // Parent constructor
        this.formerPlayerX = formerPlayerX;
        this.board = newBoard;
    }

    public static char[] copyArray(char[] a){
        char[] newArray = new char[a.length];
        System.arraycopy(a, 0, newArray, 0, a.length);
        return newArray;
    }

    public static void buildTree(Node n){
        if (checkGameOver(n.board)==2){ // game is not over
            for (int i=0; i<9; i++) {
                if (n.board[i]==' '){
                    Node child = new Node(i,n);
                    buildTree(child);
                }
            }
        }
        else{
            n.value = checkGameOver(n.board);
        }
    }

    public static char[] playRound(Node n,int value){
        // returns new board with best played pos
        for (Node child:n.children) {
            if (child.value==value){
                return child.board;
            }
        }
        return n.children.get(0).board;
    }

    public static int miniMax(Node n, boolean isMax){
        // If the node already has a computed value (internal or leaf), return it
        if (n.children.isEmpty() || n.value != Integer.MIN_VALUE) {
            return n.value;
        }

        // Compute the value based on MiniMax logic
        if (isMax) {
            int maxValue = Integer.MIN_VALUE;
            for (Node child : n.children) {
                maxValue = Math.max(maxValue, miniMax(child, false));
            }
            n.value = maxValue; // Update the node's value
        } else {
            int minValue = Integer.MAX_VALUE;
            for (Node child : n.children) {
                minValue = Math.min(minValue, miniMax(child, true));
            }
            n.value = minValue; // Update the node's value
        }

        return n.value;
    }
    public static int checkGameOver(char[] board){
        /* reminder:
           returns 1 if X won
           returns -1 if O won
           returns 0 if it was draw
           returns 2 if game is not over
        */
        if ((board[0] == board[1] && board[1] == board[2] && board[2]=='X') ||
                (board[3] == board[4] && board[4] == board[5] && board[5]=='X') ||
                (board[6] == board[7] && board[7] == board[8] && board[8]=='X') ||
                (board[0] == board[3] && board[3] == board[6] && board[6]=='X') ||
                (board[1] == board[4] && board[4] == board[7] && board[7]=='X') ||
                (board[2] == board[5] && board[5] == board[8] && board[8]=='X') ||
                (board[0] == board[4] && board[4] == board[8] && board[8]=='X') ||
                (board[2] == board[4] && board[4] == board[6] && board[6]=='X')){
            return 1;
        } else if ((board[0] == board[1] && board[1] == board[2] && board[2] == 'O') ||
                (board[3] == board[4] && board[4] == board[5] && board[5] == 'O') ||
                (board[6] == board[7] && board[7] == board[8] && board[8] == 'O') ||
                (board[0] == board[3] && board[3] == board[6] && board[6] == 'O') ||
                (board[1] == board[4] && board[4] == board[7] && board[7] == 'O') ||
                (board[2] == board[5] && board[5] == board[8] && board[8] == 'O') ||
                (board[0] == board[4] && board[4] == board[8] && board[8] == 'O') ||
                (board[2] == board[4] && board[4] == board[6] && board[6] == 'O')) {
            return -1;
        } else if (board[0]!=' ' && board[1]!=' ' && board[2]!=' '
                && board[3]!=' ' && board[4]!=' ' && board[5]!=' '
                && board[6]!=' ' && board[7]!=' ' && board[8]!=' ') {
            return 0;
        }
        else{
            return 2;
        }
    }

    public ArrayList<Node> getChildren() {
        return children;
    }
}

