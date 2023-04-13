package ks46team01.farm.farmPurchase.mapper;


import ks46team01.farm.farmPurchase.dto.FarmPurchase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FarmPurchaseMapper {
    List<FarmPurchase> getFarmPurchase();
}
