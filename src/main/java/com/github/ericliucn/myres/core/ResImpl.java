package com.github.ericliucn.myres.core;

import com.github.ericliucn.myres.api.ActionType;
import com.github.ericliucn.myres.api.Res;
import org.spongepowered.api.entity.living.player.server.ServerPlayer;
import org.spongepowered.api.service.context.Context;
import org.spongepowered.api.service.permission.Subject;
import org.spongepowered.api.util.Direction;
import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.server.ServerLocation;
import org.spongepowered.api.world.server.ServerWorld;
import org.spongepowered.api.world.volume.archetype.ArchetypeVolume;
import org.spongepowered.math.matrix.Matrix3d;
import org.spongepowered.math.vector.Vector3d;
import org.spongepowered.math.vector.Vector3i;

import java.util.List;
import java.util.UUID;

public class ResImpl implements Res {

    private Location<ServerWorld, ServerLocation> startPoint;
    private Location<ServerWorld, ServerLocation> endPoint;
    private Location<ServerWorld, ServerLocation> spawnPoint;
    private final Subject creator;
    private final UUID uniqueID;
    private List<ServerPlayer> trust;
    private List<ServerPlayer> visitor;
    private List<ServerPlayer> rejected;

    public ResImpl(Location<ServerWorld, ServerLocation> startPoint,
                   Location<ServerWorld, ServerLocation> endPoint,
                   Subject creator){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.spawnPoint = startPoint;
        this.creator = creator;
        this.uniqueID = UUID.randomUUID();
    }

    @Override
    public UUID getResUniqueID() {
        return this.uniqueID;
    }

    @Override
    public Subject getCreator() {
        return this.creator;
    }

    @Override
    public List<ServerPlayer> getTrustPlayers() {
        return this.trust;
    }

    @Override
    public List<ServerPlayer> getVisitorPlayers() {
        return this.visitor;
    }

    @Override
    public List<ServerPlayer> getRejectedPlayers() {
        return this.rejected;
    }

    @Override
    public ServerWorld getServerWorld() {
        return startPoint.world();
    }

    @Override
    public Location<ServerWorld, ServerLocation> getResSpawnPoint() {
        return this.spawnPoint;
    }

    @Override
    public Location<ServerWorld, ServerLocation> getStartPoint() {
        return this.startPoint;
    }

    @Override
    public Location<ServerWorld, ServerLocation> getEndPoint() {
        return this.endPoint;
    }

    @Override
    public void expand(Direction direction, int number) {

    }

    @Override
    public void showBorder() {
        this.getServerWorld().block(startPoint.);
        Vector3i start = startPoint.blockPosition();
        Vector3i end = endPoint.blockPosition();
        ArchetypeVolume archetypeVolume = getServerWorld().createArchetypeVolume();
        archetypeVolume.blockSize()
    }

    @Override
    public void openConfigMenu() {

    }

    @Override
    public boolean checkPermission(Context context, ActionType actionType) {
        return false;
    }
}
