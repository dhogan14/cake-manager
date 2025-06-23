package com.waracle.CakeManager.service;

import com.waracle.CakeManager.mapper.CakeMapper;
import com.waracle.CakeManager.model.CakeDto;
import com.waracle.CakeManager.model.CakeEntity;
import com.waracle.CakeManager.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CakeManagerService {

    private final CakeMapper cakeMapper = new CakeMapper();

    public List<CakeDto> fetchCakeList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<CakeDto> cakesDTO = cakeMapper.cakeEntityListToDtoList(session.createCriteria(CakeEntity.class).list());
        session.close();
        return cakesDTO;
    }

    public List<CakeDto> addCake(CakeDto cakeDto) throws ConstraintViolationException{
        Session session = HibernateUtil.getSessionFactory().openSession();
        CakeEntity cakeEntity = cakeMapper.cakeDtoToEntity(cakeDto);
        List<CakeDto> cakesDTO;
        session.beginTransaction();
        session.persist(cakeEntity);
        System.out.println("Adding cake entry");
        session.getTransaction().commit();
        cakesDTO = cakeMapper.cakeEntityListToDtoList(session.createCriteria(CakeEntity.class).list());
        session.close();
        return cakesDTO;
    }

    public List<CakeDto> updateCake(CakeDto cakeDto) throws ConstraintViolationException{
        Session session = HibernateUtil.getSessionFactory().openSession();
        CakeEntity cakeEntity = cakeMapper.cakeDtoToEntity(cakeDto);
        List<CakeDto> cakesDTO;
        session.beginTransaction();
        session.update(cakeEntity);
        System.out.println("Updating cake entry");
        session.getTransaction().commit();
        cakesDTO = cakeMapper.cakeEntityListToDtoList(session.createCriteria(CakeEntity.class).list());
        session.close();
        return cakesDTO;
    }

    public List<CakeDto> deleteCake(CakeDto cakeDto) throws ConstraintViolationException{
        Session session = HibernateUtil.getSessionFactory().openSession();
        CakeEntity cakeEntity = cakeMapper.cakeDtoToEntity(cakeDto);
        session.beginTransaction();
        session.delete(cakeEntity);
        System.out.println("Deleting cake entry");
        session.getTransaction().commit();
        List<CakeDto> cakesDTO = cakeMapper.cakeEntityListToDtoList(session.createCriteria(CakeEntity.class).list());
        session.close();
        return cakesDTO;
    }
}
