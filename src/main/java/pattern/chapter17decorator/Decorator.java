package pattern.chapter17decorator;

/**
 * 抽象装饰者
 */
public abstract  class Decorator extends Component{

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
