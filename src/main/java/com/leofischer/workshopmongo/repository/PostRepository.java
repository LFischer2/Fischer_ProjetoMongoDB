package com.leofischer.workshopmongo.repository;

import com.leofischer.workshopmongo.domain.Post;
import com.leofischer.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
