/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elsquatrecaps.flexiblelearning.infolearningstructure;

import java.time.LocalDateTime;

/**
 *
 * @author professor
 */
public class Score <T>{
    
    ScoreType scoreType;
    private LocalDateTime time;
    private T value;
 
    
    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public T getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(T value) {
        this.value = value;
    }

    
    
    /**
     * Get the value of scoreType
     *
     * @return the value of scoreType
     */
    public ScoreType getScoreType() {
        return scoreType;
    }

    /**
     * Set the value of scoreType
     *
     * @param scoreType new value of scoreType
     */
    public void ScoreType(ScoreType socreType) {
        this.scoreType = scoreType;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

}
