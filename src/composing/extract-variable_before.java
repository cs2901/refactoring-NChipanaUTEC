void renderBanner() {
    final boolean index_MAC = (platform.toUpperCase().indexOf("MAC") > -1;
    final boolean index_IE =  (browser.toUpperCase().indexOf("IE") > -1;
    if ((index_MAC) && (index_IE) &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}