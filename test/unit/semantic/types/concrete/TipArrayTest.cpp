#include "TipArray.h"
#include "TipInt.h"
#include "TipBool.h"
#include "TipRef.h"

#include <catch2/catch_test_macros.hpp>

#include <iostream>
#include <sstream>

TEST_CASE("TipArray: Test getters"
          "[TipArray]") {
  std::shared_ptr<TipType> param = std::make_shared<TipInt>();
  TipArray TipArray(param);
  REQUIRE(1 == TipArray.getArguments().size());
}

TEST_CASE("TipArray: Test equality"
          "[TipArray]") {
  std::shared_ptr<TipType> paramA = std::make_shared<TipInt>();
  
  std::shared_ptr<TipType> paramC = std::make_shared<TipBool>();

  TipArray TipArrayA(paramA);
  TipArray TipArrayC(paramC);

  SECTION("Equal when arguments are of same type") {
    std::shared_ptr<TipType> paramB = std::make_shared<TipInt>();
    TipArray TipArrayB(paramB);
    REQUIRE(TipArrayA == TipArrayB);
  }

  SECTION("Not equal when arguments differ by type") {
    std::shared_ptr<TipType> paramB = std::make_shared<TipInt>();
    TipArray TipArrayB(paramB);
    REQUIRE(TipArrayC != TipArrayB);
  }

  SECTION("Not equal when arguments differ by type") {
    std::shared_ptr<TipType> paramB = std::make_shared<TipRef>(std::make_shared<TipInt>());

    TipArray TipArrayB(paramB);
    REQUIRE(TipArrayA != TipArrayB);
  }
}

TEST_CASE("TipArray: Test output stream"
          "[TipArray]") {
  std::shared_ptr<TipType> param = std::make_shared<TipInt>();
  TipArray TipArray(param);

  auto expectedValue = "[] int";
  std::stringstream stream;
  stream << TipArray;
  std::string actualValue = stream.str();

  REQUIRE(expectedValue == actualValue);
}
