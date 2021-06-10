import java.util.*;
public class ejercicio9{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t1,t2;
        double prom = 0; 
        int count = 0;
        do {
            System.out.println("ingresar temperatura No. 1");
            t1 = s.nextInt();
            if (t1 !=0){
                System.out.println("ingresar temperatura No. 2 ");
                t2 = s.nextInt();
                if(0<=t1 && t1<=15){
                    prom +=t1;
                    count++; 
                }
                if(0<=t2 && t2<=15){
                    prom +=t2;
                    count++;
                }

            }

        }while (t1!=0);
        //System.out.println("p: "+prom);
        //System.out.println("c: "+count);
        System.out.println("promedio de temperatura "+(prom/count));
    }
}