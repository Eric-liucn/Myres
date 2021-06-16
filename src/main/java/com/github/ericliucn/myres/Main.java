package com.github.ericliucn.myres;

import com.google.inject.Inject;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.StartingEngineEvent;
import org.spongepowered.api.service.permission.Subject;
import org.spongepowered.plugin.PluginContainer;
import org.spongepowered.plugin.jvm.Plugin;

@Plugin(value = "myres")
public class Main {

    private final Logger logger;
    private final PluginContainer container;

    @Inject
    public Main(final Logger logger, final PluginContainer container){
        this.logger = logger;
        this.container = container;
    }

    @Listener
    public void onServerStarting(final StartingEngineEvent<Server> event){
        this.logger.log(Level.ERROR, "This is myres!!!");
    }

}
