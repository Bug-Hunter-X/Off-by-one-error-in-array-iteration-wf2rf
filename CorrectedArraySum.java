public class MyClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) { //Corrected: loop until i is less than array.length
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
}