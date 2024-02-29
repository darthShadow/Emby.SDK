// <copyright file="SubtitleServiceApi.cs" company="Emby LLC">
// Emby.ApiClient. Autogenerated Code. No license applied. 
// </copyright>
// <autogenerated />
namespace Emby.ApiClient.Api
{
	using System;
	using System.Collections.Generic;
	using System.Collections.ObjectModel;
	using System.Linq;
    using System.Threading.Tasks;
	using RestSharp;
	using Emby.ApiClient.Client;
	using Emby.ApiClient.Model;

    /// <summary>
    /// Provides a collection of service methods to interact with the API endpoints.
    /// </summary>
    public partial class SubtitleServiceApi : IApiAccessor
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SubtitleServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public SubtitleServiceApi(ApiClient apiClient)
        {
            this.ApiClient = apiClient;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.ApiClient.RestClient.Options.BaseUrl?.ToString();
        }

        /// <summary>Gets the ApiClient object</summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; }

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> DeleteItemsByIdSubtitlesByIndex (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->DeleteItemsByIdSubtitlesByIndex");
            }
            
            var request = new RestRequest("/Items/{Id}/Subtitles/{Index}", Method.Delete);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> DeleteVideosByIdSubtitlesByIndex (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->DeleteVideosByIdSubtitlesByIndex");
            }
            
            var request = new RestRequest("/Videos/{Id}/Subtitles/{Index}", Method.Delete);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'format' is set
            if (format == null)
            {
                throw new ApiException("Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
            {
                throw new ApiException("Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            var request = new RestRequest("/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (format != null)
            {
                request.AddParameter("Format", this.ApiClient.ParameterToString(format), ParameterType.UrlSegment);
            }

            if (startPositionTicks != null)
            {
                request.AddParameter("StartPositionTicks", this.ApiClient.ParameterToString(startPositionTicks), ParameterType.UrlSegment);
            }

            if (endPositionTicks != null)
            {
                request.AddQueryParameter("EndPositionTicks", this.ApiClient.ParameterToString(endPositionTicks));
            }

            if (copyTimestamps != null)
            {
                request.AddQueryParameter("CopyTimestamps", this.ApiClient.ParameterToString(copyTimestamps));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'format' is set
            if (format == null)
            {
                throw new ApiException("Missing required parameter 'format' when calling SubtitleServiceApi->GetItemsByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            var request = new RestRequest("/Items/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (format != null)
            {
                request.AddParameter("Format", this.ApiClient.ParameterToString(format), ParameterType.UrlSegment);
            }

            if (startPositionTicks != null)
            {
                request.AddQueryParameter("StartPositionTicks", this.ApiClient.ParameterToString(startPositionTicks));
            }

            if (endPositionTicks != null)
            {
                request.AddQueryParameter("EndPositionTicks", this.ApiClient.ParameterToString(endPositionTicks));
            }

            if (copyTimestamps != null)
            {
                request.AddQueryParameter("CopyTimestamps", this.ApiClient.ParameterToString(copyTimestamps));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="language">Language</param>
        /// <param name="isPerfectMatch">IsPerfectMatch (optional)</param>
        /// <param name="isForced">IsForced (optional)</param>
        /// <param name="isHearingImpaired">IsHearingImpaired (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;RemoteSubtitleInfo&gt;)</returns>
        public async Task<RestResponse<List<RemoteSubtitleInfo>>> GetItemsByIdRemotesearchSubtitlesByLanguage (string id, string mediaSourceId, string language, bool? isPerfectMatch, bool? isForced, bool? isHearingImpaired)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            }
            
            // verify the required parameter 'language' is set
            if (language == null)
            {
                throw new ApiException("Missing required parameter 'language' when calling SubtitleServiceApi->GetItemsByIdRemotesearchSubtitlesByLanguage");
            }
            
            var request = new RestRequest("/Items/{Id}/RemoteSearch/Subtitles/{Language}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (language != null)
            {
                request.AddParameter("Language", this.ApiClient.ParameterToString(language), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            if (isPerfectMatch != null)
            {
                request.AddQueryParameter("IsPerfectMatch", this.ApiClient.ParameterToString(isPerfectMatch));
            }

            if (isForced != null)
            {
                request.AddQueryParameter("IsForced", this.ApiClient.ParameterToString(isForced));
            }

            if (isHearingImpaired != null)
            {
                request.AddQueryParameter("IsHearingImpaired", this.ApiClient.ParameterToString(isHearingImpaired));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<List<RemoteSubtitleInfo>>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> GetProvidersSubtitlesSubtitlesById (string id)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetProvidersSubtitlesSubtitlesById");
            }
            
            var request = new RestRequest("/Providers/Subtitles/Subtitles/{Id}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'format' is set
            if (format == null)
            {
                throw new ApiException("Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            // verify the required parameter 'startPositionTicks' is set
            if (startPositionTicks == null)
            {
                throw new ApiException("Missing required parameter 'startPositionTicks' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexByStartpositionticksStreamByFormat");
            }
            
            var request = new RestRequest("/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/{StartPositionTicks}/Stream.{Format}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (format != null)
            {
                request.AddParameter("Format", this.ApiClient.ParameterToString(format), ParameterType.UrlSegment);
            }

            if (startPositionTicks != null)
            {
                request.AddParameter("StartPositionTicks", this.ApiClient.ParameterToString(startPositionTicks), ParameterType.UrlSegment);
            }

            if (endPositionTicks != null)
            {
                request.AddQueryParameter("EndPositionTicks", this.ApiClient.ParameterToString(endPositionTicks));
            }

            if (copyTimestamps != null)
            {
                request.AddQueryParameter("CopyTimestamps", this.ApiClient.ParameterToString(copyTimestamps));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Gets subtitles in a specified format.
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <param name="format">Format</param>
        /// <param name="startPositionTicks">StartPositionTicks (optional)</param>
        /// <param name="endPositionTicks">EndPositionTicks (optional)</param>
        /// <param name="copyTimestamps">CopyTimestamps (optional)</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat (string id, string mediaSourceId, int? index, string format, long? startPositionTicks, long? endPositionTicks, bool? copyTimestamps)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            // verify the required parameter 'format' is set
            if (format == null)
            {
                throw new ApiException("Missing required parameter 'format' when calling SubtitleServiceApi->GetVideosByIdByMediasourceidSubtitlesByIndexStreamByFormat");
            }
            
            var request = new RestRequest("/Videos/{Id}/{MediaSourceId}/Subtitles/{Index}/Stream.{Format}", Method.Get);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (format != null)
            {
                request.AddParameter("Format", this.ApiClient.ParameterToString(format), ParameterType.UrlSegment);
            }

            if (startPositionTicks != null)
            {
                request.AddQueryParameter("StartPositionTicks", this.ApiClient.ParameterToString(startPositionTicks));
            }

            if (endPositionTicks != null)
            {
                request.AddQueryParameter("EndPositionTicks", this.ApiClient.ParameterToString(endPositionTicks));
            }

            if (copyTimestamps != null)
            {
                request.AddQueryParameter("CopyTimestamps", this.ApiClient.ParameterToString(copyTimestamps));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="subtitleId">SubtitleId</param>
        /// <returns>Task of ApiResponse (SubtitlesSubtitleDownloadResult)</returns>
        public async Task<RestResponse<SubtitlesSubtitleDownloadResult>> PostItemsByIdRemotesearchSubtitlesBySubtitleid (string id, string mediaSourceId, string subtitleId)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            }
            
            // verify the required parameter 'subtitleId' is set
            if (subtitleId == null)
            {
                throw new ApiException("Missing required parameter 'subtitleId' when calling SubtitleServiceApi->PostItemsByIdRemotesearchSubtitlesBySubtitleid");
            }
            
            var request = new RestRequest("/Items/{Id}/RemoteSearch/Subtitles/{SubtitleId}", Method.Post);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (subtitleId != null)
            {
                request.AddParameter("SubtitleId", this.ApiClient.ParameterToString(subtitleId), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<SubtitlesSubtitleDownloadResult>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> PostItemsByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->PostItemsByIdSubtitlesByIndexDelete");
            }
            
            var request = new RestRequest("/Items/{Id}/Subtitles/{Index}/Delete", Method.Post);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

        /// <summary>
        /// Deletes an external subtitle file
        /// </summary>
        /// <remarks>
        /// Requires authentication as user
        /// </remarks>
        /// <param name="id">Item Id</param>
        /// <param name="mediaSourceId">MediaSourceId</param>
        /// <param name="index">The subtitle stream index</param>
        /// <returns>Task of ApiResponse</returns>
        public async Task<RestResponse<Object>> PostVideosByIdSubtitlesByIndexDelete (string id, string mediaSourceId, int? index)
        {
            // verify the required parameter 'id' is set
            if (id == null)
            {
                throw new ApiException("Missing required parameter 'id' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            }
            
            // verify the required parameter 'mediaSourceId' is set
            if (mediaSourceId == null)
            {
                throw new ApiException("Missing required parameter 'mediaSourceId' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            }
            
            // verify the required parameter 'index' is set
            if (index == null)
            {
                throw new ApiException("Missing required parameter 'index' when calling SubtitleServiceApi->PostVideosByIdSubtitlesByIndexDelete");
            }
            
            var request = new RestRequest("/Videos/{Id}/Subtitles/{Index}/Delete", Method.Post);

            if (id != null)
            {
                request.AddParameter("Id", this.ApiClient.ParameterToString(id), ParameterType.UrlSegment);
            }

            if (index != null)
            {
                request.AddParameter("Index", this.ApiClient.ParameterToString(index), ParameterType.UrlSegment);
            }

            if (mediaSourceId != null)
            {
                request.AddQueryParameter("MediaSourceId", this.ApiClient.ParameterToString(mediaSourceId));
            }

            // make the HTTP request
            var localVarResponse = await this.ApiClient.RestClient.ExecuteAsync<Object>(request).ConfigureAwait(false);
            return localVarResponse;
        }

    }
}