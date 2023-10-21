public class AdapterActions extends Actions implements IBed {

    //3 создаем адаптер, расширяющий actions и реализующий интерфейс
    //реализовываем методы интерфейса, которые вызывают методы класса actions
    @Override
    public void sleep() {
        nap();
    }

    @Override
    public void sit() {
        watch_film();
    }

    @Override
    public void rest() {
        meditate();
    }
}
