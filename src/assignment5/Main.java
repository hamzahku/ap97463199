package assignment5;

public class Main {
    public static double f(int x,int y){
        return ((x^2+y^2)^(1/2))/(x*Math.sin(x+y)+y*Math.cos(x+y));
    }
    public static void main(String[] args){
        Long startTime = System.currentTimeMillis();
        double max=-10000,min=10000;
        for(int x=-999;x<1000;x++){
            for(int y=-999;y<1000;y++){
                double temp = f(x,y);
                if(temp > max)
                    max = temp;
                if(temp<min)
                    min = temp;
            }
        }
        System.out.println("min :"+min+" max:"+max);
        System.out.println(System.currentTimeMillis()-startTime);
    }
}
