//
// GlobalizationCultureDto.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GlobalizationCultureDto: Codable {

    public var name: String?
    public var displayName: String?
    public var twoLetterISOLanguageName: String?
    public var threeLetterISOLanguageName: String?
    public var threeLetterISOLanguageNames: [String]?
    public var twoLetterISOLanguageNames: [String]?

    public init(name: String? = nil, displayName: String? = nil, twoLetterISOLanguageName: String? = nil, threeLetterISOLanguageName: String? = nil, threeLetterISOLanguageNames: [String]? = nil, twoLetterISOLanguageNames: [String]? = nil) {
        self.name = name
        self.displayName = displayName
        self.twoLetterISOLanguageName = twoLetterISOLanguageName
        self.threeLetterISOLanguageName = threeLetterISOLanguageName
        self.threeLetterISOLanguageNames = threeLetterISOLanguageNames
        self.twoLetterISOLanguageNames = twoLetterISOLanguageNames
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case displayName = "DisplayName"
        case twoLetterISOLanguageName = "TwoLetterISOLanguageName"
        case threeLetterISOLanguageName = "ThreeLetterISOLanguageName"
        case threeLetterISOLanguageNames = "ThreeLetterISOLanguageNames"
        case twoLetterISOLanguageNames = "TwoLetterISOLanguageNames"
    }

}