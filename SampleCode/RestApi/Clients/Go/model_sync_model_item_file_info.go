/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SyncModelItemFileInfo struct {
	Type_ *SyncModelItemFileType `json:"Type,omitempty"`
	Name string `json:"Name,omitempty"`
	Path string `json:"Path,omitempty"`
	ImageType *ImageType `json:"ImageType,omitempty"`
	Index int32 `json:"Index,omitempty"`
}