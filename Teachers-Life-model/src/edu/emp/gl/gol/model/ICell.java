package edu.emp.gl.gol.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public interface ICell {

    IPosition getPosition();

    State getState();

    void setState(State s);

    void beforeEvolve();

    void evolve();

    void postEvolve();

    static public enum State {
        ALIVE,
        DEAD
    }

}
