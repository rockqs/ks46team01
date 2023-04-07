    package ks46team01.farm.farmCondition.controller;

    import ks46team01.farm.farmCondition.dto.FarmCondition;
    import ks46team01.farm.farmCondition.service.FarmConditionService;
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
    public class FarmConditionController {
        private final FarmConditionService farmConditionService;

        @GetMapping("/farmCondition")
        public String farmCondition(Model model) {
            List<FarmCondition> fc = farmConditionService.getFarmCondition();

            model.addAttribute("title", "조회");
            model.addAttribute("fc", fc);


            return "farm/farmCondition";
        }


    }





