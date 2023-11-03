#include "TipArray.h"
#include "TipTypeVisitor.h"

#include <sstream>

TipArray::TipArray(std::vector<std::shared_ptr<TipType>> args)
    : TipCons(args) {}

std::ostream &TipArray::print(std::ostream &out) const {
  if (arguments.size() == 0) {
    out << "[] " << "\u03B1";
  } else {
    out << "[] " << *arguments.at(0);
  }
  return out;
}

bool TipArray::operator==(const TipType &other) const {
  auto otherTipArray = dynamic_cast<const TipArray *>(&other);
  if (!otherTipArray) {
    return false;
  }

  if (otherTipArray->arguments.size() != arguments.size()) {
    return false;
  }

  if (arguments.size() == 0 && otherTipArray->arguments.size() == 0)
    return true;
  else 
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
