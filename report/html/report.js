$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Git_Users_with_Repositories.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author Name: Imran Aslam"
    },
    {
      "line": 2,
      "value": "# Author Email: imran40@gmail.com"
    }
  ],
  "line": 5,
  "name": "Testing of the service responsible for searching users from GIT based upon repositories count filters.",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@user_with_repositories"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Customer searches for users with username \u003cuser\u003e who have greater than \u003crepositories_count\u003e repositories",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-greater-than-\u003crepositories-count\u003e-repositories",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@user_with_repositories_1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Customer searches for users with username \u003cuser\u003e who have \"greater\" than \u003crepositories_count\u003e repositories",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer validates users with username \u003cuser\u003e who have \"greater\" than \u003crepositories_count\u003e repositories",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-greater-than-\u003crepositories-count\u003e-repositories;",
  "rows": [
    {
      "cells": [
        "user",
        "repositories_count"
      ],
      "line": 12,
      "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-greater-than-\u003crepositories-count\u003e-repositories;;1"
    },
    {
      "cells": [
        "\"tom\"",
        "1000"
      ],
      "line": 13,
      "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-greater-than-\u003crepositories-count\u003e-repositories;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Customer searches for users with username \"tom\" who have greater than 1000 repositories",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-greater-than-\u003crepositories-count\u003e-repositories;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@user_with_repositories_1"
    },
    {
      "line": 4,
      "name": "@user_with_repositories"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Customer searches for users with username \"tom\" who have \"greater\" than 1000 repositories",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer validates users with username \"tom\" who have \"greater\" than 1000 repositories",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 43
    },
    {
      "val": "greater",
      "offset": 58
    },
    {
      "val": "1000",
      "offset": 72
    }
  ],
  "location": "GitUsersWithRepositoriesStepDef.customer_searches_for_users_with_username_who_have_than_repositories(String,String,int)"
});
formatter.result({
  "duration": 742150979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 40
    },
    {
      "val": "greater",
      "offset": 55
    },
    {
      "val": "1000",
      "offset": 69
    }
  ],
  "location": "GitUsersWithRepositoriesStepDef.customer_validates_users_with_username_who_have_than_repositories(String,String,int)"
});
formatter.result({
  "duration": 476248402,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 14,
      "value": "#| \"bob\" | 1000               |"
    }
  ],
  "line": 17,
  "name": "Customer searches for users with username \u003cuser\u003e who have less than \u003crepositories_count\u003e repositories",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-less-than-\u003crepositories-count\u003e-repositories",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@user_with_repositories_2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Customer searches for users with username \u003cuser\u003e who have \"less\" than \u003crepositories_count\u003e repositories",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Customer validates users with username \u003cuser\u003e who have \"less\" than \u003crepositories_count\u003e repositories",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-less-than-\u003crepositories-count\u003e-repositories;",
  "rows": [
    {
      "cells": [
        "user",
        "repositories_count"
      ],
      "line": 21,
      "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-less-than-\u003crepositories-count\u003e-repositories;;1"
    },
    {
      "cells": [
        "\"tom\"",
        "15"
      ],
      "line": 22,
      "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-less-than-\u003crepositories-count\u003e-repositories;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Customer searches for users with username \"tom\" who have less than 15 repositories",
  "description": "",
  "id": "testing-of-the-service-responsible-for-searching-users-from-git-based-upon-repositories-count-filters.;customer-searches-for-users-with-username-\u003cuser\u003e-who-have-less-than-\u003crepositories-count\u003e-repositories;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@user_with_repositories_2"
    },
    {
      "line": 4,
      "name": "@user_with_repositories"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Customer searches for users with username \"tom\" who have \"less\" than 15 repositories",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Customer validates users with username \"tom\" who have \"less\" than 15 repositories",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 43
    },
    {
      "val": "less",
      "offset": 58
    },
    {
      "val": "15",
      "offset": 69
    }
  ],
  "location": "GitUsersWithRepositoriesStepDef.customer_searches_for_users_with_username_who_have_than_repositories(String,String,int)"
});
formatter.result({
  "duration": 314127598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 40
    },
    {
      "val": "less",
      "offset": 55
    },
    {
      "val": "15",
      "offset": 66
    }
  ],
  "location": "GitUsersWithRepositoriesStepDef.customer_validates_users_with_username_who_have_than_repositories(String,String,int)"
});
formatter.result({
  "duration": 416018483,
  "status": "passed"
});
});