//
// CommonPluginsIPlugin.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct CommonPluginsIPlugin: Codable {

    public var name: String?
    public var _description: String?
    public var _id: String?
    public var version: Version?
    public var assemblyFilePath: String?
    public var dataFolderPath: String?

    public init(name: String? = nil, _description: String? = nil, _id: String? = nil, version: Version? = nil, assemblyFilePath: String? = nil, dataFolderPath: String? = nil) {
        self.name = name
        self._description = _description
        self._id = _id
        self.version = version
        self.assemblyFilePath = assemblyFilePath
        self.dataFolderPath = dataFolderPath
    }

    public enum CodingKeys: String, CodingKey { 
        case name = "Name"
        case _description = "Description"
        case _id = "Id"
        case version = "Version"
        case assemblyFilePath = "AssemblyFilePath"
        case dataFolderPath = "DataFolderPath"
    }

}