package com.github.ericliucn.myres.api;

import org.spongepowered.api.entity.living.player.server.ServerPlayer;
import org.spongepowered.api.service.context.Context;
import org.spongepowered.api.service.permission.Subject;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.server.ServerLocation;
import org.spongepowered.api.world.server.ServerWorld;

import java.util.List;
import java.util.UUID;

public interface Res {

    UUID getResUniqueID();

    Subject getCreator();

    List<ServerPlayer> getTrustPlayers();

    List<ServerPlayer> getVisitorPlayers();

    List<ServerPlayer> getRejectedPlayers();

    ServerWorld getServerWorld();

    Location<ServerWorld, ServerLocation> getResSpawnPoint();

    Location<ServerWorld, ServerLocation> getStartPoint();

    Location<ServerWorld, ServerLocation> getEndPoint();

    void expand(Direction direction, int number);

    void showBorder();

    void openConfigMenu();

    boolean checkPermission(Context context, ActionType actionType);


}
