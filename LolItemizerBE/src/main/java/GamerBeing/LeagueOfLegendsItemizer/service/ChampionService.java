package GamerBeing.LeagueOfLegendsItemizer.service;

import GamerBeing.LeagueOfLegendsItemizer.dto.Champion;
import GamerBeing.LeagueOfLegendsItemizer.repository.ChampionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChampionService {

    @Autowired
    private ChampionRepository championRepository;

    public List<Champion> getAllChampions() {
        List<Champion> champions = new ArrayList<>();
        championRepository.findAll().forEach(champions::add);
        return champions;
    }
}
