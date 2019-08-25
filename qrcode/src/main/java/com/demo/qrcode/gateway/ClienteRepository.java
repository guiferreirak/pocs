package com.demo.qrcode.gateway;

import com.demo.qrcode.gateway.data.ClienteDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<ClienteDocument, Integer> {
}
