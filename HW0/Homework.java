public class Homework {
    // Excercise 1 - Print triangle
    public static void drawTriangle() {
        // 
    }


    // Excercise 2 - Get max of array
    public static int max(int[] m) {
        int maxNumber = Integer.MIN_VALUE;
        for(int num : m) {
            maxNumber = Math.max(maxNumber, num);
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        //drawTriangle();

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
        // max -> 22
        System.out.println(max(numbers));
    }
}