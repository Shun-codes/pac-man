/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 shun.lembrez
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.animated;

import fr.univartois.butinfo.r304.pacman.model.IAnimated;
import fr.univartois.butinfo.r304.pacman.model.PacmanGame;
import fr.univartois.butinfo.r304.pacman.view.Sprite;

/**
 * Le type Ghost
 *
 * @author shun.lembrez
 *
 * @version 0.1.0
 */
public class Ghost extends AbstractAnimated{
    
    /**
     * L'attribut color pour les fantômes
     */
    GhostColor color;
    
    /**
     * Crée une nouvelle instance de Ghost.
     * @param game de type {@link PacmanGame}
     * @param xPosition de type {@link Double}
     * @param yPosition de type {@link Double}
     * @param sprite de type {@link Sprite}
     */
    protected Ghost(PacmanGame game, double xPosition, double yPosition, Sprite sprite) {
        super(game, xPosition, yPosition, sprite);
    }


    /**
     * Donne l'attribut color de cette instance de Ghost.
     *
     * @return L'attribut color de cette instance de Ghost.
     */
    public GhostColor getColor() {
        return color;
    }

    
    /**
     * Modifie l'attribut color de cette instance de Ghost.
     *
     * @param color La nouvelle valeur de l'attribut color pour cette instance de Ghost.
     */
    public void setColor(GhostColor color) {
        this.color = color;
    }


    /*
     * (non-Javadoc)
     *
     * @see fr.univartois.butinfo.r304.pacman.model.IAnimated#onCollisionWith(fr.univartois.butinfo.r304.pacman.model.IAnimated)
     */
    @Override
    public void onCollisionWith(IAnimated other) {
        // TODO Auto-generated method stub.   
    }
    
}

