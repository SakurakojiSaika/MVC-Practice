package com.example.mvc.DAO;
import com.example.mvc.Entity.Document;

import java.util.HashMap;
import java.util.Map;
public class DAO {
    private final Map<Integer, Document> documentMap;
    public DAO(){
        this.documentMap = new HashMap<>();
    }
    public Document getById(Integer id){
        return documentMap.get(id);
    }

    public Map<Integer,Document> getAll(){
        return documentMap;
    }

    public void add(Document doc){
        documentMap.put(doc.getId(), doc);
    }

    public void update(Document doc){
        documentMap.put(doc.getId(),doc);
    }

    public void delete(Integer id){
        documentMap.remove(id);
    }
}
