package ks46team01.accountingPurchase.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/accountAdmin")
public class AcPurchaseController {

    @GetMapping("/accountingPurchase")
    public String accountingPurchase() {
        return ("/accountAdmin/accountingPurchase");
    }
}


