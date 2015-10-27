package com.getbase.lintparcelableissue;

import android.os.Parcel;

public abstract class ABFWL extends ABF {
  public ABFWL(Parcel in) {
    super(in);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
  }
}
