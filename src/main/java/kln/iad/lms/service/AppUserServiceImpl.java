package kln.iad.lms.service;

import kln.iad.lms.entity.AppUser;
import kln.iad.lms.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserServiceImpl implements AppUserService{


    @Override
    public Optional<AppUser> getAppUserById(String id) {
        return Optional.empty();
    }
}
