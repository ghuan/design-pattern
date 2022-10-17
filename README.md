# java版 设计模式
## 1. 创建型设计模式 Create Patterns
- 1.&nbsp;&nbsp;[简单工厂模式 (Simple Factory Pattern)](src/com/example/create/factory/README.md)
- 2.&nbsp;&nbsp;[工厂方法模式 (Factory Method Pattern)](src/com/example/create/factory/README.md)
- 3.&nbsp;&nbsp;[抽象工厂模式 (Abstract Factory Pattern)](src/com/example/create/factory/README.md)
- 4.&nbsp;&nbsp;[单例模式 (Singleton Pattern)](src/com/example/create/singleton/README.md)
- 5.&nbsp;&nbsp;[原型模式 (Prototype Pattern)](src/com/example/create/prototype/README.md)
- 6.&nbsp;&nbsp;[构建器模式 (Builder Pattern)](src/com/example/create/builder/README.md)
## 2. 结构型设计模式 Structural Patterns
- 7.&nbsp;&nbsp;[外观模式 (Facade Pattern)](src/com/example/structure/facade/README.md)
- 8.&nbsp;&nbsp;[组合模式 (Composite Pattern)](src/com/example/structure/composite/README.md)
- 9.&nbsp;&nbsp;[装饰器模式 (Decorator Pattern)](src/com/example/structure/decorator/README.md)
- 10.[适配器模式 (Adapter Pattern)](src/com/example/structure/adapter/README.md)
- 11.[享元模式 (Flyweight Pattern)](src/com/example/structure/flyweight/README.md)
- 12.[代理模式 (Proxy Pattern)](src/com/example/structure/proxy/README.md)
- 13.[桥接模式 (Bridge Pattern)](src/com/example/structure/bridge/README.md)
## 3. 行为型设计模式 Behavioral Patterns
- 14.[模板方法模式 (Template Method Pattern)](src/com/example/behavior/template/README.md)
- 15.[迭代器模式 (Iterator Pattern)](src/com/example/behavior/iterator/README.md)
- 16.[责任链模式 (Chain of Responsibility Pattern)](src/com/example/behavior/responsibility/README.md)
- 17.[策略模式 (Strategy Pattern)](src/com/example/behavior/strategy/README.md)
- 18.[状态模式 (State Pattern)](src/com/example/behavior/state/README.md)
- 19.[备忘录模式 (Memento Pattern)](src/com/example/behavior/memento/README.md)
- 20.[中介者模式 (Mediator Pattern)](src/com/example/behavior/mediator/README.md)
- 21.[命令模式 (Command Pattern)](src/com/example/behavior/command/README.md)
- 22.[访问者模式 (Visitor Pattern)](src/com/example/behavior/visitor/README.md)
- 23.[观察者模式 (Observer Pattern)](src/com/example/behavior/observer/README.md)
- 24.[解释器模式 (Interpreter Pattern)](src/com/example/behavior/interpreter/README.md)
## 4. J2EE 模式 J2EE Patterns
- 25.MVC 模式（MVC Pattern）
- 26.业务代表模式（Business Delegate Pattern）
- 27.组合实体模式（Composite Entity Pattern）
- 28.数据访问对象模式（Data Access Object Pattern）
- 29.前端控制器模式（Front Controller Pattern）
- 30.拦截过滤器模式（Intercepting Filter Pattern）
- 31.服务定位器模式（Service Locator Pattern）
- 32.传输对象模式（Transfer Object Pattern）
## 5. 设计模式的六大原则
- 1.单一职责原则（Single Responsibility Principle）
一个类只负责一个功能领域中的相应职责，或者可以定义为：就一个类而言，应该只有一个引起它变化的原因。

- 2.开闭原则（Open Close Principle）
一个软件实体应当对扩展开放，对修改关闭。即软件实体应尽量在不修改原有代码的情况下进行扩展
开闭原则的意思是：对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类，后面的具体设计中我们会提到这点。

- 3.里氏替换原则(Liskov Substitution Principle, LSP)
里氏替换原则是面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。LSP 是继承复用的基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的行为。里氏代换原则是对开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。

- 4.依赖倒置原则（Dependence Inversion Principle，DIP）
这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

- 5.接口隔离原则(Interface  Segregation Principle, ISP)
这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。由此可见，其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

- 6.迪米特法则，又称最少知道原则（Demeter Principle）
最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。


