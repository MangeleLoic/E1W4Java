package epicode.D1W4;

import epicode.D1W4.entities.Menu;
import epicode.D1W4.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PizzaConfiguration {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
    }

    @Bean
    public Pizza prosciuttoFunghi() {
        return new Pizza("Prosciutto e Funghi", 7.50, 1454, List.of("Mozzarella", "Pomodoro", "Prosciutto cotto", "Funghi"));
    }

    @Bean
    public Pizza quattroFormaggi() {
        return new Pizza("4 Formaggi", 8.00, 1715, List.of("Mozzarella", "Gorgonzola", "Stracchino", "Fontina"));
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addPizza(margherita());
        menu.addPizza(prosciuttoFunghi());
        menu.addPizza(quattroFormaggi());
        return menu;
    }
}
