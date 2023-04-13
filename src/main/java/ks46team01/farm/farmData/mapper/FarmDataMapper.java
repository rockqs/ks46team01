package ks46team01.farm.farmData.mapper;

import ks46team01.farm.farmData.dto.FarmData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FarmDataMapper {
    List<FarmData> getFarmData();
}
