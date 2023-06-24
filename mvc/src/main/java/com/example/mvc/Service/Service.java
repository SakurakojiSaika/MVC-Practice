package com.example.mvc.Service;

import com.example.mvc.DAO.DAO;
import com.example.mvc.Entity.Document;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class Service {
    @Autowired
    private final DAO dao;

    public Service(DAO documentDAO) {
        this.dao = documentDAO;
    }

    public void add(Document document) {
        dao.add(document);
    }

    public Document getById(Integer id) {
        return dao.getById(id);
    }

    public Map<Integer, Document> getAll() {
        return dao.getAll();
    }

    public void update(Document document) throws Exception {
        if (dao.getById(document.getId()) == null) {
            throw new Exception("Document not found");
        }
        dao.update(document);
    }

    public void deleteDocument(Integer id) throws Exception{
        if (dao.getById(id) == null) {
            throw new Exception("Document not found");
        }
        dao.delete(id);
    }
}
