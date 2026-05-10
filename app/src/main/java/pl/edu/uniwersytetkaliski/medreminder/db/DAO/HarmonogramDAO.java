package pl.edu.uniwersytetkaliski.medreminder.db.DAO;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Harmonogram;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface HarmonogramDAO {
    @Insert
    long insert(Harmonogram harmonogram);

    @Query("SELECT * FROM Harmonogram")
    List<Harmonogram> getAll();

    @Query("SELECT * FROM Harmonogram WHERE idLeku = :idLeku")
    List<Harmonogram> getLekById(int idLeku);

    @Delete
    void delete(Harmonogram harmonogram);
}
