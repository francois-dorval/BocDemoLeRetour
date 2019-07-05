package com.fdorval.simpleapp.demo.rest.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



public class CoolResult {
    int pourcentage;
    String commentaire;

    public CoolResult(int coolScore, String commentaire) {
        this.pourcentage = coolScore;
        this.commentaire = commentaire;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
