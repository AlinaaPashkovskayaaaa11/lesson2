package Lesson2;

import java.util.stream.IntStream;

public class Number9 {
    public static void main(String[] args) {
        while (true){
            IntStream.iterate(0,x->x-5).limit(10).forEach(System.out::println);
            break;
        }
        }

    }
