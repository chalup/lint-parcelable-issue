package com.getbase.lintparcelableissue;

import android.content.Context;
import android.os.Parcel;

public class ROF extends ABFBO {
  public ROF(Parcel in) {
    super(in);
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
  }

  public static Creator<ROF> CREATOR = new Creator<ROF>() {
    public ROF createFromParcel(Parcel source) {
      return new ROF(source);
    }

    public ROF[] newArray(int size) {
      return new ROF[size];
    }
  };

  public String boom(Context context) {
    return context.getString(R.string.used_in_rof);
  }
}
