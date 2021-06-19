package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.PublisherCatalogEntity;
import com.example.truongminhquan.repository.PublisherCatalogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherCatalogServiceImp implements PublisherCatalogService {

    @Autowired
    PublisherCatalogRepo publisherCatalogRepo;

    @Override
    public List<PublisherCatalogEntity> getAllPublisherCatalog() {
        return publisherCatalogRepo.findAll();
    }

    @Override
    public PublisherCatalogEntity createPublisherCatalog(PublisherCatalogEntity p) {
        return publisherCatalogRepo.save(p);
    }
}
