package ks46team01.farm.farmMushroomGrowth.dto;

import lombok.Data;

@Data
public class FarmMushroomGrowth {
    private Long mushroomGrowthIdx;
    private Long farmDataIdx;
    private Long cropIdx;
    private String mushroomGrowDaily;
    private String mushroomGrowStatus;
    private String mushroomGrowDate;
    private String mushroomGrowUpdate;

}
