/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 */
package embyclient-rest-go

type EmbyWebGenericUiModelUiTabPageInfo struct {
	PageId string `json:"PageId,omitempty"`
	DisplayName string `json:"DisplayName,omitempty"`
	PluginId string `json:"PluginId,omitempty"`
	Href string `json:"Href,omitempty"`
	NavKey string `json:"NavKey,omitempty"`
	Index int32 `json:"Index,omitempty"`
}