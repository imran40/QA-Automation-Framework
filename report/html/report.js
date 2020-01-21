$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GIT_Sorting_And_Pagination_Testing.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author Name: Imran Aslam"
    },
    {
      "line": 2,
      "value": "# Author Email: imranaslam0731@gmail.com"
    }
  ],
  "line": 5,
  "name": "Testing of the filters for pagination and sorting for GIT search results.",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 4,
      "name": "@pagination"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Customer searches for users with username to test pagination",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-pagination",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@pagination_1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Customer searches for users with username \u003cuser\u003e where there are \u003cperpage\u003e results are returned for page number \u003cpage\u003e with the order as \u003csort\u003e the results are sorted by \u003csortorder\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer validates the items per page to be \u003cperpage\u003e for page number \u003cpage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-pagination;",
  "rows": [
    {
      "cells": [
        "user",
        "perpage",
        "page",
        "sort",
        "sortorder"
      ],
      "line": 12,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-pagination;;1"
    },
    {
      "cells": [
        "\"tom\"",
        "4",
        "1",
        "\"followers\"",
        "\"desc\""
      ],
      "line": 13,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-pagination;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Customer searches for users with username to test pagination",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-pagination;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@pagination_1"
    },
    {
      "line": 4,
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Customer searches for users with username \"tom\" where there are 4 results are returned for page number 1 with the order as \"followers\" the results are sorted by \"desc\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Customer validates the items per page to be 4 for page number 1",
  "matchedColumns": [
    1,
    2
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
      "val": "4",
      "offset": 64
    },
    {
      "val": "1",
      "offset": 103
    },
    {
      "val": "followers",
      "offset": 124
    },
    {
      "val": "desc",
      "offset": 162
    }
  ],
  "location": "GitPaginationStepDef.customer_searches_for_users_with_username_where_there_are_results_are_returned_for_page_number_with_the_order_as_the_results_are_sorted_by(String,int,int,String,String)"
});
formatter.result({
  "duration": 939611600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 44
    },
    {
      "val": "1",
      "offset": 62
    }
  ],
  "location": "GitPaginationStepDef.customer_validates_the_items_per_page_to_be_for_page_number(int,int)"
});
formatter.result({
  "duration": 209900,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 14,
      "value": "#| \"bob\" | 3       | 2   | \"followers\" | \"asc\"      |"
    },
    {
      "line": 15,
      "value": "#| \"bob\" | 2       | 3   | \"followers\" | \"desc\"     |"
    },
    {
      "line": 16,
      "value": "#| \"tom\" | 1       | 4   | \"followers\" | \"asc\"      |"
    }
  ],
  "line": 19,
  "name": "Customer searches for users with username to test the \u003csortorder\u003e",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@pagination_2"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Customer searches for users with username \u003cuser\u003e where there are \u003cperpage\u003e results are returned for page number \u003cpage\u003e with the order as \u003csort\u003e the results are sorted by \u003csortorder\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Customer validates the search results sortorder \u003csortorder\u003e for a given filter \u003csort\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;",
  "rows": [
    {
      "cells": [
        "user",
        "perpage",
        "page",
        "sort",
        "sortorder"
      ],
      "line": 23,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;1"
    },
    {
      "cells": [
        "\"tom\"",
        "5",
        "1",
        "\"followers\"",
        "\"asc\""
      ],
      "line": 24,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Customer searches for users with username to test the \"asc\"",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@pagination_2"
    },
    {
      "line": 4,
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Customer searches for users with username \"tom\" where there are 5 results are returned for page number 1 with the order as \"followers\" the results are sorted by \"asc\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Customer validates the search results sortorder \"asc\" for a given filter \"followers\"",
  "matchedColumns": [
    3,
    4
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
      "val": "5",
      "offset": 64
    },
    {
      "val": "1",
      "offset": 103
    },
    {
      "val": "followers",
      "offset": 124
    },
    {
      "val": "asc",
      "offset": 162
    }
  ],
  "location": "GitPaginationStepDef.customer_searches_for_users_with_username_where_there_are_results_are_returned_for_page_number_with_the_order_as_the_results_are_sorted_by(String,int,int,String,String)"
});
formatter.result({
  "duration": 229676400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asc",
      "offset": 49
    },
    {
      "val": "followers",
      "offset": 74
    }
  ],
  "location": "GitPaginationStepDef.customer_validates_the_search_results_sortorder_for_a_given_filter(String,String)"
});
formatter.result({
  "duration": 456934900,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 25,
      "value": "#| \"tom\" | 5       | 2   | \"followers\" | \"asc\"      |"
    },
    {
      "line": 26,
      "value": "#| \"tom\" | 5       | 3   | \"followers\" | \"asc\"      |"
    },
    {
      "line": 27,
      "value": "#| \"tom\" | 5       | 4   | \"followers\" | \"asc\"      |"
    }
  ],
  "line": 30,
  "name": "Customer searches for users with username to test the \u003csortorder\u003e",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@pagination_3"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Customer searches for users with username \u003cuser\u003e where there are \u003cperpage\u003e results are returned for page number \u003cpage\u003e with the order as \u003csort\u003e the results are sorted by \u003csortorder\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Customer validates the search results sortorder \u003csortorder\u003e for a given filter \u003csort\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;",
  "rows": [
    {
      "cells": [
        "user",
        "perpage",
        "page",
        "sort",
        "sortorder"
      ],
      "line": 34,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;1"
    },
    {
      "cells": [
        "\"tom\"",
        "5",
        "1",
        "\"followers\"",
        "\"desc\""
      ],
      "line": 35,
      "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "Customer searches for users with username to test the \"desc\"",
  "description": "",
  "id": "testing-of-the-filters-for-pagination-and-sorting-for-git-search-results.;customer-searches-for-users-with-username-to-test-the-\u003csortorder\u003e;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 29,
      "name": "@pagination_3"
    },
    {
      "line": 4,
      "name": "@pagination"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "Customer searches for users with username \"tom\" where there are 5 results are returned for page number 1 with the order as \"followers\" the results are sorted by \"desc\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "Customer validates the search results sortorder \"desc\" for a given filter \"followers\"",
  "matchedColumns": [
    3,
    4
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
      "val": "5",
      "offset": 64
    },
    {
      "val": "1",
      "offset": 103
    },
    {
      "val": "followers",
      "offset": 124
    },
    {
      "val": "desc",
      "offset": 162
    }
  ],
  "location": "GitPaginationStepDef.customer_searches_for_users_with_username_where_there_are_results_are_returned_for_page_number_with_the_order_as_the_results_are_sorted_by(String,int,int,String,String)"
});
formatter.result({
  "duration": 192240000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "desc",
      "offset": 49
    },
    {
      "val": "followers",
      "offset": 75
    }
  ],
  "location": "GitPaginationStepDef.customer_validates_the_search_results_sortorder_for_a_given_filter(String,String)"
});
formatter.result({
  "duration": 444616900,
  "status": "passed"
});
});