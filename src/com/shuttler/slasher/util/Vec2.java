package com.shuttler.slasher.util;

import static java.lang.Math.*;

public class Vec2 {

    public double x;
    public double y;

    public Vec2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(double phi) {
        this.x = cos(phi);
        this.y = sin(phi);
    }
}
