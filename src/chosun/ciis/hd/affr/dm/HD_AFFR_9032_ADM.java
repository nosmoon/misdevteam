/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_9032_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String basi_dt;
	public String seq;
	public String otn_mgng_cd;
	public String outside_clsf_cd;
	public String journal_cd;
	public String outside_tel_no;
	public String zipcode;
	public String addr;
	public String qty;
	public String icdc_qty;
	public String remk;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_9032_ADM(){}
	public HD_AFFR_9032_ADM(String cmpy_cd, String mode, String basi_dt, String seq, String otn_mgng_cd, String outside_clsf_cd, String journal_cd, String outside_tel_no, String zipcode, String addr, String qty, String icdc_qty, String remk, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.basi_dt = basi_dt;
		this.seq = seq;
		this.otn_mgng_cd = otn_mgng_cd;
		this.outside_clsf_cd = outside_clsf_cd;
		this.journal_cd = journal_cd;
		this.outside_tel_no = outside_tel_no;
		this.zipcode = zipcode;
		this.addr = addr;
		this.qty = qty;
		this.icdc_qty = icdc_qty;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOtn_mgng_cd(String otn_mgng_cd){
		this.otn_mgng_cd = otn_mgng_cd;
	}

	public void setOutside_clsf_cd(String outside_clsf_cd){
		this.outside_clsf_cd = outside_clsf_cd;
	}

	public void setJournal_cd(String journal_cd){
		this.journal_cd = journal_cd;
	}

	public void setOutside_tel_no(String outside_tel_no){
		this.outside_tel_no = outside_tel_no;
	}

	public void setZipcode(String zipcode){
		this.zipcode = zipcode;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOtn_mgng_cd(){
		return this.otn_mgng_cd;
	}

	public String getOutside_clsf_cd(){
		return this.outside_clsf_cd;
	}

	public String getJournal_cd(){
		return this.journal_cd;
	}

	public String getOutside_tel_no(){
		return this.outside_tel_no;
	}

	public String getZipcode(){
		return this.zipcode;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getQty(){
		return this.qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9032_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9032_ADM dm = (HD_AFFR_9032_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.basi_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.otn_mgng_cd);
		cstmt.setString(8, dm.outside_clsf_cd);
		cstmt.setString(9, dm.journal_cd);
		cstmt.setString(10, dm.outside_tel_no);
		cstmt.setString(11, dm.zipcode);
		cstmt.setString(12, dm.addr);
		cstmt.setString(13, dm.qty);
		cstmt.setString(14, dm.icdc_qty);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9032_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("otn_mgng_cd = [" + getOtn_mgng_cd() + "]");
		System.out.println("outside_clsf_cd = [" + getOutside_clsf_cd() + "]");
		System.out.println("journal_cd = [" + getJournal_cd() + "]");
		System.out.println("outside_tel_no = [" + getOutside_tel_no() + "]");
		System.out.println("zipcode = [" + getZipcode() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("icdc_qty = [" + getIcdc_qty() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String otn_mgng_cd = req.getParameter("otn_mgng_cd");
if( otn_mgng_cd == null){
	System.out.println(this.toString+" : otn_mgng_cd is null" );
}else{
	System.out.println(this.toString+" : otn_mgng_cd is "+otn_mgng_cd );
}
String outside_clsf_cd = req.getParameter("outside_clsf_cd");
if( outside_clsf_cd == null){
	System.out.println(this.toString+" : outside_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : outside_clsf_cd is "+outside_clsf_cd );
}
String journal_cd = req.getParameter("journal_cd");
if( journal_cd == null){
	System.out.println(this.toString+" : journal_cd is null" );
}else{
	System.out.println(this.toString+" : journal_cd is "+journal_cd );
}
String outside_tel_no = req.getParameter("outside_tel_no");
if( outside_tel_no == null){
	System.out.println(this.toString+" : outside_tel_no is null" );
}else{
	System.out.println(this.toString+" : outside_tel_no is "+outside_tel_no );
}
String zipcode = req.getParameter("zipcode");
if( zipcode == null){
	System.out.println(this.toString+" : zipcode is null" );
}else{
	System.out.println(this.toString+" : zipcode is "+zipcode );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String icdc_qty = req.getParameter("icdc_qty");
if( icdc_qty == null){
	System.out.println(this.toString+" : icdc_qty is null" );
}else{
	System.out.println(this.toString+" : icdc_qty is "+icdc_qty );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String otn_mgng_cd = Util.checkString(req.getParameter("otn_mgng_cd"));
String outside_clsf_cd = Util.checkString(req.getParameter("outside_clsf_cd"));
String journal_cd = Util.checkString(req.getParameter("journal_cd"));
String outside_tel_no = Util.checkString(req.getParameter("outside_tel_no"));
String zipcode = Util.checkString(req.getParameter("zipcode"));
String addr = Util.checkString(req.getParameter("addr"));
String qty = Util.checkString(req.getParameter("qty"));
String icdc_qty = Util.checkString(req.getParameter("icdc_qty"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String otn_mgng_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("otn_mgng_cd")));
String outside_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_clsf_cd")));
String journal_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("journal_cd")));
String outside_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("outside_tel_no")));
String zipcode = Util.Uni2Ksc(Util.checkString(req.getParameter("zipcode")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String icdc_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("icdc_qty")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setBasi_dt(basi_dt);
dm.setSeq(seq);
dm.setOtn_mgng_cd(otn_mgng_cd);
dm.setOutside_clsf_cd(outside_clsf_cd);
dm.setJournal_cd(journal_cd);
dm.setOutside_tel_no(outside_tel_no);
dm.setZipcode(zipcode);
dm.setAddr(addr);
dm.setQty(qty);
dm.setIcdc_qty(icdc_qty);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 12 17:20:16 KST 2016 */