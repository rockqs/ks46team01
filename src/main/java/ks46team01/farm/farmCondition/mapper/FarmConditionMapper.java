package ks46team01.farm.farmCondition.mapper;

import ks46team01.farm.farmCondition.dto.FarmCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FarmConditionMapper {
    List<FarmCondition> getFarmCondition();
}
