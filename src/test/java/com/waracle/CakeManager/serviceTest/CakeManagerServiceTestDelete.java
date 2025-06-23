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
public class CakeManagerServiceTestDelete {

    @InjectMocks
    CakeManagerService cakeManagerService;

    @Test
    public void testDeleteCake(){
        List<CakeDto> addList = cakeManagerService.addCake(getNewCakeDto());
        List<CakeDto> responseList = cakeManagerService.deleteCake(addList.getFirst());
        assertNotNull(responseList);
        assertEquals(0, responseList.size());
    }
}
