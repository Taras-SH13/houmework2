import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        new ServiceImpl().addNewItem("Asus charger 90w", BigDecimal.valueOf(56));
        System.out.println(EntityInMemDaoImpl.database.get(0));
    }

}
