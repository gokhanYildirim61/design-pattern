package com.training.designpatterns.creational.strategy.export;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelExportStrategy implements ExportStrategy{
    @Override
    public void export(String message) {
        System.out.println("Excel ile export edildi" + message);
    }
}
