import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int massa;
        int height;

        System.out.println(service.calculate(massa = 50, height = 170));
        System.out.println(service.calculate(massa = 60, height = 182));
        System.out.println(service.calculate(massa = 65, height = 167));
    }
}