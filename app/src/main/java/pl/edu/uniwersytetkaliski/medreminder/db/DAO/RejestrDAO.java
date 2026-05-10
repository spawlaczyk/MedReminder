package pl.edu.uniwersytetkaliski.medreminder.db.DAO;
import pl.edu.uniwersytetkaliski.medreminder.db.Entity.Rejestr;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RejestrDAO {
    @Insert
    int insert(Rejestr rejestr);

    @Query("SELECT * FROM Rejestr WHERE idHarmonogramu = :idHarmonogramu")
    List<Rejestr> getByHarmonogramId(int idHarmonogramu);

    @Query("SELECT * FROM Rejestr WHERE idHarmonogramu = :idHarmonogramu AND data BETWEEN :poczatek AND :koniec")
    List<Rejestr> getByHarmonogramIdAndData(int idHarmonogramu, long poczatek, long koniec);

    @Delete
    void delete(Rejestr rejestr);
}
