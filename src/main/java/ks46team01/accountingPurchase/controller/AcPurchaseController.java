package ks46team01.accountingPurchase.controller;

import ks46team01.accountingPurchase.dto.AcPurchase;
import ks46team01.accountingPurchase.service.AcPurchaseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("/accountAdmin")
public class AcPurchaseController {
    private final AcPurchaseService acPurchaseService;

    @GetMapping("/accountingPurchase")
    public String getAcPurchase(Model model) {
        List<AcPurchase> ac = acPurchaseService.getAcPurchase();

        model.addAttribute("title", "이력조회");
        model.addAttribute("ac", ac);

        return "accountAdmin/accountingPurchase";
    }
}


