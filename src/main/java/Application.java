import java.math.BigDecimal;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        //new ServiceImpl(new EntityInMemDaoImpl(new ArrayList<>())).addNewItem("Asus 85w", BigDecimal.valueOf(56));
        //new ServiceImpl(new EntityInMemDaoImpl(new ArrayList<>())).addNewItem("Acer 120W", BigDecimal.valueOf(56));
        //new ServiceImpl(new EntityInMemDaoImpl(new ArrayList<>())).findEntity();

        ServiceImpl service=new ServiceImpl(new EntityInMemDaoImpl(new ArrayList<>()));

        service.addNewItem("Asus charger 45w", BigDecimal.valueOf(45));
        service.addNewItem("Acer charger 65w", BigDecimal.valueOf(40));
        service.addNewItem("Sony charger 90w", BigDecimal.valueOf(90));
        service.addNewItem("Sony charger 90w", BigDecimal.valueOf(90));
        service.findEntity();
    }

}
