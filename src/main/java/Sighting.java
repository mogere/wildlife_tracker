import org.sql2o.Connection;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class Sighting {
    private int id;
    private String location;
    private Timestamp timestamp;
    private int animal_id;
    private String ranger;
    private String type;

    public Sighting(String location, int animal_id, String type, String ranger){

        this.location = location;
        this.animal_id = animal_id;
        this. type = type;
        this.ranger = ranger;
        LocalDateTime time = LocalDateTime.now();
        this.timestamp = Timestamp.valueOf(time);
        System.out.println(timestamp);
        save();

    }

    private void save() throws NullPointerException {
        try {
            try (Connection con = DB.sql2o.open()) {
                String sql = "INSERT INTO sightings (location, animal_id, type, ranger, time) VALUES (:location, :animal_id, :type, :ranger, :timestamp)";
                con.createQuery(sql)
                        .addParameter("location", this.location)
                        .addParameter("animal_id", this.animal_id)
                        .addParameter("type", this.type)
                        .addParameter("ranger", this.ranger)
                        .addParameter("time", this.timestamp)
                        .executeUpdate();
            }
        } catch (NullPointerException e){
            System.out.println("cannot find values");
        }
    }


    public static List<Sighting> allSightings(){
        String sql = "SELECT * FROM sightings ";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql).executeAndFetch(Sighting.class);
        }
    }
}
