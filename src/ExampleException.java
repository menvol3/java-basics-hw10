public class ExampleException {
  public static int rectangleArea(int a , int b){
   int area = a * b;
   if (a < 0 | b < 0){
     try {
         throw new IllegalArgumentException();
     } catch (IllegalArgumentException ex){
           System.out.println("input value is below zero!");
     }
   }
    return area;
  }
}


