package com.training.designpatterns.creational.strategy.export;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfExportStrategy implements ExportStrategy{
    @Override
    public void export(String message) {
        System.out.println("Pdf ile export edildi" + message);

    }
}
