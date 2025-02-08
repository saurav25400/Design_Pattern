package BuilderDesignPattern.Model;

public interface ICarBuilder {
    public void buildEngine();
    public void buildTyre();
    public void buildBodyShell();
    public void buildHorn();
    public ICar build();
}
