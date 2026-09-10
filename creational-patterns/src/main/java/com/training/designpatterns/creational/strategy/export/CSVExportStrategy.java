package com.training.designpatterns.creational.strategy.export;

import org.springframework.stereotype.Component;

@Component("CSV")
public class CSVExportStrategy implements ExportStrategy{
    @Override
    public void export(String message) {
        System.out.println("CSV ile export edildi" + message);
    }
}
