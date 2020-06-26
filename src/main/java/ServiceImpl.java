import java.math.BigDecimal;

public class ServiceImpl implements Service {


    private Dao entityDao = new EntityInMemDaoImpl();


    @Override
    public void addNewItem(String title, BigDecimal price) {
        entityDao.store(new Entity(title, price));

    }

    @Override
    public void findEntity() {
        System.out.println(entityDao.findAll());
    }
}
