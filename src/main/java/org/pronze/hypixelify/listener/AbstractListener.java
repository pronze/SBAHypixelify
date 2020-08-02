package org.pronze.hypixelify.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.pronze.hypixelify.Hypixelify;
import org.screamingsandals.bedwars.api.BedwarsAPI;

public abstract class AbstractListener implements Listener {


    public AbstractListener(){
        Bukkit.getServer().getPluginManager().registerEvents(this, Hypixelify.getInstance());
    }

    public boolean isInGame(Player player){
        return BedwarsAPI.getInstance().isPlayerPlayingAnyGame(player);
    }



    public abstract void onDisable();
}
