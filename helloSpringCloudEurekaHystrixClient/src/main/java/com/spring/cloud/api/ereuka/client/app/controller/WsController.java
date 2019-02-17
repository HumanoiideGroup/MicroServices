package com.spring.cloud.api.ereuka.client.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.api.ereuka.client.app.dto.Etudiant;



/***
 * 
 * @author Marc Montan
 *
 */

@RestController
public class WsController {
 
	private Logger logger = Logger.getLogger(getClass().getName());
	
    private static Map<String, List<Etudiant>> classeDB = new HashMap<String, List<Etudiant>>();
 
    static {
    	classeDB = new HashMap<String, List<Etudiant>>();
 
        List<Etudiant> _datas_ = new ArrayList<Etudiant>();
        Etudiant _dto_ = new Etudiant("Marc", "CLASS DEVELOPPER");
        _datas_.add(_dto_);
        _dto_ = new Etudiant("Andre", "CLASS PROGRAMMER");
        _datas_.add(_dto_);
 
        classeDB.put("1", _datas_);
 
        _datas_ = new ArrayList<Etudiant>();
        _dto_ = new Etudiant("Marc dev", "CLASS DEVELOPPER dev");
        _datas_.add(_dto_);
        _dto_ = new Etudiant("Andre dev", "CLASS PROGRAMMER dev");
        _datas_.add(_dto_);
 
        classeDB.put("2", _datas_);
 
    }
 
    @RequestMapping(value = "/etudiant-par-classe/{nomclasse}", method = RequestMethod.GET)
    public List<Etudiant> recuperationEtudiants(@PathVariable String nomclasse) {
    	logger.info("::::::: RECUPERATION DU DETAILS ETUDIANT EN FONCTION DE LA CLASSE :" + nomclasse);
    	List<Etudiant> _liste_ = new ArrayList<>();
    	try {
    		    _liste_ = classeDB.get(nomclasse);
    	        if (_liste_ == null) {
    	        	_liste_ = new ArrayList<Etudiant>();
    	            Etudiant _dto_ = new Etudiant("--- Aucune donnee retournee ---", "N/A");
    	            _liste_.add(_dto_);
    	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
      
        return _liste_;
    }
}
