package principal;

import java.util.Scanner;


public class Magic_and_sword {
        public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);
        Magic_and_sword p = new Magic_and_sword();
        System.out.println("Ingrese  los valores w y h del rectangulo");
        int w = lector.nextInt();
        int h = lector.nextInt();
        System.out.println("Ingrese las coordenadas X y Y");
        int x0 = lector.nextInt();
        int y0 = lector.nextInt();
        System.out.println("Digite los valores cx y cy");
        int cx = lector.nextInt();
        int cy = lector.nextInt();
        System.out.println("Digite el nivel");
        int nivel = lector.nextInt();
        System.out.println("Digite el hechizo");
        String hechizo = lector.next();
        p.intermediario(w, h, x0, y0, cx, cy, nivel, hechizo);
    }

    public void fuego(int w, int h, int x0, int y0, int cx, int cy, int nivel, String hechizo) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer dañoFuego = 200;
                Integer dañoAgua = 300;
                Integer dañoTierra = 400;
                Integer dañoAire = 100;
                if (hechizo.toUpperCase().equalsIgnoreCase("FIRE")) {
                    while (nivel <= 3) {
                        switch (nivel) {
                            case 1:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(dañoFuego = 0);
                                    nivel = 0;
                                    break;
                                } else {
                                    System.out.println(dañoFuego = dañoFuego + 20);
                                    break;
                                }
                            case 2:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(dañoFuego = dañoFuego + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoFuego = dañoFuego + 30);
                                    nivel = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(dañoFuego = dañoFuego + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoFuego = dañoFuego + 50);
                                    nivel = 0;
                                }
                                break;
                            default:
                                break;
                        }

                    }
                }

            }
        }
    }

    public void agua(int w, int h, int x0, int y0, int cx, int cy, int nivel, String hechizo) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer dañoAgua = 300;
                if (hechizo.toUpperCase().equalsIgnoreCase("WATER")) {
                    while (nivel <= 3) {
                        switch (nivel) {
                            case 1:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(dañoAgua = 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoAgua = dañoAgua + 10);
                                    nivel = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(dañoAgua = dañoAgua + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoAgua = dañoAgua + 25);
                                    nivel = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(dañoAgua = dañoAgua + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoAgua = dañoAgua + 40);
                                    nivel = 0;
                                }
                                break;
                            default:
                                break;
                        }

                    }
                }

            }
        }
    }

    public void tierra(int w, int h, int x0, int y0, int cx, int cy, int nivel, String hechizo) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer dañoTierra = 400;
                if (hechizo.toUpperCase().equalsIgnoreCase("EARTH")) {
                    while (nivel <= 3) {
                        switch (nivel) {
                            case 1:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(dañoTierra = 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoTierra = dañoTierra + 25);
                                    nivel = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(dañoTierra = dañoTierra + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoTierra = dañoTierra + 55);
                                    nivel = 0;
                                }
                                break;
                            case 3:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(dañoTierra = dañoTierra + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(dañoTierra = dañoTierra + 70);
                                    nivel = 0;
                                }
                                break;
                            default:
                                break;
                        }

                    }
                }

            }
        }
    }

    public void aire(int w, int h, int x0, int y0, int cx, int cy, int nivel, String hechizo) {
        while (w <= 1000 & h <= 1000) {
            while (x0 <= 1000 & y0 <= 1000) {
                Integer damageAire = 100;
                if (hechizo.toUpperCase().equalsIgnoreCase("AIR")) {
                    while (nivel <= 3) {
                        switch (nivel) {
                            case 1:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageAire = 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(damageAire = damageAire + 18);
                                    nivel = 0;
                                }
                                break;
                            case 2:
                                if (cx > x0 & cy > y0) {
                                    System.out.println(damageAire = damageAire + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(damageAire = damageAire + 38);
                                    nivel = 0;
                                }
                                break;
                            case 3:
                                if (cx >= x0 & cy >= y0) {
                                    System.out.println(damageAire = damageAire + 0);
                                    nivel = 0;
                                } else {
                                    System.out.println(damageAire = damageAire + 60);
                                    nivel = 0;
                                }
                                break;
                            default:
                                break;
                        }

                    }
                }

            }
        }
    }

    private void intermediario(int w, int h, int x0, int y0, int cx, int cy, int nivel, String hechizo) {
        if (hechizo.equalsIgnoreCase("Fire")) {
            fuego(w, h, x0, y0, cx, cy, nivel, hechizo);
        } else if (hechizo.equalsIgnoreCase("Water")) {
            agua(w, h, x0, y0, cx, cy, nivel, hechizo);
        } else if (hechizo.equalsIgnoreCase("Earth")) {
            tierra(w, h, x0, y0, cx, cy, nivel, hechizo);
        } else {
            aire(w, h, x0, y0, cx, cy, nivel, hechizo);
        }
    }

}