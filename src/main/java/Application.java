import java.math.BigDecimal;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {


        ServiceImpl service=new ServiceImpl(new EntityInMemDaoImpl(new ArrayList<>())); // создали объект сервиса и связали с базой данных

        service.addNewItem("Asus charger 45w", BigDecimal.valueOf(45));
        service.addNewItem("Acer charger 65w", BigDecimal.valueOf(40));
        service.addNewItem("Sony charger 90w", BigDecimal.valueOf(90));
        service.addNewItem("Sony charger 90w", BigDecimal.valueOf(90));
        service.findEntity();
    }

}
