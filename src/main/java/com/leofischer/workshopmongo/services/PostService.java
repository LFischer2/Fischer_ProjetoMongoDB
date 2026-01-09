package com.leofischer.workshopmongo.services;

import com.leofischer.workshopmongo.domain.Post;
import com.leofischer.workshopmongo.domain.User;
import com.leofischer.workshopmongo.dto.UserDTO;
import com.leofischer.workshopmongo.repository.PostRepository;
import com.leofischer.workshopmongo.repository.UserRepository;
import com.leofischer.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text) {
        return repo.searchTitle(text);
    }
}