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
* Enum class SortOrder.
* @enum {}
* @readonly
*/
export default class SortOrder {
        /**
         * value: "Ascending"
         * @const
         */
        ascending = "Ascending";

        /**
         * value: "Descending"
         * @const
         */
        descending = "Descending";


    /**
    * Returns a <code>SortOrder</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/SortOrder} The enum <code>SortOrder</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}