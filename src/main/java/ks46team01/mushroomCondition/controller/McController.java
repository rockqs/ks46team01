package ks46team01.mushroomCondition.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping("/farm")
public class McController {
    @GetMapping("/farmCondition")
    public String farmCondition() {
        return ("/farm/farmCondition");
    }

    @GetMapping("/farmPastList")
    public String farmPastList() {
        return ("/farm/farmPastList");
    }

    @GetMapping("/farmData")
    public String farmData() {
        return ("/farm/farmData");
    }

    @GetMapping("/farmAccount")
    public String farmAccount() {
        return ("/farm/farmAccount");
    }

    @GetMapping("/farmGrownData")
    public String farmGrownData() {
        return ("/farm/farmGrownData");
    }


}


