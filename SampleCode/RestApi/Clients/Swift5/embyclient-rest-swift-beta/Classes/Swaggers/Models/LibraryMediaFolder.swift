//
// LibraryMediaFolder.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct LibraryMediaFolder: Codable {

    public var name: String?
    public var _id: String?
    public var guid: String?
    public var subFolders: [LibrarySubFolder]?

    public init(name: String? = nil, _id: String? = nil, guid: String? = nil, subFolders: [LibrarySubFolder]? = nil) {
        self.name = name
        self._id = _id
        self.guid = guid
        self.subFolders = subFolders
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case _id = "Id"
        case guid = "Guid"
        case subFolders = "SubFolders"
    }

}