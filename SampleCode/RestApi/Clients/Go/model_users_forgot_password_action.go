/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type UsersForgotPasswordAction string

// List of Users.ForgotPasswordAction
const (
	CONTACT_ADMIN_UsersForgotPasswordAction UsersForgotPasswordAction = "ContactAdmin"
	PIN_CODE_UsersForgotPasswordAction UsersForgotPasswordAction = "PinCode"
	IN_NETWORK_REQUIRED_UsersForgotPasswordAction UsersForgotPasswordAction = "InNetworkRequired"
)