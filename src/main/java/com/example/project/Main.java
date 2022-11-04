package com.example.project;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Main {

    static int sum(List<Integer> xs) {
        int res = 0;
        for (Integer x : xs) {
            res += x;
        }
        return res;
    }

    static int product(List<Integer> xs) {
        int res = 1;
        for (Integer x : xs) {
            res *= x;
        }
        return res;
    }

    static @NotNull List<Integer> multByConstant(@NotNull List<Integer> xs, int coef) {
        List<Integer> res = new ArrayList<Integer>();
        for (Integer x : xs) {
            res.add(x * coef);
        }
        return res;
    }

    static List<Integer> addConstant(List<Integer> xs, int coef) {
        List<Integer> res = new ArrayList<Integer>();
        for (Integer x : xs) {
            res.add(x + coef);
        }
        return res;
    }



}
