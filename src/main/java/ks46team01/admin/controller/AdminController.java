package ks46team01.admin.controller;

import ks46team01.admin.dto.AdminDTO;
import ks46team01.admin.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Slf4j
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/listAdmin")
    public String adminList(Model model) {
        List<AdminDTO> adminList = adminService.findAllAdmins();
        model.addAttribute("adminList", adminList);
        log.info("adminList={}", adminList);
        return "admin/listAdmin";
    }

    @PostMapping("/addAdmin")
    public ResponseEntity<String> addAdmin(@RequestBody AdminDTO adminDTO) {
        adminService.addAdmin(adminDTO);
        return ResponseEntity.ok("Admin added successfully");
    }

    @PostMapping("/updateAdmin")
    public ResponseEntity<String> updateAdmin(@RequestBody AdminDTO adminDTO) {
        adminService.updateAdmin(adminDTO);
        return ResponseEntity.ok("Admin updated successfully");
    }

    @DeleteMapping("/deleteAdmin/{adminUsername}")
    public ResponseEntity<String> deleteAdmin(@PathVariable("adminUsername") String adminUsername) {
        adminService.deleteAdmin(adminUsername);
        return ResponseEntity.ok("Admin deleted successfully");
    }
}


