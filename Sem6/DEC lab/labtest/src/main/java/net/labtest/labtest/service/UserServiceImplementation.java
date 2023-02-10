package net.labtest.labtest.service;

import java.util.List;
import net.labtest.labtest.model.users;
import net.labtest.labtest.repository.UserRespoitory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplementation implements UserService{
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private UserRespoitory userRepo;
    @Override
    public List<users> getAllUsers(){
        return userRepo.findAll();
    }
}
