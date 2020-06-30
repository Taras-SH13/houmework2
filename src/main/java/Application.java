import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        new ServiceImpl().addNewItem("Asus 85w", BigDecimal.valueOf(56));
        new ServiceImpl().addNewItem("aCER 120W", BigDecimal.valueOf(56));
        new ServiceImpl().findEntity();
    }

}
