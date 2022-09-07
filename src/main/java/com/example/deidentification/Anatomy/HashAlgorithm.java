package com.example.deidentification.Anatomy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashAlgorithm {

    public static String sha256(String msg) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(msg.getBytes());

        StringBuilder builder = new StringBuilder();
        for (byte b : md.digest()) builder.append(String.format("%02x", b));

        return builder.toString();
    }

}

