package com.training.designpatterns.creational.factory.document;

public class FactoryDemo {
    public  static void main(String[] args){
        DocumentExporterService documentExporterService= DocumentExporterFactory.createExportDocument("excel");
        documentExporterService.exportDocument("maaş bordoları");
    }
}
