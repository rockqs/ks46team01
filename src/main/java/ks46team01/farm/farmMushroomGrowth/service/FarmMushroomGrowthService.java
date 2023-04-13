package ks46team01.farm.farmMushroomGrowth.service;

import ks46team01.farm.farmMushroomGrowth.dto.FarmMushroomGrowth;
import ks46team01.farm.farmMushroomGrowth.mapper.FarmMushroomGrowthMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FarmMushroomGrowthService {
    private final FarmMushroomGrowthMapper farmMushroomGrowthMapper;

    public FarmMushroomGrowthService(FarmMushroomGrowthMapper farmMushroomGrowthMapper){
        this.farmMushroomGrowthMapper = farmMushroomGrowthMapper;
    }

    public List<FarmMushroomGrowth> getFarmMushroomGrowth(){
        List<FarmMushroomGrowth> farmMushroomGrowth = farmMushroomGrowthMapper.getFarmMushroomGrowth();
        return farmMushroomGrowth;
    }


}
