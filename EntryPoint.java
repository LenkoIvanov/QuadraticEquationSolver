import java.lang.*;

public class EntryPoint {

    public static void quadraticSolver(double a,double b, double c, double x1, double x2, double x){
        double det = 0.0;
        det = (b*b) - (4*a*c);
        if(det > 0.0){
            x1 = (-b + Math.sqrt(det))/(2*a); //two solutions
            x2 = (-b - Math.sqrt(det))/(2*a);
        }
        else if(det == 0.0){
            x = -b/(2*a); //one solution
        }
        else{
            //no real solutions
            //add error message
        }
    }

    public static void main(String[] args){
        GUIFrame.setLookAndFeel();
        GUIFrame gui = new GUIFrame();
    }
}
