package laurriana.last_fm.controller;

import laurriana.last_fm.model.LovedTracks;
import laurriana.last_fm.repository.LovedTracksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/lovedTracks")
public class LovedTracksController {
    @Autowired
    LovedTracksRepository repository;

    @GetMapping("/getLovedTrackByName")
    @ResponseBody
    public LovedTracks getLovedTrackByName(String trackName) {
        LovedTracks lovedTrack = repository.getLovedTracksByTrackName(trackName);
        return lovedTrack;
    }

    @GetMapping("/getLovedTrackById")
    @ResponseBody
    public LovedTracks getLovedTrackById(int id) {
        LovedTracks lovedTrack = repository.getLovedTracksById(id);
        return lovedTrack;
    }

    @GetMapping("/getLovedTracksByArtistName")
    @ResponseBody
    public List<LovedTracks> getLovedTracksByArtist(String artistName) {
        return repository.findLovedTracksByArtistName(artistName);
    }

    @GetMapping("/getLovedTracksByMonth")
    @ResponseBody
    public List<LovedTracks> getLovedTracksByMonth(int month) {
        return repository.findLovedTracksByTrackDateMonth(month);
    }

    @GetMapping("/getLovedTracksByArtistContains")
    @ResponseBody
    public List<LovedTracks> getLovedTracksByArtistContains(String artistName) {
        return repository.findLovedTracksByArtistNameContainsIgnoreCase(artistName);
    }

    @GetMapping("/getAllLovedTracks")
    @ResponseBody
    public List<LovedTracks> getAllTracks() {
        return repository.findAll();
    }

    @GetMapping("/getEvenLovedTracks")
    @ResponseBody
    public List<LovedTracks> getEvenTracks() {
        List<LovedTracks> lovedTracksList = new ArrayList<>();
        for (LovedTracks lt : repository.findAll()) {
            if (lt.getId() % 2 == 0) {
                lovedTracksList.add(lt);
            }
        }
        return lovedTracksList;
    }


}
