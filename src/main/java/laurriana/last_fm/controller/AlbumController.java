package laurriana.last_fm.controller;

import laurriana.last_fm.model.Album;
import laurriana.last_fm.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    AlbumRepository repository;

    @GetMapping("/getAlbumByName")
    @ResponseBody
    public Album getAlbumByName(String albumName) {
        Album album = repository.findAlbumByAlbumName(albumName);
        return album;
    }


    @GetMapping("/getAlbumById")
    @ResponseBody
    public Album getAlbumByName(int id) {
        Album album = repository.findAlbumsById(id);
        return album;
    }

    @GetMapping("/getAlbumsByArtist")
    @ResponseBody
    public List<Album> getAlbumsByArtist(String artistName) {
        return repository.findAllByArtistName(artistName);
    }

    @GetMapping("/getAlbumsByPlaycountGreater")
    @ResponseBody
    public List<Album> getAlbumsByPlaycountGreater(int playcount) {
        return repository.findAlbumByPlaycountGreaterThanEqual(playcount);
    }

    @GetMapping("/getAlbumsByPlaycountLesser")
    @ResponseBody
    public List<Album> getAlbumsByPlaycountLess(int playcount) {
        return repository.findAlbumsByPlaycountLessThanEqual(playcount);
    }

    @GetMapping("/getAlbumsByArtistContains")
    @ResponseBody
    public List<Album> getAlbumsByArtistContains(String artistName) {
        return repository.findAlbumsByArtistNameContainsIgnoreCase(artistName);
    }

    @GetMapping("/getAllAlbums")
    @ResponseBody
    public List<Album> getAllAlbums() {
        return repository.findAll();
    }

}
