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
import ConfigurationLibraryOptions from './ConfigurationLibraryOptions';

/**
* The LibraryUpdateLibraryOptions model module.
* @module model/LibraryUpdateLibraryOptions
* @version 4.8.0.5
*/
export default class LibraryUpdateLibraryOptions {
    /**
    * Constructs a new <code>LibraryUpdateLibraryOptions</code>.
    * @alias module:model/LibraryUpdateLibraryOptions
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>LibraryUpdateLibraryOptions</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/LibraryUpdateLibraryOptions} obj Optional instance to populate.
    * @return {module:model/LibraryUpdateLibraryOptions} The populated <code>LibraryUpdateLibraryOptions</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LibraryUpdateLibraryOptions();
                        
            
            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('LibraryOptions')) {
                obj['LibraryOptions'] = ConfigurationLibraryOptions.constructFromObject(data['LibraryOptions']);
            }
        }
        return obj;
    }

    /**
    * @member {String} Id
    */
    'Id' = undefined;
    /**
    * @member {module:model/ConfigurationLibraryOptions} LibraryOptions
    */
    'LibraryOptions' = undefined;




}