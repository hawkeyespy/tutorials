package com.rc.streams;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.stream.IntStream;

class Out
{
    public static void print(int i)
    {
        System.out.print(i);
    }

    public static void println(int i)
    {
        System.out.println(i);
    }
}

interface Fun
{
    String print();
}
public class Streams1
{
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach(System.out::println); //Method access explicit
        IntStream.rangeClosed(1, 10).filter(i -> i > 5).forEach(Out::println); //Method access explicit
        System.out.println((IntStream.rangeClosed(1, 10).filter(i -> i > 5).reduce(Integer::sum))); //Sum of the nos greater than 5
        System.out.println((IntStream.rangeClosed(1, 10).reduce((a, b) -> a > b ? a : b)).getAsInt()); //Highest no from the list
        System.out.println((IntStream.range(0, 10).reduce((a, b) -> a > b ? a : b)).getAsInt()); //Highest no from the list

        check(() -> "hello");

    }

    static void check(Fun f)
    {
        System.out.println(f.print());
    }
}
