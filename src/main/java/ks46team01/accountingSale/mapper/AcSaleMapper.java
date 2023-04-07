package ks46team01.accountingSale.mapper;

import ks46team01.accountingSale.dto.AcSale;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AcSaleMapper {
    List<AcSale> getAcSale();
}
