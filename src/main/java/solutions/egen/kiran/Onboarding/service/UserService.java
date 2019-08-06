package solutions.egen.kiran.Onboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutions.egen.kiran.Onboarding.model.User;
import solutions.egen.kiran.Onboarding.repository.UserJpaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserJpaRepository userJpaRepository;

    public List<User> findAll() {
        return userJpaRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userJpaRepository.findById(id);
    }

    public User save(User user) {
        return userJpaRepository.save(user);
    }

    public void deleteById(Long id) {
        userJpaRepository.deleteById(id);
    }

    public User findByName(String name) {
        return userJpaRepository.findByName(name);
    }

}
