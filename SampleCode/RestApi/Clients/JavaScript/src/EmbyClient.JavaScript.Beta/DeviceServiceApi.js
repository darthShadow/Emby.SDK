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

import ApiClient from "../ApiClient";
import DevicesContentUploadHistory from '../model/DevicesContentUploadHistory';
import DevicesDeviceInfo from '../model/DevicesDeviceInfo';
import DevicesDeviceOptions from '../model/DevicesDeviceOptions';
import QueryResultDevicesDeviceInfo from '../model/QueryResultDevicesDeviceInfo';

/**
* DeviceService service.
* @module EmbyClient.JavaScript.Beta/DeviceServiceApi
* @version 4.8.0.5
*/
export default class DeviceServiceApi {

    /**
    * Constructs a new DeviceServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/DeviceServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the deleteDevices operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~deleteDevicesCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a device
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~deleteDevicesCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deleteDevices() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Devices', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDevices operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesCallback
     * @param {String} error Error message, if any.
     * @param {module:model/QueryResultDevicesDeviceInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets all devices
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/QueryResultDevicesDeviceInfo}
     */
    getDevices() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = QueryResultDevicesDeviceInfo;

      return this.apiClient.callApi(
        '/Devices', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDevicesCamerauploads operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesCamerauploadsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DevicesContentUploadHistory} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets camera upload history for a device
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesCamerauploadsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DevicesContentUploadHistory}
     */
    getDevicesCamerauploads() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = DevicesContentUploadHistory;

      return this.apiClient.callApi(
        '/Devices/CameraUploads', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDevicesInfo operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesInfoCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DevicesDeviceInfo} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets info for a device
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DevicesDeviceInfo}
     */
    getDevicesInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = DevicesDeviceInfo;

      return this.apiClient.callApi(
        '/Devices/Info', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getDevicesOptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesOptionsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/DevicesDeviceOptions} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets options for a device
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~getDevicesOptionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/DevicesDeviceOptions}
     */
    getDevicesOptions() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = DevicesDeviceOptions;

      return this.apiClient.callApi(
        '/Devices/Options', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDevicesCamerauploads operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesCamerauploadsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Uploads content
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesCamerauploadsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDevicesCamerauploads() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Album': album,
        'Name': name,
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Devices/CameraUploads', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDevicesDelete operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesDeleteCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a device
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesDeleteCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDevicesDelete() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Devices/Delete', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postDevicesOptions operation.
     * @callback module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesOptionsCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates device options
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/DeviceServiceApi~postDevicesOptionsCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postDevicesOptions() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
        'Id': id
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/Devices/Options', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}