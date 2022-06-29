package ru.axtane.springMVC.models;

public class Composer {
    private int id;
    private String name;
    private String epoch;
    private String dateOfBirth;
    private String birthPlace;
    private String activityYears;
    private String dateOfDeath;
    private String burialPlace;
    private String photo;
    private String composerQuote;
    private String autograph;
    private String biography;
    private String environment;
    private String facts;
    private String mistake;
    //private boolean isModerated;
    //name, dateOfBirth, birthPlace, activityYears, dateOfDeath, burialPlace, photo, composerQuote, autograph, biography, environment, facts, mistake
    //getName(), getDateOfBirth(), getBirthPlace(), getActivityYears(), getDateOfDeath(), getBurialPlace(), getPhoto(), getComposerQuote(), getAutograph(), getBiography(), getEnvironment(), getFacts(), getMistake(), getIsModerated()


    public Composer(int id, String name, String epoch, String dateOfBirth, String birthPlace, String activityYears, String dateOfDeath, String burialPlace, String photo, String composerQuote, String autograph, String biography, String environment, String facts, String mistake) {
        this.id = id;
        this.name = name;
        this.epoch = epoch;
        this.dateOfBirth = dateOfBirth;
        this.birthPlace = birthPlace;
        this.activityYears = activityYears;
        this.dateOfDeath = dateOfDeath;
        this.burialPlace = burialPlace;
        this.photo = photo;
        this.composerQuote = composerQuote;
        this.autograph = autograph;
        this.biography = biography;
        this.environment = environment;
        this.facts = facts;
        this.mistake = mistake;
    }

    public Composer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getActivityYears() {
        return activityYears;
    }

    public void setActivityYears(String activityYears) {
        this.activityYears = activityYears;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getBurialPlace() {
        return burialPlace;
    }

    public void setBurialPlace(String burialPlace) {
        this.burialPlace = burialPlace;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getComposerQuote() {
        return composerQuote;
    }

    public void setComposerQuote(String composerQuote) {
        this.composerQuote = composerQuote;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getFacts() {
        return facts;
    }

    public void setFacts(String facts) {
        this.facts = facts;
    }

    public String getMistake() {
        return mistake;
    }

    public void setMistake(String mistake) {
        this.mistake = mistake;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    /* public boolean isModerated() {
        return isModerated;
    }

    public void setModerated(boolean moderated) {
        isModerated = moderated;
    }*/
}

