package me.wyskyisland.wyskyisland.Checkers;

import com.iridium.iridiumskyblock.*;
import com.iridium.iridiumskyblock.database.User;
import com.iridium.
import com.iridium.iridiumskyblock.api.*;
import org.bukkit.*;

public class PermissionChecker {
    boolean canBreakBlocks = IridiumSkyblockAPI.getInstance().getIslandPermission(island, user, PermissionType.BLOCK_BREAK);
    boolean canEditPermissions = IridiumSkyblockAPI.getInstance().getIslandPermission(island, user, PermissionType.CHANGE_PERMISSIONS);
}
