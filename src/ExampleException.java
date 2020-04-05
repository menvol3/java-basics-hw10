public class ExampleException {
    public static int rectangleArea(int a , int b) throws IllegalArgumentException{
        int area = a * b;
        if (a < 0 | b < 0){
                throw new IllegalArgumentException("input value is below zero!");
            }
        return area;
    }
}