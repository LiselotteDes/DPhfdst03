package be.vdab;
public class DocumentMain {
    public static void main(String[] args) {
//        DocumentFactory factory = new DocumentFactory();
        Document document = DocumentFactoryEnum.INSTANCE.open("liedje.pptx");
        document.printPreview();
        document.print();
    }
    
}
