package ks46team01.accounting.accountingPurchase.mapper;

import ks46team01.accounting.accountingPurchase.dto.AcPurchase;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AcPurchaseMapper {

    List<AcPurchase> getAcPurchase();
}