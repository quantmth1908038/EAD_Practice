package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.PublisherCatalogEntity;

import java.util.List;

public interface PublisherCatalogService {
    List<PublisherCatalogEntity> getAllPublisherCatalog();
    PublisherCatalogEntity createPublisherCatalog(PublisherCatalogEntity p);
}
