package ru.axtane.springMVC.models;

public class Composer {
    private int id;
    private String username;
    private String dateOfBirth;
    private String placeOfBirth;
    private String yearsOfActivity;
    private String dateOfDeath;
    private String deathReason;
    private String placeOfDeath;
    private String burialPlace;
    private String composerQuotes;
    private String positiveQuotes;
    private String negativeQuotes;
    private String interestingFacts;
    private String delusions;
    private String fio;
    private String epoch;
    private String biography;
    //private boolean isModerated;
    //name, dateOfBirth, birthPlace, activityYears, dateOfDeath, burialPlace, photo, composerQuote, autograph, biography, environment, facts, mistake
    //getName(), getDateOfBirth(), getBirthPlace(), getActivityYears(), getDateOfDeath(), getBurialPlace(), getPhoto(), getComposerQuote(), getAutograph(), getBiography(), getEnvironment(), getFacts(), getMistake(), getIsModerated()


    public Composer(int id, String username, String dateOfBirth, String placeOfBirth, String yearsOfActivity, String dateOfDeath, String deathReason, String placeOfDeath, String burialPlace, String composerQuotes, String positiveQuotes, String negativeQuotes, String interestingFacts, String delusions, String fio, String epoch, String biography) {
        this.id = id;
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.yearsOfActivity = yearsOfActivity;
        this.dateOfDeath = dateOfDeath;
        this.deathReason = deathReason;
        this.placeOfDeath = placeOfDeath;
        this.burialPlace = burialPlace;
        this.composerQuotes = composerQuotes;
        this.positiveQuotes = positiveQuotes;
        this.negativeQuotes = negativeQuotes;
        this.interestingFacts = interestingFacts;
        this.delusions = delusions;
        this.fio = fio;
        this.epoch = epoch;
        this.biography = biography;
    }

    public Composer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(String yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
    }

    public String getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    public String getDeathReason() {
        return deathReason;
    }

    public void setDeathReason(String deathReason) {
        this.deathReason = deathReason;
    }

    public String getPlaceOfDeath() {
        return placeOfDeath;
    }

    public void setPlaceOfDeath(String placeOfDeath) {
        this.placeOfDeath = placeOfDeath;
    }

    public String getBurialPlace() {
        return burialPlace;
    }

    public void setBurialPlace(String burialPlace) {
        this.burialPlace = burialPlace;
    }

    public String getComposerQuotes() {
        return composerQuotes;
    }

    public void setComposerQuotes(String composerQuotes) {
        this.composerQuotes = composerQuotes;
    }

    public String getPositiveQuotes() {
        return positiveQuotes;
    }

    public void setPositiveQuotes(String positiveQuotes) {
        this.positiveQuotes = positiveQuotes;
    }

    public String getNegativeQuotes() {
        return negativeQuotes;
    }

    public void setNegativeQuotes(String negativeQuotes) {
        this.negativeQuotes = negativeQuotes;
    }

    public String getInterestingFacts() {
        return interestingFacts;
    }

    public void setInterestingFacts(String interestingFacts) {
        this.interestingFacts = interestingFacts;
    }

    public String getDelusions() {
        return delusions;
    }

    public void setDelusions(String delusions) {
        this.delusions = delusions;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}

