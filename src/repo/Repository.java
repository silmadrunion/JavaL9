package repo;

public interface Repository { //implemented an interface, because ArtistRepository and AlbumReposity share many functions, so an interface sounds appropriate

    void create(dbEntity entity);

    dbEntity findById(String pKey);

    List<dbEntity> findByName(String name);
}
