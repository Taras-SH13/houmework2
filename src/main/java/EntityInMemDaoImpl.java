import java.util.ArrayList;
import java.util.List;

public class EntityInMemDaoImpl implements Dao {

    private static List<Entity> database = new ArrayList<Entity>();
   //private static List<Entity> database = null; //база данных для товаров отсутствует

    public static List<Entity> getDatabase() {
        return database;
    }

    public static void setDatabase(List<Entity> database) {
        EntityInMemDaoImpl.database = database;
    }

    // метод для проверки на наличие товара и его сохранение.
    @Override
    public boolean store(Entity entity) throws NetworkException {
        if(database==null){
            throw new NetworkException("Соединение с базой данных - отсутствует!");

        }
        if (!database.contains(entity)) {
            database.add(entity);
            return true;
        }
        return false;
    }

    @Override
    public List<Entity> findAll() throws NetworkException {
        if(database==null){
            throw new NetworkException("Соединение с базой данных - отсутствует!");

        }
        return database;
    }
}
