/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 UTILISATEUR
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model;


import fr.univartois.butinfo.r304.pacman.model.map.GameMap;
import fr.univartois.butinfo.r304.pacman.model.map.ICardGenerator;

/**
 * Le type Level
 *
 * @author UTILISATEUR
 *
 * @version 0.1.0
 */
public class Level {
    /**
     * L'attribut levelNumber, l'identifiant d'un niveau
     */
    private final int levelNumber;

    /**
     * L'attribut map 
     */
    private final GameMap map;
    
    /**
     * L'attribut card va gérer la carte du jeu
     */
    private ICardGenerator card;
    
    /**
     * Crée une nouvelle instance de Level.
     * @param levelNumber id du niveau
     * @param map La map du niveau
     * @param card La carte du jeu
     */
    public Level (int levelNumber, GameMap map, ICardGenerator card) {
        this.levelNumber = levelNumber;
        this.map = map;
        this.card = card;
    }
    
}

