package com.training.designpatterns.creational.factory.document;

public class PdfExporter implements DocumentExporterService{
    @Override
    public void exportDocument(String message) {
        System.out.println("Pdf ile  export edildi " + message );

    }
}
