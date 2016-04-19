/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the  "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author : Ammar Shadiq, Filip Antomonov
 * Information Retrieval Lab 1: Inverted Index, Boolean Query, Weighted Query
 * Uppsala University, April 2016
 */

package infretlab1;

import java.util.HashMap;
import java.util.Map;

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
