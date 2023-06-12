// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


public class ExceptionsSem1Task1 {
    public static void main(String[] args) {
        // System.out.println("First exception");
        // getValue(new int[10], 15);
        // System.out.println("Second exception");
        // divide(10, 0);
        System.out.println("Third exception");
        createArray(-10);
    }

    static int getValue(int[] array, int index) {
        if (index > array.length) {
            throw new IndexOutOfBoundsException("Index must be less than bounds of the array!");
        }
        return array[index];
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("There is no way to divide by ZERO");
        }
        return a / b;
    }
    static int[] createArray(int size) {
        if (size < 0) {
            throw new NegativeArraySizeException("Lenghs of the array must be positive!");
        }
        return new int[size];
    }

    
}


