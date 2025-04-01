/***/
public class Exam extends Assessment {
    //Store variables
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    /**
     * Constructor initializes questions and missed answers, and calculates score.
     *
     * @param questions Total number of questions on the exam.
     * @param missed    Number of questions missed.
     */
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;
        calculateScore();
    }//ends Exame

    /**
     * Calculates points per question and overall score.
     */
    private void calculateScore() {
        pointsEach = 100.0 / numQuestions;
        double numericScore = 100.0 - (numMissed * pointsEach);
        super.setScore((int) numericScore);  // Calls parent class's setScore method
    }//ends calculateScore

    /**
     * Returns points per question.
     *
     * @return Points for each question.
     */
    public double getPointsEach() {
        //Returns the points per question
        return pointsEach;
    }//ends get pointsEach
}//ends Exam

