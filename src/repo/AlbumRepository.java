package repo;

import entity.Album;
import entity.Artist;

import java.util.List;

public class AlbumRepository implements Repository {//contains empty and null-returning implementations of the interface functions

    public void create(dbEntity entity) {

    }

    public dbEntity findById(String pKey) {
        return null;
    }

    public List<dbEntity> findByName(String name) {
        return null;
    }

    public List<Album> findByArtist(Artist artist) //is the additional function aside from the interface ones, returns 
    {
        return null;
    }
}
