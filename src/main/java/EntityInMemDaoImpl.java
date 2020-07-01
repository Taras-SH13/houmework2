import java.util.List;

public class EntityInMemDaoImpl implements Dao {

    private  List<Entity> database;

    public  List<Entity> getDatabase() {
        return database;
    }

    public EntityInMemDaoImpl(List<Entity> database) {
        this.database = database;
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
