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
import ImageType from './ImageType';

/**
* The ImageProviderInfo model module.
* @module model/ImageProviderInfo
* @version 4.8.0.5
*/
export default class ImageProviderInfo {
    /**
    * Constructs a new <code>ImageProviderInfo</code>.
    * @alias module:model/ImageProviderInfo
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ImageProviderInfo</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ImageProviderInfo} obj Optional instance to populate.
    * @return {module:model/ImageProviderInfo} The populated <code>ImageProviderInfo</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImageProviderInfo();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('SupportedImages')) {
                obj['SupportedImages'] = ApiClient.convertToType(data['SupportedImages'], [ImageType]);
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {Array.<module:model/ImageType>} SupportedImages
    */
    'SupportedImages' = undefined;




}