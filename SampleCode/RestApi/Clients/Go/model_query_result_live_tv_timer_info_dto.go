/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type QueryResultLiveTvTimerInfoDto struct {
	Items []LiveTvTimerInfoDto `json:"Items,omitempty"`
	TotalRecordCount int32 `json:"TotalRecordCount,omitempty"`
}