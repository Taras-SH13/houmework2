import java.math.BigDecimal;

public class ServiceImpl implements Service {


    private Dao entityDao = new EntityInMemDaoImpl();


    @Override
    public void addNewItem(String title, BigDecimal price) {
        entityDao.store(new Entity(title, price));

    }
}
