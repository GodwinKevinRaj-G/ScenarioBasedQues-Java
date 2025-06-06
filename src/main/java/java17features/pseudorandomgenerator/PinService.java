package java17features.pseudorandomgenerator;

import java.util.random.RandomGenerator;

 class PinServiceGenerator {
    private static final RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");

    public static String generatePin() {

        return String.format("%08d", rng.nextInt(10000));
    }
}

/**
 * 22 -> OP 0022
 */
public  class PinService
{
    public static void main(String[] args) {
        System.out.println(PinServiceGenerator.generatePin());
    }
}
