package ks46team01.farm.farmPastData.mapper;

import ks46team01.farm.farmPastData.dto.FarmPastData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FarmPastDataMapper {
    List<FarmPastData> getFarmPastData();
}
