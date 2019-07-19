package com.dsimon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    ArrayList<String> save();
    void read(ArrayList<String> savedValues);
}
