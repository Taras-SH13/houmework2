import java.util.ArrayList;
import java.util.List;

public class EntityInMemDaoImpl implements Dao {

    private static List<Entity> database = new ArrayList<>();  //база данных для товаров
// проверка на наличие товара и его сохранение.
    @Override
    public boolean store(Entity entity) throws NetworkException {
        if (!database.contains(entity)) {
            database.add(entity);
            return true;
        }
        return false;
    }
}
