package ks46team01.admin.service;


import ks46team01.admin.dto.AdminDTO;
import ks46team01.admin.mapper.AdminMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AdminServiceTest {

    @Mock
    private AdminMapper adminMapper;

    @InjectMocks
    private AdminService adminService;

    private AdminDTO admin1;
    private AdminDTO admin2;

    @BeforeEach
    public void setUp() {
        admin1 = new AdminDTO("admin1", "password1", "Admin One", new Timestamp(System.currentTimeMillis()), null);
        admin2 = new AdminDTO("admin2", "password2", "Admin Two", new Timestamp(System.currentTimeMillis()), null);
    }

    @Test
    public void findAllAdminsTest() {
        when(adminMapper.findAllAdmins()).thenReturn(Arrays.asList(admin1, admin2));

        List<AdminDTO> adminList = adminService.findAllAdmins();

        assertEquals(2, adminList.size());
        verify(adminMapper, times(1)).findAllAdmins();
    }

    @Test
    public void addAdminTest() {
        adminService.addAdmin(admin1);
        verify(adminMapper, times(1)).addAdmin(admin1);
    }

    @Test
    public void updateAdminTest() {
        adminService.updateAdmin(admin1);
        verify(adminMapper, times(1)).updateAdmin(admin1);
    }

    @Test
    public void deleteAdminTest() {
        adminService.deleteAdmin("admin1");
        verify(adminMapper, times(1)).deleteAdmin("admin1");
    }
}
