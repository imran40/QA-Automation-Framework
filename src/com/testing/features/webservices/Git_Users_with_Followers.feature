# Author Name: Imran Aslam
# Author Email: imran40@gmail.com

@user_with_followers
Feature: Testing of the service responsible for searching users from GIT based upon followers count filter

 @user_with_followers_1
  Scenario Outline: Customer searches for users with username <user> who have greater than <followers_count> followers
    Given Customer searches for users with username <user> who have "greater" than <followers_count> followers
    Then  Customer validates users with username <user> who have "greater" than <followers_count> followers
    Examples:
    | user  | followers_count |
    | "tom" | 1000            |
    #| "bob" | 1000            |

 @user_with_followers_2
  Scenario Outline: Customer searches for users with username <user> who have less than <followers_count> followers
    Given Customer searches for users with username <user> who have "less" than <followers_count> followers
    Then  Customer validates users with username <user> who have "less" than <followers_count> followers
    Examples:
    | user  | followers_count |
    | "tom" | 15              |
    #| "bob" | 15              |