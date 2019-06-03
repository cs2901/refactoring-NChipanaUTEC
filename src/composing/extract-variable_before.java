void renderBanner() {
    final boolean index_MAC = (platform.toUpperCase().indexOf("MAC");
    final boolean index_IE =  (browser.toUpperCase().indexOf("IE");
    if ((index_MAC > -1) && (index_IE > -1) &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}