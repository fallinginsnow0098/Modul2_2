package bai8.baitap.refactoring;

public class TennisGame {
    public static String getScore(String FIRST_PLAYER_NAME, String SECOND_PLAYER_NAME, int firstPlayerScore, int secondPlayerScore) {
        StringBuilder score = new StringBuilder();
        int initScore =0;
        if (firstPlayerScore==secondPlayerScore)
        {
            switch (firstPlayerScore)
            {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        }
        else {
            boolean checkScore = firstPlayerScore >= 4 || secondPlayerScore >= 4;
            if (checkScore) {
                score = getWinnerScore(firstPlayerScore, secondPlayerScore);
            }
            else {
                getScore(firstPlayerScore, secondPlayerScore, score);
            }
        }
        return score.toString();
    }

    private static void getScore(int firstPlayerScore, int secondPlayerScore, StringBuilder score) {
        int initScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) initScore  = firstPlayerScore;
            else { score.append("-"); initScore  = secondPlayerScore;}
            switch(initScore )
            {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }

    private static StringBuilder getWinnerScore(int firstPlayerScore, int secondPlayerScore) {
        StringBuilder score;
        int minusResult = firstPlayerScore - secondPlayerScore;

        if (minusResult==1) score = new StringBuilder("Advantage player1");
        else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
        else if (minusResult>=2) score = new StringBuilder("Win for player1");
        else score = new StringBuilder("Win for player2");
        return score;
    }
}
