package ru.axtane.springMVC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.axtane.springMVC.models.Composer;

import java.util.List;
import java.util.Optional;

@Component
public class ComposerDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ComposerDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Composer> index(){
        return jdbcTemplate.query("SELECT * FROM Composer",
                new BeanPropertyRowMapper<>(Composer.class));
    }

    public Composer show(String fio){
        return jdbcTemplate.query("SELECT * FROM Composer WHERE fio = ?",
                        new Object[]{fio}, new BeanPropertyRowMapper<>(Composer.class))
                .stream().findAny().orElse(null);
    }

    /*public Optional<Composer> show(String name){
        return jdbcTemplate.query("SELECT * FROM Composer WHERE name = ?",
                        new Object[]{name}, new BeanPropertyRowMapper<>(Composer.class))
                .stream().findAny();
    }*/

    public void save(Composer composer){
        jdbcTemplate.update("INSERT INTO Composer(username, dateOfBirth, placeOfBirth, yearsOfActivity, dateOfDeath, " +
                        "deathReason, placeOfDeath, burialPlace, composerQuotes, positiveQuotes," +
                        "negativeQuotes, interestingFacts, delusions, fio, epoch, biography) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                composer.getUsername(), composer.getDateOfBirth(), composer.getPlaceOfBirth(), composer.getYearsOfActivity(),
                composer.getDateOfDeath(), composer.getDeathReason(), composer.getPlaceOfDeath(),
                composer.getBurialPlace(), composer.getComposerQuotes(), composer.getPositiveQuotes(),
                composer.getNegativeQuotes(), composer.getInterestingFacts(),
                composer.getDelusions(), composer.getFio(), composer.getEpoch(), composer.getBiography());
    }

    public void update(int id, Composer composer){
        jdbcTemplate.update("UPDATE Composer SET username=?, dateOfBirth=?, placeOfBirth=?, yearsOfActivity=?, dateOfDeath=?, " +
                        "deathReason=?, placeOfDeath=?, burialPlace=?, composerQuotes=?, " +
                        "positiveQuotes=?, negativeQuotes=?, interestingFacts=?," +
                        "delusions=?, fio=?, epoch=?, biography=? WHERE id=?",
                composer.getUsername(), composer.getDateOfBirth(), composer.getPlaceOfBirth(), composer.getYearsOfActivity(),
                composer.getDateOfDeath(), composer.getDeathReason(), composer.getPlaceOfDeath(),
                composer.getBurialPlace(), composer.getComposerQuotes(), composer.getPositiveQuotes(),
                composer.getNegativeQuotes(), composer.getInterestingFacts(),
                composer.getDelusions(), composer.getFio(), composer.getEpoch(), composer.getBiography(), id);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM Composer WHERE id=?", id);
    }
}
