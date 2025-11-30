package com.portfolio.get_in_touch.service;

import com.portfolio.get_in_touch.repository.GetInTouchRepository;
import org.springframework.stereotype.Service;
import com.portfolio.get_in_touch.model.GetInTouch;

@Service
public class GetInTouchServiceImpl {

    private final GetInTouchRepository repository;

    public GetInTouchServiceImpl(GetInTouchRepository repository) {
        this.repository = repository;
    }

    public GetInTouch submitDetails(GetInTouch getInTouch){
        return repository.save(getInTouch);
    }
}
