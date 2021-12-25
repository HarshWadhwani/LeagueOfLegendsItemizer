package GamerBeing.LeagueOfLegendsItemizer.dto;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="champion")
public class Champion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="champion_name")
    private String championName;

    public Champion() {
        super();
    }

    public Champion(Integer id, String championName) {
        super();
        this.id = id;
        this.championName = championName;
    }
}
