package color;

import color.ColorStore;



public class Prototype {
    public static void main(String[] args) {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("Red").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Red").addColor();

    }
}
