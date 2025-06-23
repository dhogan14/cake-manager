package com.waracle.CakeManager.mapper;

import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.model.CakeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CakeMapper {

    public List<CakeDto> cakeEntityListToDtoList(List<CakeEntity> entityList){
        if(entityList == null || entityList.isEmpty()) return new ArrayList<>();
        return entityList.stream().map(this::cakeEntityToDto).collect(Collectors.toList());
    }

    public CakeDto cakeEntityToDto(CakeEntity cakeEntity){
        CakeDto cakeDto = new CakeDto();
        cakeDto.setId(cakeEntity.getId());
        cakeDto.setTitle(cakeEntity.getTitle());
        cakeDto.setDescription(cakeEntity.getDescription());
        cakeDto.setImage(cakeEntity.getImage());
        return cakeDto;
    }

    public List<CakeEntity> cakeDtoListToEntityList(List<CakeDto> dtoList){
        if(dtoList == null || dtoList.isEmpty()) return new ArrayList<>();
        return dtoList.stream().map(this::cakeDtoToEntity).collect(Collectors.toList());
    }

    public CakeEntity cakeDtoToEntity(CakeDto cakeDto){
        CakeEntity cakeEntity = new CakeEntity();
        cakeEntity.setId(cakeDto.getId());
        cakeEntity.setTitle(cakeDto.getTitle());
        cakeEntity.setDescription(cakeDto.getDescription());
        cakeEntity.setImage(cakeDto.getImage());
        return cakeEntity;
    }
}
