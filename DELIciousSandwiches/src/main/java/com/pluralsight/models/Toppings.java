package com.pluralsight.models;

public class Toppings
{
    private String extraMeat;
    private String cheese;
    private String extraCheese;
    private String lettuce;
    private String peppers;
    private String onions;
    private String tomatoes;
    private String jalepenos;
    private String cucumbers;
    private String pickles;
    private String guacamole;
    private String mushrooms;

    private String Mayo;
    private String mustard;
    private String ketchup;
    private String ranch;
    private String thousand_islands;
    private String vinaigrette;

    private String au_jus;
    private String sauce;

    public Toppings(String extraMeat,String cheese, String extraCheese, String lettuce,String peppers, String onions, String tomatoes, String jalepenos, String cucumbers,String pickles, String guacamole, String mushrooms, String mayo, String mustard, String ketchup, String ranch, String thousand_islands, String vinaigrette, String sauce) {
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.lettuce = lettuce;
        this.peppers = peppers;
        this.onions = onions;
        this.tomatoes = tomatoes;
        this.jalepenos = jalepenos;
        this.cucumbers = cucumbers;
        this.pickles = pickles;
        this.guacamole = guacamole;
        this.mushrooms = mushrooms;
        this.Mayo = mayo;
        this.mustard = mustard;
        this.ketchup = ketchup;
        this.ranch = ranch;
        this.thousand_islands = thousand_islands;
        this.vinaigrette = vinaigrette;
        this.sauce = sauce;
    }

    public String getExtraMeat() {
        return extraMeat;
    }

    public String getExtraCheese() {
        return extraCheese;
    }

    public String getCheese() {
        return cheese;
    }

    public String getPeppers() {
        return peppers;
    }

    public String getPickles() {
        return pickles;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getOnions() {
        return onions;
    }

    public String getTomatoes() {
        return tomatoes;
    }

    public String getJalepenos() {
        return jalepenos;
    }

    public String getCucumbers() {
        return cucumbers;
    }

    public String getGuacamole() {
        return guacamole;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public String getMayo() {
        return Mayo;
    }

    public String getMustard() {
        return mustard;
    }

    public String getKetchup() {
        return ketchup;
    }

    public String getRanch() {
        return ranch;
    }

    public String getThousand_islands() {
        return thousand_islands;
    }

    public String getVinaigrette() {
        return vinaigrette;
    }

    public String getAu_jus() {
        return au_jus;
    }

    public String getSauce() {
        return sauce;
    }

}
