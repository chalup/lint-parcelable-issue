package com.getbase.lintparcelableissue;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class ABF implements Parcelable {
  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
  }

  public ABF(Parcel in) {
  }
}
