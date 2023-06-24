package com.example.mvc.JPA;

import com.example.mvc.Entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface JPA extends JpaReository<Document,Integer>{
    default List<Document> getDocumentById(Integer id){
        List<Document> docus = new ArrayList<>();
        for(Document doc: this.findAll()){
            if(doc.getId().equals(id)){
                docus.add(doc);
            }
        }
        return docus;
    }

    default List<Document> getDocumentByContent(String content){
        List<Document> docus = new ArrayList<>();
        for(Document doc: this.findAll()){
            if(doc.getId().equals(content)){
                docus.add(doc);
            }
        }
        return docus;
    }

    default void update(Document doc){
        this.update(doc);
    }
    default void delete(Document doc){
        this.delete(doc);
    }
    default void add(Document doc){
        this.add(doc);
    }

}
