/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 romain.thibaut
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.animated;

import fr.univartois.dpprocessor.designpatterns.state.StateDesignPattern;
import fr.univartois.dpprocessor.designpatterns.state.StateParticipant;

/**
 * Le type PacmanInvulnerable
 *
 * @author romain.thibaut
 *
 * @version 0.1.0
 */
@StateDesignPattern(state = PacmanInvulnerable.class, participant = StateParticipant.IMPLEMENTATION)
public class PacmanInvulnerable implements IStatePacman{
    
    /**
     * L'attribut compteur permet de compter le temps d'invulnérabilité.
     */
    private long compteur = 0;

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStatePacman#onCollisionWith(fr.univartois.butinfo.r304.pacman.model.animated.Ghost)
     */
    @Override
    public IStatePacman onCollisionWithGhost(PacMan pacman) {
        return this;        
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStatePacman#changeStatePacman(long)
     */
    @Override
    public IStatePacman changeStatePacman(long time) {
       compteur += time;
       if(compteur < 3000) { // 3 secondes d'invulnérabilité
           return this;
       }
        return new PacmanVulnerable();
    }

}

