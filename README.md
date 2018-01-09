
# react-native-android-broadcast-receiver-for-referrer

## Getting started

`$ npm install react-native-android-broadcast-receiver-for-referrer --save`

### Mostly automatic installation

`$ react-native link react-native-android-broadcast-receiver-for-referrer`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.androidbroadcastreceiverforreferrer.RNAndroidBroadcastReceiverForReferrerPackage;` to the imports at the top of the file
  - Add `new RNAndroidBroadcastReceiverForReferrerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-android-broadcast-receiver-for-referrer'
  	project(':react-native-android-broadcast-receiver-for-referrer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-android-broadcast-receiver-for-referrer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-android-broadcast-receiver-for-referrer')
  	```


## Usage
```javascript
import RNAndroidBroadcastReceiverForReferrer from 'react-native-android-broadcast-receiver-for-referrer';

// TODO: What to do with the module?
RNAndroidBroadcastReceiverForReferrer;
```
  