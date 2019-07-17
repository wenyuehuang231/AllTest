package com.yue.maptest;

import java.util.*;

/**
 * @author : Mr.Huang
 * @date : 2019/7/10 9:46
 */
public class Name {
    private String first, last;

    public Name(String first, String last) {
        if (first == null || last == null) {
            throw new NullPointerException();
        }
        this.first = first;
        this.last = last;
    }

    private boolean equals(Name o) {
        return first.equals(o.first) && last.equals(o.last);
    }

    @Override
    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set s = new HashSet();
        Name name = new Name("Mickey", "Mouse");
        s.add(name);
        System.out.println(s.contains(new Name("Mickey", "Mouse")));
        System.out.println(s.contains(name));
        System.out.println(name.equals(new Name("Mickey", "Mouse")));
        System.out.println("----------------------------------------");
        List<Name> l = new ArrayList<>();
        l.add(name);
        System.out.println(l.contains(new Name("Mickey", "Mouse")));
        System.out.println(l.contains(name));
        System.out.println("----------------------------------------");
        Map<Integer, Name> map = new HashMap<>();
        map.put(1, name);
        System.out.println(map.containsValue(new Name("Mickey", "Mouse")));
        System.out.println(map.containsValue(name));

    }
}
