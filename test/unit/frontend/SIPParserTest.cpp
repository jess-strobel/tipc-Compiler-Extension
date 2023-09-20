#include "ExceptionContainsWhat.h"
#include "FrontEnd.h"
#include "ParseError.h"
#include "ParserHelper.h"

#include <catch2/catch_test_macros.hpp>

TEST_CASE("SIP Parser: legal increment/decrement", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x++;
        x--;
        y++;
        y--;
        return x;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: illegal increment/decrement", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        if (x++ > y++) {}
        return x++;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: legal for loop iterator-style", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        for (x : y) {}
        for (x : [3, 4, 5]) {}
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: for loop iterator-style with mismatched parenthesis", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        for (x : y) {{
        for (x : [3, 4, 5]) {}}
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: legal for loop range-style", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var w, x, y, z;
        for (w : x .. y by z) {}
        for (x : 3 .. 5 by 2) {}
        for (x : 2 .. 4) {}
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: for loop range-style with mismatched parenthesis", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var w, x, y, z;
        for (w : x .. y by z) {{
        for (x : 3 .. 5 by 2) {}}
        for (x : 2 .. 4) {
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: array [E1, ... En] constructor", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2*4, 3];
        y = [y, x, [2, 3 % 2, [4]]];
        y = [];
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: array [E1, ... En] constructor with mismatched brackets", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, [2, 3];
        y = [y, x, -2, 3, 4]];
        y = [;
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: array [E1 of E2] constructor", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x = 4;
        y = [1 of 3 % 9];
        y = [x of 2];
        y = [5*2 of -3];
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: array [E1 of E2] constructor with mismatched brackets", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x = 4;
        y = [1 of 3 % 9]]];
        y = [x] of 2;
        y = [[[5*2 of -3];
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: unary prefix length operator #", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x = [1, 2, 3];
        y = #x;
        y = [#[2, 3], 1 % 9];
        y = [#x of 2];
        y = #[5*#x of -3];
        y = #[];
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: illegal unary prefix length operator #", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x = ##y;
        x = #;
        y = #[#];
        y = []#;
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: binary array element reference operator", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        x = y[0];
        x = y[y[y[0]]];
        x = y[-3 * 0];
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: binary array element reference operator with mismatched brackets", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        x = y[0]];
        x = y[y[y0]]];
        x = y[-3 * 0;
        x = y];
        return 0;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}