package com.example.mvc.Controller;

import com.example.mvc.Entity.Document;
import com.example.mvc.Service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/documents")
public class Controller {
    private final Service service;
    private Map<Integer, Document> docs;

    public Controller(Service service) {
        this.service = service;
        Map<Integer,Document> docs = service.getAll();
    }

    @RequestMapping( value = "document/{id}",method = RequestMethod.GET, consumes = "application/json")
    public Document getDocument(@PathVariable Integer id) throws Exception {
        Document document = service.getById(id);
        if (document == null) {
            throw new Exception("Document not found");
        } else {
            return document;
        }
    }

    @GetMapping
    public Map<Integer, Document>  getAllDocuments() {
        Map<Integer, Document> docs = service.getAll();
        return docs;
    }


    @PostMapping("documents")
    public Document addDocument(@RequestBody Document doc){
        docs.put(doc.getId(),doc);
        return doc;
    }

    @GetMapping("documents")
    public List<Document> ListDocuments(){
        return docs.values().stream().toList();
    }

    @DeleteMapping("document/{id}")
    public void deleteDocument(@PathVariable Integer id) throws Exception {
        Document document = service.getById(id);
        if (document == null) {
            throw new Exception("Document not found");
        } else {
            docs.remove(id);
        }

    }
}
