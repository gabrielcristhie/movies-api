package com.movies.api.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "imdb")
public class ImdbEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String poster_link;
    @Column
    private String series_title;
    @Column
    private String released_year;
    @Column
    private String certificate;
    @Column
    private String runtime;
    @Column
    private String genre;
    @Column
    private String imdb_rating;
    @Column
    private String overview;
    @Column
    private String meta_score;
    @Column
    private String director;
    @Column
    private String star1;
    @Column
    private String star2;
    @Column
    private String star3;
    @Column
    private String star4;
    @Column
    private String no_of_votes;
    @Column
    private String gross;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPoster_link() {
        return poster_link;
    }

    public void setPoster_link(String poster_link) {
        this.poster_link = poster_link;
    }

    public String getSeries_title() {
        return series_title;
    }

    public void setSeries_title(String series_title) {
        this.series_title = series_title;
    }

    public String getReleased_year() {
        return released_year;
    }

    public void setReleased_year(String released_year) {
        this.released_year = released_year;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdb_rating() {
        return imdb_rating;
    }

    public void setImdb_rating(String imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getMeta_score() {
        return meta_score;
    }

    public void setMeta_score(String meta_score) {
        this.meta_score = meta_score;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar1() {
        return star1;
    }

    public void setStar1(String star1) {
        this.star1 = star1;
    }

    public String getStar2() {
        return star2;
    }

    public void setStar2(String star2) {
        this.star2 = star2;
    }

    public String getStar3() {
        return star3;
    }

    public void setStar3(String star3) {
        this.star3 = star3;
    }

    public String getStar4() {
        return star4;
    }

    public void setStar4(String star4) {
        this.star4 = star4;
    }

    public String getNo_of_votes() {
        return no_of_votes;
    }

    public void setNo_of_votes(String no_of_votes) {
        this.no_of_votes = no_of_votes;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) {
        this.gross = gross;
    }
}
