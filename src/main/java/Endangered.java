
import org.sql2o.Connection;

public class Endangered extends Animals {


    public static final String DATABASE_TYPE = "Endangered";

    public Endangered(String name) {
        super(name);
        this.name = name;
        type =  DATABASE_TYPE;

    }

    public static Animals find(String type){
        try(Connection con = DB.sql2o.open()){
            String sql = "SELECT * FROM animals WHERE type=:type";
            Animals animal = con.createQuery(sql)
                    .addParameter("type", type)
                    .executeAndFetchFirst(Animals.class);
            return animal;
        }
    }
}
