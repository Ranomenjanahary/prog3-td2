package com.ralobo.prog3td2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "team")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(name = "has_sponsor",
            joinColumns = @JoinColumn(name = "id_team", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_sponsor", referencedColumnName = "id"))
    @JsonIgnoreProperties("teams")

    @OneToOne(mappedBy = "team", cascade = CascadeType.ALL)
    private List<SponsorEntity> sponsors;
}
