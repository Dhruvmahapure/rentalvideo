package com.example.Rentvideo.controller;

import com.example.Rentvideo.entity.Video;
import com.example.Rentvideo.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;

    @GetMapping
    public List<Video> getVideos() {
        return videoService.getAllVideos();
    }

    @PostMapping
    public Video addVideo(@RequestBody Video video) {
        return videoService.addVideo(video);
    }

    @DeleteMapping("/{id}")
    public String deleteVideo(@PathVariable Long id) {
        videoService.deleteVideo(id);
        return "Video deleted";
    }
}
