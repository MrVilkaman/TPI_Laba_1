package donnu.zolotarev.tpi.lab1;

public class Triangle {


    private double a = 0;
    private double b = 0;
    private double c = 0;

    private double halfPerimetr(){
        return (a+b+c)/2;
    }

    public double area(){
        double p = halfPerimetr();
        double res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return res;
    }

    public void setSides(double a, double b, double c) throws NumberFormatException,IllegalArgumentException {
        if (a<0 || b<0 || c<0){
            throw new NumberFormatException();
        }

        if (!((a < b+c) && (b < a+c) && (c < a+b))){
            throw new IllegalArgumentException();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
