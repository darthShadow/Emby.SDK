//
// SyncModelSyncJobCreationResult.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct SyncModelSyncJobCreationResult: Codable {

    public var job: SyncSyncJob?
    public var jobItems: [SyncModelSyncJobItem]?

    public init(job: SyncSyncJob? = nil, jobItems: [SyncModelSyncJobItem]? = nil) {
        self.job = job
        self.jobItems = jobItems
    }

    public enum CodingKeys: String, CodingKey { 
        case job = "Job"
        case jobItems = "JobItems"
    }

}