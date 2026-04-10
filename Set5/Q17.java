
interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

      public boolean isPassed(int mark) {
        if (mark >= 35) {
            return true;
        } else {
            return false;
        }
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        int mark = 50;
        double avg = 65.5;

      
        if (r.isPassed(mark)) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        System.out.println("Division: " + r.getDivision(avg));
    }
}
