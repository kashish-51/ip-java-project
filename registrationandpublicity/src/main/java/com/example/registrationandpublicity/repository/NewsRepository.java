package com.example.registrationandpublicity.repository;

import com.example.registrationandpublicity.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
