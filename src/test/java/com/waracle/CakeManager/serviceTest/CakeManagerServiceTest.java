package com.waracle.CakeManager.serviceTest;

import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.service.CakeManagerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.waracle.CakeManager.common.CakeManagerTestData.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CakeManagerServiceTest {

    @InjectMocks
    CakeManagerService cakeManagerService;

    @Test
    public void testFetchCakeList(){
        List<CakeDto> addList = cakeManagerService.addCake(getNewCakeDto());
        List<CakeDto> responseList = cakeManagerService.fetchCakeList();
        assertNotNull(responseList);
        assertEquals(1, responseList.size());
        List<CakeDto> deleteList = cakeManagerService.deleteCake(responseList.getFirst());
    }

    @Test
    public void testAddCake(){
        List<CakeDto> responseList = cakeManagerService.addCake(getNewCakeDto());
        assertNotNull(responseList);
        assertEquals(1, responseList.size());
        List<CakeDto> deleteList = cakeManagerService.deleteCake(responseList.getFirst());
    }

    @Test
    public void testUpdateCake(){
        List<CakeDto> addList = cakeManagerService.addCake(getNewCakeDto());
        CakeDto cake = addList.getFirst();
        cake.setTitle("updated Title");
        List<CakeDto> responseList = cakeManagerService.updateCake(cake);
        assertNotNull(responseList);
        assertEquals(1, responseList.size());
        List<CakeDto> deleteList = cakeManagerService.deleteCake(cake);
    }

    @Test
    public void testDeleteCake(){
        List<CakeDto> addList = cakeManagerService.addCake(getNewCakeDto());
        List<CakeDto> responseList = cakeManagerService.deleteCake(addList.getFirst());
        assertNotNull(responseList);
        assertEquals(0, responseList.size());
    }
}
