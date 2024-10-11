package com.example.registrationandpublicity.service.impl;

import com.example.registrationandpublicity.entity.News;
import com.example.registrationandpublicity.repository.NewsRepository;
import com.example.registrationandpublicity.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> findAllNews() {
        return newsRepository.findAll();
    }

    @Override
    public Optional<News> findNewsById(Long id) {
        return newsRepository.findById(id);
    }

    @Override
    public News saveNews(News news) {
        return newsRepository.save(news);
    }

    @Override
    public void deleteNews(Long id) {
        newsRepository.deleteById(id);
    }
}
