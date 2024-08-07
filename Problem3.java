public class CalculateAggregateMarks {
    public static void main(String[] args) {
        int marksSubject1 = 80;
        int marksSubject2 = 90;
        int marksSubject3 = 75;
        int marksSubject4 = 60;
        int marksSubject5 = 100;

        int totalMarks = marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4 + marksSubject5;
        double percentage = (totalMarks * 100.0) / 500;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentage + "%");
    }
}
