package com.company.GServicesManager;

import java.util.ArrayList;
import java.util.List;

public class GoogleManager {

    public GUser register(){
        Gmail gmail = new Gmail();
        List<GUser> getGmails = gmail.getMails();
        int rndIndex = (int)Math.floor(Math.random()* (long) getGmails.size() -1);
        return getGmails.get(rndIndex);
    }
}
