    package ks46team01.farm.farmPastData.controller;

    import ks46team01.farm.farmPastData.dto.FarmPastData;
    import ks46team01.farm.farmPastData.service.FarmPastDataService;
    import lombok.AllArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.*;
    import java.util.List;

    @Controller
    @Slf4j
    @AllArgsConstructor
    @RequestMapping("/farm")
    public class FarmPastDataController {
        private final FarmPastDataService farmPastDataService;

        @GetMapping("/farmPastData")
        public String farmPastData(Model model) {
            List<FarmPastData> fpd = farmPastDataService.getFarmPastData();

            model.addAttribute("title", "조회");
            model.addAttribute("fpd", fpd);


            return "farm/farmPastData";
        }


    }





