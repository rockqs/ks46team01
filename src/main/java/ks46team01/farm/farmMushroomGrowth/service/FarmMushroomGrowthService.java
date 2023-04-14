package ks46team01.farm.farmMushroomGrowth.service;

import groovyjarjarantlr4.v4.parse.ActionSplitterListener;
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

    public List<FarmMushroomGrowth> getFarmMushroomGrowth(String searchKey , String searchValue){
        if(searchKey != null){
            switch (searchKey) {
                case "mushroomGrowthIdx" -> searchKey = "mushroom_growth_idx";
                case "farmDataIdx" -> searchKey = "farm_data_idx";
                default -> searchKey = "crop_idx";
            }
        }

        System.out.println(searchKey+ "입력값");


        System.out.println(searchValue + "찾는값");


        List<FarmMushroomGrowth> farmMushroomGrowth = farmMushroomGrowthMapper.getMushroomGrowthInfoById(searchKey, searchValue);
        return farmMushroomGrowth;

    }



/*    public List<FarmMushroomGrowth> getFarmMushroomGrowth(){
        List<FarmMushroomGrowth> farmMushroomGrowth = farmMushroomGrowthMapper.getFarmMushroomGrowth();
        return farmMushroomGrowth;
    }*/


}
