package snakeGame;

public class Board {

    private final int B_WIDTH  = 300;
    private final int B_HEIGHT = 300;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private final int DELAY    = 140;

    private final int COLS = B_WIDTH  / DOT_SIZE; // 30
    private final int ROWS = B_HEIGHT / DOT_SIZE; // 30

    private final int[] x = new int[ALL_DOTS];
    private final int[] y = new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;
    private int score = 0;

    private boolean leftDirection  = false;
    private boolean rightDirection = true;
    private boolean upDirection    = false;
    private boolean downDirection  = false;
    private boolean inGame         = true;

    // ANSI color codes
    private static final String RESET  = "\u001B[0m";
    private static final String BOLD   = "\u001B[1m";
    private static final String CLEAR  = "\u001B[2J\u001B[H";
    private static final String GREEN  = "\u001B[32m";
    private static final String BGREEN = "\u001B[92m";
    private static final String RED    = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN   = "\u001B[36m";
    private static final String GRAY   = "\u001B[90m";
    private static final String WHITE  = "\u001B[37m";

    public Board() {
        initGame();
    }

    private void initGame() {
        dots = 3;
        for (int z = 0; z < dots; z++) {
            x[z] = 5 - z;
            y[z] = 5;
        }
        locateApple();
    }

    private void locateApple() {
        int r = (int) (Math.random() * RAND_POS);
        apple_x = r;
        r = (int) (Math.random() * RAND_POS);
        apple_y = r;
    }

    public void checkApple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            score++;
            locateApple();
        }
    }

    public void move() {
        for (int z = dots; z > 0; z--) {
            x[z] = x[z - 1];
            y[z] = y[z - 1];
        }
        if (leftDirection)  x[0]--;
        if (rightDirection) x[0]++;
        if (upDirection)    y[0]--;
        if (downDirection)  y[0]++;
    }

    public void checkCollision() {
        for (int z = dots; z > 0; z--) {
            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }
        if (y[0] >= ROWS) inGame = false;
        if (y[0] < 0)     inGame = false;
        if (x[0] >= COLS) inGame = false;
        if (x[0] < 0)     inGame = false;
    }

    public void render() {
        StringBuilder sb = new StringBuilder();
        sb.append(CLEAR);

        // Top border + score
        sb.append(CYAN).append(BOLD);
        sb.append("╔").append("══".repeat(COLS)).append("╗").append(RESET);
        sb.append("  ").append(YELLOW).append(BOLD).append("SNAKE")
          .append(RESET).append("  ").append(WHITE)
          .append("Score: ").append(BOLD).append(score).append(RESET);
        sb.append("\n");

        // Game rows
        for (int row = 0; row < ROWS; row++) {
            sb.append(CYAN).append(BOLD).append("║").append(RESET);
            for (int col = 0; col < COLS; col++) {
                if (col == x[0] && row == y[0]) {
                    sb.append(BGREEN).append(BOLD).append("██").append(RESET);
                } else if (isBodyAt(col, row)) {
                    sb.append(GREEN).append("▓▓").append(RESET);
                } else if (col == apple_x && row == apple_y) {
                    sb.append(RED).append(BOLD).append("()").append(RESET);
                } else {
                    sb.append(GRAY).append("· ").append(RESET);
                }
            }
            sb.append(CYAN).append(BOLD).append("║").append(RESET).append("\n");
        }

        // Bottom border
        sb.append(CYAN).append(BOLD);
        sb.append("╚").append("══".repeat(COLS)).append("╝").append(RESET).append("\n");
        sb.append(WHITE).append("  Arrow Keys = Move  |  Q = Quit").append(RESET).append("\n");

        System.out.print(sb);
    }

    public void gameOver() {
        System.out.print(CLEAR);
        System.out.println(RED + BOLD);
        System.out.println("  +--------------------------+");
        System.out.println("  |        GAME  OVER        |");
        System.out.println("  |   Final Score : " + score + "        |");
        System.out.println("  |   Thanks for playing!    |");
        System.out.println("  +--------------------------+");
        System.out.println(RESET);
    }

    private boolean isBodyAt(int col, int row) {
        for (int z = 1; z < dots; z++) {
            if (x[z] == col && y[z] == row) return true;
        }
        return false;
    }

    public void setLeft()  { if (!rightDirection) { leftDirection=true;  upDirection=false; downDirection=false; } }
    public void setRight() { if (!leftDirection)  { rightDirection=true; upDirection=false; downDirection=false; } }
    public void setUp()    { if (!downDirection)  { upDirection=true;    rightDirection=false; leftDirection=false; } }
    public void setDown()  { if (!upDirection)    { downDirection=true;  rightDirection=false; leftDirection=false; } }

    public int     getDelay()  { return DELAY; }
    public boolean isInGame()  { return inGame; }
    public int     getScore()  { return score; }
}
