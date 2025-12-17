package com.example.Rentvideo.service;

import com.example.Rentvideo.entity.Video;
import com.example.Rentvideo.repository.VideoRepository;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VideoService {

    private final VideoRepository videoRepo;

    public VideoService(VideoRepository videoRepo) {
        this.videoRepo = videoRepo;
    }


    public List<Video> getAllVideos() {
        return videoRepo.findAll();
    }

    public Video addVideo(Video video) {
        return videoRepo.save(video);
    }

    public void deleteVideo(Long id) {
        videoRepo.deleteById(id);
    }
}
