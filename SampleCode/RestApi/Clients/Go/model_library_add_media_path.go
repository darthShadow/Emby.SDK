/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type LibraryAddMediaPath struct {
	Id string `json:"Id,omitempty"`
	Path string `json:"Path,omitempty"`
	PathInfo *ConfigurationMediaPathInfo `json:"PathInfo,omitempty"`
	RefreshLibrary bool `json:"RefreshLibrary,omitempty"`
}