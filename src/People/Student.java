package People;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student extends People{
    int s_id;
    Course courses;
    HashMap<String, Integer> scoremap = new HashMap<String, Integer>();


    Course []classesList;

}
