/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.lnk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.ds.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_2065_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String filenm;
	public String record_clsf;
	public String seq;
	public String organcode;
	public String aplc_dt;
	public String aplc_clsf;
	public String pymt_cd;
	public String bankcode;
	public String bankaccount;
	public String bankaccountidentity;
	public String category;
	public String paytype;
	public String ret_clsf;
	public String ret_cd;
	public String validclsf;
	public String telno;
	public String chnl;
	public String infodata;
	public String incmg_pers_addr;
	public String incmg_pers;

	public TN_LNK_2065_ADM(){}
	public TN_LNK_2065_ADM(String cmpy_cd, String filenm, String record_clsf, String seq, String organcode, String aplc_dt, String aplc_clsf, String pymt_cd, String bankcode, String bankaccount, String bankaccountidentity, String category, String paytype, String ret_clsf, String ret_cd, String validclsf, String telno, String chnl, String infodata, String incmg_pers_addr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.filenm = filenm;
		this.record_clsf = record_clsf;
		this.seq = seq;
		this.organcode = organcode;
		this.aplc_dt = aplc_dt;
		this.aplc_clsf = aplc_clsf;
		this.pymt_cd = pymt_cd;
		this.bankcode = bankcode;
		this.bankaccount = bankaccount;
		this.bankaccountidentity = bankaccountidentity;
		this.category = category;
		this.paytype = paytype;
		this.ret_clsf = ret_clsf;
		this.ret_cd = ret_cd;
		this.validclsf = validclsf;
		this.telno = telno;
		this.chnl = chnl;
		this.infodata = infodata;
		this.incmg_pers_addr = incmg_pers_addr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setRecord_clsf(String record_clsf){
		this.record_clsf = record_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOrgancode(String organcode){
		this.organcode = organcode;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setPymt_cd(String pymt_cd){
		this.pymt_cd = pymt_cd;
	}

	public void setBankcode(String bankcode){
		this.bankcode = bankcode;
	}

	public void setBankaccount(String bankaccount){
		this.bankaccount = bankaccount;
	}

	public void setBankaccountidentity(String bankaccountidentity){
		this.bankaccountidentity = bankaccountidentity;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public void setPaytype(String paytype){
		this.paytype = paytype;
	}

	public void setRet_clsf(String ret_clsf){
		this.ret_clsf = ret_clsf;
	}

	public void setRet_cd(String ret_cd){
		this.ret_cd = ret_cd;
	}

	public void setValidclsf(String validclsf){
		this.validclsf = validclsf;
	}

	public void setTelno(String telno){
		this.telno = telno;
	}

	public void setChnl(String chnl){
		this.chnl = chnl;
	}

	public void setInfodata(String infodata){
		this.infodata = infodata;
	}

	public void setIncmg_pers_addr(String incmg_pers_addr){
		this.incmg_pers_addr = incmg_pers_addr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getRecord_clsf(){
		return this.record_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOrgancode(){
		return this.organcode;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getPymt_cd(){
		return this.pymt_cd;
	}

	public String getBankcode(){
		return this.bankcode;
	}

	public String getBankaccount(){
		return this.bankaccount;
	}

	public String getBankaccountidentity(){
		return this.bankaccountidentity;
	}

	public String getCategory(){
		return this.category;
	}

	public String getPaytype(){
		return this.paytype;
	}

	public String getRet_clsf(){
		return this.ret_clsf;
	}

	public String getRet_cd(){
		return this.ret_cd;
	}

	public String getValidclsf(){
		return this.validclsf;
	}

	public String getTelno(){
		return this.telno;
	}

	public String getChnl(){
		return this.chnl;
	}

	public String getInfodata(){
		return this.infodata;
	}

	public String getIncmg_pers_addr(){
		return this.incmg_pers_addr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_LNK_2065_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_LNK_2065_ADM dm = (TN_LNK_2065_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.filenm);
		cstmt.setString(5, dm.record_clsf);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.organcode);
		cstmt.setString(8, dm.aplc_dt);
		cstmt.setString(9, dm.aplc_clsf);
		cstmt.setString(10, dm.pymt_cd);
		cstmt.setString(11, dm.bankcode);
		cstmt.setString(12, dm.bankaccount);
		cstmt.setString(13, dm.bankaccountidentity);
		cstmt.setString(14, dm.category);
		cstmt.setString(15, dm.paytype);
		cstmt.setString(16, dm.ret_clsf);
		cstmt.setString(17, dm.ret_cd);
		cstmt.setString(18, dm.validclsf);
		cstmt.setString(19, dm.telno);
		cstmt.setString(20, dm.chnl);
		cstmt.setString(21, dm.infodata);
		cstmt.setString(22, dm.incmg_pers_addr);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.lnk.ds.TN_LNK_2065_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("filenm = [" + getFilenm() + "]");
		System.out.println("record_clsf = [" + getRecord_clsf() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("organcode = [" + getOrgancode() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("pymt_cd = [" + getPymt_cd() + "]");
		System.out.println("bankcode = [" + getBankcode() + "]");
		System.out.println("bankaccount = [" + getBankaccount() + "]");
		System.out.println("bankaccountidentity = [" + getBankaccountidentity() + "]");
		System.out.println("category = [" + getCategory() + "]");
		System.out.println("paytype = [" + getPaytype() + "]");
		System.out.println("ret_clsf = [" + getRet_clsf() + "]");
		System.out.println("ret_cd = [" + getRet_cd() + "]");
		System.out.println("validclsf = [" + getValidclsf() + "]");
		System.out.println("telno = [" + getTelno() + "]");
		System.out.println("chnl = [" + getChnl() + "]");
		System.out.println("infodata = [" + getInfodata() + "]");
		System.out.println("incmg_pers_addr = [" + getIncmg_pers_addr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String record_clsf = req.getParameter("record_clsf");
if( record_clsf == null){
	System.out.println(this.toString+" : record_clsf is null" );
}else{
	System.out.println(this.toString+" : record_clsf is "+record_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String organcode = req.getParameter("organcode");
if( organcode == null){
	System.out.println(this.toString+" : organcode is null" );
}else{
	System.out.println(this.toString+" : organcode is "+organcode );
}
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String pymt_cd = req.getParameter("pymt_cd");
if( pymt_cd == null){
	System.out.println(this.toString+" : pymt_cd is null" );
}else{
	System.out.println(this.toString+" : pymt_cd is "+pymt_cd );
}
String bankcode = req.getParameter("bankcode");
if( bankcode == null){
	System.out.println(this.toString+" : bankcode is null" );
}else{
	System.out.println(this.toString+" : bankcode is "+bankcode );
}
String bankaccount = req.getParameter("bankaccount");
if( bankaccount == null){
	System.out.println(this.toString+" : bankaccount is null" );
}else{
	System.out.println(this.toString+" : bankaccount is "+bankaccount );
}
String bankaccountidentity = req.getParameter("bankaccountidentity");
if( bankaccountidentity == null){
	System.out.println(this.toString+" : bankaccountidentity is null" );
}else{
	System.out.println(this.toString+" : bankaccountidentity is "+bankaccountidentity );
}
String category = req.getParameter("category");
if( category == null){
	System.out.println(this.toString+" : category is null" );
}else{
	System.out.println(this.toString+" : category is "+category );
}
String paytype = req.getParameter("paytype");
if( paytype == null){
	System.out.println(this.toString+" : paytype is null" );
}else{
	System.out.println(this.toString+" : paytype is "+paytype );
}
String ret_clsf = req.getParameter("ret_clsf");
if( ret_clsf == null){
	System.out.println(this.toString+" : ret_clsf is null" );
}else{
	System.out.println(this.toString+" : ret_clsf is "+ret_clsf );
}
String ret_cd = req.getParameter("ret_cd");
if( ret_cd == null){
	System.out.println(this.toString+" : ret_cd is null" );
}else{
	System.out.println(this.toString+" : ret_cd is "+ret_cd );
}
String validclsf = req.getParameter("validclsf");
if( validclsf == null){
	System.out.println(this.toString+" : validclsf is null" );
}else{
	System.out.println(this.toString+" : validclsf is "+validclsf );
}
String telno = req.getParameter("telno");
if( telno == null){
	System.out.println(this.toString+" : telno is null" );
}else{
	System.out.println(this.toString+" : telno is "+telno );
}
String chnl = req.getParameter("chnl");
if( chnl == null){
	System.out.println(this.toString+" : chnl is null" );
}else{
	System.out.println(this.toString+" : chnl is "+chnl );
}
String infodata = req.getParameter("infodata");
if( infodata == null){
	System.out.println(this.toString+" : infodata is null" );
}else{
	System.out.println(this.toString+" : infodata is "+infodata );
}
String incmg_pers_addr = req.getParameter("incmg_pers_addr");
if( incmg_pers_addr == null){
	System.out.println(this.toString+" : incmg_pers_addr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_addr is "+incmg_pers_addr );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String filenm = Util.checkString(req.getParameter("filenm"));
String record_clsf = Util.checkString(req.getParameter("record_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String organcode = Util.checkString(req.getParameter("organcode"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String pymt_cd = Util.checkString(req.getParameter("pymt_cd"));
String bankcode = Util.checkString(req.getParameter("bankcode"));
String bankaccount = Util.checkString(req.getParameter("bankaccount"));
String bankaccountidentity = Util.checkString(req.getParameter("bankaccountidentity"));
String category = Util.checkString(req.getParameter("category"));
String paytype = Util.checkString(req.getParameter("paytype"));
String ret_clsf = Util.checkString(req.getParameter("ret_clsf"));
String ret_cd = Util.checkString(req.getParameter("ret_cd"));
String validclsf = Util.checkString(req.getParameter("validclsf"));
String telno = Util.checkString(req.getParameter("telno"));
String chnl = Util.checkString(req.getParameter("chnl"));
String infodata = Util.checkString(req.getParameter("infodata"));
String incmg_pers_addr = Util.checkString(req.getParameter("incmg_pers_addr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String record_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("record_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String organcode = Util.Uni2Ksc(Util.checkString(req.getParameter("organcode")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String pymt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_cd")));
String bankcode = Util.Uni2Ksc(Util.checkString(req.getParameter("bankcode")));
String bankaccount = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccount")));
String bankaccountidentity = Util.Uni2Ksc(Util.checkString(req.getParameter("bankaccountidentity")));
String category = Util.Uni2Ksc(Util.checkString(req.getParameter("category")));
String paytype = Util.Uni2Ksc(Util.checkString(req.getParameter("paytype")));
String ret_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ret_clsf")));
String ret_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ret_cd")));
String validclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("validclsf")));
String telno = Util.Uni2Ksc(Util.checkString(req.getParameter("telno")));
String chnl = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl")));
String infodata = Util.Uni2Ksc(Util.checkString(req.getParameter("infodata")));
String incmg_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_addr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFilenm(filenm);
dm.setRecord_clsf(record_clsf);
dm.setSeq(seq);
dm.setOrgancode(organcode);
dm.setAplc_dt(aplc_dt);
dm.setAplc_clsf(aplc_clsf);
dm.setPymt_cd(pymt_cd);
dm.setBankcode(bankcode);
dm.setBankaccount(bankaccount);
dm.setBankaccountidentity(bankaccountidentity);
dm.setCategory(category);
dm.setPaytype(paytype);
dm.setRet_clsf(ret_clsf);
dm.setRet_cd(ret_cd);
dm.setValidclsf(validclsf);
dm.setTelno(telno);
dm.setChnl(chnl);
dm.setInfodata(infodata);
dm.setIncmg_pers_addr(incmg_pers_addr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 25 18:13:32 KST 2016 */