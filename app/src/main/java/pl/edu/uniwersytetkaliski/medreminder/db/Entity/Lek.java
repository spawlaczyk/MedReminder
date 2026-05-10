package pl.edu.uniwersytetkaliski.medreminder.db.Entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "Leki")
public class Lek {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nazwa;
    private String dawka;

    public Lek(String nazwa, String dawka) {
        this.nazwa = nazwa;
        this.dawka = dawka;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDawka() {
        return dawka;
    }

    public void setDawka(String dawka) {
        this.dawka = dawka;
    }
}
