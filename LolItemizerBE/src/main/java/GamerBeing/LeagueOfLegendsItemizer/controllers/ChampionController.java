package GamerBeing.LeagueOfLegendsItemizer.controllers;

import GamerBeing.LeagueOfLegendsItemizer.dto.Champion;
import GamerBeing.LeagueOfLegendsItemizer.service.ChampionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champion")
public class ChampionController {

    @Autowired
    private ChampionService championService;

    @GetMapping("/test")
    public List<Champion> getAllChampions() {
        return championService.getAllChampions();
    }
}