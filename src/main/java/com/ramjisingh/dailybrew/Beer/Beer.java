package com.ramjisingh.dailybrew.Beer;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "beer_info")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Beer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beer_id", nullable = false)
    private Long beerId;

    @Column(name = "beer_name")
    private String beerName;

    @Column(name = "brewery_address")
    private String breweryAddress;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "tasting_notes")
    private String tastingNotes;

//    @Column(name = "rating")
//    private Long rating;

}
