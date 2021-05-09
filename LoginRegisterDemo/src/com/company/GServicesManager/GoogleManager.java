package com.company.GServicesManager;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {

    public GUser register(){
        Gmail gmail = new Gmail();
        List<GUser> getGmails = gmail.getMails();
        int rndIndex = (int)Math.floor(Math.random()*getGmails.stream().count());
        return getGmails.get(rndIndex);
    }
}
