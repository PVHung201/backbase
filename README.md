https://engineering.backbase.com/intellij-docs/#create-a-new-backbase-project

https://github.com/Backbase/stream-services/blob/master/api/stream-product-catalog/openapi.yaml

<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                              https://maven.apache.org/xsd/settings-1.0.0.xsd">

    <servers>
        <server>
            <id>backbase-releases</id>
            <username>YOUR_USERNAME</username>
            <password>YOUR_PASSWORD</password>
        </server>
    </servers>

</settings>


@Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}
@Service
public class ServiceBClient {

    private final RestTemplate restTemplate;

    public ServiceBClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getDataFromB() {
        String url = "http://localhost:8081/api/data";

        return restTemplate.getForObject(url, String.class);
    }
}
