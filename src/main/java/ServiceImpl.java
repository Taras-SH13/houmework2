import java.math.BigDecimal;

public class ServiceImpl implements Service {


    private Dao entityDao = new EntityInMemDaoImpl();


    @Override
    public void addNewItem(String title, BigDecimal price) {

        String errorMessage="Недопустимая длинна в названии товара! Товар "+title+" не добавлен!";
        String errorMessage2="Не уникальное название! Товар "+title+" не добавлен!";
        int len;
        len = title.length();
        if (len < 3 || len > 20) {
            System.out.println(errorMessage);
            return;


        }

        for (Entity p : EntityInMemDaoImpl.database) {
            if (p.getTitle().equals(title)) {
                System.out.println(errorMessage2);
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

