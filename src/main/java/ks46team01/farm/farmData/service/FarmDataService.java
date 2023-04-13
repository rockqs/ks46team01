package ks46team01.farm.farmData.service;

import ks46team01.farm.farmData.dto.FarmData;
import ks46team01.farm.farmData.mapper.FarmDataMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FarmDataService {
    private final FarmDataMapper farmDataMapper;

    public FarmDataService(FarmDataMapper farmDataMapper){
        this.farmDataMapper = farmDataMapper;
    }

    public List<FarmData> getFarmData(){
        List<FarmData> farmData = farmDataMapper.getFarmData();
        return farmData;
    }


}
