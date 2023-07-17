# nPunish API

The nPunish API allows you to integrate the nPunish plugin functionalities into your own plugins. With this API, you can programmatically perform actions such as banning and kicking players from your server.

## Usage

To use the nPunish API in your plugin, follow the steps below:

1. Download the latest version of the nPunish plugin from the [SpigotMC](https://www.spigotmc.org/) website.
2. Install and enable the nPunish plugin on your Spigot/Paper server.
3. Add the nPunish plugin as a dependency in your plugin's `plugin.yml` file:

   ```yaml
   depend: [nPunish]

    Add the nPunish API class (nPunishAPI.java) to your plugin's source code. You can find the API class in this repository.

## Banning a Player

To ban a player using the nPunish API, follow these steps:

    Create an instance of the nPunishAPI class in your plugin:

First import the api:
`import com.nate.npunish.api.nPunishAPI;`

Then initialize it in your on enable method:

    private nPunishAPI npunishAPI;
    @Override
    public void onEnable() {
        npunishAPI = new nPunishAPI(this);
    }
}

Use the kickPlayer method of the nPunishAPI class to ban a player:


    import org.bukkit.entity.Player;

    // Inside your plugin code...
    Player player = getPlayerSomehow(); // Get the player you want to ban
    String reason = "Breaking server rules"; // Specify the reason for the ban

    // Ban the player using the nPunishAPI
    npunishAPI.banPlayer(player, reason);

## Kicking a Player

To kick a player using the nPunish API, follow these steps:

Create an instance of the nPunishAPI class in your plugin (if you haven;t already done so):


    @Override
    import org.bukkit.plugin.java.JavaPlugin;
    import com.nate.npunish.api.nPunishAPI;

    public class YourPlugin extends JavaPlugin {
    private nPunishAPI npunishAPI;
    public void onEnable() {
        // Initialize the nPunishAPI with your plugin instance
        npunishAPI = new nPunishAPI(this);

        // Your plugin initialization code...
    }

    // Other methods and plugin code...
}

Use the kickPlayer method of the nPunishAPI class to kick a player:


    import org.bukkit.entity.Player;

    // Inside your plugin code...
    Player player = getPlayerSomehow(); // Get the player you want to kick
    String reason = "Breaking server rules"; // Specify the reason for the kick

    // Kick the player using the nPunishAPI
    npunishAPI.kickPlayer(player, reason);



## Dependencies

The nPunish API requires the nPunish plugin to be installed and enabled on your Spigot/Paper server. Make sure to include the nPunish plugin as a dependency in your plugin's plugin.yml file.

## Contributing

If you encounter any issues or have suggestions for improvements, please open an issue on the GitHub repository.

## License

This project is licensed under the [MIT License](LICENSE).
