package com.backendvue.backend.repository;

import com.backendvue.backend.entiry.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by IntelliJ IDEA.
 * User: frodriguez
 * MessageRepository
 * Date: 4/10/2019
 * Time: 2:25 PM
 */
@RepositoryRestResource(collectionResourceRel = "message", path = "message" )
public interface MessageRepository extends MongoRepository<Message, String> {

}
