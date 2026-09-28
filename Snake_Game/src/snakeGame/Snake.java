package snakeGame;

public class Snake {

    private Board board;
    private boolean running = true;

    public Snake() {
        board = new Board();
    }

    private void startGame() throws Exception {
        showWelcomeScreen();

        // Input thread - reads arrow keys as raw bytes
        // On Windows: arrow keys send 224 followed by a code
        // UP=72, DOWN=80, LEFT=75, RIGHT=77
        Thread inputThread = new Thread(() -> {
            try {
                while (running) {
                    int b1 = System.in.read();

                    if (b1 == 224 || b1 == 0) {
                        // Arrow key detected!
                        int b2 = System.in.read();
                        switch (b2) {
                            case 72: board.setUp();    break; // UP arrow
                            case 80: board.setDown();  break; // DOWN arrow
                            case 75: board.setLeft();  break; // LEFT arrow
                            case 77: board.setRight(); break; // RIGHT arrow
                        }
                    } else {
                        // WASD fallback
                        char key = Character.toLowerCase((char) b1);
                        switch (key) {
                            case 'w': board.setUp();    break;
                            case 's': board.setDown();  break;
                            case 'a': board.setLeft();  break;
                            case 'd': board.setRight(); break;
                            case 'q':
                                running = false;
                                board.gameOver();
                                System.exit(0);
                                break;
                        }
                    }
                }
            } catch (Exception e) {
                // stream closed
            }
        });
        inputThread.setDaemon(true);
        inputThread.start();

        // Main game loop - auto moves every DELAY ms
        while (running && board.isInGame()) {
            board.checkApple();
            board.checkCollision();
            board.move();
            board.render();
            Thread.sleep(board.getDelay());
        }

        running = false;
        board.gameOver();
    }

    private void showWelcomeScreen() throws Exception {
        System.out.print("\u001B[2J\u001B[H");
        System.out.println("\u001B[36m\u001B[1m");
        System.out.println("  ███████╗███╗   ██╗ █████╗ ██╗  ██╗███████╗");
        System.out.println("  ██╔════╝████╗  ██║██╔══██╗██║ ██╔╝██╔════╝");
        System.out.println("  ███████╗██╔██╗ ██║███████║█████╔╝ █████╗  ");
        System.out.println("  ╚════██║██║╚██╗██║██╔══██║██╔═██╗ ██╔══╝  ");
        System.out.println("  ███████║██║ ╚████║██║  ██║██║  ██╗███████╗");
        System.out.println("  ╚══════╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝");
        System.out.println("\u001B[0m");
        System.out.println("\u001B[33m  Controls:\u001B[0m");
        System.out.println("  \u001B[37m  Arrow Keys  =  Move ( ↑ ↓ ← → )\u001B[0m");
        System.out.println("  \u001B[37m  W A S D     =  Also works\u001B[0m");
        System.out.println("  \u001B[37m  Q           =  Quit\u001B[0m");
        System.out.println();
        System.out.println("\u001B[92m  Press any arrow key to start...\u001B[0m");
        System.out.flush();

        // Wait for first keypress to start
        int b1 = System.in.read();
        if (b1 == 224 || b1 == 0) {
            int b2 = System.in.read();
            switch (b2) {
                case 72: board.setUp();    break;
                case 80: board.setDown();  break;
                case 75: board.setLeft();  break;
                case 77: board.setRight(); break;
            }
        } else {
            char key = Character.toLowerCase((char) b1);
            switch (key) {
                case 'w': board.setUp();    break;
                case 's': board.setDown();  break;
                case 'a': board.setLeft();  break;
                case 'd': board.setRight(); break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Snake game = new Snake();
        game.startGame();
    }
}
