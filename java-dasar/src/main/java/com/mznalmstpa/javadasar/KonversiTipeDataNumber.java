package com.mznalmstpa.javadasar;

public class KonversiTipeDataNumber {
    // widening casting (otomatis) byte -> short -> int -> long - float -> double
    // narrowing casting (manual) double -> float -> long -> int -> char -> short -> byte

    byte iniByte = 10;
    short iniShort = iniByte;
    long iniInt = iniShort;
    float iniFloat = iniInt;
    double iniDouble = iniFloat;


    float iniFloat2 = (float) iniDouble;
    long iniLong2 = (long) iniFloat2;
    int iniInt2 = (int) iniLong2;
    short iniShort2 = (short) iniInt2;
}
