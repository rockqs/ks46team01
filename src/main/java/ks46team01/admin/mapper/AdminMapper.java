package ks46team01.admin.mapper;

import ks46team01.admin.dto.AdminDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<AdminDTO> findAllAdmins();
    void addAdmin(AdminDTO adminDTO);
    void updateAdmin(AdminDTO adminDTO);
    void deleteAdmin(String adminUsername);

    }
