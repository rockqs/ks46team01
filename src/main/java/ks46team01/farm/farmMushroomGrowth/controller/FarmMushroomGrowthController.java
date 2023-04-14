    package ks46team01.farm.farmMushroomGrowth.controller;

    import io.micrometer.common.util.StringUtils;
    import ks46team01.farm.farmMushroomGrowth.dto.FarmMushroomGrowth;
    import ks46team01.farm.farmMushroomGrowth.service.FarmMushroomGrowthService;
    import lombok.AllArgsConstructor;
    import lombok.extern.slf4j.Slf4j;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;

    import java.util.ArrayList;
    import java.util.List;

    @Controller
    @Slf4j
    @AllArgsConstructor
    @RequestMapping("/farm")
    public class FarmMushroomGrowthController {
        private final FarmMushroomGrowthService farmMushroomGrowthService;


        @GetMapping("/farmGrownData")
        public String farmMushroomGrowthService(Model model
                , @RequestParam(name = "searchKey", required = false) String searchKey
                , @RequestParam(name = "searchValue", required = false) String searchValue) {

            List<FarmMushroomGrowth> fmsg = farmMushroomGrowthService.getFarmMushroomGrowth(searchKey, searchValue);


            model.addAttribute("title", "조회");
            model.addAttribute("fmsg", fmsg);

            return "farm/farmGrownData";


        }


      }














