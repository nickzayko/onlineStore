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



@Repository
public interface UserRepository extends CrudRepository <User, Integer> {

//    /**
//          * This method for get user by name
//          *
//          * @param name
//          * @return
//          */
    @Query("select id from User user where user.idProfile = :idProfile")
    int getIdUser(@Param("idProfile") int idProfile);

    @Query("select id from User user where user.login = :login and user.password = :password")
    int getIdUser(@Param("login") String login,
                  @Param("password") String password);

    @Query ("select login from User user where user.login = :loginUserDTO")
    String isLoginExist(@Param("loginUserDTO") String loginUserDTO);

    @Query ("select password from User user where user.password = :password")
    String isPasswordCorrect(@Param("password") String password);

}
