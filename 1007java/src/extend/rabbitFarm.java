package extend;

/*
public class rabbitFarm <T extends rabbit
> {
*/
public class rabbitFarm <T /*extends rabbit*/> {

    private T aniaml;

    public rabbitFarm() {

    }

    public T getAniaml() {
        return aniaml;
    }

    public void setAniaml(T aniaml) {
        this.aniaml = aniaml;
    }
}
