package ks46team01.accountingPurchase.mapper;

import ks46team01.accountingPurchase.dto.AcPurchase;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AcPurchaseMapper {

    List<AcPurchase> getAcPurchase();
}