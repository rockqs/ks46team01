package ks46team01.admin.repository;

import ks46team01.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, String> {
    List<Admin> findAll();
    Optional<Admin> findByAdminUsername(String adminUsername);
    void deleteByAdminUsername(String adminUsername);
}

