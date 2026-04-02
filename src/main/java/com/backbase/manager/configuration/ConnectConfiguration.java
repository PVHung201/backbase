package com.backbase.manager.configuration;

@Configuration
public class ConnectConfiguration {
    @Bean
    public ServerAPI serverAPI(RestTemplate restTemplate) {
        ApiClient apiClient = new ApiClient(restTemplate);

        apiClient.setBasePath("http://localhost:9090");

        return new ServerAPI(apiClient);
    }
}
