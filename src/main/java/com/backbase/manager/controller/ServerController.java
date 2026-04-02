package com.backbase.manager.controller;

import com.backbase.manager.service.ServerService;

@RestController
public class ServerController {
    private final ServerService serverService;

    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

    @GetMapping("/server")
    public ResponseEntity<String> fetchRemoteServerName() {
        ServerNameResponse data = serverService.getServerName();

        return ResponseEntity.ok(result);
    }
}
