package com.example.registrationandpublicity.controller;

import com.example.registrationandpublicity.entity.News;
import com.example.registrationandpublicity.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    // Get all news
    @GetMapping
    public List<News> findAllNews() {
        return newsService.findAllNews();
    }

    // Get a single news by id
    @GetMapping("/{id}")
    public ResponseEntity<News> findNewsById(@PathVariable Long id) {
        Optional<News> news = newsService.findNewsById(id);
        return news.map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    // Add a new news post
    @PostMapping
    public News saveNews(@RequestBody News news) {
        news.setPublishedDate(new Date());  // Set the current date as the published date
        return newsService.saveNews(news);
    }

    // Update an existing news post
    @PutMapping("/{id}")
    public ResponseEntity<News> updateNews(@PathVariable Long id, @RequestBody News updatedNews) {
        Optional<News> existingNews = newsService.findNewsById(id);
        if (existingNews.isPresent()) {
            News news = existingNews.get();
            news.setTitle(updatedNews.getTitle());
            news.setContent(updatedNews.getContent());
            news.setPublishedBy(updatedNews.getPublishedBy());
            news.setPublishedDate(new Date());  // Update the published date
            return ResponseEntity.ok(newsService.saveNews(news));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a news post
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNews(@PathVariable Long id) {
        newsService.deleteNews(id);
        return ResponseEntity.ok().build();
    }
}
