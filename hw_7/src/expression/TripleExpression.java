package expression;

import expression.exceptions.*;

public interface TripleExpression {
    int evaluate(int x, int y, int z) throws CalculationException;
}
