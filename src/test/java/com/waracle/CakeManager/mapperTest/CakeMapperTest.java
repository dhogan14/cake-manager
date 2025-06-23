package com.waracle.CakeManager.mapperTest;

import com.waracle.CakeManager.mapper.CakeMapper;
import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.model.CakeEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static com.waracle.CakeManager.common.CakeManagerTestData.getCakeDtoList;
import static com.waracle.CakeManager.common.CakeManagerTestData.getCakeEntityList;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CakeMapperTest {

    @InjectMocks
    CakeMapper cakeMapper;

    @Test
    public void testCakeDtoListToEntityList(){
        List<CakeDto> cakeDtoList = getCakeDtoList();
        List<CakeEntity> cakeEntityList = cakeMapper.cakeDtoListToEntityList(cakeDtoList);
        assertNotNull(cakeEntityList);
        assertEquals(cakeEntityList.getFirst().getTitle(), cakeDtoList.getFirst().getTitle());
    }

    @Test
    public void testCakeDtoListToEntityListNull(){
        List<CakeEntity> cakeEntityList = cakeMapper.cakeDtoListToEntityList(null);
        assertNotNull(cakeEntityList);
        assertTrue(cakeEntityList.isEmpty());
    }

    @Test
    public void testCakeDtoListToEntityListEmpty(){
        List<CakeEntity> cakeEntityList = cakeMapper.cakeDtoListToEntityList(new ArrayList<>());
        assertNotNull(cakeEntityList);
        assertTrue(cakeEntityList.isEmpty());
    }

    @Test
    public void testCakeEntityListToDtoList(){
        List<CakeEntity> cakeEntityList = getCakeEntityList();
        List<CakeDto> cakeDtoList = cakeMapper.cakeEntityListToDtoList(cakeEntityList);
        assertNotNull(cakeEntityList);
        assertEquals(cakeEntityList.getFirst().getTitle(), cakeDtoList.getFirst().getTitle());
    }

    @Test
    public void testCakeEntityListToDtoListNull(){
        List<CakeDto> cakeDtoList = cakeMapper.cakeEntityListToDtoList(null);
        assertNotNull(cakeDtoList);
        assertTrue(cakeDtoList.isEmpty());
    }

    @Test
    public void testCakeEntityListToDtoListEmpty(){
        List<CakeDto> cakeDtoList = cakeMapper.cakeEntityListToDtoList(new ArrayList<>());
        assertNotNull(cakeDtoList);
        assertTrue(cakeDtoList.isEmpty());
    }
}
