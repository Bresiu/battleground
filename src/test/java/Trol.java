/**
 * @author Michal Brewczak
 */
public class Trol {
	public static void main(String[] args) {
		String str = "{\"hasMoreCommand\":false,\"payload\":\"{\\\"deviceStatus\\\":{\\\"androidRestrictions\\\":{\\\"disableCamera\\\":false,\\\"encryptInternalStorage\\\":true},\\\"appCompliance\\\":false,\\\"deviceInfo\\\":{\\\"IMEI\\\":\\\"357558066351574\\\",\\\"MAC\\\":\\\"E8:50:8B:2A:E7:D0\\\",\\\"agentVersion\\\":\\\"1.1.0.1\\\",\\\"apiLevel\\\":\\\"22\\\",\\\"bluetooth\\\":\\\"10:D3:8A:B5:EF:72\\\",\\\"board\\\":\\\"universal7420\\\",\\\"bootloader\\\":\\\"G920FXXU2COH2\\\",\\\"brand\\\":\\\"samsung\\\",\\\"buildID\\\":\\\"LMY47X\\\",\\\"buildType\\\":\\\"user\\\",\\\"deviceName\\\":\\\"Galaxy S6\\\",\\\"edmVersion\\\":\\\"ENTERPRISE_SDK_VERSION_5_4_1\\\",\\\"ekmVersion\\\":\\\"KNOX_ENTERPRISE_SDK_VERSION_2_4_1\\\",\\\"fingerprint\\\":\\\"samsung/zerofltexx/zeroflte:5.1.1/LMY47X/G920FXXU2COH2:user/release-keys\\\",\\\"gdDeviceID\\\":\\\"357558066351574\\\",\\\"gdSdkVerision\\\":\\\"2.0.50\\\",\\\"isELMKeyActivated\\\":true,\\\"isGoodForKnoxEnabled\\\":false,\\\"isJailBroken\\\":false,\\\"isKLMKeyActivated\\\":true,\\\"manufacturer\\\":\\\"samsung\\\",\\\"model\\\":\\\"zerofltexx\\\",\\\"networkOperator\\\":\\\"26006\\\",\\\"os\\\":\\\"Linux\\\",\\\"product\\\":\\\"SM-G920F\\\",\\\"radio\\\":\\\"G920FXXU2COH2\\\",\\\"serialNumber\\\":\\\"R58G3243M9W\\\",\\\"simOperator\\\":\\\"\\\",\\\"supportedActions\\\":[\\\"LOCK\\\",\\\"WIPE\\\",\\\"UNENROLL\\\",\\\"FORCECHECKIN\\\",\\\"CLEAR_PASSWORD\\\"],\\\"version\\\":\\\"5.1.1\\\"},\\\"exchange\\\":[],\\\"installedApps\\\":[{\\\"identifier\\\":\\\"com.good.gcs.g3.enterprise\\\",\\\"installedTime\\\":1443025869540,\\\"isManaged\\\":false,\\\"label\\\":\\\"Good Work\\\",\\\"lastAccessedTime\\\":1443025869540,\\\"size\\\":32311618,\\\"version\\\":\\\"1.5.1.20150922_19\\\"},{\\\"identifier\\\":\\\"pl.bresiu.myapplication\\\",\\\"installedTime\\\":1444731922225,\\\"isManaged\\\":false,\\\"label\\\":\\\"My Application\\\",\\\"lastAccessedTime\\\":1444732144129,\\\"size\\\":1211613,\\\"version\\\":\\\"1.0\\\"}],\\\"knoxRestrictions\\\":{\\\"disableAndroidBeam\\\":false,\\\"disableBluetooth\\\":false,\\\"disableBluetoothTethering\\\":false,\\\"disableCellularData\\\":false,\\\"disableFactoryRest\\\":false,\\\"disableGooglePlay\\\":false,\\\"disableLockScreenShortcuts\\\":false,\\\"disableLockScreenWidgets\\\":false,\\\"disableMMS\\\":false,\\\"disableNFC\\\":false,\\\"disableNativeBrowser\\\":false,\\\"disableNonMarketApp\\\":false,\\\"disableNoticeAndConsentBanner\\\":false,\\\"disableOTAOSUpdate\\\":false,\\\"disableRoamingData\\\":false,\\\"disableRoamingSync\\\":false,\\\"disableRoamingVoiceCall\\\":false,\\\"disableSDCard\\\":false,\\\"disableSMS\\\":false,\\\"disableSVoice\\\":false,\\\"disableScreenCapture\\\":false,\\\"disableUsbDebugging\\\":false,\\\"disableUsbHostStorage\\\":false,\\\"disableUsbMediaPlayer\\\":false,\\\"disableUsbTethering\\\":false,\\\"disableWiFi\\\":false,\\\"disableWiFiAutoConnect\\\":false,\\\"disableWiFiTethering\\\":false,\\\"disableYouTube\\\":false,\\\"enableCommonCriteriaMode\\\":false,\\\"encryptSDCard\\\":false},\\\"securityInfo\\\":{\\\"pwdRestrictions\\\":{\\\"expiration\\\":0,\\\"historyDepth\\\":0,\\\"length\\\":9,\\\"maxFailedAttempts\\\":0,\\\"maxIdleTime\\\":0,\\\"maxSequentialCharacters\\\":0,\\\"minDigits\\\":0,\\\"minLetters\\\":0,\\\"minLowercaseLetters\\\":0,\\\"minMutations\\\":0,\\\"minNonLetters\\\":0,\\\"minSymbols\\\":0,\\\"minUppercaseLetters\\\":0,\\\"quality\\\":\\\"SOMETHING\\\"}},\\\"vpn\\\":[],\\\"wifi\\\":[]}}\",\"type\":\"com.good.mdm.android.device.DeviceStatusCmd\",\"uuid\":\"a6498132-60f7-4e04-883e-0b0ea9943049\"}";
		String str2 = str.replace("\\", "");
		System.out.println(str2);
	}
}
