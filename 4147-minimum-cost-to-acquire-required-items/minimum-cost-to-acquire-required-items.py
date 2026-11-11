class Solution:
    def minimumCost(self, cost1: int, cost2: int, costBoth: int, need1: int, need2: int) -> int:
        def calculate_cost(b: int) -> int:
            rem1 = max(0, need1 - b)
            rem2 = max(0, need2 - b)
            return b * costBoth + rem1 * cost1 + rem2 * cost2
        candidate0 = calculate_cost(0)
        candidate1 = calculate_cost(min(need1, need2))
        candidate2 = calculate_cost(max(need1, need2))
        return min(candidate0, candidate1, candidate2)
