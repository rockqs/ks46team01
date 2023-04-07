package ks46team01.accountingSale.controller;

import ks46team01.accountingSale.dto.AcSale;
import ks46team01.accountingSale.service.AcSaleService;
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
public class AcSaleController {
    private final AcSaleService acSaleService;

    @GetMapping("/accountingSale")
    public String accountingSale(Model model) {
        List<AcSale> as = acSaleService.getAcSale();

        model.addAttribute("title","조회");
        model.addAttribute("as", as);

        return ("accountAdmin/accountingSale");
    }
}


