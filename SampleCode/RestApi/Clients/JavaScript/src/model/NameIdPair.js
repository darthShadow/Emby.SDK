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
* The NameIdPair model module.
* @module model/NameIdPair
* @version 4.8.0.5
*/
export default class NameIdPair {
    /**
    * Constructs a new <code>NameIdPair</code>.
    * @alias module:model/NameIdPair
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>NameIdPair</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/NameIdPair} obj Optional instance to populate.
    * @return {module:model/NameIdPair} The populated <code>NameIdPair</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NameIdPair();
                        
            
            if (data.hasOwnProperty('Name')) {
                obj['Name'] = ApiClient.convertToType(data['Name'], 'String');
            }
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} Name
    */
    'Name' = undefined;
    /**
    * @member {String} Id
    */
    'Id' = undefined;




}