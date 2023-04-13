package ks46team01.farm.farmData.dto;

import lombok.Data;

@Data
public class FarmData {
    private Long farmDataIdx;
    private String username;
    private Long companyInfoIdx;
    private String farmDataCompost;
    private String farmDataProduction;
    private String farmDataExpectedSale;
    private String farmDataActualSale;
    private String farmDataProductionDate;
    private String farmDataOccurrenceSaleDate;
    private String farmDataExpectedWasted;

}
