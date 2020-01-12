import org.sql2o.Connection;

import java.util.List;
import java.util.Objects;

public class Animals {
    public String name;
    public int id;
    public String type;
    public static final String DATABASE_TYPE = "Normal";
    public String ranger;

    public Animals(String name){
        this.name = name;
        save();
    }



    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int)con.createQuery(sql)
                    .addParameter("name", this.name)
                    .executeUpdate()
            .getKey();
        }
    }

    public static Animals find(int id){
        try(Connection con = DB.sql2o.open()){
            String sql = "SELECT * FROM animals WHERE id=:id";
            Animals animal = con.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Animals.class);
            return animal;
        }
    }

    public static List<Animals> allAnimals(){
        String sql = "SELECT * FROM animals ";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Animals.class);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return id == animals.id &&
                Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
