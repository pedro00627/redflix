/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.misiontic2022.redflix.repositorio;

import edu.misiontic2022.redflix.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pedro
 */
@Repository
public interface DirectorRepositorio extends JpaRepository<Director, Integer> {

}
