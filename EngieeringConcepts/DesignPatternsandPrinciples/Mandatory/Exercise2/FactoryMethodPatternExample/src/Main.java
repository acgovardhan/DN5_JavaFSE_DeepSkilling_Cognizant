public class Main {
    public static void main(String[] args) {
        Document word1 = new WordFactory().createDocument();
        word1.Open();
        Document pdf1 = new PdfFactory().createDocument();
        pdf1.Open();
        Document excel1 = new ExcelFactory().createDocument();
        excel1.Open();
    }
}
