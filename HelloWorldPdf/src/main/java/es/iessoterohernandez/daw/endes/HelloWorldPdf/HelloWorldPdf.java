package es.iessoterohernandez.daw.endes.HelloWorldPdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class HelloWorldPdf {

    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
            document.open();
            document.add(new Paragraph("Hola Mundo"));
            document.close();
            System.out.println("PDF creado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
