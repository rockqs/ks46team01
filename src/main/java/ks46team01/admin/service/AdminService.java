package ks46team01.admin.service;

import ks46team01.admin.dto.AdminDTO;
import ks46team01.admin.mapper.AdminMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AdminService {


    private final AdminMapper adminMapper;
    public AdminService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public List<AdminDTO> findAllAdmins() {
        return adminMapper.findAllAdmins();
    }
    public void addAdmin(AdminDTO adminDTO) {
        adminMapper.addAdmin(adminDTO);
    }

    public void updateAdmin(AdminDTO adminDTO) {
        adminMapper.updateAdmin(adminDTO);
    }

    public void deleteAdmin(String adminUsername) {
        adminMapper.deleteAdmin(adminUsername);
    }

}
