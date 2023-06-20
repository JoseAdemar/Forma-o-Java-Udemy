package KeywordsAndExpressios;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        validaMetodos(score,gameOver);
    }

    public static boolean validaScore(int score) {
        if (score >= 6000) {
            System.out.println("Seu score é = " + score);
            return true;
        }
        return false;
    }

    public static boolean validaGameOver(boolean gameOver) {
        if (!gameOver) {
            System.out.println("sdfsf");
            return true;
        }
        return false;
    }

    public static boolean validaMetodos(int score, boolean gameOver) {
        var teste1 = validaScore(score);
        var teste2 = validaGameOver(gameOver);
        if ((!teste1) && (!teste2)) {
            System.out.println("nenhuma das opções");
            return true;
        }
        return false;
    }
}
