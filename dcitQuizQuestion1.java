public class dcitQuizQuestion1 {
    public void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return; 
        }

        char grade = calculateLetterGrade(score);

        displayPerformanceMessage(grade);
    }

    // HELPER METHODS

    public boolean validateScore(double score) {
        // Simple validation: score must be between 0 and 100
        return score >= 0 && score <= 100;
    }

    public char calculateLetterGrade(double score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public void displayPerformanceMessage(char grade) {
        System.out.println("The final grade report is: " + grade);
    }
}
