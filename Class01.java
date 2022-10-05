class jinjin{
    void Cal_area(int x){
        System.out.printf("半徑= %d",x);
        System.out.printf("球形體積 %f",((4.0/3.0)*3.14159*(x*x*x))); 
    }
    void Cal_area(int x,int y,int z){
        System.out.printf("長%d","寬%d","高%d",x,y,z);
        System.out.printf("立方體體積%d",2*(x*y)+2*(x*z)+2*(y*z));
    }
}
public class Class01{
    public static void main(String[] args) {
        jinjin sl= new jinjin();
        sl.Cal_area(10);
        sl.Cal_area(4,5,6);
    }
}
