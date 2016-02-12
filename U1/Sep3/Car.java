public class Car
{
    private double mpg;
    private double gasTank;
    
    public Car(){
        mpg = 0;
        gasTank = 0;
    }
    
    public Car(double efficiency){
        mpg = efficiency;
        gasTank = 0;
    }
    
    //methods
    public void drive(double miles){
        gasTank = gasTank - miles/mpg;
    }
    
    public double getGasInTank(){
        return gasTank;
    }
    
    public void addGas(double inputGas){
        gasTank = gasTank + inputGas;
    }
}
