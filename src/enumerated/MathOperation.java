package enumerated;

public enum MathOperation {

    ADD {
        @Override
        public float calculate(float a, float b) {
            return a + b;
        }
    },

    SUBSTRACT {
        @Override
        public float calculate(float a, float b) {
            return a - b;
        }
    };

    public abstract float calculate(float a, float b);

}
