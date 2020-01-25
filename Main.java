package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HuffmanCompression obj = new HuffmanCompression();

        StringBuilder message =new StringBuilder();
        message=obj.comression("ABCCCAAAA");
        System.out.println("compressed message  "+message);
        System.out.println("output message  " +obj.decompression(message));










    }
}
