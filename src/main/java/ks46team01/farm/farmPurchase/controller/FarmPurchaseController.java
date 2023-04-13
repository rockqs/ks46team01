    package ks46team01.farm.farmPurchase.controller;

    import ks46team01.farm.farmPurchase.dto.FarmPurchase;
    import ks46team01.farm.farmPurchase.service.FarmPurchaseService;
    import lombok.AllArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import java.util.List;

    @Controller
    @Slf4j
    @AllArgsConstructor
    @RequestMapping("/farm")
    public class FarmPurchaseController {
        private final FarmPurchaseService farmPurchaseService;

        @GetMapping("/farmAccount")
        public String farmPurchase(Model model) {
            List<FarmPurchase> fap = farmPurchaseService.getFarmPurchase();

            model.addAttribute("title", "조회");
            model.addAttribute("fap", fap);


            return "farm/farmAccount";
        }


    }





