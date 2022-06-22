public class personne {
    private String nom;
    private String prenom;
    //la composition

    public class Adress {
        private  String avenue;
        private String numero;
        private String cellule;
        private String quartier;
        private String commune;
        private String ville;
        private String pays;

        public Adress(String avenue, String numero, String cellule, String quartier, String commune, String ville, String pays) {
            this.avenue = avenue;
            this.numero = numero;
            this.cellule = cellule;
            this.quartier = quartier;
            this.commune = commune;
            this.ville = ville;
            this.pays = pays;
        }

        public String getAvenue() {
            return avenue;
        }

        public String getNumero() {
            return numero;
        }

        public String getCellule() {
            return cellule;
        }

        public String getQuartier() {
            return quartier;
        }

        public String getCommune() {
            return commune;
        }

        public String getVille() {
            return ville;
        }

        public String getPays() {
            return pays;
        }

        public void setAvenue(String avenue) {
            this.avenue = avenue;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public void setCellule(String cellule) {
            this.cellule = cellule;
        }

        public void setQuartier(String quartier) {
            this.quartier = quartier;
        }

        public void setCommune(String commune) {
            this.commune = commune;
        }

        public void setVille(String ville) {
            this.ville = ville;
        }

        public void setPays(String pays) {
            this.pays = pays;
        }
    }
}
