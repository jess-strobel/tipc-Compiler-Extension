#include "TipArray.h"
#include "TipTypeVisitor.h"

#include <sstream>

TipArray::TipArray(std::shared_ptr<TipType> of)
    : TipCons(std::move(std::vector<std::shared_ptr<TipType>>{of})) {}

std::ostream &TipArray::print(std::ostream &out) const {
  if (arguments.at(0)) {
    out << "[] " << *arguments.at(0);
  } else {
    out << "[]" << " null";
  }

  return out;
}

bool TipArray::operator==(const TipType &other) const {
  auto otherTipArray = dynamic_cast<const TipArray *>(&other);
  if (!otherTipArray) {
    return false;
  }

  return *arguments.at(0) == *(otherTipArray->arguments.at(0));
}

bool TipArray::operator!=(const TipType &other) const {
  return !(*this == other);
}

void TipArray::accept(TipTypeVisitor *visitor) {
  if (visitor->visit(this)) {
    for (auto a : arguments) {
      a->accept(visitor);
    }
  }
  visitor->endVisit(this);
}
