import java.math.BigDecimal;

public class Application {

    public static void main(String[] args)  {
        new ServiceImpl().addNewItem("tr5ipp", BigDecimal.valueOf(56));
        new ServiceImpl().addNewItem("tr5ipp", BigDecimal.valueOf(56));

    }

}
