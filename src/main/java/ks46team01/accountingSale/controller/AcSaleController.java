package ks46team01.accountingSale.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/accountAdmin")
public class AcSaleController {

    @GetMapping("/accountingSale")
    public String accountingSale() {
        return ("/accountAdmin/accountingSale");
    }

}


