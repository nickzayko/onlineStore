package by.teachmeskills.onlinestore.dao;


import by.teachmeskills.onlinestore.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.jpa.HibernateEntityManager;
import org.hibernate.jpa.HibernateQuery;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.RepositoryQuery;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.repository.GenericDeclRepository;


@Repository
public interface UserRepository extends CrudRepository <User, Integer> {

//    /**
//          * This method for get user by name
//          *
//          * @param name
//          * @return
//          */
    @Query("select user from User user where user.name = :name")
    User getUserByName(@Param("name") String name);

}