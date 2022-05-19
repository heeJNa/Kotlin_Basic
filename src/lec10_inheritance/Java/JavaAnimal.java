package lec10_inheritance.Java;
// 추상 클래스
public abstract class JavaAnimal {

    protected final String species; // 종
    protected final int legCount; // 다리 개수

    public JavaAnimal(String species, int legCount) {
        this.species = species;
        this.legCount = legCount;
    }
    // 추상 메소드
    abstract public void move();

    public String getSpecies(){
        return species;
    }

    public int getLegCount() {
        return legCount;
    }
}
