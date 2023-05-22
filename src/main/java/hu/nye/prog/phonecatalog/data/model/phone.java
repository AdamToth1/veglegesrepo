package hu.nye.prog.phonecatalog.data.model;

import java.util.Objects;

//Model class for phones
public class phone {
   private Long id;
    private String név;
    private String méret;
    private String évjárat;
    private Genre genre;
    public phone(){

    }


    public phone(Long id, String név, String méret, String évjárat, Genre genre) {
        this.id = id;
        this.név = név;
        this.méret = méret;
        this.évjárat = évjárat;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public String getMéret() {
        return méret;
    }

    public void setMéret(String méret) {
        this.méret = méret;
    }

    public String getÉvjárat() {
        return évjárat;
    }

    public void setÉvjárat(String évjárat) {
        this.évjárat = évjárat;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        phone phone = (phone) o;
        return Objects.equals(id, phone.id) && Objects.equals(név, phone.név) && Objects.equals(méret, phone.méret) && Objects.equals(évjárat, phone.évjárat) && genre == phone.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, név, méret, évjárat, genre);
    }

    @Override
    public String toString() {
        return "phone{" +
                "id=" + id +
                ", név='" + név + '\'' +
                ", méret='" + méret + '\'' +
                ", évjárat='" + évjárat + '\'' +
                ", genre=" + genre +
                '}';
    }
}
