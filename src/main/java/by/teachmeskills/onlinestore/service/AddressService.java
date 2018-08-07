package by.teachmeskills.onlinestore.service;

import by.teachmeskills.onlinestore.dao.AddressRepository;
import by.teachmeskills.onlinestore.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public void saveAddress(Address address) {
        addressRepository.save(address);
    }


    public int getIdAddress(String country, String city, String region, String street, String buildNumber) {
        int id = addressRepository.getIdAddress(country, city, region, street, buildNumber);
        return id;
    }
}
