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
* The ValidatePath model module.
* @module model/ValidatePath
* @version 4.8.0.5
*/
export default class ValidatePath {
    /**
    * Constructs a new <code>ValidatePath</code>.
    * @alias module:model/ValidatePath
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>ValidatePath</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ValidatePath} obj Optional instance to populate.
    * @return {module:model/ValidatePath} The populated <code>ValidatePath</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValidatePath();
                        
            
            if (data.hasOwnProperty('ValidateWriteable')) {
                obj['ValidateWriteable'] = ApiClient.convertToType(data['ValidateWriteable'], 'Boolean');
            }
            if (data.hasOwnProperty('IsFile')) {
                obj['IsFile'] = ApiClient.convertToType(data['IsFile'], 'Boolean');
            }
        }
        return obj;
    }

    /**
    * @member {Boolean} ValidateWriteable
    */
    'ValidateWriteable' = undefined;
    /**
    * @member {Boolean} IsFile
    */
    'IsFile' = undefined;




}