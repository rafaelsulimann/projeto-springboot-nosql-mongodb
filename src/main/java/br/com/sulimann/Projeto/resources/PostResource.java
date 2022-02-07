package br.com.sulimann.Projeto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sulimann.Projeto.model.PostModel;
import br.com.sulimann.Projeto.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
    
    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PostModel> findById(@PathVariable String id) {
        PostModel obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}