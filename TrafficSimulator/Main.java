package TrafficSimulator;

public class Main {

    public static void main(String[] args) {


        StopLight s = new StopLight();

        System.out.println(s.getColor());
        System.out.println(s.getColor());
        System.out.println(s.getColor());
        System.out.println(s.getColor());
        s.nextColor();
        System.out.println(s.getColor());
        System.out.println(s.getColor());
        System.out.println(s.getColor());
        System.out.println(s.getColor());
        s.nextColor();
        System.out.println(s.getColor());
        System.out.println(s.getColor());

        Street road = new Street(8);
        

    }
}
