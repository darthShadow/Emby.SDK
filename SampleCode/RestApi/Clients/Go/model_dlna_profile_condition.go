/*
 * Emby Server REST API (BETA)
 *
 * Explore the Emby Server API
 *
 * API version: 4.8.0.5
 */
package embyclient-rest-go

type DlnaProfileCondition struct {
	Condition *DlnaProfileConditionType `json:"Condition,omitempty"`
	Property *DlnaProfileConditionValue `json:"Property,omitempty"`
	Value string `json:"Value,omitempty"`
	IsRequired bool `json:"IsRequired,omitempty"`
}