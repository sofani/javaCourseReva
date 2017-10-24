package interfaces;
  /*
   * A group of related method with empty bodies
   * interface forms a contract b/n outside world and a class and this contract is enforce by a compiler at build time
   * A class that implements an interface class must provide an implementation for every interface method or be an abstract class
   * all methods are public and abstract
   * all variables are static final public 
   * A class that implements an interface must provide an implementation for every interface method or be an abstract class
   * public-facing- interfaces(API) were difficult to update or change
   * 
   * */
public interface Bicycle {
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
