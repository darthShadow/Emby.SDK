/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LocationType string

// List of LocationType
const (
	FILE_SYSTEM_LocationType LocationType = "FileSystem"
	VIRTUAL_LocationType LocationType = "Virtual"
)