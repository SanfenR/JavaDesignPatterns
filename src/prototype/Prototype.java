package prototype;

import java.io.*;

/**
 * Created by sanfen on 2016/12/26.
 *
 * 原型模式（Prototype）
 *
 *
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，
 * 都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 *
 */
public class Prototype implements Cloneable, Serializable{
    private static final long serialVersionUID = 1L;

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }


    /**
     * 深复制
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();


    }
}
