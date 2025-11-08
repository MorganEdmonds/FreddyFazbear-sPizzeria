package com.pluralsight;

public class Drink {

    Double large = 3.00;
    Double medium = 2.50;
    Double small = 1.50;

    public Drink(Double large, Double medium, Double small) {
        this.large = large;
        this.medium = medium;
        this.small = small;
    }


    public Double getLarge() {
        return large;
    }

    public void setLarge(Double large) {
        this.large = large;
    }

    public Double getMedium() {
        return medium;
    }

    public void setMedium(Double medium) {
        this.medium = medium;
    }

    public Double getSmall() {
        return small;
    }

    public void setSmall(Double small) {
        this.small = small;
    }





}
