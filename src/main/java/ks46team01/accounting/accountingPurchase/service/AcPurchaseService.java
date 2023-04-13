package ks46team01.accounting.accountingPurchase.service;

import ks46team01.accounting.accountingPurchase.dto.AcPurchase;
import ks46team01.accounting.accountingPurchase.mapper.AcPurchaseMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AcPurchaseService {
    private final AcPurchaseMapper acPurchaseMapper;


    public AcPurchaseService(AcPurchaseMapper acPurchaseMapper) {
        this.acPurchaseMapper = acPurchaseMapper;
    }

    public List<AcPurchase> getAcPurchase() {
        List<AcPurchase> acPurchase = acPurchaseMapper.getAcPurchase();
        return acPurchase;
    }


    }



