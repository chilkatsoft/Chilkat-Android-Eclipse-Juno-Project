/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkAuthGoogle {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkAuthGoogle(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkAuthGoogle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkAuthGoogle(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkAuthGoogle() {
    this(chilkatJNI.new_CkAuthGoogle(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkAuthGoogle_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthGoogle_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkAuthGoogle_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkAuthGoogle_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkAuthGoogle_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkAuthGoogle_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkAuthGoogle_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkAuthGoogle_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkAuthGoogle_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkAuthGoogle_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkAuthGoogle_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkAuthGoogle_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkAuthGoogle_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkAuthGoogle_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkAuthGoogle_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkAuthGoogle_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkAuthGoogle_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkAuthGoogle_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkAuthGoogle_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkAuthGoogle_SaveLastError(swigCPtr, this, path);
  }

  public void get_AccessToken(CkString str) {
    chilkatJNI.CkAuthGoogle_get_AccessToken(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String accessToken() {
    return chilkatJNI.CkAuthGoogle_accessToken(swigCPtr, this);
  }

  public void put_AccessToken(String newVal) {
    chilkatJNI.CkAuthGoogle_put_AccessToken(swigCPtr, this, newVal);
  }

  public void get_EmailAddress(CkString str) {
    chilkatJNI.CkAuthGoogle_get_EmailAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String emailAddress() {
    return chilkatJNI.CkAuthGoogle_emailAddress(swigCPtr, this);
  }

  public void put_EmailAddress(String newVal) {
    chilkatJNI.CkAuthGoogle_put_EmailAddress(swigCPtr, this, newVal);
  }

  public int get_ExpireNumSeconds() {
    return chilkatJNI.CkAuthGoogle_get_ExpireNumSeconds(swigCPtr, this);
  }

  public void put_ExpireNumSeconds(int newVal) {
    chilkatJNI.CkAuthGoogle_put_ExpireNumSeconds(swigCPtr, this, newVal);
  }

  public void get_JsonKey(CkString str) {
    chilkatJNI.CkAuthGoogle_get_JsonKey(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String jsonKey() {
    return chilkatJNI.CkAuthGoogle_jsonKey(swigCPtr, this);
  }

  public void put_JsonKey(String newVal) {
    chilkatJNI.CkAuthGoogle_put_JsonKey(swigCPtr, this, newVal);
  }

  public int get_NumSecondsRemaining() {
    return chilkatJNI.CkAuthGoogle_get_NumSecondsRemaining(swigCPtr, this);
  }

  public void get_Scope(CkString str) {
    chilkatJNI.CkAuthGoogle_get_Scope(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String scope() {
    return chilkatJNI.CkAuthGoogle_scope(swigCPtr, this);
  }

  public void put_Scope(String newVal) {
    chilkatJNI.CkAuthGoogle_put_Scope(swigCPtr, this, newVal);
  }

  public void get_SubEmailAddress(CkString str) {
    chilkatJNI.CkAuthGoogle_get_SubEmailAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subEmailAddress() {
    return chilkatJNI.CkAuthGoogle_subEmailAddress(swigCPtr, this);
  }

  public void put_SubEmailAddress(String newVal) {
    chilkatJNI.CkAuthGoogle_put_SubEmailAddress(swigCPtr, this, newVal);
  }

  public boolean get_Valid() {
    return chilkatJNI.CkAuthGoogle_get_Valid(swigCPtr, this);
  }

  public CkPfx GetP12() {
    long cPtr = chilkatJNI.CkAuthGoogle_GetP12(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPfx(cPtr, true);
  }

  public boolean ObtainAccessToken(CkSocket connection) {
    return chilkatJNI.CkAuthGoogle_ObtainAccessToken(swigCPtr, this, CkSocket.getCPtr(connection), connection);
  }

  public CkTask ObtainAccessTokenAsync(CkSocket connection) {
    long cPtr = chilkatJNI.CkAuthGoogle_ObtainAccessTokenAsync(swigCPtr, this, CkSocket.getCPtr(connection), connection);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SetP12(CkPfx key) {
    return chilkatJNI.CkAuthGoogle_SetP12(swigCPtr, this, CkPfx.getCPtr(key), key);
  }

}
