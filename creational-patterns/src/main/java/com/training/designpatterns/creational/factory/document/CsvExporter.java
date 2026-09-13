package com.training.designpatterns.creational.factory.document;

public class CsvExporter implements DocumentExporterService{
    @Override
    public void exportDocument(String message) {
        System.out.println("Csv ile  export edildi " + message );
    }
}
