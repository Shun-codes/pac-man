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
 * Le type PacmanVulnerable
 *
 * @author romain.thibaut
 *
 * @version 0.1.0
 */
@StateDesignPattern(state = PacmanVulnerable.class, participant = StateParticipant.IMPLEMENTATION)
public class PacmanVulnerable implements IStatePacman{

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStatePacman#onCollisionWith(fr.univartois.butinfo.r304.pacman.model.animated.Ghost)
     */
    @Override
    public IStatePacman onCollisionWithGhost(PacMan pacman) {
        pacman.setHp(pacman.getHpProperty().get() - 1);
        return new PacmanInvulnerable();      
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStatePacman#changeStatePacman(long)
     */
    @Override
    public IStatePacman changeStatePacman(long time) {              
        return this;
    }
    
}

