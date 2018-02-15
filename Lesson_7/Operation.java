package Lesson_7;

public class Operation {
private double answer;

    public void addition(double fnum, double snum) {
        answer = fnum + snum;
    }

    public void subtraction(double fnum, double snum) {
        answer = fnum - snum;
    }

    public void division(double fnum, double snum) {
        if (snum == 0) {
            throw new IllegalArgumentException("Division by 0"); // обработка исключения деления на 0
        }
        answer = fnum / snum;
    }

    public void multiplication(double fnum, double snum) {
        answer = fnum * snum;
    }

    public Operation() {
        this.answer = answer;
    }

    public double getAnswer() {
        return answer;
    }

}

