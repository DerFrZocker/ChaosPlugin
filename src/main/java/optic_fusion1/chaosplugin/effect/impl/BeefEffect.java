package optic_fusion1.chaosplugin.effect.impl;

import optic_fusion1.chaosplugin.effect.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BeefEffect extends Effect {

  public BeefEffect() {
    super("Beef");
  }

  @Override
  public void activate(Player player) {
    player.getInventory().addItem(new ItemStack[]{new ItemStack(Material.COOKED_BEEF, 16)});
  }

}
