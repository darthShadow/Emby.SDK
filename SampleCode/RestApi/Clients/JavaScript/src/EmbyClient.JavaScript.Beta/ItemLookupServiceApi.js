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
import ExternalIdInfo from '../model/ExternalIdInfo';
import ProvidersRemoteSearchQueryProvidersAlbumInfo from '../model/ProvidersRemoteSearchQueryProvidersAlbumInfo';
import ProvidersRemoteSearchQueryProvidersArtistInfo from '../model/ProvidersRemoteSearchQueryProvidersArtistInfo';
import ProvidersRemoteSearchQueryProvidersBookInfo from '../model/ProvidersRemoteSearchQueryProvidersBookInfo';
import ProvidersRemoteSearchQueryProvidersGameInfo from '../model/ProvidersRemoteSearchQueryProvidersGameInfo';
import ProvidersRemoteSearchQueryProvidersItemLookupInfo from '../model/ProvidersRemoteSearchQueryProvidersItemLookupInfo';
import ProvidersRemoteSearchQueryProvidersMovieInfo from '../model/ProvidersRemoteSearchQueryProvidersMovieInfo';
import ProvidersRemoteSearchQueryProvidersMusicVideoInfo from '../model/ProvidersRemoteSearchQueryProvidersMusicVideoInfo';
import ProvidersRemoteSearchQueryProvidersPersonLookupInfo from '../model/ProvidersRemoteSearchQueryProvidersPersonLookupInfo';
import ProvidersRemoteSearchQueryProvidersSeriesInfo from '../model/ProvidersRemoteSearchQueryProvidersSeriesInfo';
import ProvidersRemoteSearchQueryProvidersTrailerInfo from '../model/ProvidersRemoteSearchQueryProvidersTrailerInfo';
import RemoteSearchResult from '../model/RemoteSearchResult';

/**
* ItemLookupService service.
* @module EmbyClient.JavaScript.Beta/ItemLookupServiceApi
* @version 4.8.0.5
*/
export default class ItemLookupServiceApi {

    /**
    * Constructs a new ItemLookupServiceApi. 
    * @alias module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the getItemsByIdExternalidinfos operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~getItemsByIdExternalidinfosCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/ExternalIdInfo>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets external id infos for an item
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~getItemsByIdExternalidinfosCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/ExternalIdInfo>}
     */
    getItemsByIdExternalidinfos() {
      let postBody = null;

      let pathParams = {
        'Id': id
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
      let returnType = [ExternalIdInfo];

      return this.apiClient.callApi(
        '/Items/{Id}/ExternalIdInfos', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getItemsRemotesearchImage operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~getItemsRemotesearchImageCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets a remote image
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~getItemsRemotesearchImageCallback} callback The callback function, accepting three arguments: error, data, response
     */
    getItemsRemotesearchImage() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ImageUrl': imageUrl,
        'ProviderName': providerName
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
        '/Items/RemoteSearch/Image', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchApplyById operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchApplyByIdCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Applies search criteria to an item and refreshes metadata
     * Requires authentication as administrator
     * @param {Object} opts Optional parameters
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchApplyByIdCallback} callback The callback function, accepting three arguments: error, data, response
     */
    postItemsRemotesearchApplyById() {
      opts = opts || {};
      let postBody = body;

      let pathParams = {
        'Id': id
      };
      let queryParams = {
        'ReplaceAllImages': opts['replaceAllImages']
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
        '/Items/RemoteSearch/Apply/{Id}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchBook operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchBookCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchBookCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBook() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Book', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchBoxset operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchBoxsetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchBoxsetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchBoxset() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/BoxSet', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchGame operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchGameCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchGameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchGame() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Game', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMovie operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMovieCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMovieCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMovie() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Movie', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicalbum operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicalbumCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicalbumCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicalbum() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicAlbum', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicartist operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicartistCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicartistCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicartist() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicArtist', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchMusicvideo operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicvideoCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchMusicvideoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchMusicvideo() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/MusicVideo', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchPerson operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchPersonCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as administrator
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchPersonCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchPerson() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Person', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchSeries operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchSeriesCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchSeriesCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchSeries() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Series', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the postItemsRemotesearchTrailer operation.
     * @callback module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchTrailerCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/RemoteSearchResult>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Requires authentication as user
     * @param {module:EmbyClient.JavaScript.Beta/ItemLookupServiceApi~postItemsRemotesearchTrailerCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/RemoteSearchResult>}
     */
    postItemsRemotesearchTrailer() {
      let postBody = body;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['apikeyauth', 'embyauth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [RemoteSearchResult];

      return this.apiClient.callApi(
        '/Items/RemoteSearch/Trailer', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}