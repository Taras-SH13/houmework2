import java.util.List;

public interface Dao {


    boolean store(Entity entity) throws NetworkException; // сохранение объекта
    List<Entity> findAll() throws NetworkException; // поиск объектов




}
