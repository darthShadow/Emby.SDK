/**
 * Emby Server REST API (BETA)
 * Explore the Emby Server API
 *
 * OpenAPI spec version: 4.8.0.5
 * 
 *
 * NOTE: This class is auto generated.
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class RecommendationType.
* @enum {}
* @readonly
*/
export default class RecommendationType {
        /**
         * value: "SimilarToRecentlyPlayed"
         * @const
         */
        similarToRecentlyPlayed = "SimilarToRecentlyPlayed";

        /**
         * value: "SimilarToLikedItem"
         * @const
         */
        similarToLikedItem = "SimilarToLikedItem";

        /**
         * value: "HasDirectorFromRecentlyPlayed"
         * @const
         */
        hasDirectorFromRecentlyPlayed = "HasDirectorFromRecentlyPlayed";

        /**
         * value: "HasActorFromRecentlyPlayed"
         * @const
         */
        hasActorFromRecentlyPlayed = "HasActorFromRecentlyPlayed";

        /**
         * value: "HasLikedDirector"
         * @const
         */
        hasLikedDirector = "HasLikedDirector";

        /**
         * value: "HasLikedActor"
         * @const
         */
        hasLikedActor = "HasLikedActor";


    /**
    * Returns a <code>RecommendationType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/RecommendationType} The enum <code>RecommendationType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}