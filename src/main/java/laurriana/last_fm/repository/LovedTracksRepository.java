package laurriana.last_fm.repository;

import laurriana.last_fm.model.LovedTracks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LovedTracksRepository extends JpaRepository<LovedTracks, Integer> {
    LovedTracks getLovedTracksByTrackName(String trackName);
    List<LovedTracks> findLovedTracksByArtistName(String artistName);

    @Query("SELECT lt FROM LovedTracks lt WHERE MONTH(lt.trackDate) = :month")
    List<LovedTracks> findLovedTracksByTrackDateMonth(@Param("month") int month);

    List<LovedTracks> findLovedTracksByArtistNameContainsIgnoreCase(String artistName);

    LovedTracks getLovedTracksById(int id);
}
