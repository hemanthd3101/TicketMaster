package com.scaler.TicketMaster.models;

import com.scaler.TicketMaster.models.constants.BaseModel;
import com.scaler.TicketMaster.models.constants.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String description;
    private String language;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;

}
