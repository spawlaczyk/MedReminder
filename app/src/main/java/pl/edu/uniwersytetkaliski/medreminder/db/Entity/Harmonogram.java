package pl.edu.uniwersytetkaliski.medreminder.db.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ForeignKey;

@Entity(
        tableName = "Harmonogram",
        foreignKeys = @ForeignKey(
                entity = Lek.class,
                parentColumns = "id",
                childColumns = "idLeku",
                onDelete = ForeignKey.CASCADE
        )
)
public class Harmonogram {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private int idLeku;
    private int czasMin;

    public Harmonogram(int idLeku, int czasMin) {
        this.idLeku = idLeku;
        this.czasMin = czasMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLeku() {
        return idLeku;
    }

    public void setIdLeku(int idLeku) {
        this.idLeku = idLeku;
    }

    public int getCzasMin() {
        return czasMin;
    }

    public void setCzasMin(int czasMin) {
        this.czasMin = czasMin;
    }
}