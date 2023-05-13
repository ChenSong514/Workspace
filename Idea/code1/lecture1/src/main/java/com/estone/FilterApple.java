package com.estone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class FilterApple {

    public static List<Apple>findGreenApple(List<Apple> inventory){
        List<Apple> result=new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> findApple(List<Apple> inventory, String color){
        List<Apple> result=new ArrayList<>();
        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    @FunctionalInterface
    public interface  AppleFilter{
        boolean filter(Apple apple);
        default  void print(String var){
            System.out.println(var);
        }
    }
    public static class GreenAnd150WeightFilter implements  AppleFilter{

        @Override
        public boolean filter(Apple apple) {
            return  ("green".equals(apple.getColor())&&apple.getWeight()>150);
        }
    }

    public static  List<Apple> findApple(List<Apple> inventory,AppleFilter filter){
        List<Apple> result=new ArrayList<>();
        for (Apple apple : inventory) {
            if (filter.filter(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    public static void main(String[] args) throws InterruptedException {
        List<Apple> inventory= Arrays.asList(new Apple("red",160));
        GreenAnd150WeightFilter greenAnd150WeightFilter=new GreenAnd150WeightFilter();
        //List<Apple> result = findApple(inventory, greenAnd150WeightFilter);
        List<Apple> result =findApple(inventory,apple -> apple.getWeight()>150);
        System.out.println(result.size());
        Thread tx = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        tx.start();

        Thread.currentThread().join();
        System.out.println("memo");

    }
}
