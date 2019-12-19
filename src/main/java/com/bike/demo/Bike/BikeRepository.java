package com.bike.demo.Bike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BikeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Bike> findAll(){
        return jdbcTemplate.query(
                "SELECT * FROM mountainbike",
                (response, rowNumber) ->
                        new  Bike(response.getLong("id"),
                                response.getString("brand"),
                                response.getString("model"),
                                response.getFloat("size"),
                                response.getFloat("weight"),
                                response.getString("material")));
    }

    public Bike findById(long id){
        return jdbcTemplate.queryForObject(
                "SELECT * FROM mountainbike WHERE id=?",
                (response, rowNumber) ->
                        new  Bike(response.getLong("id"),
                                response.getString("brand"),
                                response.getString("model"),
                                response.getFloat("size"),
                                response.getFloat("weight"),
                                response.getString("material")), id);
    }


    public void save(Bike bike) {
        jdbcTemplate.update(
                "INSERT INTO MountainBike(brand, model, size, weight, material) VALUES(?,?,?,?,?)",
                bike.getBrand(), bike.getModel(), bike.getSize(), bike.getWeight(), bike.getMaterial());
    }

    public void delete(long id){
        jdbcTemplate.update(
                "DELETE FROM MountainBike WHERE id = ?",id);
    }

    public void update(long id, Bike bike) {
        jdbcTemplate.update(
                "UPDATE MountainBike SET brand=?, model=?, size=?, weight=?, material=? WHERE id = ?",
                bike.getBrand(), bike.getModel(), bike.getSize(), bike.getWeight(), bike.getMaterial(), id);
    }
}
