package repo;

import java.util.List;

public class ArtistRepository implements Repository{ //contains empty and null-returning implementations of the interface functions

    public void create(dbEntity entity) {

    }

    public dbEntity findById(String pKey) {
        return null;
    }

    public List<dbEntity> findByName(String name) {
        return null;
    }
}
