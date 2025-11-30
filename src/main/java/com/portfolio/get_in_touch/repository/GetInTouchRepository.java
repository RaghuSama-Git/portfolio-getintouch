package com.portfolio.get_in_touch.repository;

import com.portfolio.get_in_touch.model.GetInTouch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GetInTouchRepository extends MongoRepository<GetInTouch, String> {
}
