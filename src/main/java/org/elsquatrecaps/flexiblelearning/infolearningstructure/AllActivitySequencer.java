/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elsquatrecaps.flexiblelearning.infolearningstructure;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author professor
 */
public class AllActivitySequencer implements ActivitySequencer {

    @Override
    public List<Activity> nextActivities(NuclearActivity na, Activity act) {
        List <Activity> result=new ArrayList<>();
        
        result.addAll(na.members);
        
        return result;
    }
}
