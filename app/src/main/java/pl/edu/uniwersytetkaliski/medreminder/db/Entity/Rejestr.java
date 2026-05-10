package pl.edu.uniwersytetkaliski.medreminder.db.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(
        tableName = "Rejestr",
        foreignKeys = @ForeignKey(
                entity = Harmonogram.class,
                parentColumns = "id",
                childColumns = "idHarmonogramu",
                onDelete = ForeignKey.CASCADE
        )
)
public class Rejestr {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int idHarmonogramu;
    private long data;

    public Rejestr(int idHarmonogramu, long data) {
        this.idHarmonogramu = idHarmonogramu;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHarmonogramu() {
        return idHarmonogramu;
    }

    public void setIdHarmonogramu(int idHarmonogramu) {
        this.idHarmonogramu = idHarmonogramu;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
}
