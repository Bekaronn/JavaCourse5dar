public class Temperature {
    private double degreesC = 0;
    private double degreesF  = 0;
    public Temperature(){
    }
    public Temperature(double C, double F){
        this.degreesC = C;
        this.degreesF  = F;
    }

    public double getDegreesC(){
        return 5*(degreesF - 32) / 9;
    }

    public double getDegreesF(){
        return (9*(degreesC/5)) + 32;
    }

    public void setDegreesC(int C){
        this.degreesC = C;
    }
    public void setDegreesF(int F){
        this.degreesF = F;
    }
}
