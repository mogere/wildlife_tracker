
import java.sql.Timestamp;
public class Endangered extends Animals {


    public static final String DATABASE_TYPE = "Endangered";

    public Endangered(String name) {
        super(name);
        this.name = name;
        type =  DATABASE_TYPE;

    }
}
