package ks46team01.farm.farmPurchase.service;


import ks46team01.farm.farmPurchase.dto.FarmPurchase;
import ks46team01.farm.farmPurchase.mapper.FarmPurchaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FarmPurchaseService {
    private final FarmPurchaseMapper farmPurchaseMapper;

    public FarmPurchaseService(FarmPurchaseMapper farmPurchaseMapper){
        this.farmPurchaseMapper = farmPurchaseMapper;
    }

    public List<FarmPurchase> getFarmPurchase(){
        List<FarmPurchase> farmPurchase = farmPurchaseMapper.getFarmPurchase();
        return farmPurchase;
    }


}
