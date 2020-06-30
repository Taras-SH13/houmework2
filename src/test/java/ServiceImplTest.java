import org.junit.Assert;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ServiceImplTest {

    @org.junit.jupiter.api.Test
    public void shoodNoShortTiteleAddNewItem() {
        //Given
        String titleOfEntityTest = "tr";
        BigDecimal priceOfEntityTest = BigDecimal.valueOf(67);
        ServiceImpl service = new ServiceImpl();
        //When
        service.addNewItem(titleOfEntityTest, priceOfEntityTest);
        //Then
        Assert.assertTrue(EntityInMemDaoImpl.database.isEmpty());
    }

    @org.junit.jupiter.api.Test
    public void shoodNoLongTitelAddNewItem() {
        //Given
        String titleOfEntityTest = "tr443424242424244465464654654654654654654";
        BigDecimal priceOfEntityTest = BigDecimal.valueOf(657);
        ServiceImpl service = new ServiceImpl();
        //When
        service.addNewItem(titleOfEntityTest, priceOfEntityTest);
        //Then
        Assert.assertTrue(EntityInMemDaoImpl.database.isEmpty());
    }

    @org.junit.jupiter.api.Test
    public void shoodNoAddRepeatingItem() {
        //Given
        String titleOfEntityTest = "Asus carger 90w";
        BigDecimal priceOfEntityTest = BigDecimal.valueOf(56);
        String titleOfEntityTest2 = "Asus carger 90w";
        BigDecimal priceOfEntityTest2 = BigDecimal.valueOf(56);
        ServiceImpl service = new ServiceImpl();
        //When
        service.addNewItem(titleOfEntityTest, priceOfEntityTest);
        service.addNewItem(titleOfEntityTest2, priceOfEntityTest2);
        //Then
        Assert.assertEquals(1, EntityInMemDaoImpl.database.size());

    }

    @org.junit.jupiter.api.Test
    public void NoDatabaseConnectionExeption() throws NetworkException {
        //Given
        ServiceImpl service = new ServiceImpl();
        String titleOfEntityTest = "Asus carger 90w";
        BigDecimal priceOfEntityTest = BigDecimal.valueOf(56);
        //Then
        assertThrows(NetworkException.class,
                () -> service.addNewItem(titleOfEntityTest, priceOfEntityTest),
                "Соединение с базой данных - отсутствует!");

    }
}