/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type ConnectUserLinkResult struct {
	IsPending bool `json:"IsPending,omitempty"`
	IsNewUserInvitation bool `json:"IsNewUserInvitation,omitempty"`
	GuestDisplayName string `json:"GuestDisplayName,omitempty"`
}