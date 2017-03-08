package com.dspot.declex.ready;

import android.app.Application;

import com.dspot.declex.api.localdb.UseLocalDB;

import org.androidannotations.annotations.EApplication;

@EApplication
@UseLocalDB
public class DeclexApplication extends Application {
}
