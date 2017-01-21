package dna.result;

public class Result {

    private String documentName = "";
    private String virusName = "";
    private String similarity = "";

    public Result() {
    }

    public Result(String documentName, String virusName, String similarity) {
        this.documentName = documentName;
        this.virusName = virusName;
        this.similarity = similarity;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getVirusName() {
        return virusName;
    }

    public void setVirusName(String virusName) {
        this.virusName = virusName;
    }

    public String getSimilarity() {
        return similarity;
    }

    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }
}
