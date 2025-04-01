import javax.swing.JOptionPane;

/**
 * This program demonstrates the Exam class,
 * which extends the Assessment class.
 */
public class Runner {

    public static void main(String[] args) {
        //Store input
        String input;
        int questions = 0;
        int missed = 0;
        boolean validInput = false;

        //Ensures vaild input is recieved
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);
                if (questions <= 0) {
                    JOptionPane.showMessageDialog(null, "Number of questions must be greater than 0.");
                }//ends if
                else {
                    validInput = true;
                }//ends else
            }//ends try
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }//ends catch
        }//ends while loop

        validInput = false;

        //Validates number of questions missed
        while (!validInput) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);
                if (missed < 0 || missed > questions) {
                    JOptionPane.showMessageDialog(null, "Missed questions must be between 0 and " + questions + ".");
                }//ends if statement
                else {
                    validInput = true;
                }//ends else statement
            }//ends try
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }//ends try
        }//ends while loop

        //Establish exam object
        Exam exam = new Exam(questions, missed);

        //Displays
        String message = "Each question counts " + exam.getPointsEach();
        message += " points.\nThe exam score is " + exam.getScore();
        message += "\nThe exam grade is " + exam.getGrade();
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }//ends Runner file
}
