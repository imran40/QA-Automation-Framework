# Author Name: Imran Aslam
# Author Email: imranaslam0731@gmail.com

@user_with_repositories
Feature: Testing of the service responsible for searching users from GIT based upon repositories count filters.

 @user_with_repositories_1
  Scenario Outline: Customer searches for users with username <user> who have greater than <repositories_count> repositories
    Given Customer searches for users with username <user> who have "greater" than <repositories_count> repositories
    Then  Customer validates users with username <user> who have "greater" than <repositories_count> repositories
    Examples:
    | user  | repositories_count |
    | "tom" | 1000               |
    #| "bob" | 1000               |

 @user_with_repositories_2
  Scenario Outline: Customer searches for users with username <user> who have less than <repositories_count> repositories
    Given Customer searches for users with username <user> who have "less" than <repositories_count> repositories
    Then  Customer validates users with username <user> who have "less" than <repositories_count> repositories
    Examples:
    | user  | repositories_count |
    | "tom" | 15                 |
    #| "bob" | 15                 |