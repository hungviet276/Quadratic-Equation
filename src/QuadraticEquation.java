import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public double delta;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        this.delta = Math.pow(b,2)-4*a*c;
        return this.delta;
    }
    public double getRoot1(){
        double r1;
        if (this.delta>0 || this.delta ==0){
            r1= (-b + Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
        } else r1 = 0;
        return r1;
    }
    public double getRoot2(){
        double r2;
        if (this.delta>0 || this.delta ==0){
            r2= (-b - Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
        } else r2 = 0;
        return r2;
    }
    public void showResult(){
        if (this.delta > 0){
            System.out.println("The Equation has two roots is: "+ this.getRoot1() +"and " + getRoot2());
        } else if (this.delta==0){
            System.out.println("The equation has one root is: " + this.getRoot1());
        } else {
            System.out.println("The equation has no real root.");
        }
    }

}
class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        System.out.println("a: "+ a +"\t" +" b: "+b +"\t" +" c: "+c);
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta: "+ delta);
        quadraticEquation.showResult();



    }


}
