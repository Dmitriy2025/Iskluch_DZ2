public class ex2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[] {1,4,7,7,3,7,9,2,3};
            int a = intArray[8];
            int catchedRes1 = a / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching arithmetic exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching array index exception: " + e);
        }
    }
}
