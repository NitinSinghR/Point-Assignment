package org.example;

class Point extends Points implements Cloneable {
    private int x1;
    private int y1;

    Point(int x, int y) {
        this.x1 = x;
        this.y1 = y;
    }

    public String equals(int x, int y) {
        if (x1 == x && y == y1) {
            return "true";
        } else {
            return "false";
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
