public class MyClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <= array.length; i++) { //Error: accessing array beyond bounds
            sum += array[i];
        }
        System.out.println("Sum: " + sum); //This line may not execute as expected due to the exception
    }
}