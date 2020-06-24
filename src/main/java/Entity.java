import java.math.BigDecimal;
import java.time.Instant;

// класс для описания товара
public class Entity {

    private static Long id; // уникальный номер товара
    private String title; // название товара
    private Instant dateIn; // дата добавления в систему
    private BigDecimal price; // цена товара
// конструктор
    public Entity(String title,BigDecimal price) {
        this.title = title;
        this.dateIn = dateIn;    //todo создать дату добавления в систему
        this.price = price;
        id++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getDateIn() {
        return dateIn;
    }

    public void setDateIn(Instant dateIn) {
        this.dateIn = dateIn;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
