import java.math.BigDecimal;
import java.util.List;

public class ServiceImpl implements Service {


    private Dao entityDao = new EntityInMemDaoImpl();


    @Override
    public void addNewItem(String title, BigDecimal price) {
        List<Entity> localDatabase = EntityInMemDaoImpl.database;
        int len;
        len = title.length();
        if (len < 3 || len > 20) {
            System.out.println("Недопустимая длинна в названии товара! Товар "+title+" не добавлен!");
            return;
        }

        for (Entity p : localDatabase) {
            if (p.getTitle().equals(title)) {
                System.out.println("Не уникальное название! Товар "+title+"не добавлен!");
                return;

            }
        }
        entityDao.store(new Entity(title, price));
    }

    @Override
    public void findEntity() {
        System.out.println(entityDao.findAll());
    }
}

