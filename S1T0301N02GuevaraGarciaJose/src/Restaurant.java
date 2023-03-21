public class Restaurant {
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
}
