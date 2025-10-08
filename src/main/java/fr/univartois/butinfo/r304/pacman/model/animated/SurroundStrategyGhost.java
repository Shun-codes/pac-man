/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 shun.lembrez
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.animated;

import fr.univartois.butinfo.r304.pacman.model.PacmanGame;
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
public class SurroundStrategyGhost implements IStrategyGhost{


    /**
     * L'attribut SPEED pour gerer la vitesse des famtôme quand il change de direction
     */
    private static final double SPEED = 75;
    
    /**
     * L'attribut temps pour actualise tout les 2 secondes
     */
    private double temps = 2000;



    @Override
    public void moveStrategy(Ghost ghost, long delta, PacmanGame game) {
        // Le fantôme change de direction toutes les 2 secondes
        if (temps <= 0) {
            changeDirection(ghost, game);
            temps = 2000;
        } else {
            temps -= delta;
        }
    }

    /**
     * Change la direction du fantôme pour tenter d’encercler Pac-Man.
     *
     * @param ghost Le fantôme à déplacer
     * @param game  Le jeu actuel
     */
    private void changeDirection(Ghost ghost, PacmanGame game) {
        
        PacMan pacman = game.getPlayer();        
     
        if (Math.abs(pacman.getX() - ghost.getX()) > Math.abs(pacman.getY() - ghost.getY())) {
            
            if (pacman.getY() < ghost.getY() && game.getCellAt(ghost.getX(), ghost.getY() - 1).isEmpty()) {
                ghost.setVerticalSpeed(-SPEED);
                ghost.setHorizontalSpeed(0);
            }
            else if (pacman.getY() > ghost.getY() && game.getCellAt(ghost.getX(), ghost.getY() + 1).isEmpty()) {
                ghost.setVerticalSpeed(SPEED);
                ghost.setHorizontalSpeed(0);
            }
        }
        else {
            if (pacman.getX() < ghost.getX() && game.getCellAt(ghost.getX() - 1, ghost.getY()).isEmpty()) {
                ghost.setHorizontalSpeed(-SPEED);
                ghost.setVerticalSpeed(0);
            }
            else if (pacman.getX() > ghost.getX() && game.getCellAt(ghost.getX() + 1, ghost.getY()).isEmpty()) {
                ghost.setHorizontalSpeed(SPEED);
                ghost.setVerticalSpeed(0);
            }
        }
        
    }

}

