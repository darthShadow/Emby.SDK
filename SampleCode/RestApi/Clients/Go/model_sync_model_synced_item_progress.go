/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type SyncModelSyncedItemProgress struct {
	Progress float64 `json:"Progress,omitempty"`
	Status *SyncModelSyncJobItemStatus `json:"Status,omitempty"`
}