//
// DisplayPreferences.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct DisplayPreferences: Codable {

    public var _id: String?
    public var viewType: String?
    public var sortBy: String?
    public var indexBy: String?
    public var rememberIndexing: Bool?
    public var primaryImageHeight: Int?
    public var primaryImageWidth: Int?
    public var customPrefs: [String:String]?
    public var scrollDirection: ScrollDirection?
    public var showBackdrop: Bool?
    public var rememberSorting: Bool?
    public var sortOrder: SortOrder?
    public var client: String?

    public init(_id: String? = nil, viewType: String? = nil, sortBy: String? = nil, indexBy: String? = nil, rememberIndexing: Bool? = nil, primaryImageHeight: Int? = nil, primaryImageWidth: Int? = nil, customPrefs: [String:String]? = nil, scrollDirection: ScrollDirection? = nil, showBackdrop: Bool? = nil, rememberSorting: Bool? = nil, sortOrder: SortOrder? = nil, client: String? = nil) {
        self._id = _id
        self.viewType = viewType
        self.sortBy = sortBy
        self.indexBy = indexBy
        self.rememberIndexing = rememberIndexing
        self.primaryImageHeight = primaryImageHeight
        self.primaryImageWidth = primaryImageWidth
        self.customPrefs = customPrefs
        self.scrollDirection = scrollDirection
        self.showBackdrop = showBackdrop
        self.rememberSorting = rememberSorting
        self.sortOrder = sortOrder
        self.client = client
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "Id"
        case viewType = "ViewType"
        case sortBy = "SortBy"
        case indexBy = "IndexBy"
        case rememberIndexing = "RememberIndexing"
        case primaryImageHeight = "PrimaryImageHeight"
        case primaryImageWidth = "PrimaryImageWidth"
        case customPrefs = "CustomPrefs"
        case scrollDirection = "ScrollDirection"
        case showBackdrop = "ShowBackdrop"
        case rememberSorting = "RememberSorting"
        case sortOrder = "SortOrder"
        case client = "Client"
    }

}