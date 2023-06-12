// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше


public class ExceptionsSem1Task3 {
    public static void main(String[] args) {
        divideArray(new int [7], new int [3]);
        divideArray(new int [4], new int [4]);
    }

    static int[] divideArray(int[] a, int [] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Lengths of the arrays are not equal!");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0)
                throw new RuntimeException("There is no way to divide by ZERO!");
            result[i] = a[i] / b[i];
        }
        return result;
    }
}
