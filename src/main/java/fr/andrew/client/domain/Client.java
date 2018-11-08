package fr.andrew.client.domain;

public class Client {

    private Integer id;
    private Integer numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String telFixe;
    private String telPortable;
    private String dateNaissance;
    private String email;

    public Client() {
    }

    public Client(Integer id, Integer numClient, String nom, String prenom, String adresse, String telFixe, String telPortable, String dateNaissance, String email) {
        this.id = id;
        this.numClient = numClient;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telFixe = telFixe;
        this.telPortable = telPortable;
        this.dateNaissance = dateNaissance;
        this.email = email;
    }

    //GETTER & SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumClient() {
        return numClient;
    }

    public void setNumClient(Integer numClient) {
        this.numClient = numClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
