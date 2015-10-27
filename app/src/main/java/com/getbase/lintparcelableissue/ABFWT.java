package com.getbase.lintparcelableissue;

import android.os.Parcel;

public abstract class ABFWT extends ABFWL {
  public ABFWT(Parcel in) {
    super(in);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
  }
}
