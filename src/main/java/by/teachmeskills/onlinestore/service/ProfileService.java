package by.teachmeskills.onlinestore.service;

import by.teachmeskills.onlinestore.dao.ProfileRepository;
import by.teachmeskills.onlinestore.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    public void saveProfile(Profile profile) {
        profileRepository.save(profile);
    }

    public int getIdProfile(int idAddress) {
        int id = profileRepository.getIdProfile(idAddress);
        return id;
    }
}
