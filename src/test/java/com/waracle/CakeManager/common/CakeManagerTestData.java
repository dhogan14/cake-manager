package com.waracle.CakeManager.common;

import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.model.CakeEntity;

import java.util.ArrayList;
import java.util.List;

public class CakeManagerTestData {

    public static List<CakeDto> getCakeDtoList(){
        List<CakeDto> cakeDtoList = new ArrayList<>();

        cakeDtoList.add(getCakeDto());

        CakeDto cakeDto = new CakeDto();
        cakeDto.setId(2);
        cakeDto.setTitle("test cake title");
        cakeDto.setDescription("test cake description");
        cakeDto.setImage("test cake image");
        cakeDtoList.add(cakeDto);

        return cakeDtoList;
    }

    public static CakeDto getCakeDto(){
        CakeDto cakeDto = new CakeDto();
        cakeDto.setId(1);
        cakeDto.setTitle("test update title");
        cakeDto.setDescription("test description");
        cakeDto.setImage("test image");
        return cakeDto;
    }

    public static CakeDto getNewCakeDto(){
        CakeDto cakeDto = new CakeDto();
        cakeDto.setTitle("test title");
        cakeDto.setDescription("test description");
        cakeDto.setImage("test image");
        return cakeDto;
    }

    public static List<CakeEntity> getCakeEntityList(){
        List<CakeEntity> cakeEntityList = new ArrayList<>();

        cakeEntityList.add(getCakeEntity());

        CakeEntity cakeEntity = new CakeEntity();
        cakeEntity.setId(2);
        cakeEntity.setTitle("test cake title");
        cakeEntity.setDescription("test cake description");
        cakeEntity.setImage("test cake image");
        cakeEntityList.add(cakeEntity);

        return cakeEntityList;
    }

    public static CakeEntity getCakeEntity(){
        CakeEntity cakeEntity = new CakeEntity();
        cakeEntity.setId(1);
        cakeEntity.setTitle("test title");
        cakeEntity.setDescription("test description");
        cakeEntity.setImage("test image");
        return cakeEntity;
    }

    public static CakeEntity getNewCakeEntity(){
        CakeEntity cakeEntity = new CakeEntity();
        cakeEntity.setTitle("test title");
        cakeEntity.setDescription("test description");
        cakeEntity.setImage("test image");
        return cakeEntity;
    }
}
