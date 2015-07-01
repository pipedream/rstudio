/*
 * PackagesPrefs.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.prefs.model;

import org.rstudio.studio.client.common.mirrors.model.BioconductorMirror;
import org.rstudio.studio.client.common.mirrors.model.CRANMirror;

import com.google.gwt.core.client.JavaScriptObject;

public class PackagesPrefs extends JavaScriptObject
{
   protected PackagesPrefs() {}

   public static final native PackagesPrefs create(
                                  CRANMirror cranMirror,
                                  boolean useInternet2,
                                  BioconductorMirror bioconductorMirror,
                                  boolean cleanupAfterCheckSuccess,
                                  boolean viewDirAfterCheckFailure,
                                  boolean hideObjectFiles,
                                  boolean useDevtools,
                                  boolean useSecureDownload) /*-{
      var prefs = new Object();
      prefs.cran_mirror = cranMirror;
      prefs.use_internet2 = useInternet2;
      prefs.bioconductor_mirror = bioconductorMirror;
      prefs.cleanup_after_check_success = cleanupAfterCheckSuccess;
      prefs.viewdir_after_check_failure = viewDirAfterCheckFailure;
      prefs.hide_object_files = hideObjectFiles;
      prefs.use_devtools = useDevtools;
      prefs.use_secure_download = useSecureDownload;
      return prefs ;
   }-*/;

   public native final CRANMirror getCRANMirror() /*-{
      return this.cran_mirror;
   }-*/;
   
   public native final boolean getUseInternet2() /*-{
      return this.use_internet2;
   }-*/;
   
   public native final boolean getCleanupAfterCheckSuccess() /*-{
      return this.cleanup_after_check_success;
   }-*/;
   
   public native final boolean getViewDirAfterCheckFailure() /*-{
      return this.viewdir_after_check_failure;
   }-*/;
   
   public native final boolean getHideObjectFiles() /*-{
      return this.hide_object_files;
   }-*/;
   
   public native final BioconductorMirror getBioconductorMirror() /*-{
      return this.bioconductor_mirror;
   }-*/;
   
   public native final boolean getUseDevtools() /*-{
      return this.use_devtools;
   }-*/;
   
   public native final boolean getUseSecureDownload() /*-{
      return this.use_secure_download;
   }-*/;
   
   
}
