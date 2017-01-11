package mementor;

/**
 * Created by sanfen on 2016/12/26.
 *
 * 备忘录模式（Memento）
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象，
 * 个人觉得叫备份模式更形象些，通俗的讲下：假设有原始类A，A中有各种属性，
 * A可以决定需要备份的属性，备忘录类B是用来存储A的一些内部状态，
 * 类C呢，就是一个用来存储备忘录的，且只能存储，不能修改等操作。
 *
 */
public class Main {
    public static void main(String[] args){
        //原始类
        Original original = new Original("egg");

        //备忘录
        Storage storage = new Storage(original.createMemento());


        System.out.println("初始化状态: " + original.getValue());
        original.setValue("niu");

        System.out.println("修改后的状态为: " + original.getValue());

        original.restoreMemento(storage.getMemento());

        System.out.println("恢复后的状态为: " + original.getValue());
    }
}
