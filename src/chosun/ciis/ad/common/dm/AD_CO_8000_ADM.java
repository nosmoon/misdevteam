/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.common.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_CO_8000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	
	public String InDate;
	public String RcvTelNo;
	public String SndTelNo;
	public String SndMsg;
	public String SysKey;
	

	public AD_CO_8000_ADM(){}
	public AD_CO_8000_ADM(String inDate, String rcvTelNo, String sndTelNo, String sndMsg, String sysKey) {
		super();
		InDate = inDate;
		RcvTelNo = rcvTelNo;
		SndTelNo = sndTelNo;
		SndMsg = sndMsg;
		SysKey = sysKey;
	}	
	

	public String getInDate() {
		return InDate;
	}
	public void setInDate(String inDate) {
		InDate = inDate;
	}
	public String getRcvTelNo() {
		return RcvTelNo;
	}
	public void setRcvTelNo(String rcvTelNo) {
		RcvTelNo = rcvTelNo;
	}
	public String getSndMsg() {
		return SndMsg;
	}
	public void setSndMsg(String sndMsg) {
		SndMsg = sndMsg;
	}
	public String getSndTelNo() {
		return SndTelNo;
	}
	public void setSndTelNo(String sndTelNo) {
		SndTelNo = sndTelNo;
	}
	public String getSysKey() {
		return SysKey;
	}
	public void setSysKey(String sysKey) {
		SysKey = sysKey;
	}
	public String getSQL(){
		 return "";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_CO_8000_ADM dm = (AD_CO_8000_ADM)bdm;
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.common.ds.AD_CO_8000_ADataSet();
	}
	
	public void print(){
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcv_plac = req.getParameter("rcv_plac");
if( rcv_plac == null){
	System.out.println(this.toString+" : rcv_plac is null" );
}else{
	System.out.println(this.toString+" : rcv_plac is "+rcv_plac );
}
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String fax_no = req.getParameter("fax_no");
if( fax_no == null){
	System.out.println(this.toString+" : fax_no is null" );
}else{
	System.out.println(this.toString+" : fax_no is "+fax_no );
}
String send_plac = req.getParameter("send_plac");
if( send_plac == null){
	System.out.println(this.toString+" : send_plac is null" );
}else{
	System.out.println(this.toString+" : send_plac is "+send_plac );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String seq = Util.checkString(req.getParameter("seq"));
String rcv_plac = Util.checkString(req.getParameter("rcv_plac"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String fax_no = Util.checkString(req.getParameter("fax_no"));
String send_plac = Util.checkString(req.getParameter("send_plac"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcv_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("rcv_plac")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String fax_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fax_no")));
String send_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setSeq(seq);
dm.setRcv_plac(rcv_plac);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setTel_no(tel_no);
dm.setFax_no(fax_no);
dm.setSend_plac(send_plac);
dm.setTitl(titl);
dm.setCont(cont);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 14:10:02 KST 2009 */