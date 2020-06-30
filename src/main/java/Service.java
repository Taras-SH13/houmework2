import java.math.BigDecimal;

public interface Service {


    void addNewItem(String title, BigDecimal price) throws NetworkException;
    void findEntity ()throws NetworkException;

}
