/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkCert {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkCert(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkCert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkCert(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkCert() {
    this(chilkatJNI.new_CkCert(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkCert_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkCert_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkCert_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkCert_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkCert_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkCert_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkCert_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkCert_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkCert_lastErrorXml(swigCPtr, this);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkCert_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkCert_version(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkCert_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkCert_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkCert_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkCert_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkCert_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkCert_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkCert_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkCert_SaveLastError(swigCPtr, this, path);
  }

  public void get_AuthorityKeyId(CkString str) {
    chilkatJNI.CkCert_get_AuthorityKeyId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String authorityKeyId() {
    return chilkatJNI.CkCert_authorityKeyId(swigCPtr, this);
  }

  public boolean get_AvoidWindowsPkAccess() {
    return chilkatJNI.CkCert_get_AvoidWindowsPkAccess(swigCPtr, this);
  }

  public void put_AvoidWindowsPkAccess(boolean newVal) {
    chilkatJNI.CkCert_put_AvoidWindowsPkAccess(swigCPtr, this, newVal);
  }

  public int get_CertVersion() {
    return chilkatJNI.CkCert_get_CertVersion(swigCPtr, this);
  }

  public void get_CspName(CkString str) {
    chilkatJNI.CkCert_get_CspName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String cspName() {
    return chilkatJNI.CkCert_cspName(swigCPtr, this);
  }

  public boolean get_Expired() {
    return chilkatJNI.CkCert_get_Expired(swigCPtr, this);
  }

  public boolean get_ForClientAuthentication() {
    return chilkatJNI.CkCert_get_ForClientAuthentication(swigCPtr, this);
  }

  public boolean get_ForCodeSigning() {
    return chilkatJNI.CkCert_get_ForCodeSigning(swigCPtr, this);
  }

  public boolean get_ForSecureEmail() {
    return chilkatJNI.CkCert_get_ForSecureEmail(swigCPtr, this);
  }

  public boolean get_ForServerAuthentication() {
    return chilkatJNI.CkCert_get_ForServerAuthentication(swigCPtr, this);
  }

  public boolean get_ForTimeStamping() {
    return chilkatJNI.CkCert_get_ForTimeStamping(swigCPtr, this);
  }

  public boolean get_HasKeyContainer() {
    return chilkatJNI.CkCert_get_HasKeyContainer(swigCPtr, this);
  }

  public long get_IntendedKeyUsage() {
    return chilkatJNI.CkCert_get_IntendedKeyUsage(swigCPtr, this);
  }

  public boolean get_IsRoot() {
    return chilkatJNI.CkCert_get_IsRoot(swigCPtr, this);
  }

  public void get_IssuerC(CkString str) {
    chilkatJNI.CkCert_get_IssuerC(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerC() {
    return chilkatJNI.CkCert_issuerC(swigCPtr, this);
  }

  public void get_IssuerCN(CkString str) {
    chilkatJNI.CkCert_get_IssuerCN(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerCN() {
    return chilkatJNI.CkCert_issuerCN(swigCPtr, this);
  }

  public void get_IssuerDN(CkString str) {
    chilkatJNI.CkCert_get_IssuerDN(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerDN() {
    return chilkatJNI.CkCert_issuerDN(swigCPtr, this);
  }

  public void get_IssuerE(CkString str) {
    chilkatJNI.CkCert_get_IssuerE(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerE() {
    return chilkatJNI.CkCert_issuerE(swigCPtr, this);
  }

  public void get_IssuerL(CkString str) {
    chilkatJNI.CkCert_get_IssuerL(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerL() {
    return chilkatJNI.CkCert_issuerL(swigCPtr, this);
  }

  public void get_IssuerO(CkString str) {
    chilkatJNI.CkCert_get_IssuerO(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerO() {
    return chilkatJNI.CkCert_issuerO(swigCPtr, this);
  }

  public void get_IssuerOU(CkString str) {
    chilkatJNI.CkCert_get_IssuerOU(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerOU() {
    return chilkatJNI.CkCert_issuerOU(swigCPtr, this);
  }

  public void get_IssuerS(CkString str) {
    chilkatJNI.CkCert_get_IssuerS(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String issuerS() {
    return chilkatJNI.CkCert_issuerS(swigCPtr, this);
  }

  public void get_KeyContainerName(CkString str) {
    chilkatJNI.CkCert_get_KeyContainerName(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String keyContainerName() {
    return chilkatJNI.CkCert_keyContainerName(swigCPtr, this);
  }

  public boolean get_MachineKeyset() {
    return chilkatJNI.CkCert_get_MachineKeyset(swigCPtr, this);
  }

  public void get_OcspUrl(CkString str) {
    chilkatJNI.CkCert_get_OcspUrl(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String ocspUrl() {
    return chilkatJNI.CkCert_ocspUrl(swigCPtr, this);
  }

  public boolean get_PrivateKeyExportable() {
    return chilkatJNI.CkCert_get_PrivateKeyExportable(swigCPtr, this);
  }

  public boolean get_Revoked() {
    return chilkatJNI.CkCert_get_Revoked(swigCPtr, this);
  }

  public void get_Rfc822Name(CkString str) {
    chilkatJNI.CkCert_get_Rfc822Name(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String rfc822Name() {
    return chilkatJNI.CkCert_rfc822Name(swigCPtr, this);
  }

  public boolean get_SelfSigned() {
    return chilkatJNI.CkCert_get_SelfSigned(swigCPtr, this);
  }

  public void get_SerialNumber(CkString str) {
    chilkatJNI.CkCert_get_SerialNumber(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String serialNumber() {
    return chilkatJNI.CkCert_serialNumber(swigCPtr, this);
  }

  public void get_Sha1Thumbprint(CkString str) {
    chilkatJNI.CkCert_get_Sha1Thumbprint(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String sha1Thumbprint() {
    return chilkatJNI.CkCert_sha1Thumbprint(swigCPtr, this);
  }

  public boolean get_SignatureVerified() {
    return chilkatJNI.CkCert_get_SignatureVerified(swigCPtr, this);
  }

  public boolean get_Silent() {
    return chilkatJNI.CkCert_get_Silent(swigCPtr, this);
  }

  public void get_SubjectC(CkString str) {
    chilkatJNI.CkCert_get_SubjectC(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectC() {
    return chilkatJNI.CkCert_subjectC(swigCPtr, this);
  }

  public void get_SubjectCN(CkString str) {
    chilkatJNI.CkCert_get_SubjectCN(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectCN() {
    return chilkatJNI.CkCert_subjectCN(swigCPtr, this);
  }

  public void get_SubjectDN(CkString str) {
    chilkatJNI.CkCert_get_SubjectDN(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectDN() {
    return chilkatJNI.CkCert_subjectDN(swigCPtr, this);
  }

  public void get_SubjectE(CkString str) {
    chilkatJNI.CkCert_get_SubjectE(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectE() {
    return chilkatJNI.CkCert_subjectE(swigCPtr, this);
  }

  public void get_SubjectKeyId(CkString str) {
    chilkatJNI.CkCert_get_SubjectKeyId(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectKeyId() {
    return chilkatJNI.CkCert_subjectKeyId(swigCPtr, this);
  }

  public void get_SubjectL(CkString str) {
    chilkatJNI.CkCert_get_SubjectL(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectL() {
    return chilkatJNI.CkCert_subjectL(swigCPtr, this);
  }

  public void get_SubjectO(CkString str) {
    chilkatJNI.CkCert_get_SubjectO(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectO() {
    return chilkatJNI.CkCert_subjectO(swigCPtr, this);
  }

  public void get_SubjectOU(CkString str) {
    chilkatJNI.CkCert_get_SubjectOU(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectOU() {
    return chilkatJNI.CkCert_subjectOU(swigCPtr, this);
  }

  public void get_SubjectS(CkString str) {
    chilkatJNI.CkCert_get_SubjectS(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String subjectS() {
    return chilkatJNI.CkCert_subjectS(swigCPtr, this);
  }

  public boolean get_TrustedRoot() {
    return chilkatJNI.CkCert_get_TrustedRoot(swigCPtr, this);
  }

  public void get_ValidFrom(SYSTEMTIME outSysTime) {
    chilkatJNI.CkCert_get_ValidFrom(swigCPtr, this, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public void get_ValidFromStr(CkString str) {
    chilkatJNI.CkCert_get_ValidFromStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String validFromStr() {
    return chilkatJNI.CkCert_validFromStr(swigCPtr, this);
  }

  public void get_ValidTo(SYSTEMTIME outSysTime) {
    chilkatJNI.CkCert_get_ValidTo(swigCPtr, this, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public void get_ValidToStr(CkString str) {
    chilkatJNI.CkCert_get_ValidToStr(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String validToStr() {
    return chilkatJNI.CkCert_validToStr(swigCPtr, this);
  }

  public int CheckRevoked() {
    return chilkatJNI.CkCert_CheckRevoked(swigCPtr, this);
  }

  public boolean ExportCertDer(CkByteData outData) {
    return chilkatJNI.CkCert_ExportCertDer(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public boolean ExportCertDerFile(String path) {
    return chilkatJNI.CkCert_ExportCertDerFile(swigCPtr, this, path);
  }

  public boolean ExportCertPem(CkString outStr) {
    return chilkatJNI.CkCert_ExportCertPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String exportCertPem() {
    return chilkatJNI.CkCert_exportCertPem(swigCPtr, this);
  }

  public boolean ExportCertPemFile(String path) {
    return chilkatJNI.CkCert_ExportCertPemFile(swigCPtr, this, path);
  }

  public boolean ExportCertXml(CkString outStr) {
    return chilkatJNI.CkCert_ExportCertXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String exportCertXml() {
    return chilkatJNI.CkCert_exportCertXml(swigCPtr, this);
  }

  public CkPrivateKey ExportPrivateKey() {
    long cPtr = chilkatJNI.CkCert_ExportPrivateKey(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPrivateKey(cPtr, true);
  }

  public CkPublicKey ExportPublicKey() {
    long cPtr = chilkatJNI.CkCert_ExportPublicKey(swigCPtr, this);
    return (cPtr == 0) ? null : new CkPublicKey(cPtr, true);
  }

  public boolean ExportToPfxData(String password, boolean includeCertChain, CkByteData outBytes) {
    return chilkatJNI.CkCert_ExportToPfxData(swigCPtr, this, password, includeCertChain, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ExportToPfxFile(String pfxFilename, String password, boolean bIncludeChain) {
    return chilkatJNI.CkCert_ExportToPfxFile(swigCPtr, this, pfxFilename, password, bIncludeChain);
  }

  public CkCert FindIssuer() {
    long cPtr = chilkatJNI.CkCert_FindIssuer(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public CkCertChain GetCertChain() {
    long cPtr = chilkatJNI.CkCert_GetCertChain(swigCPtr, this);
    return (cPtr == 0) ? null : new CkCertChain(cPtr, true);
  }

  public boolean GetEncoded(CkString outStr) {
    return chilkatJNI.CkCert_GetEncoded(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getEncoded() {
    return chilkatJNI.CkCert_getEncoded(swigCPtr, this);
  }

  public String encoded() {
    return chilkatJNI.CkCert_encoded(swigCPtr, this);
  }

  public boolean GetExtensionAsXml(String oid, CkString outStr) {
    return chilkatJNI.CkCert_GetExtensionAsXml(swigCPtr, this, oid, CkString.getCPtr(outStr), outStr);
  }

  public String getExtensionAsXml(String oid) {
    return chilkatJNI.CkCert_getExtensionAsXml(swigCPtr, this, oid);
  }

  public String extensionAsXml(String oid) {
    return chilkatJNI.CkCert_extensionAsXml(swigCPtr, this, oid);
  }

  public boolean GetPrivateKeyPem(CkString outStr) {
    return chilkatJNI.CkCert_GetPrivateKeyPem(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getPrivateKeyPem() {
    return chilkatJNI.CkCert_getPrivateKeyPem(swigCPtr, this);
  }

  public String privateKeyPem() {
    return chilkatJNI.CkCert_privateKeyPem(swigCPtr, this);
  }

  public boolean GetSpkiFingerprint(String hashAlg, String encoding, CkString outStr) {
    return chilkatJNI.CkCert_GetSpkiFingerprint(swigCPtr, this, hashAlg, encoding, CkString.getCPtr(outStr), outStr);
  }

  public String getSpkiFingerprint(String hashAlg, String encoding) {
    return chilkatJNI.CkCert_getSpkiFingerprint(swigCPtr, this, hashAlg, encoding);
  }

  public String spkiFingerprint(String hashAlg, String encoding) {
    return chilkatJNI.CkCert_spkiFingerprint(swigCPtr, this, hashAlg, encoding);
  }

  public CkDateTime GetValidFromDt() {
    long cPtr = chilkatJNI.CkCert_GetValidFromDt(swigCPtr, this);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public CkDateTime GetValidToDt() {
    long cPtr = chilkatJNI.CkCert_GetValidToDt(swigCPtr, this);
    return (cPtr == 0) ? null : new CkDateTime(cPtr, true);
  }

  public boolean HasPrivateKey() {
    return chilkatJNI.CkCert_HasPrivateKey(swigCPtr, this);
  }

  public boolean LoadByCommonName(String cn) {
    return chilkatJNI.CkCert_LoadByCommonName(swigCPtr, this, cn);
  }

  public boolean LoadByEmailAddress(String emailAddress) {
    return chilkatJNI.CkCert_LoadByEmailAddress(swigCPtr, this, emailAddress);
  }

  public boolean LoadByIssuerAndSerialNumber(String issuerCN, String serialNum) {
    return chilkatJNI.CkCert_LoadByIssuerAndSerialNumber(swigCPtr, this, issuerCN, serialNum);
  }

  public boolean LoadFromBase64(String encodedCert) {
    return chilkatJNI.CkCert_LoadFromBase64(swigCPtr, this, encodedCert);
  }

  public boolean LoadFromBinary(CkByteData data) {
    return chilkatJNI.CkCert_LoadFromBinary(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public boolean LoadFromFile(String path) {
    return chilkatJNI.CkCert_LoadFromFile(swigCPtr, this, path);
  }

  public boolean LoadPem(String strPem) {
    return chilkatJNI.CkCert_LoadPem(swigCPtr, this, strPem);
  }

  public boolean LoadPfxData(CkByteData pfxData, String password) {
    return chilkatJNI.CkCert_LoadPfxData(swigCPtr, this, CkByteData.getCPtr(pfxData), pfxData, password);
  }

  public boolean LoadPfxFile(String pfxPath, String password) {
    return chilkatJNI.CkCert_LoadPfxFile(swigCPtr, this, pfxPath, password);
  }

  public boolean LoadTaskResult(CkTask task) {
    return chilkatJNI.CkCert_LoadTaskResult(swigCPtr, this, CkTask.getCPtr(task), task);
  }

  public boolean PemFileToDerFile(String fromPath, String toPath) {
    return chilkatJNI.CkCert_PemFileToDerFile(swigCPtr, this, fromPath, toPath);
  }

  public boolean SaveToFile(String path) {
    return chilkatJNI.CkCert_SaveToFile(swigCPtr, this, path);
  }

  public boolean SetFromEncoded(String encodedCert) {
    return chilkatJNI.CkCert_SetFromEncoded(swigCPtr, this, encodedCert);
  }

  public boolean SetPrivateKey(CkPrivateKey privKey) {
    return chilkatJNI.CkCert_SetPrivateKey(swigCPtr, this, CkPrivateKey.getCPtr(privKey), privKey);
  }

  public boolean SetPrivateKeyPem(String privKeyPem) {
    return chilkatJNI.CkCert_SetPrivateKeyPem(swigCPtr, this, privKeyPem);
  }

  public boolean UseCertVault(CkXmlCertVault vault) {
    return chilkatJNI.CkCert_UseCertVault(swigCPtr, this, CkXmlCertVault.getCPtr(vault), vault);
  }

  public boolean VerifySignature() {
    return chilkatJNI.CkCert_VerifySignature(swigCPtr, this);
  }

}