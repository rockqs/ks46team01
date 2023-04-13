    package ks46team01.farm.farmData.controller;

    import ks46team01.farm.farmData.dto.FarmData;
    import ks46team01.farm.farmData.service.FarmDataService;
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
    public class FarmDataController {
        private final FarmDataService farmDataService;

        @GetMapping("/farmData")
        public String farmData(Model model) {
            List<FarmData> fd = farmDataService.getFarmData();

            model.addAttribute("title", "조회");
            model.addAttribute("fd", fd);


            return "farm/farmData";
        }


    }





