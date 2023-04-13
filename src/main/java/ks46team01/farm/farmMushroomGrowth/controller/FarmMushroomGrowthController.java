    package ks46team01.farm.farmMushroomGrowth.controller;

    import ks46team01.farm.farmMushroomGrowth.dto.FarmMushroomGrowth;
    import ks46team01.farm.farmMushroomGrowth.service.FarmMushroomGrowthService;
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
    public class FarmMushroomGrowthController {
        private final FarmMushroomGrowthService farmMushroomGrowthService;

        @GetMapping("/farmGrownData")
        public String farmMushroomGrowthService(Model model) {
            List<FarmMushroomGrowth> fmsg = farmMushroomGrowthService.getFarmMushroomGrowth();

            model.addAttribute("title", "조회");
            model.addAttribute("fmsg", fmsg);


            return "farm/farmGrownData";
        }


    }





