package com.example.Rentvideo.repository;

import com.example.Rentvideo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Long> {
}
