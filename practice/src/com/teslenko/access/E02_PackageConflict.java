package com.teslenko.access;

import java.util.*;
import com.teslenko.access.local.*;

public class E02_PackageConflict {
    public static void main(String[] args) {
//        new Vector();  // conflict
        new java.util.Vector();
        new com.teslenko.access.local.Vector();
    }
}
