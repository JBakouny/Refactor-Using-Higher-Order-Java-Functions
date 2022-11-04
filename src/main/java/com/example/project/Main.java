package com.example.project;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    static int sum(List<Integer> xs) {
        return foldLeft(xs, 0, Integer::sum);
    }

    static int product(List<Integer> xs) {
        return foldLeft(xs, 1, (z, x) -> z * x);
    }

    static @NotNull List<Integer> multByConstant(@NotNull List<Integer> xs, int coef) {
        return map(xs, x -> x * coef);
    }

    static @NotNull List<Integer> addConstant(@NotNull List<Integer> xs, int coef) {
        return map(xs, x -> x + coef);
    }

    static <A, B> List<B> map(List<A> xs, Function<A, B> f) {
        List<B> l = new ArrayList<>();
        for (A x: xs) {
            l.add(f.apply(x));
        }
        return l;
    }

    static <Z, T> Z foldLeft(List<T> xs, Z zero, BiFunction<Z, T, Z> op) {
        Z res = zero;
        for (T x: xs) {
            res = op.apply(res, x);
        }
        return res;
    }


}
