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

    public Composer show(String name){
        return jdbcTemplate.query("SELECT * FROM Composer WHERE name = ?",
                        new Object[]{name}, new BeanPropertyRowMapper<>(Composer.class))
                .stream().findAny().orElse(null);
    }

    /*public Optional<Composer> show(String name){
        return jdbcTemplate.query("SELECT * FROM Composer WHERE name = ?",
                        new Object[]{name}, new BeanPropertyRowMapper<>(Composer.class))
                .stream().findAny();
    }*/

    public void save(Composer composer){
        jdbcTemplate.update("INSERT INTO Composer(name, epoch, dateOfBirth, birthPlace, activityYears, " +
                        "dateOfDeath, burialPlace, photo, composerQuote, autograph," +
                        "biography, environment, facts, mistake) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
                composer.getName(), composer.getEpoch(), composer.getDateOfBirth(), composer.getBirthPlace(),
                composer.getActivityYears(), composer.getDateOfDeath(), composer.getBurialPlace(),
                composer.getPhoto(), composer.getComposerQuote(), composer.getAutograph(),
                composer.getBiography(), composer.getEnvironment(),
                composer.getFacts(), composer.getMistake());
    }

    public void update(int id, Composer composer){
        jdbcTemplate.update("UPDATE Composer SET name=?, epoch=?, dateOfBirth=?, birthPlace=?, activityYears=?, " +
                        "dateOfDeath=?, burialPlace=?, photo=?, composerQuote=?, " +
                        "autograph=?, biography=?, environment=?," +
                        "facts=?, mistake=? WHERE id=?",
                composer.getName(), composer.getEpoch(), composer.getDateOfBirth(), composer.getBirthPlace(),
                composer.getActivityYears(), composer.getDateOfDeath(), composer.getBurialPlace(),
                composer.getPhoto(), composer.getComposerQuote(), composer.getAutograph(),
                composer.getBiography(), composer.getEnvironment(),
                composer.getFacts(), composer.getMistake(), id);
    }

    public void delete(int id){
        jdbcTemplate.update("DELETE FROM Composer WHERE id=?", id);
    }
}
