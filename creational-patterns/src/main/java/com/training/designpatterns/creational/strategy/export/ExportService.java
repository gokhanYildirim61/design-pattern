package com.training.designpatterns.creational.strategy.export;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExportService {

    private Map<String,ExportStrategy> exportStrategyMap;

    ExportService (Map<String,ExportStrategy> exportStrategy){
        exportStrategyMap=exportStrategy;
    }

    public   void exportData(String type,String message){
        ExportStrategy exportStrategy = exportStrategyMap.get(type);
        exportStrategy.export(message);
    }

}
