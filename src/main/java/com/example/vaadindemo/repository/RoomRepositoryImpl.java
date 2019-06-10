package com.example.vaadindemo.repository;

import com.example.vaadindemo.entity.Room;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class RoomRepositoryImpl implements RoomRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Room> findAll() throws Exception{
        return em.createQuery("select n from " + Room.class.getSimpleName() + " n").getResultList();
    }

    @Override
    public void save(Room room) throws Exception{
        em.persist(room);
    }

    @Override
    public void delete(Integer id) throws Exception{
        em.remove(findById(id));
    }

    @Override
    public void update(Room room) throws Exception{
        em.merge(room);
    }

    @Override
    public Room findById(Integer id) throws Exception{
        return em.find(Room.class, id);
    }
}
