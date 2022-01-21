package CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>>{
    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element){
        this.values.add(element);
    }

    public T remove(int index){
        return this.values.remove(index);
    }

    public boolean contains(T element){
        return this.values.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(this.values, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element){
        return (int)this.values.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax(){
        return Collections.max(this.values);
    }

    public T getMin(){
        return Collections.min(this.values);
    }

    public void print(){
        this.values.stream().forEach(System.out::println);
    }

    public T get(int index){
        return this.values.get(index);
    }

    public List<T> getValues() {
        return values;
    }

    public int size(){
        return this.values.size();
    }

}
