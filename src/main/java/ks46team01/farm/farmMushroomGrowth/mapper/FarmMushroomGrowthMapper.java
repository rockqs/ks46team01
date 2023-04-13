package ks46team01.farm.farmMushroomGrowth.mapper;

import ks46team01.farm.farmMushroomGrowth.dto.FarmMushroomGrowth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FarmMushroomGrowthMapper {
    List<FarmMushroomGrowth> getFarmMushroomGrowth();
}
