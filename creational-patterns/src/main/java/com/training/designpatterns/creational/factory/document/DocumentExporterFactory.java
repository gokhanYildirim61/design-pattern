package com.training.designpatterns.creational.factory.document;

public class DocumentExporterFactory {

    public static DocumentExporterService createExportDocument(String documentType){
        if (documentType==null){
            return null;
        }
        return switch (documentType.toUpperCase()){
            case "PDF" -> new PdfExporter();
            case "CSV" -> new CsvExporter();
            default -> throw new IllegalArgumentException("Bilinmeyen documentType");
        };
    }

}
