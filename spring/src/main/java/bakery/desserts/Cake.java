package bakery.desserts;

import bakery.Dessert;
import org.springframework.stereotype.Component;

@Component
public class Cake implements Dessert {
    @Override
    public void introduce() {
        System.out.println("I am a cake!");
    }
}
