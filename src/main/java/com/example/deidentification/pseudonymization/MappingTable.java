package com.example.deidentification.pseudonymization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MappingTable {
    private static final String LASTNAME = "src/main/resources/name/LastName.csv";
    private static final String MALE = "src/main/resources/name/MaleName.csv";
    private static final String FEMALE = "src/main/resources/name/FemaleName.csv";

    public static void main(String[] args) throws Exception {
        getName(LASTNAME);
        getName(MALE);
    }

    public static String getName(String fileName) throws IOException {
        List<String> nameList = new ArrayList<>();
        File csv = new File(fileName);

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String name = "";

        while(true) {
            name = reader.readLine();
            if(name == null || name.equals("")) break;
            nameList.add(name);
        }

        int rand = (int)(Math.random() * nameList.size()) + 1;

        return nameList.get(rand);
    }
}
