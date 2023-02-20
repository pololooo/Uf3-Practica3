package Uf3Practica3Ex2;

public class Ex2 {

    private class Clients {

        public Clients(int Codi, String Nom, String Cognoms, int DiaNeix, int MesNeix, int AnyNeix, String AdreçaPostal, String eMail, boolean VIP) {
            this.Codi = Codi;
            this.Nom = Nom;
            this.Cognoms = Cognoms;
            this.DiaNeix = DiaNeix;
            this.MesNeix = MesNeix;
            this.AnyNeix = AnyNeix;
            this.AdreçaPostal = AdreçaPostal;
            this.eMail = eMail;
            this.VIP = VIP;
        }

        int Codi;
        String Nom;
        String Cognoms;
        int DiaNeix;
        int MesNeix;
        int AnyNeix;
        String AdreçaPostal;
        String eMail;
        boolean VIP;

        public int getCodi() {
            return Codi;
        }

        public void setCodi(int Codi) {
            this.Codi = Codi;
        }

        public String getNom() {
            return Nom;
        }

        public void setNom(String Nom) {
            this.Nom = Nom;
        }

        public String getCognoms() {
            return Cognoms;
        }

        public void setCognoms(String Cognoms) {
            this.Cognoms = Cognoms;
        }

        public int getDiaNeix() {
            return DiaNeix;
        }

        public void setDiaNeix(int DiaNeix) {
            this.DiaNeix = DiaNeix;
        }

        public int getMesNeix() {
            return MesNeix;
        }

        public void setMesNeix(int MesNeix) {
            this.MesNeix = MesNeix;
        }

        public int getAnyNeix() {
            return AnyNeix;
        }

        public void setAnyNeix(int AnyNeix) {
            this.AnyNeix = AnyNeix;
        }

        public String getAdreçaPostal() {
            return AdreçaPostal;
        }

        public void setAdreçaPostal(String AdreçaPostal) {
            this.AdreçaPostal = AdreçaPostal;
        }

        public String geteMail() {
            return eMail;
        }

        public void seteMail(String eMail) {
            this.eMail = eMail;
        }

        public boolean isVIP() {
            return VIP;
        }

        public void setVIP(boolean VIP) {
            this.VIP = VIP;
        }
    }
}
