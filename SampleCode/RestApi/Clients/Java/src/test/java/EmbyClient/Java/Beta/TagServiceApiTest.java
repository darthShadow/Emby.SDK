/*
 * Emby Server REST API (BETA)
 * 
 *
 * API version: 4.8.0.5
 */

package EmbyClient.Java.Beta;

import io.swagger.client.model.NameValuePair;
import io.swagger.client.model.QueryResultUserLibraryTagItem;
import io.swagger.client.model.UserLibraryAddTags;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TagServiceApi
 */
@Ignore
public class TagServiceApiTest {

    private final TagServiceApi api = new TagServiceApi();

    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArtistsPrefixesTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        List<NameValuePair> response = api.getArtistsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAudiocodecsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getAudiocodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContainersTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getContainers(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemsPrefixesTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        List<NameValuePair> response = api.getItemsPrefixes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getItemtypesTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getItemtypes(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getStreamlanguagesTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getStreamlanguages(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSubtitlecodecsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getSubtitlecodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTagsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getTags(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVideocodecsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getVideocodecs(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Gets items based on a query.
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getYearsTest() throws Exception {
        String artistType = null;
        String maxOfficialRating = null;
        Boolean hasThemeSong = null;
        Boolean hasThemeVideo = null;
        Boolean hasSubtitles = null;
        Boolean hasSpecialFeature = null;
        Boolean hasTrailer = null;
        String adjacentTo = null;
        Integer minIndexNumber = null;
        Integer minPlayers = null;
        Integer maxPlayers = null;
        Integer parentIndexNumber = null;
        Boolean hasParentalRating = null;
        Boolean isHD = null;
        String locationTypes = null;
        String excludeLocationTypes = null;
        Boolean isMissing = null;
        Boolean isUnaired = null;
        Double minCommunityRating = null;
        Double minCriticRating = null;
        Integer airedDuringSeason = null;
        String minPremiereDate = null;
        String minDateLastSaved = null;
        String minDateLastSavedForUser = null;
        String maxPremiereDate = null;
        Boolean hasOverview = null;
        Boolean hasImdbId = null;
        Boolean hasTmdbId = null;
        Boolean hasTvdbId = null;
        String excludeItemIds = null;
        Integer startIndex = null;
        Integer limit = null;
        Boolean recursive = null;
        String searchTerm = null;
        String sortOrder = null;
        String parentId = null;
        String fields = null;
        String excludeItemTypes = null;
        String includeItemTypes = null;
        String anyProviderIdEquals = null;
        String filters = null;
        Boolean isFavorite = null;
        Boolean isMovie = null;
        Boolean isSeries = null;
        Boolean isNews = null;
        Boolean isKids = null;
        Boolean isSports = null;
        String mediaTypes = null;
        String imageTypes = null;
        String sortBy = null;
        Boolean isPlayed = null;
        String genres = null;
        String officialRatings = null;
        String tags = null;
        String years = null;
        Boolean enableImages = null;
        Boolean enableUserData = null;
        Integer imageTypeLimit = null;
        String enableImageTypes = null;
        String person = null;
        String personIds = null;
        String personTypes = null;
        String studios = null;
        String studioIds = null;
        String artists = null;
        String artistIds = null;
        String albums = null;
        String ids = null;
        String videoTypes = null;
        String containers = null;
        String audioCodecs = null;
        String videoCodecs = null;
        String subtitleCodecs = null;
        String path = null;
        String userId = null;
        String minOfficialRating = null;
        Boolean isLocked = null;
        Boolean isPlaceHolder = null;
        Boolean hasOfficialRating = null;
        Boolean groupItemsIntoCollections = null;
        Boolean is3D = null;
        String seriesStatus = null;
        String nameStartsWithOrGreater = null;
        String artistStartsWithOrGreater = null;
        String albumArtistStartsWithOrGreater = null;
        String nameStartsWith = null;
        String nameLessThan = null;
        QueryResultUserLibraryTagItem response = api.getYears(artistType, maxOfficialRating, hasThemeSong, hasThemeVideo, hasSubtitles, hasSpecialFeature, hasTrailer, adjacentTo, minIndexNumber, minPlayers, maxPlayers, parentIndexNumber, hasParentalRating, isHD, locationTypes, excludeLocationTypes, isMissing, isUnaired, minCommunityRating, minCriticRating, airedDuringSeason, minPremiereDate, minDateLastSaved, minDateLastSavedForUser, maxPremiereDate, hasOverview, hasImdbId, hasTmdbId, hasTvdbId, excludeItemIds, startIndex, limit, recursive, searchTerm, sortOrder, parentId, fields, excludeItemTypes, includeItemTypes, anyProviderIdEquals, filters, isFavorite, isMovie, isSeries, isNews, isKids, isSports, mediaTypes, imageTypes, sortBy, isPlayed, genres, officialRatings, tags, years, enableImages, enableUserData, imageTypeLimit, enableImageTypes, person, personIds, personTypes, studios, studioIds, artists, artistIds, albums, ids, videoTypes, containers, audioCodecs, videoCodecs, subtitleCodecs, path, userId, minOfficialRating, isLocked, isPlaceHolder, hasOfficialRating, groupItemsIntoCollections, is3D, seriesStatus, nameStartsWithOrGreater, artistStartsWithOrGreater, albumArtistStartsWithOrGreater, nameStartsWith, nameLessThan);

        // TODO: test validations
    }
    /**
     * Adds new tags to an item
     *
     * Requires authentication as user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postItemsByIdTagsAddTest() throws Exception {
        UserLibraryAddTags body = null;
        String id = null;
        api.postItemsByIdTagsAdd(body, id);

        // TODO: test validations
    }
}