import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

public class App {

    public static void main(String[] args) {

        System.out.println("SpringVersion: " + SpringVersion.getVersion());
        System.out.println("SpringBootVersion: " + SpringBootVersion.getVersion());
    }
}
