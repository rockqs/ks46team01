package ks46team01.farm.farmCondition.service;

import ks46team01.farm.farmCondition.dto.FarmCondition;
import ks46team01.farm.farmCondition.mapper.FarmConditionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FarmConditionService {
    private final FarmConditionMapper farmConditionMapper;

    public FarmConditionService(FarmConditionMapper farmConditionMapper){
        this.farmConditionMapper = farmConditionMapper;
    }

    public List<FarmCondition> getFarmCondition(){
        List<FarmCondition> farmCondition = farmConditionMapper.getFarmCondition();
        return farmCondition;
    }


}
