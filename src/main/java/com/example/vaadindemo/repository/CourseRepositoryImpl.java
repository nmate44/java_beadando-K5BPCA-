package com.example.vaadindemo.repository;

import com.example.vaadindemo.entity.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class CourseRepositoryImpl implements CourseRepository{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Course> findAll() throws Exception {
        return em.createQuery("select n from " + Course.class.getSimpleName() + " n").getResultList();
    }

    @Override
    public void save(Course course) throws Exception {
        em.persist(course);
    }

    @Override
    public void delete(int id) throws Exception{
        em.remove(findById(id));
    }

    @Override
    public void update(Course course) throws Exception {
        em.merge(course);
    }

    @Override
    public Course findById(int id) throws Exception {
        return em.find(Course.class, id);
    }
}
