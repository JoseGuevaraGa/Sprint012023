public class Restaurant implements Comparable<Restaurant>{
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public String toString(){
        return ("Retaurant: "+nom+" Puntuacion: "+puntuacio);
    }

    public boolean equals( Object objeto ) {
        if (objeto == null) return false;

        Restaurant restaurant = (Restaurant) objeto;
        //this.getNom().equals(restaurant.getNom() &&
        return this.getPuntuacio() == restaurant.getPuntuacio();
    }

    public int hashCode() {
        return this.getNom().hashCode();
    }

    @Override
    public int compareTo(Restaurant o) {

        if (this.getNom().compareTo(o.getNom()) > 0 && this.getPuntuacio() > o.getPuntuacio() ){
            return 1;
        }else if (this.getNom().compareTo(o.getNom()) < 0 && this.getPuntuacio() < o.getPuntuacio() ) {
            return -1;
        }else {
            return 0;
        }
    }


    /*
    @Override
    public int compareTo(Restaurant o) {
        String a=new String(String.valueOf(this.getNom())+this.getPuntuacio());
        String b=new String(String.valueOf(o.getNom())+o.getPuntuacio());
        return a.compareTo(b);
    }*/
}
