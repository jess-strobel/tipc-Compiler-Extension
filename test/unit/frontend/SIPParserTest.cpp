#include "ExceptionContainsWhat.h"
#include "FrontEnd.h"
#include "ParseError.h"
#include "ParserHelper.h"

#include <catch2/catch_test_macros.hpp>

TEST_CASE("SIP Parser: boolean types", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        x = true;
        y = false;
        return x;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: logical operators", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        z = x and y;
        z = x or y;
        z = not x;
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: relational operators", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        z = x >= y;
        z = x <= y;
        z = x < y;
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: arithmetic operators", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        z = x % y;
        z = -x;
        z = [1, 2];
        x = -z[-5 % 2];
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: ternary operator", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        x = 1;
        y = 2;
        z = (x > y) ? x : y;
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: integrated ops", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var a, b, c, x, y, z;
        x = true;
        y = false;
        z = x and y;
        z = x or y;
        z = not x;
        c = a % b;
        c = -a;
        c = a < b;
        c = a <= b;
        c = a >= b;
        c = (a > b) ? a : b;
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: associativity and precedence", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        z = x < y;
        z = x % y;
        z = y or x;
        z = -y;
        x = false;
        z = (x > y) ? x : y;
        x = not z;
        x = z <= y;
        y = true;
        z = y and x;
        y = z >= x;
        return z;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: boolean types - lexically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  stream << R"(
      short() {
        x = tru;
      }
    )";
  stream2 << R"(
      short() {
        x = fal;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2)));
}

TEST_CASE("SIP Parser: boolean types - syntactically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  stream << R"(
      short() {
        1 = true;
      }
    )";
   stream2 << R"(
      short() {
        7 = false;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2)));
}

TEST_CASE("SIP Parser: logical operators - lexically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"(
      short() {
        var x, y;
        x an y;
        return x;
      }
    )";
  stream2 << R"(
      short() {
        var x, y;
        y orr x;
        return x;
      }
    )";
  stream3 << R"(
      short() {
        var x, y;
        nott x;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
}

TEST_CASE("SIP Parser: logical operators - syntactically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"(
      short() {
        var x, y;
        x and;
        return x;
      }
    )";
  stream2 << R"(
      short() {
        var x, y;
        or x;
        return x;
      }
    )";
  stream3 << R"(
      short() {
        var x, y;
        not x;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
}

TEST_CASE("SIP Parser: relational operators - lexically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"(
      short() {
        var x, y;
        y >>= x;
        return x;
      }
    )";
  stream2 << R"(
      short() {
        var x, y;
        y <== x;
        return x;
      }
    )";
  stream3 << R"(
      short() {
        var x, y;
        x <<< y;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
}

TEST_CASE("SIP Parser: relational operators - syntactically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"(
      short() {
        var x, y;
        >= x;
        return x;
      }
    )";
  stream2 << R"(
      short() {
        var x, y;
        y <=;
        return x;
      }
    )";
  stream3 << R"(
      short() {
        var x, y;
        <;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
}

TEST_CASE("SIP Parser: arithmetic operators - lexically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  stream << R"(
      short() {
        var x, y;
        x %% y;
        return x;
      }
    )";
   stream2 << R"(
      short() {
        var x, y;
        x = -0y;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2)));
}

TEST_CASE("SIP Parser: arithmetic operators - syntactically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  stream << R"(
      short() {
        var x;
        x %;
        return x;
      }
    )";
   stream2 << R"(
      short() {
        var x;
        x = -;
        return x;
      }
    )";

  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2)));
}

TEST_CASE("SIP Parser: ternary operator - lexically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y, z;
        x = 1;
        y = 2;
        z = (x > y) ?? x :::: y;
        return z;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: ternary operator - syntactically incorrect", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
        short() {
        var x, y, z;
        x = 1;
        y = 2;
        z = ? x : y;
        return z;
      }
    )";

  REQUIRE_FALSE(ParserHelper::is_parsable(stream));
}


TEST_CASE("SIP Parser: legal increment/decrement", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        x++;
        y[0]--;
        y[1]++;
        return x;
      }
    )";
  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: increment/decrement with errors", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; x++ return 0; })";
  stream2 << R"( short() { var x, y; ++; return 0; })";
  stream3 << R"( short() { var x, y; 3ae++; return 0; })";
  stream4 << R"( short() { var x, y; *&--; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: illegal increment/decrement", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; x+ +; return 0; })";
  stream2 << R"( short() { var x, y; ++y; return 0; })";
  stream3 << R"( short() { var x, y; if (x++ > y++) {} return 0; })";
  stream4 << R"( short() { var x, y; return x++; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: legal for loop iterator-style", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2, 3];
        for (x: y) { x++; }
        for (x :[3, 4, 5]) { for (x : [1]) {} }
        for (x:[1,2]) {}
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: for loop iterator-style with mismatched/extra parenthesis", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; y = [1, 2, 3]; for x : y)) {} return 0; })";
  stream2 << R"( short() { var x, y; y = [1, 2, 3]; for ((x : [3, 4, 5])) {} return 0; })";
  stream3 << R"( short() { var x, y; y = [1, 2, 3]; for x:[1,2] {} return 0; })";
  stream4 << R"( short() { var x, y; y = [1, 2, 3]; for (x:[1,2]) { return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: for loop iterator-style with lexical errors", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; y = [1, 2, 3]; for (x : 2y) {} return 0; })";
  stream2 << R"( short() { var x, y; y = [1, 2, 3]; for (x : -) {} return 0; })";
  stream3 << R"( short() { var x, y; y = [1, 2, 3]; for ( : *) {} return 0; })";
  stream4 << R"( short() { var x, y; y = [1, 2, 3]; for (x : [1, 2]) { -23 = } return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: legal for loop range-style", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var w, x, y, z;
        for (w : x .. y by z) {}
        for (x : 3 .. 5 by 2) {}
        for (x:2..4) {}
        return 0;
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: for loop range-style with mismatched/extra parenthesis", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"( short() { var w, x, y, z; for w : x .. y by z)) {} return 0; })";
  stream2 << R"( short() { var w, x, y, z; for ((x : 3 .. 5 by 2)) {} return 0; })";
  stream3 << R"( short() { var w, x, y, z; for x: 2 .. 4 {} return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
}

TEST_CASE("SIP Parser: for loop range-style with other lexical errors", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var w, x, y, z; for (w : x .. y b z) {} return 0; })";
  stream2 << R"( short() { var w, x, y, z; fr (w : x .. y by z) {} return 0; })";
  stream3 << R"( short() { var w, x, y, z; for ( : 3 ..  by ) {} return 0; })";
  stream4 << R"( short() { var w, x, y, z; for (x : 2 ... y) {} return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: array [E1, ... En] constructor", "[SIP Parser]") {
  std::stringstream stream;
  stream << R"(
      short() {
        var x, y;
        y = [1, 2*4, 3];
        y = [y, x, [2, 3 % 2, [4]]];
        y = [];
        return [1, y, []];
      }
    )";

  REQUIRE(ParserHelper::is_parsable(stream));
}

TEST_CASE("SIP Parser: array [E1, ... En] constructor with mismatched brackets", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"( short() { var x, y; y = [1, [2, 3]; return 0; })";
  stream2 << R"( short() { var x, y; y = [y, x, -2, 3, 4]]; return 0; })";
  stream3 << R"( short() { var x, y; y = [; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
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
  std::stringstream stream2;
  std::stringstream stream3;
  stream << R"( short() { var x, y; y = [1 of 3 % 9]]]; return 0; })";
  stream2 << R"( short() { var x, y; x = 4; y = [x] of 2; return 0; })";
  stream3 << R"( short() { var x, y; y = [[[5*2 of -3]; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3)));
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

TEST_CASE("SIP Parser: lexical errors for unary prefix length operator #", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; x = ##; return 0; })";
  stream2 << R"( short() { var x, y; x = #; return 0; })";
  stream3 << R"( short() { var x, y; y = # #[; return 0; })";
  stream4 << R"( short() { var x, y; y = []#; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: more lexical errors for unary prefix length operator #", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; x = #2x; return 0; })";
  stream2 << R"( short() { var x, y; x = #[2 * x; return 0; })";
  stream3 << R"( short() { var x, y; y = #[#]; return 0; })";
  stream4 << R"( short() { var x, y; y = []#; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
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
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; y = [1, 2, 3]; x = y[0]]; return 0; })";
  stream2 << R"( short() { var x, y; y = [1, 2, 3]; x = y[y[y0]]]; return 0; })";
  stream3 << R"( short() { var x, y; y = [1, 2, 3]; x = y[-3 * 0; return 0; })";
  stream4 << R"( short() { var x, y; y = [1, 2, 3]; x = y]; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}

TEST_CASE("SIP Parser: lexical error for binary element reference operator", "[SIP Parser]") {
  std::stringstream stream;
  std::stringstream stream2;
  std::stringstream stream3;
  std::stringstream stream4;
  stream << R"( short() { var x, y; y = [1, 2, 3]; x = y[0}; return 0; })";
  stream2 << R"( short() { var x, y; y = [1, 2, 3]; x = y[y[2xy]]; return 0; })";
  stream3 << R"( short() { var x, y; y = [1, 2, 3]; x = y[-]; return 0; })";
  stream4 << R"( short() { var x, y; y = [1, 2, 3]; x = y[ ]; return 0; })";
  REQUIRE_FALSE((ParserHelper::is_parsable(stream) || ParserHelper::is_parsable(stream2) || ParserHelper::is_parsable(stream3) || ParserHelper::is_parsable(stream4)));
}