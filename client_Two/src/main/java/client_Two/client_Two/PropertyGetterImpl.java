package client_Two.client_Two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PropertyGetterImpl {

    //We can either use @Value annotation or Environement object to get the properties values.
    //I'm using both at this moment

    @Autowired
    Environment environment;

    @Value("${property.myname}")
    String myName;

    @Value("${property.myplanet}")
    String myPlanet;

    //For the below two properties, we get it from Environement object
    String mysatellite = "";
    Long mydistance = 0L;

    List<String> getEnvVars()
    {
        List<String> envArray = new ArrayList<>();
        envArray.add("myname = "+myName);
        envArray.add("myPlanet = "+myPlanet);
        envArray.add("mysatellite = "+environment.getProperty("property.mysatellite"));
        envArray.add("mydistance = "+environment.getProperty("property.mydistance"));
        return envArray;
    }
}
