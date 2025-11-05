/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 romain.thibaut
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.animated;

/**
 * Le type IStatePacman
 *
 * @author romain.thibaut
 *
 * @version 0.1.0
 */
public interface IStatePacman {
   
    /**
     * @param other Savoir si pacman est en collision avec un fantome
     */
    public void onCollisionWith(Ghost other);
    
    /**
     * @param time Le temps que pacman ne peut pas rentrer en collision avec des fantômes 
     * @return IStatePacman l'état actuelle de Pacman
     */
    public IStatePacman changeStatePacman(long time);
}

