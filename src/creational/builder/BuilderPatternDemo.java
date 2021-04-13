package creational.builder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts
                .Builder(240, 8) // 필수 인자
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();
    }
}
