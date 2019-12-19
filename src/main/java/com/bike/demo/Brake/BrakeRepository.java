package com.bike.demo.Brake;

import com.bike.demo.Groupset.Groupset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrakeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Brake> findAllBrakes() {
        return jdbcTemplate.query(
                "SELECT * FROM brakes",
                (response, rowNumber) ->
                        new Brake(response.getLong("id"),
                                response.getString("brand"),
                                response.getInt("quantityOfPistons"),
                                response.getInt("diameterOfRotor")));
    }

    public Brake findBrakesById(long id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM brakes WHERE id=?",
                (response, rowNumber) ->
                        new Brake(response.getLong("id"),
                                response.getString("brand"),
                                response.getInt("quantityOfPistons"),
                                response.getInt("diameterOfRotor")), id);
    }

    public void save(Brake brake) {
        jdbcTemplate.update(
                "INSERT INTO brakes(brand, quantityofpistons, diameterofrotor) VALUES(?,?,?)",
                brake.getBrand(), brake.getQuantityOfPistons(), brake.getDiameterOfRotor());
    }

    public void delete(long id){
        jdbcTemplate.update(
                "DELETE FROM brakes WHERE id = ?",id);
    }

    public void update(long id, Brake brake) {
        jdbcTemplate.update(
                "UPDATE brakes SET brand=?, quantityofpistons=?, diameterofrotor=? WHERE id = ?",
                brake.getBrand(), brake.getQuantityOfPistons(), brake.getDiameterOfRotor(), id);
    }
}
