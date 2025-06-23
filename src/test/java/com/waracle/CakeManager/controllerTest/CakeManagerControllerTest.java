package com.waracle.CakeManager.controllerTest;

import com.waracle.CakeManager.controller.CakeManagerController;
import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.service.CakeManagerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.waracle.CakeManager.common.CakeManagerTestData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static com.waracle.CakeManager.common.CakeManagerTestData.getCakeDto;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CakeManagerControllerTest {

    @InjectMocks
    CakeManagerController cakeManagerController;

    @Mock
    CakeManagerService cakeManagerService;

    @Test
    public void testGetCakes(){
        when(cakeManagerService.fetchCakeList()).thenReturn(CakeManagerTestData.getCakeDtoList());
        ResponseEntity<List<CakeDto>> response = cakeManagerController.getCakes();
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    public void testAddCake(){
        when(cakeManagerService.addCake(any())).thenReturn(CakeManagerTestData.getCakeDtoList());
        ResponseEntity<List<CakeDto>> response = cakeManagerController.addCake(getCakeDto());
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    public void testUpdateCake(){
        when(cakeManagerService.updateCake(any())).thenReturn(CakeManagerTestData.getCakeDtoList());
        ResponseEntity<List<CakeDto>> response = cakeManagerController.updateCake(getCakeDto());
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }

    @Test
    public void testDeleteCake(){
        when(cakeManagerService.deleteCake(any())).thenReturn(CakeManagerTestData.getCakeDtoList());
        ResponseEntity<List<CakeDto>> response = cakeManagerController.deleteCake(getCakeDto());
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
    }
}
