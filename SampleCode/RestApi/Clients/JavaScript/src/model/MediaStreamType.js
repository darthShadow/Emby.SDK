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
* Enum class MediaStreamType.
* @enum {}
* @readonly
*/
export default class MediaStreamType {
        /**
         * value: "Unknown"
         * @const
         */
        unknown = "Unknown";

        /**
         * value: "Audio"
         * @const
         */
        audio = "Audio";

        /**
         * value: "Video"
         * @const
         */
        video = "Video";

        /**
         * value: "Subtitle"
         * @const
         */
        subtitle = "Subtitle";

        /**
         * value: "EmbeddedImage"
         * @const
         */
        embeddedImage = "EmbeddedImage";

        /**
         * value: "Attachment"
         * @const
         */
        attachment = "Attachment";

        /**
         * value: "Data"
         * @const
         */
        data = "Data";


    /**
    * Returns a <code>MediaStreamType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaStreamType} The enum <code>MediaStreamType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}