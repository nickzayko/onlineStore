package by.teachmeskills.onlinestore.dao;

import by.teachmeskills.onlinestore.entity.Address;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

    @Query("select id from Address addresses where addresses.country = :country and " +
            "addresses.region = :region and addresses.city = :city and addresses.street = :street " +
            "and addresses.buildNumber = :buildNumber")
    int getIdAddress(@Param("country") String country,
                     @Param("region") String region,
                     @Param("city") String city,
                     @Param("street") String street,
                     @Param("buildNumber") String buildNumber);


}
