package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Driver {
    public static void countSpecimens(Specimen[] animals, Species s) {
        int count = 0;
        for (Specimen animal : animals) {
            if (s.equals(animal.getTOA())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void makeList(Specimen[] animals) {
        LinkedList<Specimen> SpecimenList = new LinkedList<>();
        for(Specimen animal : animals) {
            SpecimenList.add(animal);
        }
    }

    public static LinkedList<Specimen> makeSpeciesList(LinkedList<Specimen> animals) {
        LinkedList<Specimen> SpeciesList = new LinkedList<>();
        for (Specimen animal : animals) {
            SpeciesList.add(animal);
        }
        return SpeciesList;
    }

    public static LinkedList<Specimen> makeSpeciesListUnique(LinkedList<Specimen> animals) {
        LinkedList<Specimen> SpeciesUniqueList = new LinkedList<>();
        for (Specimen animal : animals) {
            if (SpeciesUniqueList.contains(animal.getTOA()) == true) {
                continue;
            } else {
                SpeciesUniqueList.add(animal);
            }
        }
        return SpeciesUniqueList;
    }
}
