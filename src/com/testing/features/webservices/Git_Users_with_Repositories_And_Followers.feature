# Author Name: Imran Aslam
# Author Email: imran40@gmail.com

@user_with_followers_repositories
Feature: Testing of the service responsible for searching users from GIT based upon repositories and followers count filters.

 @user_with_followers_repositories_1
  Scenario Outline: Customer searches for users with username <user> who have greater than <repos_count> repositories and have greater than <followers_count> followers
    Given Customer searches for users with username <user> who have "greater" than <repos_count> repositories and have "greater" than <followers_count> followers
    Then  Customer validates users with username <user> who have "greater" than <repos_count> repositories and have "greater" than <followers_count> followers
    Examples:
    | user  | repos_count | followers_count |
    | "tom" | 42           | 1000           |
    #| "bob" | 42           | 1000           |

 @user_with_followers_repositories_2
  Scenario Outline: Customer searches for users with username <user> who have less than <repos_count> repositories and have less than <followers_count> followers
    Given Customer searches for users with username <user> who have "less" than <repos_count> repositories and have "less" than <followers_count> followers
    Then  Customer validates users with username <user> who have "less" than <repos_count> repositories and have "less" than <followers_count> followers
    Examples:
    | user  | repos_count | followers_count |
    | "tom" | 3           | 15              |
    #| "bob" | 3           | 15              |

 @user_with_followers_repositories_3
  Scenario Outline: Customer searches for users with username <user> who have less than <repos_count> repositories and have greater than <followers_count> followers
    Given Customer searches for users with username <user> who have "less" than <repos_count> repositories and have "greater" than <followers_count> followers
    Then  Customer validates users with username <user> who have "less" than <repos_count> repositories and have "greater" than <followers_count> followers
    Examples:
    | user  | repos_count | followers_count |
    | "tom" | 2           | 15           |
    #| "bob" | 2           | 15           |

 @user_with_followers_repositories_4
  Scenario Outline: Customer searches for users with username <user> who have greater than <repos_count> repositories and have less than <followers_count> followers
    Given Customer searches for users with username <user> who have "greater" than <repos_count> repositories and have "less" than <followers_count> followers
    Then  Customer validates users with username <user> who have "greater" than <repos_count> repositories and have "less" than <followers_count> followers
    Examples:
    | user  | repos_count | followers_count |
    | "tom" | 200         | 5               |
    #| "bob" | 200         | 5               |