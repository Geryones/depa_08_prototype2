package patterns.clone.comparison;


import patterns.clone.comparison.util.SerializableClone;

import java.io.Serializable;

/**
 * Created by Geryones on 06/11/2018.
 */
public class DictionarySerial implements Serializable {

    private String language;
    private final int size;
    private String[] words;

    public DictionarySerial(String language, int size) {
        System.out.println("tada");
        this.language = language;
        this.size = size;
        this.words = new String[size];
        for (int i = 0; i < size; i++)
            this.words[i] = "sample word " + i;
    }

    @Override
    public DictionarySerial clone() {
       return (DictionarySerial) SerializableClone.clone(this);

    }

}
