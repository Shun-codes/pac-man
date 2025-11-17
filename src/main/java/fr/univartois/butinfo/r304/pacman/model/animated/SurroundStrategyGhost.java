/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 shun.lembrez
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.animated;

import fr.univartois.butinfo.r304.pacman.model.PacmanGame;
import fr.univartois.dpprocessor.designpatterns.state.StateDesignPattern;
import fr.univartois.dpprocessor.designpatterns.state.StateParticipant;
import fr.univartois.dpprocessor.designpatterns.strategy.StrategyDesignPattern;
import fr.univartois.dpprocessor.designpatterns.strategy.StrategyParticipant;

/**
 * Le type surroundStrategy
 *
 * @author shun.lembrez
 *
 * @version 0.1.0
 */
@StrategyDesignPattern(strategy = IStrategyGhost.class, participant = StrategyParticipant.IMPLEMENTATION)
@StateDesignPattern(state = IStateGhostMove.class, participant = StateParticipant.IMPLEMENTATION)
public class SurroundStrategyGhost implements IStrategyGhost, IStateGhostMove{
    
    /**
     * L'attribut speedOfGhost qui permet de gerer la direction du fantôme pour le diriger dans le coin correspondant a sa couleur
     */
    private double speedOfGhost;
    
    /**
     * L'attribut stateGhost pour la gestion des états des fantômes
     */
    private IStateGhostMove stateGhost;
    
    /**
     * Constructeur qui permet d'initialisée la vitesse et l'état du fantôme
     * 
     * @param speedOfGhost 
     */
    public SurroundStrategyGhost(int speedOfGhost) {
        this.speedOfGhost = speedOfGhost;
        this.stateGhost = new DistantStateGhost();
    }
    
    
    /**
     * Modifie l'attribut speedOfGhost de cette instance de SurroundStrategyGhost.
     *
     * @param speedOfGhost La nouvelle valeur de l'attribut speedOfGhost pour cette instance de SurroundStrategyGhost.
     */
    public void setSpeedOfGhost(double speedOfGhost) {
        this.speedOfGhost = speedOfGhost;
    }


    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStrategyGhost#moveStrategy(fr.univartois.butinfo.r304.pacman.model.animated.Ghost)
     */
    @Override
    public void moveStrategy(Ghost ghost, long delta, PacmanGame game) {
        stateGhost.moveState(ghost, delta, speedOfGhost, game);
        this.stateGhost = this.stateGhost.nextState();
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStateGhostMove#moveState(fr.univartois.butinfo.r304.pacman.model.animated.Ghost, long, double, fr.univartois.butinfo.r304.pacman.model.PacmanGame)
     */
    @Override
    public void moveState(Ghost ghost, long delta, double speedOfGhostState, PacmanGame game) {
        stateGhost.moveState(ghost, delta, speedOfGhostState, game);
    }

    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.animated.IStateGhostMove#nextState()
     */
    @Override
    public IStateGhostMove nextState() {
        return stateGhost.nextState();
    }

    

}

