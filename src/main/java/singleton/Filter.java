package singleton;

import java.util.ArrayList;

public class Filter {
  protected int treshold;

  public Filter(int treshold) {
    this.treshold = treshold;
  }

  public ArrayList<Integer> filterOut(ArrayList<Integer> source) {
    Logger logger = Logger.getInstance();
    ArrayList<Integer> result = new ArrayList<>();
    for(int i = 0; i < source.size(); i++) {
      if(source.get(i) >= treshold) {
        logger.log("Элемент \"" + source.get(i) + "\" проходит");
        result.add(source.get(i));
      } else {
        logger.log("Элемент \"" + source.get(i) + "\" не проходит");
      }
    }
    logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
    return result;
  }
}