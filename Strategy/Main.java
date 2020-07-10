public class Main {
   public static void main(String[] args) {
      Context context = new Context(new OperationPlus());		
      System.out.println("19 + 11 = " + context.executeStrategy(19, 11));

      context = new Context(new OperationMinus());		
      System.out.println("30 - 5 = " + context.executeStrategy(30, 5));

      context = new Context(new OperationCross());		
      System.out.println("10 * 2 = " + context.executeStrategy(10, 2));
      
      context = new Context(new OperationBagi());		
      System.out.println("20 / 5 = " + context.executeStrategy(20, 5));
      
      context = new Context(new OperationMod ());		
      System.out.println("10 % 2 = " + context.executeStrategy(10, 2));
   }
}