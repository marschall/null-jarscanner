package com.github.marschall.nulljarscanner;

import javax.servlet.ServletContext;

import org.apache.tomcat.JarScanFilter;
import org.apache.tomcat.JarScanType;
import org.apache.tomcat.JarScanner;
import org.apache.tomcat.JarScannerCallback;

/**
 * A {@link JarScanner} that does nothing at all.
 */
public class NullJarScanner implements JarScanner {

  @Override
  public void scan(JarScanType scanType, ServletContext context, JarScannerCallback callback) {
    // do nothing
  }

  @Override
  public JarScanFilter getJarScanFilter() {
    return NullJarScanFilter.INSTANCE;
  }

  @Override
  public void setJarScanFilter(JarScanFilter jarScanFilter) {
    // do nothing
  }

  enum NullJarScanFilter implements JarScanFilter {
    INSTANCE;

    @Override
    public boolean check(JarScanType jarScanType, String jarName) {
      return false;
    }
    
  }

}
