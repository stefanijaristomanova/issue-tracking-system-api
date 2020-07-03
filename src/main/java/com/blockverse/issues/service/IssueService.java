package com.blockverse.issues.service;

import com.blockverse.issues.dto.Issue;
import com.blockverse.issues.dto.request.AddIssueRequest;

import java.util.List;

public interface IssueService {

    List<Issue> findAllIssues();

    Issue findIssueById(Long id);

    List<Issue> findHistoryByTemplateID(Long templateID);


    Integer findNextVersion(Long templateID);

    Issue addIssue(AddIssueRequest addIssueRequest);


//    List<Issue> findAllLatestTemplatesByTenantIdAndTemplateBlock(Long tenantId, Boolean templateBlock);


    Issue addNewVersionOfIssue(Long templateID, AddIssueRequest addIssueRequest);

    String removeIssue(Long id);


}
