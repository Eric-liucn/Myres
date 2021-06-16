package com.github.ericliucn.myres.api;

import org.spongepowered.api.entity.living.player.server.ServerPlayer;
import org.spongepowered.api.service.permission.Subject;

public interface ResManager {

    Res createAdminRes();

    Res createRes(Subject subject);

}
