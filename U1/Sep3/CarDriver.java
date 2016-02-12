public class CarDriver
{
   public static void main(String[] args){
       Car ferrari = new Car(10);
       ferrari.addGas(100);
       ferrari.drive(990);
       System.out.println("You have " + ferrari.getGasInTank() + " gallons remainging.");
   }
}
