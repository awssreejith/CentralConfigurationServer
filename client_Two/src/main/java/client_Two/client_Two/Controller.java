package client_Two.client_Two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
public class Controller {

 @Autowired
 PropertyGetterImpl propertyGetter;

    @GetMapping("/ConfigValue")
    public ResponseEntity<List<String>> getConfigurationVariable()
    {
         return (ResponseEntity.status(HttpStatus.OK).body(propertyGetter.getEnvVars()));
    }
}
