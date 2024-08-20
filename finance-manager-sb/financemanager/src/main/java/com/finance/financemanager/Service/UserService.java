package com.finance.financemanager.Service;

import com.finance.financemanager.exception.UserNotFoundException;
import com.finance.financemanager.model.User;
import com.finance.financemanager.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public List<User> findAllUsers() { return userRepository.findAll(); }

    public User findUserById(Long id) {
        return userRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + "was not found"));
    }

    public User addUser(User user) {
        user.setUserCode(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    public User updateUser(User user) { return userRepository.save(user); }

    public void deleteUser(Long id) { userRepository.deleteUserById(id); }
}
