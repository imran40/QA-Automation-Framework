# Author Name: Imran Aslam
# Author Email: imranaslam0731@gmail.com

@pagination
Feature: Testing of the filters for pagination and sorting for GIT search results.

 @pagination_1
  Scenario Outline: Customer searches for users with username to test pagination
    Given Customer searches for users with username <user> where there are <perpage> results are returned for page number <page> with the order as <sort> the results are sorted by <sortorder>
    Then Customer validates the items per page to be <perpage> for page number <page>
    Examples:
    | user  | perpage | page | sort       | sortorder  |
    | "tom" | 4       | 1   | "followers" | "desc"     |
    #| "bob" | 3       | 2   | "followers" | "asc"      |
    #| "bob" | 2       | 3   | "followers" | "desc"     |
    #| "tom" | 1       | 4   | "followers" | "asc"      |
    
 @pagination_2
  Scenario Outline: Customer searches for users with username to test the <sortorder>
    Given Customer searches for users with username <user> where there are <perpage> results are returned for page number <page> with the order as <sort> the results are sorted by <sortorder>
    Then Customer validates the search results sortorder <sortorder> for a given filter <sort>
    Examples:
    | user  | perpage | page | sort       | sortorder  |
    | "tom" | 5       | 1   | "followers" | "asc"      |
    #| "tom" | 5       | 2   | "followers" | "asc"      |
    #| "tom" | 5       | 3   | "followers" | "asc"      |
    #| "tom" | 5       | 4   | "followers" | "asc"      |
    
 @pagination_3
  Scenario Outline: Customer searches for users with username to test the <sortorder>
    Given Customer searches for users with username <user> where there are <perpage> results are returned for page number <page> with the order as <sort> the results are sorted by <sortorder>
    Then Customer validates the search results sortorder <sortorder> for a given filter <sort>
    Examples:
    | user  | perpage | page | sort        | sortorder  |
    | "tom" | 5       | 1    | "followers" | "desc"     |
    #| "tom" | 5       | 2    | "followers" | "desc"     |
		#| "tom" | 5       | 3    | "followers" | "desc"     |
		#| "tom" | 5       | 4    | "followers" | "desc"     |
