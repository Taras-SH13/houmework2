import java.math.BigDecimal;
import java.time.Instant;

// класс для описания товара
public class Entity {

    private Long id; // уникальный номер товара
    private String title; // название товара
    private Instant dateIn; // дата добавления в систему
    private BigDecimal price; // цена товара

// конструктор

    public Entity(String title,BigDecimal price) {
        this.id=(long)(Math.random()*1000000); // генерация id товара
        this.title = title;
        this.dateIn = Instant.now(); // определяем время добавления в систему
        this.price = price;

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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", price='" + price + '\'' +
                //", id='" + id + '\'' +
                ", date to add=" + dateIn +
                //", amount=" + amount +
                '}';
    }
}
