package com.getbase.lintparcelableissue;

import android.os.Parcel;

public class ABFBO extends ABFWT {
  public ABFBO(Parcel in) {
    super(in);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
  }

  public static Creator<ABFBO> CREATOR = new Creator<ABFBO>() {
    public ABFBO createFromParcel(Parcel source) {
      return new ABFBO(source);
    }

    public ABFBO[] newArray(int size) {
      return new ABFBO[size];
    }
  };
}
