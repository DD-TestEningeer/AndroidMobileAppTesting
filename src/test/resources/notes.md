# Appium Setup Guide

## 1. Appium Documentation
- [Official Appium Documentation](https://appium.io/docs/en/2.4/)

## 2. Driver Capabilities
- [UIAutomator2 Driver Capabilities](https://github.com/appium/appium-uiautomator2-driver?#capabilities)

## 3. Gestures Documentation
- [Android Mobile Gestures (UIAutomator2)](https://github.com/appium/appium-uiautomator2-driver/blob/2d02006eaf1e5a62acfbc36a5bc5a9ea271cf7cd/docs/android-mobile-gestures.md)

## 4. Enable Virtualization in Windows 10
- [Virtualization Setup Guide](https://www.simplilearn.com/enable-virtualization-windows-10-article)

---

## Step-by-Step Setup Instructions

### Step 1: Install Node.js
- Download: [https://nodejs.org/en/download](https://nodejs.org/en/download)
- To check if Node.js is installed: `node -v`
- To check npm version: `npm -v`

### Step 2: Install Appium Server
- Install Appium globally: `npm install -g appium`
- Check Appium installation location (Windows): `where appium`
- Uninstall Appium: `npm uninstall -g appium`
- Start Appium server: `appium`
- Stop Appium server: Press `Ctrl + C` in the terminal
- List installed drivers: `appium driver list`
- Install UIAutomator2 driver: `appium driver install uiautomator2`

### Step 3: Install Appium Inspector
- [Appium Inspector GitHub](https://github.com/appium/appium-inspector)

### Step 4: Install Android Studio
- [Download Android Studio](https://developer.android.com/studio)

### Step 5: Java & Android SDK Environment Setup

#### Windows
- Set `ANDROID_HOME` environment variable  
  Example: `C:\Users\YourUser\AppData\Local\Android\Sdk`
- Add to System `PATH`:
  - `%ANDROID_HOME%\platform-tools`
  - `%ANDROID_HOME%\tools`
  - `%ANDROID_HOME%\tools\bin`

#### macOS

##### Set JAVA_HOME
- Edit `.zshrc` and add:


export JAVA\_HOME=\$(/usr/libexec/java\_home)
export PATH="\${JAVA\_HOME}/bin:\${PATH}"


- Apply changes: `source .zshrc`
- Check values: `echo $JAVA_HOME`, `echo $PATH`

##### Set ANDROID_HOME
- Add to `.zshrc`:


export ANDROID\_HOME=\${HOME}/Library/Android/sdk
export PATH="\${ANDROID\_HOME}/platform-tools:\${ANDROID\_HOME}/cmdline-tools:\${PATH}"


- Apply changes: `source .zshrc`
- Check values: `echo $ANDROID_HOME`, `echo $PATH`

---

## APK & AVD Essentials
- **APK**: Android Application Package  
- **AVD**: Android Virtual Device  
- **SDK**: Software Development Kit  
- **ADB**: Android Debug Bridge  
- Check connected devices: `adb devices`

---

## UDID (Unique Device Identifier)
- For iOS Simulators on macOS: `xcrun simctl list`

---

## Installation Issues & Solutions

### Emulator Acceleration
- [Enable Emulator Acceleration](https://developer.android.com/studio/run/emulator-acceleration)

### For AMD Processors
1. Restart PC  
2. Enter BIOS (`F2` during boot)  
3. Enable **SVM Mode**  
4. Set **UMA Frame Buffer Size** to **Auto**  
5. Save & Exit BIOS, then restart

### For Intel Processors
- Install Intel HAXM (Hardware Accelerated Execution Manager)  
- [HAXM Releases](https://github.com/intel/haxm/releases)  
- [HAXM Installation Guide](https://github.com/intel/haxm/wiki/Installation-Instructions-on-Windows)

---

## Performance Parameters
- Appium performance data collection: **Performance Data**

---

## Real Device Setup: Enable USB Debugging on Android

### Steps:
1. Go to **Settings → System → About Phone**  
2. Tap **Build Number** 7–8 times to enable Developer Mode  
3. Go to **Settings → Developer Options → Enable USB Debugging**  
4. Connect device via USB and confirm permissions  
5. Verify connection: `adb devices`

### USB Drivers:
- [Google USB Drivers](https://developer.android.com/studio/run/win-usb)
- [OEM USB Drivers](https://developer.android.com/studio/run/oem-usb.html)

---

# 📱 App Details & Configuration for ApiDemos-debug.apk

---

## 1. APK File Details

- **Package Name:** `io.appium.android.apis`  
- **Activity Name:** `io.appium.android.apis.ApiDemos`

---

## 🛠️ Methods to Find App Package & Activity

### ✅ 1. From an Installed App on Emulator

**Note:** Ensure `ApiDemos-debug.apk` is installed and opened on the emulator.

**Steps:**

1. Open Command Prompt or Android Studio Terminal  
2. Run the following command:  
 `adb shell dumpsys window | findstr mCurrentFocus`

**Example Output:**


mCurrentFocus=Window{... io.appium.android.apis/io.appium.android.apis.ApiDemos}



**Extracted Values:**
- **appPackage:** `io.appium.android.apis`  
- **appActivity:** `io.appium.android.apis.ApiDemos`

---

## ⚙️ Appium Inspector Desired Capabilities

> Replace the app path with your actual local APK file location.


{
  "platformName": "Android",
  "appium:automationName": "UiAutomator2",
  "appium:deviceName": "emulator-5556",
  "appium:app": "C:\\StarAgile\\AndroidMobileTestingNew\\src\\test\\resources\\ApiDemos-debug.apk"
}


