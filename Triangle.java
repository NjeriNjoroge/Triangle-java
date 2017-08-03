class Triangle{
  public int mLength;
  public int mHypotenuse;
  public int mBase;

  public Triangle(int length, int hypotenuse, int base){
    mLength = length;
    mHypotenuse = hypotenuse;
    mBase = base;
  }

public boolean checkType(){
  if (mBase == mHypotenuse){
    return true;
  }else if (mBase == mLength){
    return true;
  } else {
    return false;
  }
}
}
