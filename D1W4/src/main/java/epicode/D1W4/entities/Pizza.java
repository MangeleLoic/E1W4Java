package epicode.D1W4.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Pizza {
    private String nome;
    private double prezzo;
    private int calorie;
    private List<String> toppings;

    public void addTopping (String topping){
        this.toppings.add(topping);
    }
}


