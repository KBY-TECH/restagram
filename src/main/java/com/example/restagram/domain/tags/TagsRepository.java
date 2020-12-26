package com.example.restagram.domain.tags;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Long> {
    public Tags findByTagName(String tagName);
}