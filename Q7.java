package Lab7;
enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}
public class Q7 {
    public static void main(String[] args) {
        char[] correctAns = {'C', 'A', 'B', 'D'};
        int correctCount = 0;
        int wrongCount = 0;
        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");
        for (int i = 0; i < correctAns.length; i++) {
            char submitted;
            if (i < args.length) {
                submitted = args[i].charAt(0);
            } else {
                submitted = 'X'; 
            }
            Result result;
            if (submitted == 'X') {
                result = Result.NOT_ANSWERED;
                wrongCount++;
            } else if (submitted == correctAns[i]) {
                result = Result.CORRECT;
                correctCount++;
            } else {
                result = Result.WRONG;
                wrongCount++;
            }
            System.out.println((i + 1) + "\t\t" + submitted + "\t\t" 
                               + correctAns[i] + "\t\t" + result);
        }
        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        if (correctCount >= 2) {
            System.out.println("The candidate passed.");
        } else {
            System.out.println("The candidate failed.");
        }
    }
}