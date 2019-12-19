package com.bike.demo.Groupset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroupsetRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Groupset> findAllGroupset() {
        return jdbcTemplate.query(
                "SELECT * FROM groupset",
                (response, rowNumber) ->
                        new Groupset(response.getLong("id"),
                                response.getString("brand"),
                                response.getInt("frontSpeeds"),
                                response.getString("frontSpeedRange"),
                                response.getInt("rearSpeeds"),
                                response.getString("rearSpeedRange")));
    }

    public Groupset findGroupsetById(long id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM groupset WHERE id=?",
                (response, rowNumber) ->
                        new Groupset(response.getLong("id"),
                                response.getString("brand"),
                                response.getInt("frontSpeeds"),
                                response.getString("frontSpeedRange"),
                                response.getInt("rearSpeeds"),
                                response.getString("rearSpeedRange")), id);
    }

    public void save(Groupset groupset) {
        jdbcTemplate.update(
                "INSERT INTO groupset(brand, frontspeeds, frontspeedrange, rearspeeds, rearspeedrange) VALUES(?,?,?,?,?)",
                groupset.getBrand(), groupset.getFrontSpeeds(), groupset.getFrontSpeedRange(), groupset.getRearSpeeds(), groupset.getFrontSpeedRange());
    }

    public void delete(long id){
        jdbcTemplate.update(
                "DELETE FROM groupset WHERE id = ?",id);
    }

    public void update(long id, Groupset groupset) {
        jdbcTemplate.update(
                "UPDATE groupset SET brand=?, frontspeeds=?, frontspeedrange=?, rearspeeds=?, rearspeedrange=? WHERE id = ?",
                groupset.getBrand(), groupset.getFrontSpeeds(), groupset.getFrontSpeedRange(), groupset.getRearSpeeds(), groupset.getRearSpeedRange(), id);
    }
}
