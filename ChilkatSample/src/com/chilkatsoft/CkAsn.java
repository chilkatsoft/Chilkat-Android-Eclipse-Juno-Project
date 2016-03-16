/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkAsn {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkAsn(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkAsn obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkAsn(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkAsn() {
    this(chilkatJNI.new_CkAsn(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkAsn_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkAsn_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkAsn_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkAsn_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkAsn_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkAsn_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkAsn_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkAsn_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkAsn_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkAsn_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkAsn_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkAsn_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkAsn_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkAsn_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkAsn_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkAsn_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkAsn_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkAsn_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkAsn_SaveLastError(swigCPtr, this, path);
  }

  public boolean get_BoolValue() {
    return chilkatJNI.CkAsn_get_BoolValue(swigCPtr, this);
  }

  public void put_BoolValue(boolean newVal) {
    chilkatJNI.CkAsn_put_BoolValue(swigCPtr, this, newVal);
  }

  public boolean get_Constructed() {
    return chilkatJNI.CkAsn_get_Constructed(swigCPtr, this);
  }

  public void get_ContentStr(CkString str) {
    chilkatJNI.CkAsn_get_ContentStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String contentStr() {
    return chilkatJNI.CkAsn_contentStr(swigCPtr, this);
  }

  public void put_ContentStr(String newVal) {
    chilkatJNI.CkAsn_put_ContentStr(swigCPtr, this, newVal);
  }

  public int get_IntValue() {
    return chilkatJNI.CkAsn_get_IntValue(swigCPtr, this);
  }

  public void put_IntValue(int newVal) {
    chilkatJNI.CkAsn_put_IntValue(swigCPtr, this, newVal);
  }

  public int get_NumSubItems() {
    return chilkatJNI.CkAsn_get_NumSubItems(swigCPtr, this);
  }

  public void get_Tag(CkString str) {
    chilkatJNI.CkAsn_get_Tag(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tag() {
    return chilkatJNI.CkAsn_tag(swigCPtr, this);
  }

  public int get_TagValue() {
    return chilkatJNI.CkAsn_get_TagValue(swigCPtr, this);
  }

  public boolean AppendBigInt(String encodedBytes, String encoding) {
    return chilkatJNI.CkAsn_AppendBigInt(swigCPtr, this, encodedBytes, encoding);
  }

  public boolean AppendBits(String encodedBytes, String encoding) {
    return chilkatJNI.CkAsn_AppendBits(swigCPtr, this, encodedBytes, encoding);
  }

  public boolean AppendBool(boolean value) {
    return chilkatJNI.CkAsn_AppendBool(swigCPtr, this, value);
  }

  public boolean AppendContextConstructed(int tag) {
    return chilkatJNI.CkAsn_AppendContextConstructed(swigCPtr, this, tag);
  }

  public boolean AppendContextPrimitive(int tag, String encodedBytes, String encoding) {
    return chilkatJNI.CkAsn_AppendContextPrimitive(swigCPtr, this, tag, encodedBytes, encoding);
  }

  public boolean AppendInt(int value) {
    return chilkatJNI.CkAsn_AppendInt(swigCPtr, this, value);
  }

  public boolean AppendNull() {
    return chilkatJNI.CkAsn_AppendNull(swigCPtr, this);
  }

  public boolean AppendOctets(String encodedBytes, String encoding) {
    return chilkatJNI.CkAsn_AppendOctets(swigCPtr, this, encodedBytes, encoding);
  }

  public boolean AppendOid(String oid) {
    return chilkatJNI.CkAsn_AppendOid(swigCPtr, this, oid);
  }

  public boolean AppendSequence() {
    return chilkatJNI.CkAsn_AppendSequence(swigCPtr, this);
  }

  public boolean AppendSequence2() {
    return chilkatJNI.CkAsn_AppendSequence2(swigCPtr, this);
  }

  public CkAsn AppendSequenceR() {
    long cPtr = chilkatJNI.CkAsn_AppendSequenceR(swigCPtr, this);
    return (cPtr == 0) ? null : new CkAsn(cPtr, true);
  }

  public boolean AppendSet() {
    return chilkatJNI.CkAsn_AppendSet(swigCPtr, this);
  }

  public boolean AppendSet2() {
    return chilkatJNI.CkAsn_AppendSet2(swigCPtr, this);
  }

  public CkAsn AppendSetR() {
    long cPtr = chilkatJNI.CkAsn_AppendSetR(swigCPtr, this);
    return (cPtr == 0) ? null : new CkAsn(cPtr, true);
  }

  public boolean AppendString(String strType, String value) {
    return chilkatJNI.CkAsn_AppendString(swigCPtr, this, strType, value);
  }

  public boolean AppendTime(String timeFormat, String dateTimeStr) {
    return chilkatJNI.CkAsn_AppendTime(swigCPtr, this, timeFormat, dateTimeStr);
  }

  public boolean AsnToXml(CkString outStr) {
    return chilkatJNI.CkAsn_AsnToXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String asnToXml() {
    return chilkatJNI.CkAsn_asnToXml(swigCPtr, this);
  }

  public boolean DeleteSubItem(int index) {
    return chilkatJNI.CkAsn_DeleteSubItem(swigCPtr, this, index);
  }

  public boolean GetBinaryDer(CkByteData outBytes) {
    return chilkatJNI.CkAsn_GetBinaryDer(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetEncodedContent(String encoding, CkString outStr) {
    return chilkatJNI.CkAsn_GetEncodedContent(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedContent(String encoding) {
    return chilkatJNI.CkAsn_getEncodedContent(swigCPtr, this, encoding);
  }

  public String encodedContent(String encoding) {
    return chilkatJNI.CkAsn_encodedContent(swigCPtr, this, encoding);
  }

  public boolean GetEncodedDer(String encoding, CkString outStr) {
    return chilkatJNI.CkAsn_GetEncodedDer(swigCPtr, this, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getEncodedDer(String encoding) {
    return chilkatJNI.CkAsn_getEncodedDer(swigCPtr, this, encoding);
  }

  public String encodedDer(String encoding) {
    return chilkatJNI.CkAsn_encodedDer(swigCPtr, this, encoding);
  }

  public CkAsn GetLastSubItem() {
    long cPtr = chilkatJNI.CkAsn_GetLastSubItem(swigCPtr, this);
    return (cPtr == 0) ? null : new CkAsn(cPtr, true);
  }

  public CkAsn GetSubItem(int index) {
    long cPtr = chilkatJNI.CkAsn_GetSubItem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkAsn(cPtr, true);
  }

  public boolean LoadAsnXml(String xmlStr) {
    return chilkatJNI.CkAsn_LoadAsnXml(swigCPtr, this, xmlStr);
  }

  public boolean LoadBinary(CkByteData derBytes) {
    return chilkatJNI.CkAsn_LoadBinary(swigCPtr, this, CkByteData.getCPtr(derBytes), derBytes);
  }

  public boolean LoadBinaryFile(String path) {
    return chilkatJNI.CkAsn_LoadBinaryFile(swigCPtr, this, path);
  }

  public boolean LoadEncoded(String asnContent, String encoding) {
    return chilkatJNI.CkAsn_LoadEncoded(swigCPtr, this, asnContent, encoding);
  }

  public boolean SetEncodedContent(String encodedBytes, String encoding) {
    return chilkatJNI.CkAsn_SetEncodedContent(swigCPtr, this, encodedBytes, encoding);
  }

  public boolean WriteBinaryDer(String path) {
    return chilkatJNI.CkAsn_WriteBinaryDer(swigCPtr, this, path);
  }

}
