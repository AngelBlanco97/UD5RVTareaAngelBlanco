package com.angelblanco.ud5_rvtarea_angelblanco


import android.view.textclassifier.TextLanguage
import com.google.gson.annotations.SerializedName

data class RespuestaJSON(
    @SerializedName("id") val id : Int,
    @SerializedName("node_id") val node_id : String,
    @SerializedName("name") val name : String,
    @SerializedName("full_name") val full_name : String,
    @SerializedName("private") val private : Boolean,
    @SerializedName("owner") val owner : Owner,
    @SerializedName("html_url") val html_url : String,
    @SerializedName("description") val description : String,
    @SerializedName("fork") val fork : Boolean,
    @SerializedName("url") val url : String,
    @SerializedName("forks_url") val forks_url : String,
    @SerializedName("keys_url") val keys_urls_url : String,
    @SerializedName("collaborators_url") val collaborators_url : String,
    @SerializedName("teams_url") val teams_url : String,
    @SerializedName("hooks_url") val hooks_url : String,
    @SerializedName("issue_events_url") val issue_events_url : String,
    @SerializedName("events_url") val events_url : String,
    @SerializedName("assignees_url") val assignees_url : String,
    @SerializedName("branches_url") val branches_url : String,
    @SerializedName("tags_url") val tags_url : String,
    @SerializedName("blobs_url") val blobs_url : String,
    @SerializedName("git_tags_url") val git_tags_url : String,
    @SerializedName("git_refs_url") val git_refs_url : String,
    @SerializedName("trees_url") val trees_url : String,
    @SerializedName("statuses_url") val statuses_url : String,
    @SerializedName("languages_url") val languages_url : String,
    @SerializedName("stargazers_url") val stargazers_url : String,
    @SerializedName("contributors_url") val contributors_url : String,
    @SerializedName("subscribers_url") val subscribers_url : String,
    @SerializedName("subscription_url") val subscription_url : String,
    @SerializedName("commits_url") val commits_url : String,
    @SerializedName("git_commits_url") val git_commits_url : String,
    @SerializedName("comments_url") val comments_url : String,
    @SerializedName("issue_comment_url") val issue_comment_url : String,
    @SerializedName("contents_url") val contents_url : String,
    @SerializedName("compare_url") val compare_url : String,
    @SerializedName("merges_url") val merges_url : String,
    @SerializedName("archive_url") val archive_url : String,
    @SerializedName("downloads_url") val downloads_url : String,
    @SerializedName("issues_url") val issues_url : String,
    @SerializedName("pulls_url") val pulls_url : String,
    @SerializedName("milestones_url") val milestones_url : String,
    @SerializedName("notifications_url") val notifications_url : String,
    @SerializedName("labels_url") val labels_url : String,
    @SerializedName("releases_url") val releases_url : String,
    @SerializedName("deployments_url") val deployments_url : String,
    @SerializedName("language") val language: String,
    @SerializedName("license") val license: License,
    @SerializedName("topics") val topics: List<String>

)
