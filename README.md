# utils
This repositary contains most required and useful utils files


### 1. How To use EncryptedSharedPreferences
    implementation 'androidx.security:security-crypto-ktx:1.1.0-alpha03'

        /prefs

        initialize Pref in Application class 
                PrefManager.initPrefs(this)
        PrefManager.prefs.setValue("TEst1", "sss")
        PrefManager.prefs.getStringValue("TEst1")
        PrefManager.prefs.clear()


### 2. How To use PrefManager.java

        PrefManager prefManager = new PrefManager(this);
        
        prefManager.getBoolean("key")
        exist("key")
        putString("key", value)
        
### 2. How To use KeyboardHandler
        KeyboardHandler.hideKeyboard(this);
        KeyboardHandler.showKeyboard(this);

### 3. How To use LocaleHelper
        Useful for multiple language in app ("en", "hi", "mr", "gu", "pa")
        
        For set language hindi automatically hindi will be set
        LocaleHelper.setLocale(this, "hi");
        
        For update textview text startactivity again
        Intent intent = activity.getIntent();
        activity.finish();
        activity.startActivity(intent);
        
        For init hindi when open app again
        @Override
          protected void attachBaseContext(Context newBase) {
              super.attachBaseContext(LocaleHelper.onAttach(newBase));
          }

