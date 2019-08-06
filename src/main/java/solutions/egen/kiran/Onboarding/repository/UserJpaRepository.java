package solutions.egen.kiran.Onboarding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import solutions.egen.kiran.Onboarding.model.User;

@Component
public interface UserJpaRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}