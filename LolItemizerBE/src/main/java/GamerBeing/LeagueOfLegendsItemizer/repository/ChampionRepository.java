package GamerBeing.LeagueOfLegendsItemizer.repository;


import GamerBeing.LeagueOfLegendsItemizer.dto.Champion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampionRepository extends CrudRepository<Champion, Long> {
}
