package com.scrutinizer.ci.test;

public class Bonkers {
public int mazing(int x, int y, int z) {
  if (x>0) {
    if (y > 0) {
      if (z>0) {
        return x+y+z;
      }
    return y;
    }
    return x;
  }
  return 0;
}
}
