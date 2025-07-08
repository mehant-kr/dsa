public class LearningRecursion {

    public void printAscending(int n) {
        if (n == 0) {
            return;
        }
        printAscending(n - 1);
        System.out.println(n);
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        LearningRecursion a = new LearningRecursion();
        // a.printAscending(5);

        System.out.println(a.factorial(5));
    }
}
