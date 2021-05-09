package com.company.GServicesManager;

import java.util.ArrayList;
import java.util.List;

public class Gmail {
    public List<GUser> getMails(){
        List<GUser> gmails = new ArrayList<>();
        gmails.add(new GUser("İbrahim","Usta","abc@gmail.com","123456ibo"));
        gmails.add(new GUser("Umut","Kuş","abcd@gmail.com","123456umut"));
        gmails.add(new GUser("Fatih","Kayan","abcde@gmail.com","123456fatih"));
        gmails.add(new GUser("Salih","Yanbal","abcdef@gmail.com","123456salih"));
        return gmails;
    }
}
