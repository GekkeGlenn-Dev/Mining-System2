
import Messages.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MineMain extends JavaPlugin {
    @Override
    public void onDisable() {
        System.out.println(MessageManager.PLUGIN_DISABLE.getMessage());
    }

    @Override
    public void onEnable() {
        System.out.println(MessageManager.PLUGIN_ENABLE.getMessage());
        registerListeners();
    }

    public void registerListeners() {
        // TODO Register your listeners here.
    }
}
