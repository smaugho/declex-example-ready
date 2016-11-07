package com.dspot.declex.ready;

import android.app.Application;

import com.dspot.declex.api.localdb.UseLocalDB;

import org.androidannotations.annotations.EApplication;

/**
 * Created by Adrian on 07.11.2016.
 */

@EApplication
@UseLocalDB
public class DeclexApplication extends Application {
}
