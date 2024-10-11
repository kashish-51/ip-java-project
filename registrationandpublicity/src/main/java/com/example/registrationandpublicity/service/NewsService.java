package com.example.registrationandpublicity.service;

import com.example.registrationandpublicity.entity.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<News> findAllNews();
    Optional<News> findNewsById(Long id);
    News saveNews(News news);
    void deleteNews(Long id);
}
