package com.example.dell.letsgo;


public class reqitems {

    private static final int no_image = -1;
    private String radd;
    private String rnam;
    private int rimgid = no_image;

    public reqitems(String nam, String add, int imgid) {
        rnam = nam;
        radd = add;
        rimgid = imgid;
    }

    public String get_name() {
        return rnam;
    }

    public String get_address() {
        return radd;
    }

    public int get_imgid() {
        return rimgid;
    }

    public boolean image_available() {
        return rimgid != no_image;
    }
}
