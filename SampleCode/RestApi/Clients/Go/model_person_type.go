/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type PersonType string

// List of PersonType
const (
	ACTOR_PersonType PersonType = "Actor"
	DIRECTOR_PersonType PersonType = "Director"
	WRITER_PersonType PersonType = "Writer"
	PRODUCER_PersonType PersonType = "Producer"
	GUEST_STAR_PersonType PersonType = "GuestStar"
	COMPOSER_PersonType PersonType = "Composer"
	CONDUCTOR_PersonType PersonType = "Conductor"
	LYRICIST_PersonType PersonType = "Lyricist"
)