package edu.emp.gl.gol.model;


import java.util.List;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public interface IWorld {
    
    void initializeWorld (Properties p)  ; 
    
    List<ICell> getAllCells () ;  
    
    ICell getCell (IPosition pos) ;
    
    void InsertPatch (List<ICell> cells, IPosition relativePosition) ;

    List<ICell> getNeigbors (ICell cell) ;    

    void evolveWorld () ;     
    
    boolean isPopulated();

    void show () ; 
    
    public static final String WIDTH = "WIDTH" ;
    public static final String HEIGHT = "HEIGHT" ;
    public static final String THRESHOLD = "THRESHOLD" ;


}
