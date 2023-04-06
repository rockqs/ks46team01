package ks46team01.user.service;

import ks46team01.user.entity.User;
import ks46team01.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(String username, User updatedUser) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setPassword(updatedUser.getPassword());
            user.setName(updatedUser.getName());
            user.setBirth(updatedUser.getBirth());
            user.setEmail(updatedUser.getEmail());
            user.setPhone(updatedUser.getPhone());
            user.setAddress(updatedUser.getAddress());
            user.setUpdate(new Timestamp(System.currentTimeMillis()));
            user.setStatus(updatedUser.getStatus());
            user.setCompanyInfoIdx(updatedUser.getCompanyInfoIdx());
            return userRepository.save(user);
        } else {
            throw new ResourceNotFoundException("User", "username", username);
        }
    }

    public void deleteUser(String username) {
        Optional<User> optionalUser = userRepository.findByUsername(username);
        if (optionalUser.isPresent()) {
            userRepository.delete(optionalUser.get());
        } else {
            throw new ResourceNotFoundException("User", "username", username);
        }
    }
}
