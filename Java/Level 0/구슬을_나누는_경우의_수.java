/*
머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
구슬은 모두 다르게 생겼습니다.
머쓱이가 갖고 있는 구슬의 개수 balls 와
친구들에게 나누어 줄 구슬 개수 share 이 매개변수로 주어질 때,
balls 개의 구슬 중 share 개의 구슬을 고르는
가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
*/
import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        if (balls == share)
            return BigInteger.valueOf(1);

        BigInteger numerator = BigInteger.valueOf(1);
        BigInteger denominator = BigInteger.valueOf(1);
        for (int i = 0; i < share; i++) {
            numerator = numerator.multiply(BigInteger.valueOf(balls - i));
            denominator = denominator.multiply(BigInteger.valueOf(i + 1));
        }
        return numerator.divide(denominator);
    }
}