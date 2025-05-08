package com.micro.rewards.lookups;

import java.util.Random;

public class Places {

    public static final String AFGHANISTAN = "Afghanistan";
    public static final String ARGENTINA = "Argentina";
    public static final String AUSTRALIA = "Australia";
    public static final String AUSTRIA = "Austria";
    public static final String BANGLADESH = "Bangladesh";
    public static final String BELGIUM = "Belgium";
    public static final String BOLIVIA = "Bolivia";
    public static final String BRAZIL = "Brazil";
    public static final String CANADA = "Canada";
    public static final String CHILE = "Chile";
    public static final String CHINA = "China";
    public static final String COLOMBIA = "Colombia";
    public static final String CZECH_REPUBLIC = "Czech Republic";
    public static final String DENMARK = "Denmark";
    public static final String DOMINICAN_REPUBLIC = "Dominican Republic";
    public static final String ECUADOR = "Ecuador";
    public static final String EGYPT = "Egypt";
    public static final String ETHIOPIA = "Ethiopia";
    public static final String FINLAND = "Finland";
    public static final String FRANCE = "France";
    public static final String GERMANY = "Germany";
    public static final String GHANA = "Ghana";
    public static final String GREECE = "Greece";
    public static final String GUATEMALA = "Guatemala";
    public static final String HONDURAS = "Honduras";
    public static final String HUNGARY = "Hungary";
    public static final String ICELAND = "Iceland";
    public static final String INDIANA = "Indiana";
    public static final String INDONESIA = "Indonesia";
    public static final String IRAN = "Iran";
    public static final String IRAQ = "Iraq";
    public static final String IRELAND = "Ireland";
    public static final String ILLINOIS = "ILLINOIS";
    public static final String ITALY = "Italy";
    public static final String JAPAN = "Japan";
    public static final String KENYA = "Kenya";
    public static final String MALAYSIA = "Malaysia";
    public static final String MEXICO = "Mexico";
    public static final String MOROCCO = "Morocco";
    public static final String NEPAL = "Nepal";
    public static final String NETHERLANDS = "Netherlands";
    public static final String NEW_ZEALAND = "New Zealand";
    public static final String NIGERIA = "Nigeria";
    public static final String NORWAY = "Norway";
    public static final String PAKISTAN = "Pakistan";
    public static final String PERU = "Peru";
    public static final String PHILIPPINES = "Philippines";
    public static final String POLAND = "Poland";
    public static final String PORTUGAL = "Portugal";
    public static final String ROMANIA = "Romania";

    static Random random = new Random();

    public static String getPlace() {
        int x = random.nextInt(50); // Adjusted to 50 to include case 49
        return switch (x) {
            case 0 -> AFGHANISTAN;
            case 1 -> ARGENTINA;
            case 2 -> AUSTRALIA;
            case 3 -> AUSTRIA;
            case 4 -> BANGLADESH;
            case 5 -> BELGIUM;
            case 6 -> BOLIVIA;
            case 7 -> BRAZIL;
            case 8 -> CANADA;
            case 9 -> CHILE;
            case 10 -> CHINA;
            case 11 -> COLOMBIA;
            case 12 -> CZECH_REPUBLIC;
            case 13 -> DENMARK;
            case 14 -> DOMINICAN_REPUBLIC;
            case 15 -> ECUADOR;
            case 16 -> EGYPT;
            case 17 -> ETHIOPIA;
            case 18 -> FINLAND;
            case 19 -> FRANCE;
            case 20 -> GERMANY;
            case 21 -> GHANA;
            case 22 -> GREECE;
            case 23 -> GUATEMALA;
            case 24 -> HONDURAS;
            case 25 -> HUNGARY;
            case 26 -> ICELAND;
            case 27 -> INDIANA;
            case 28 -> INDONESIA;
            case 29 -> IRAN;
            case 30 -> IRAQ;
            case 31 -> IRELAND;
            case 32 -> ILLINOIS;
            case 33 -> ITALY;
            case 34 -> JAPAN;
            case 35 -> KENYA;
            case 36 -> MALAYSIA;
            case 37 -> MEXICO;
            case 38 -> MOROCCO;
            case 39 -> NEPAL;
            case 40 -> NETHERLANDS;
            case 41 -> NEW_ZEALAND;
            case 42 -> NIGERIA;
            case 43 -> NORWAY;
            case 44 -> PAKISTAN;
            case 45 -> PERU;
            case 46 -> PHILIPPINES;
            case 47 -> POLAND;
            case 48 -> PORTUGAL;
            case 49 -> ROMANIA;
            default -> "Breast";
        };
    }

}
