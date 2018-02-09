
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
4. Insert the following lines inside the AndroidManifest.xml in `android/app/src/main/AndroidManifest.xml`:
  	```
	  <manifest ....>
	  		.....
			<application ...>
					.....
			        <receiver
						android:name="com.androidbroadcastreceiverforreferrer.ReferrerBroadcastReceiver"
						android:enabled="true"
						android:exported="true">
						<intent-filter>
							<action android:name="com.android.vending.INSTALL_REFERRER"/>
						</intent-filter>
        			</receiver>
   			</application>
      </manifest>
  	```

## Usage
```javascript
import { DeviceEventEmitter } from "react-native";

//Add it in componentWillMount or somewhere where it will get executed at the start of app 
DeviceEventEmitter.addListener('GReferrerBroadcastReceiver', function (map) {
    console.log('Google Broadcast referrer data is: ' + map.referrer;
});;

//Do not forget to remove the listener at componentWillUnmount 
componentWillUnmount() {
    DeviceEventEmitter.removeListener('GReferrerBroadcastReceiver'); 
  }

//You can also get the referrer which is stored in the local variable by
import RNAndroidBroadcastReceiverForReferrer from 'react-native-android-broadcast-receiver-for-referrer'; 

//This will return the referrer value if we have got it other will return "NOT AVAILABLE"
let referrerValue = await RNAndroidBroadcastReceiverForReferrer.getReferrerData();

```
  