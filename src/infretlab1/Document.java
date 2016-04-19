package infretlab1;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by shadiq on 2016-04-12.
 */
public class Document {
    private int docId;
    private String docContent = null;
    private Map<String, Integer> termFreqMap = new HashMap<>();
    private Map<String, Double> tfidfMap = new HashMap<>();
    private double docNormalizer = 0; // L2 norm || d ||

    public int getDocId(){
        return docId;
    }

    public void setDocId(int docId){
        this.docId = docId;
    }

    public String getDocContent(){
        return docContent;
    }
    public void setDocumentContent(String docContent){
        this.docContent = docContent;
    }

    public Map<String, Integer> getTermFrequencyMap() {
        return termFreqMap;
    }

    public void setTermFrequencyMap(Map<String, Integer> termFrequencyMap) {
        this.termFreqMap = termFrequencyMap;
    }

    public void setTermFreqMap(String[] tokens){
        for(int i = 0; i < tokens.length; i++){
            String tok = tokens[i];
            
            int count = termFreqMap.containsKey(tok) ? termFreqMap.get(tok) : 0;
            termFreqMap.put(tok, count + 1);
        }
    }

    public Map<String, Double> getTfidfMap() {
        return tfidfMap;
    }

    public void setTfidfMap(Map<String, Double> tfidfMap) {
        this.tfidfMap = tfidfMap;
    }
    
    public double getDocNormalizer() {
        return docNormalizer;
    }

    public void setDocNormalizer(double docNormalizer) {
        this.docNormalizer = docNormalizer;
    }
}
