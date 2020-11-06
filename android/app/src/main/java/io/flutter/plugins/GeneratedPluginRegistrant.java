package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
      com.idofilus.audio.AudioPlugin.registerWith(shimPluginRegistry.registrarFor("com.idofilus.audio.AudioPlugin"));
      com.example.flutterpedometer.FlutterPedometerPlugin.registerWith(shimPluginRegistry.registrarFor("com.example.flutterpedometer.FlutterPedometerPlugin"));
      com.flutter_webview_plugin.FlutterWebviewPlugin.registerWith(shimPluginRegistry.registrarFor("com.flutter_webview_plugin.FlutterWebviewPlugin"));
      io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin.registerWith(shimPluginRegistry.registrarFor("io.github.ponnamkarthik.toast.fluttertoast.FluttertoastPlugin"));
      io.flutter.plugins.googlemaps.GoogleMapsPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
      cachet.plugins.pedometer.PedometerPlugin.registerWith(shimPluginRegistry.registrarFor("cachet.plugins.pedometer.PedometerPlugin"));
      com.ly.permission.PermissionPlugin.registerWith(shimPluginRegistry.registrarFor("com.ly.permission.PermissionPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.webviewflutter.WebViewFlutterPlugin());
  }
}
