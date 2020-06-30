import java.util.List;

public class EntityInMemDaoImpl implements Dao {

    //static List<Entity> database = new ArrayList<Entity>();
    static List<Entity> database = null; //база данных для товаров отсутствует



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
