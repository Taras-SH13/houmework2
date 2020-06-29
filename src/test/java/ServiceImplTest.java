import org.junit.Assert;

import java.math.BigDecimal;

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
    public void shoodNoLongTitelAddNewItem(){
        //Given
        String titleOfEntityTest = "tr443424242424244465464654654654654654654";
        BigDecimal priceOfEntityTest = BigDecimal.valueOf(657);
        ServiceImpl service = new ServiceImpl();
        //When
        service.addNewItem(titleOfEntityTest, priceOfEntityTest);
        //Then
        Assert.assertTrue(EntityInMemDaoImpl.database.isEmpty());
    }
}