package com.fdorval.simpleapp.demo.rest.util;

import com.fdorval.simpleapp.demo.rest.dto.CoolResult;
import org.springframework.stereotype.Repository;

@Repository
public class CoolCalculator {
    public CoolResult getCoolScore(String name){
        String nameLowerCase = name.toLowerCase();
        int coolScore = Math.floorMod (nameLowerCase.hashCode(), 100);
        String commentaire = "bof";

        if (name.equals("François")){
            return new CoolResult(150, "\uD83D\uDE32\uD83D\uDE32\uD83D\uDE32\uD83D\uDE32");
        }

        if (coolScore<20){
            commentaire = name +" c'est naze!";
        }else if (coolScore<50){
            commentaire = name +" c'est pas top top";
        }else if (coolScore<80){
            commentaire = name +" c'est plutôt cool!";
        }else{
            commentaire = name +" c'est top moumoute :-D";
        }

        return new CoolResult(coolScore, commentaire);
    }
}
