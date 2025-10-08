/**
 * Ce fichier fait partie du projet projet-2025-2026.
 *
 * (c) 2025 simon.cohet
 * Tous droits réservés.
 */

package fr.univartois.butinfo.r304.pacman.model.map;

/**
 * Le type ICardGenerator
 *
 * @author simon.cohet
 *
 * @version 0.1.0
 */
public interface ICardGenerator {

    /**
     * Génère une nouvelle carte de jeu de dimensions données.
     *
     * @param height Le nombre de lignes de cellules.
     * @param width  Le nombre de colonnes de cellules.
     *
     * @return La carte générée.
     */
    GameMap generate(int height, int width);

}
