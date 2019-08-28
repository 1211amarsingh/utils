# utils
This repositary contains most required and useful utils files


### How To use PrefManager

        PrefManager prefManager = new PrefManager(this);
        
        prefManager.getBoolean("key")
        exist("key")
        putString("key", value)
        
### How To use KeyboardHandler
        KeyboardHandler.hideKeyboard(this);
        KeyboardHandler.showKeyboard(this);

### How To use LocaleHelper
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

