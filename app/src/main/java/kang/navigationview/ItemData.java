package kang.navigationview;

import java.util.ArrayList;

/**
 * Created by kangjonghyuk on 2016. 7. 4..
 */
public class ItemData {

    private String name, naesun, number;

    public ItemData(String name, String naesun, String number){
        this.name = name;
        this.naesun = naesun;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNaesun() {
        return naesun;
    }

    public String getNumber() {
        return number;
    }

}
