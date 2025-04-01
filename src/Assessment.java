import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */
public class Assessment {
    private int score;  // Numeric score

    /**
     * The setScore method sets the score field.
     * @param s The value to store in score.
     */
    public void setScore(int s) {
        this.score = s;
    }//ends set Score

    /**
     * The getScore method returns the score.
     * @return The value stored in the score field.
     */
    public int getScore() {
        return this.score;
    }//ends getScore

    /**
     * The getGrade method returns a letter grade determined from the score field.
     * @return The letter grade.
     */
    public char getGrade() {
        char letterGrade;
        switch (this.score / 10) {
            case 10:
            case 9:
                letterGrade = 'A';
                break;
            case 8:
                letterGrade = 'B';
                break;
            case 7:
                letterGrade = 'C';
                break;
            case 6:
                letterGrade = 'D';
                break;
            default:
                letterGrade = 'F';
                break;
        }//ends switch
        return letterGrade;
    }//ends getGrade
}//ends Assessment
