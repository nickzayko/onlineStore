package by.teachmeskills.onlinestore.dao;

import by.teachmeskills.onlinestore.entity.Profile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {


    @Query("select id from Profile profiles where profiles.idAddress = :idAddress")
    Integer getIdProfile(@Param("idAddress") int idAddress);

    @Query ("select email from Profile profile where profile.email = :emailUserDTO")
    String isEmailExist(@Param("emailUserDTO") String emailUserDTO);

    @Query ("select telephoneNumber from Profile profile where profile.telephoneNumber = :telephoneNumberUserDTO")
    Integer isTelephoneExist(@Param("telephoneNumberUserDTO") Integer telephoneNumberUserDTO);

}
