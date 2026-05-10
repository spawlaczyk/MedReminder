package pl.edu.uniwersytetkaliski.medreminder.db.DAO;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Lek;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface LekDAO {
    @Insert
    long insert(Lek lek);

    @Query("SELECT * FROM Leki")
    List<Lek> getAll();

    @Delete
    void delete(Lek lek);
}
