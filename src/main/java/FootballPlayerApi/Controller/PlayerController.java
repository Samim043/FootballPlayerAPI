package FootballPlayerApi.Controller;

import FootballPlayerApi.Domain.Player;
import FootballPlayerApi.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Player getPlayer(@PathVariable int id){
        return playerService.getPlayer(id);
    }

    @PostMapping( "/players")

    public void addPlayers(@RequestBody Player Player){
        playerService.addPlayer(Player);
    }

    @PutMapping("/players/{id}")
    public void updatePlayers(@RequestBody Player player, @PathVariable int id){
        playerService.updatePlayer(id, player);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayers(@PathVariable int id){
        playerService.deletePlayer(id);
    }

}
