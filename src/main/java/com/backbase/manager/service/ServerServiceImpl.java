package com.backbase.manager.service;

@Service
public class ServerServiceImpl implements ServerService {
    private final ServerAPI serverAPI;

    public ServerServiceImpl(ServerAPI serverAPI) {
        this.serverAPI = serverAPI;
    }

    public ServerNameResponse getServerName() {
        ServerNameResponse data = serverAPI.getServerName();
        System.out.println(data);
        return data
    }
}
