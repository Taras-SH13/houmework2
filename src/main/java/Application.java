import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        new ServiceImpl().addNewItem("Asus charger 90w", BigDecimal.valueOf(56));
        new ServiceImpl().addNewItem("Asus charger 65w", BigDecimal.valueOf(59));
        new ServiceImpl().addNewItem("Asus charger 120w", BigDecimal.valueOf(100));
        new ServiceImpl().addNewItem("Asus charger 45w", BigDecimal.valueOf(35));
        new ServiceImpl().findEntity();
    }

}
