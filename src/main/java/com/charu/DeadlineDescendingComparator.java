package com.charu;

import java.util.Comparator;

public class DeadlineDescendingComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Tasks t1 = (Tasks) o1;
        Tasks t2 = (Tasks) o2;

        return t2.getDeadline().compareTo(t1.getDeadline());

    }
}
