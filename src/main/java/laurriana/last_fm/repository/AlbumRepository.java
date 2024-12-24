package laurriana.last_fm.repository;

import laurriana.last_fm.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Album findAlbumByAlbumName(String albumName);
    List<Album> findAllByArtistName(String artistName);
    Album findAlbumsById(int id);
    List<Album> findAlbumByPlaycountGreaterThanEqual(int playcountIsGreaterThan);
    List<Album> findAlbumsByPlaycountLessThanEqual(int playcountIsLessThan);
    List<Album> findAlbumsByArtistNameContainsIgnoreCase(String artistName);
}
