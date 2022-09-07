package FootballPlayerApi.Service;

import FootballPlayerApi.Domain.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> players = new ArrayList<>(Arrays.asList(
            new Player(1, "Cristiano Ronaldo", "Manchester United", "Portugal", 7),
            new Player(2, "Lionel Messi", "PSG", "Argentina", 10),
            new Player(3, "Karim Benzema", "Real Madrid", "France", 9)
    ));

    public List<Player> getAllPlayers() {
        return players;
    }

    public Player getPlayer(int id) {
        return players.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayer(int id, Player player) {
        for (int i = 0; i < players.size(); i++) {
            Player t = players.get(i);
            if (t.getId() == id) {
                players.set(i, player);
                return;
            }
        }
    }

    public void deletePlayer(int id) {
        players.removeIf(t -> t.getId() == id);
    }
}
