/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String cmpy_cd;
	public String reg_dt;
	public String reg_seq;
	public String medi_cd;
	public String sect_cd;
	public String qty;
	public String aplc_pers_nm;
	public String aplc_pers_tel_no_1;
	public String aplc_pers_tel_no_2;
	public String aplc_pers_tel_no_3;
	public String aplc_pers_ptph_no_1;
	public String aplc_pers_ptph_no_2;
	public String aplc_pers_ptph_no_3;
	public String dlv_zip_1;
	public String dlv_zip_2;
	public String dlv_dtls_addr;
	public String dlv_addr;
	public String stmt_issu_req_yn;
	public String sell_clsf;
	public String setl_acct_no;
	public String amt;
	public String arvl_clsf;
	public String bo_cd;
	public String send_plac_seq;
	public String prt_plac_cd;
	public String ledt_cd;
	public String ecnt_cd;
	public String issu_dt;
	public String acpn_chrg_pers;
	public String acpn_chrg_pers_nm;
	public String acpn_chrg_pers_cntc_plac;
	public String acpn_chrg_pers_cmpy_cd;
	public String acpn_chrg_pers_dept_cd;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_QTY_2130_ADM(){}
	public SE_QTY_2130_ADM(String accflag, String cmpy_cd, String reg_dt, String reg_seq, String medi_cd, String sect_cd, String qty, String aplc_pers_nm, String aplc_pers_tel_no_1, String aplc_pers_tel_no_2, String aplc_pers_tel_no_3, String aplc_pers_ptph_no_1, String aplc_pers_ptph_no_2, String aplc_pers_ptph_no_3, String dlv_zip_1, String dlv_zip_2, String dlv_dtls_addr, String dlv_addr, String stmt_issu_req_yn, String sell_clsf, String setl_acct_no, String amt, String arvl_clsf, String bo_cd, String send_plac_seq, String prt_plac_cd, String ledt_cd, String ecnt_cd, String issu_dt, String acpn_chrg_pers, String acpn_chrg_pers_nm, String acpn_chrg_pers_cntc_plac, String acpn_chrg_pers_cmpy_cd, String acpn_chrg_pers_dept_cd, String incmg_pers, String incmg_pers_ip){
		this.accflag = accflag;
		this.cmpy_cd = cmpy_cd;
		this.reg_dt = reg_dt;
		this.reg_seq = reg_seq;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.qty = qty;
		this.aplc_pers_nm = aplc_pers_nm;
		this.aplc_pers_tel_no_1 = aplc_pers_tel_no_1;
		this.aplc_pers_tel_no_2 = aplc_pers_tel_no_2;
		this.aplc_pers_tel_no_3 = aplc_pers_tel_no_3;
		this.aplc_pers_ptph_no_1 = aplc_pers_ptph_no_1;
		this.aplc_pers_ptph_no_2 = aplc_pers_ptph_no_2;
		this.aplc_pers_ptph_no_3 = aplc_pers_ptph_no_3;
		this.dlv_zip_1 = dlv_zip_1;
		this.dlv_zip_2 = dlv_zip_2;
		this.dlv_dtls_addr = dlv_dtls_addr;
		this.dlv_addr = dlv_addr;
		this.stmt_issu_req_yn = stmt_issu_req_yn;
		this.sell_clsf = sell_clsf;
		this.setl_acct_no = setl_acct_no;
		this.amt = amt;
		this.arvl_clsf = arvl_clsf;
		this.bo_cd = bo_cd;
		this.send_plac_seq = send_plac_seq;
		this.prt_plac_cd = prt_plac_cd;
		this.ledt_cd = ledt_cd;
		this.ecnt_cd = ecnt_cd;
		this.issu_dt = issu_dt;
		this.acpn_chrg_pers = acpn_chrg_pers;
		this.acpn_chrg_pers_nm = acpn_chrg_pers_nm;
		this.acpn_chrg_pers_cntc_plac = acpn_chrg_pers_cntc_plac;
		this.acpn_chrg_pers_cmpy_cd = acpn_chrg_pers_cmpy_cd;
		this.acpn_chrg_pers_dept_cd = acpn_chrg_pers_dept_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setAplc_pers_nm(String aplc_pers_nm){
		this.aplc_pers_nm = aplc_pers_nm;
	}

	public void setAplc_pers_tel_no_1(String aplc_pers_tel_no_1){
		this.aplc_pers_tel_no_1 = aplc_pers_tel_no_1;
	}

	public void setAplc_pers_tel_no_2(String aplc_pers_tel_no_2){
		this.aplc_pers_tel_no_2 = aplc_pers_tel_no_2;
	}

	public void setAplc_pers_tel_no_3(String aplc_pers_tel_no_3){
		this.aplc_pers_tel_no_3 = aplc_pers_tel_no_3;
	}

	public void setAplc_pers_ptph_no_1(String aplc_pers_ptph_no_1){
		this.aplc_pers_ptph_no_1 = aplc_pers_ptph_no_1;
	}

	public void setAplc_pers_ptph_no_2(String aplc_pers_ptph_no_2){
		this.aplc_pers_ptph_no_2 = aplc_pers_ptph_no_2;
	}

	public void setAplc_pers_ptph_no_3(String aplc_pers_ptph_no_3){
		this.aplc_pers_ptph_no_3 = aplc_pers_ptph_no_3;
	}

	public void setDlv_zip_1(String dlv_zip_1){
		this.dlv_zip_1 = dlv_zip_1;
	}

	public void setDlv_zip_2(String dlv_zip_2){
		this.dlv_zip_2 = dlv_zip_2;
	}

	public void setDlv_dtls_addr(String dlv_dtls_addr){
		this.dlv_dtls_addr = dlv_dtls_addr;
	}

	public void setDlv_addr(String dlv_addr){
		this.dlv_addr = dlv_addr;
	}

	public void setStmt_issu_req_yn(String stmt_issu_req_yn){
		this.stmt_issu_req_yn = stmt_issu_req_yn;
	}

	public void setSell_clsf(String sell_clsf){
		this.sell_clsf = sell_clsf;
	}

	public void setSetl_acct_no(String setl_acct_no){
		this.setl_acct_no = setl_acct_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setArvl_clsf(String arvl_clsf){
		this.arvl_clsf = arvl_clsf;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setEcnt_cd(String ecnt_cd){
		this.ecnt_cd = ecnt_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setAcpn_chrg_pers(String acpn_chrg_pers){
		this.acpn_chrg_pers = acpn_chrg_pers;
	}

	public void setAcpn_chrg_pers_nm(String acpn_chrg_pers_nm){
		this.acpn_chrg_pers_nm = acpn_chrg_pers_nm;
	}

	public void setAcpn_chrg_pers_cntc_plac(String acpn_chrg_pers_cntc_plac){
		this.acpn_chrg_pers_cntc_plac = acpn_chrg_pers_cntc_plac;
	}

	public void setAcpn_chrg_pers_cmpy_cd(String acpn_chrg_pers_cmpy_cd){
		this.acpn_chrg_pers_cmpy_cd = acpn_chrg_pers_cmpy_cd;
	}

	public void setAcpn_chrg_pers_dept_cd(String acpn_chrg_pers_dept_cd){
		this.acpn_chrg_pers_dept_cd = acpn_chrg_pers_dept_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getAplc_pers_nm(){
		return this.aplc_pers_nm;
	}

	public String getAplc_pers_tel_no_1(){
		return this.aplc_pers_tel_no_1;
	}

	public String getAplc_pers_tel_no_2(){
		return this.aplc_pers_tel_no_2;
	}

	public String getAplc_pers_tel_no_3(){
		return this.aplc_pers_tel_no_3;
	}

	public String getAplc_pers_ptph_no_1(){
		return this.aplc_pers_ptph_no_1;
	}

	public String getAplc_pers_ptph_no_2(){
		return this.aplc_pers_ptph_no_2;
	}

	public String getAplc_pers_ptph_no_3(){
		return this.aplc_pers_ptph_no_3;
	}

	public String getDlv_zip_1(){
		return this.dlv_zip_1;
	}

	public String getDlv_zip_2(){
		return this.dlv_zip_2;
	}

	public String getDlv_dtls_addr(){
		return this.dlv_dtls_addr;
	}

	public String getDlv_addr(){
		return this.dlv_addr;
	}

	public String getStmt_issu_req_yn(){
		return this.stmt_issu_req_yn;
	}

	public String getSell_clsf(){
		return this.sell_clsf;
	}

	public String getSetl_acct_no(){
		return this.setl_acct_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getArvl_clsf(){
		return this.arvl_clsf;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getEcnt_cd(){
		return this.ecnt_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getAcpn_chrg_pers(){
		return this.acpn_chrg_pers;
	}

	public String getAcpn_chrg_pers_nm(){
		return this.acpn_chrg_pers_nm;
	}

	public String getAcpn_chrg_pers_cntc_plac(){
		return this.acpn_chrg_pers_cntc_plac;
	}

	public String getAcpn_chrg_pers_cmpy_cd(){
		return this.acpn_chrg_pers_cmpy_cd;
	}

	public String getAcpn_chrg_pers_dept_cd(){
		return this.acpn_chrg_pers_dept_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_QTY_2130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2130_ADM dm = (SE_QTY_2130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.reg_dt);
		cstmt.setString(6, dm.reg_seq);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.sect_cd);
		cstmt.setString(9, dm.qty);
		cstmt.setString(10, dm.aplc_pers_nm);
		cstmt.setString(11, dm.aplc_pers_tel_no_1);
		cstmt.setString(12, dm.aplc_pers_tel_no_2);
		cstmt.setString(13, dm.aplc_pers_tel_no_3);
		cstmt.setString(14, dm.aplc_pers_ptph_no_1);
		cstmt.setString(15, dm.aplc_pers_ptph_no_2);
		cstmt.setString(16, dm.aplc_pers_ptph_no_3);
		cstmt.setString(17, dm.dlv_zip_1);
		cstmt.setString(18, dm.dlv_zip_2);
		cstmt.setString(19, dm.dlv_dtls_addr);
		cstmt.setString(20, dm.dlv_addr);
		cstmt.setString(21, dm.stmt_issu_req_yn);
		cstmt.setString(22, dm.sell_clsf);
		cstmt.setString(23, dm.setl_acct_no);
		cstmt.setString(24, dm.amt);
		cstmt.setString(25, dm.arvl_clsf);
		cstmt.setString(26, dm.bo_cd);
		cstmt.setString(27, dm.send_plac_seq);
		cstmt.setString(28, dm.prt_plac_cd);
		cstmt.setString(29, dm.ledt_cd);
		cstmt.setString(30, dm.ecnt_cd);
		cstmt.setString(31, dm.issu_dt);
		cstmt.setString(32, dm.acpn_chrg_pers);
		cstmt.setString(33, dm.acpn_chrg_pers_nm);
		cstmt.setString(34, dm.acpn_chrg_pers_cntc_plac);
		cstmt.setString(35, dm.acpn_chrg_pers_cmpy_cd);
		cstmt.setString(36, dm.acpn_chrg_pers_dept_cd);
		cstmt.setString(37, dm.incmg_pers);
		cstmt.setString(38, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2130_ADataSet();
	}



    public void print(){
        System.out.println("accflag = " + getAccflag());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("reg_dt = " + getReg_dt());
        System.out.println("reg_seq = " + getReg_seq());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("sect_cd = " + getSect_cd());
        System.out.println("qty = " + getQty());
        System.out.println("aplc_pers_nm = " + getAplc_pers_nm());
        System.out.println("aplc_pers_tel_no_1 = " + getAplc_pers_tel_no_1());
        System.out.println("aplc_pers_tel_no_2 = " + getAplc_pers_tel_no_2());
        System.out.println("aplc_pers_tel_no_3 = " + getAplc_pers_tel_no_3());
        System.out.println("aplc_pers_ptph_no_1 = " + getAplc_pers_ptph_no_1());
        System.out.println("aplc_pers_ptph_no_2 = " + getAplc_pers_ptph_no_2());
        System.out.println("aplc_pers_ptph_no_3 = " + getAplc_pers_ptph_no_3());
        System.out.println("dlv_zip_1 = " + getDlv_zip_1());
        System.out.println("dlv_zip_2 = " + getDlv_zip_2());
        System.out.println("dlv_dtls_addr = " + getDlv_dtls_addr());
        System.out.println("dlv_addr = " + getDlv_addr());
        System.out.println("stmt_issu_req_yn = " + getStmt_issu_req_yn());
        System.out.println("sell_clsf = " + getSell_clsf());
        System.out.println("setl_acct_no = " + getSetl_acct_no());
        System.out.println("amt = " + getAmt());
        System.out.println("arvl_clsf = " + getArvl_clsf());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("send_plac_seq = " + getSend_plac_seq());
        System.out.println("prt_plac_cd = " + getPrt_plac_cd());
        System.out.println("ledt_cd = " + getLedt_cd());
        System.out.println("ecnt_cd = " + getEcnt_cd());
        System.out.println("issu_dt = " + getIssu_dt());
        System.out.println("acpn_chrg_pers = " + getAcpn_chrg_pers());
        System.out.println("acpn_chrg_pers_nm = " + getAcpn_chrg_pers_nm());
        System.out.println("acpn_chrg_pers_cntc_plac = " + getAcpn_chrg_pers_cntc_plac());
        System.out.println("acpn_chrg_pers_cmpy_cd = " + getAcpn_chrg_pers_cmpy_cd());
        System.out.println("acpn_chrg_pers_dept_cd = " + getAcpn_chrg_pers_dept_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String aplc_pers_nm = req.getParameter("aplc_pers_nm");
if( aplc_pers_nm == null){
	System.out.println(this.toString+" : aplc_pers_nm is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_nm is "+aplc_pers_nm );
}
String aplc_pers_tel_no_1 = req.getParameter("aplc_pers_tel_no_1");
if( aplc_pers_tel_no_1 == null){
	System.out.println(this.toString+" : aplc_pers_tel_no_1 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_tel_no_1 is "+aplc_pers_tel_no_1 );
}
String aplc_pers_tel_no_2 = req.getParameter("aplc_pers_tel_no_2");
if( aplc_pers_tel_no_2 == null){
	System.out.println(this.toString+" : aplc_pers_tel_no_2 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_tel_no_2 is "+aplc_pers_tel_no_2 );
}
String aplc_pers_tel_no_3 = req.getParameter("aplc_pers_tel_no_3");
if( aplc_pers_tel_no_3 == null){
	System.out.println(this.toString+" : aplc_pers_tel_no_3 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_tel_no_3 is "+aplc_pers_tel_no_3 );
}
String aplc_pers_ptph_no_1 = req.getParameter("aplc_pers_ptph_no_1");
if( aplc_pers_ptph_no_1 == null){
	System.out.println(this.toString+" : aplc_pers_ptph_no_1 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_ptph_no_1 is "+aplc_pers_ptph_no_1 );
}
String aplc_pers_ptph_no_2 = req.getParameter("aplc_pers_ptph_no_2");
if( aplc_pers_ptph_no_2 == null){
	System.out.println(this.toString+" : aplc_pers_ptph_no_2 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_ptph_no_2 is "+aplc_pers_ptph_no_2 );
}
String aplc_pers_ptph_no_3 = req.getParameter("aplc_pers_ptph_no_3");
if( aplc_pers_ptph_no_3 == null){
	System.out.println(this.toString+" : aplc_pers_ptph_no_3 is null" );
}else{
	System.out.println(this.toString+" : aplc_pers_ptph_no_3 is "+aplc_pers_ptph_no_3 );
}
String dlv_zip_1 = req.getParameter("dlv_zip_1");
if( dlv_zip_1 == null){
	System.out.println(this.toString+" : dlv_zip_1 is null" );
}else{
	System.out.println(this.toString+" : dlv_zip_1 is "+dlv_zip_1 );
}
String dlv_zip_2 = req.getParameter("dlv_zip_2");
if( dlv_zip_2 == null){
	System.out.println(this.toString+" : dlv_zip_2 is null" );
}else{
	System.out.println(this.toString+" : dlv_zip_2 is "+dlv_zip_2 );
}
String dlv_dtls_addr = req.getParameter("dlv_dtls_addr");
if( dlv_dtls_addr == null){
	System.out.println(this.toString+" : dlv_dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dlv_dtls_addr is "+dlv_dtls_addr );
}
String dlv_addr = req.getParameter("dlv_addr");
if( dlv_addr == null){
	System.out.println(this.toString+" : dlv_addr is null" );
}else{
	System.out.println(this.toString+" : dlv_addr is "+dlv_addr );
}
String stmt_issu_req_yn = req.getParameter("stmt_issu_req_yn");
if( stmt_issu_req_yn == null){
	System.out.println(this.toString+" : stmt_issu_req_yn is null" );
}else{
	System.out.println(this.toString+" : stmt_issu_req_yn is "+stmt_issu_req_yn );
}
String sell_clsf = req.getParameter("sell_clsf");
if( sell_clsf == null){
	System.out.println(this.toString+" : sell_clsf is null" );
}else{
	System.out.println(this.toString+" : sell_clsf is "+sell_clsf );
}
String setl_acct_no = req.getParameter("setl_acct_no");
if( setl_acct_no == null){
	System.out.println(this.toString+" : setl_acct_no is null" );
}else{
	System.out.println(this.toString+" : setl_acct_no is "+setl_acct_no );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String arvl_clsf = req.getParameter("arvl_clsf");
if( arvl_clsf == null){
	System.out.println(this.toString+" : arvl_clsf is null" );
}else{
	System.out.println(this.toString+" : arvl_clsf is "+arvl_clsf );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String ledt_cd = req.getParameter("ledt_cd");
if( ledt_cd == null){
	System.out.println(this.toString+" : ledt_cd is null" );
}else{
	System.out.println(this.toString+" : ledt_cd is "+ledt_cd );
}
String ecnt_cd = req.getParameter("ecnt_cd");
if( ecnt_cd == null){
	System.out.println(this.toString+" : ecnt_cd is null" );
}else{
	System.out.println(this.toString+" : ecnt_cd is "+ecnt_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String acpn_chrg_pers = req.getParameter("acpn_chrg_pers");
if( acpn_chrg_pers == null){
	System.out.println(this.toString+" : acpn_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : acpn_chrg_pers is "+acpn_chrg_pers );
}
String acpn_chrg_pers_nm = req.getParameter("acpn_chrg_pers_nm");
if( acpn_chrg_pers_nm == null){
	System.out.println(this.toString+" : acpn_chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : acpn_chrg_pers_nm is "+acpn_chrg_pers_nm );
}
String acpn_chrg_pers_cntc_plac = req.getParameter("acpn_chrg_pers_cntc_plac");
if( acpn_chrg_pers_cntc_plac == null){
	System.out.println(this.toString+" : acpn_chrg_pers_cntc_plac is null" );
}else{
	System.out.println(this.toString+" : acpn_chrg_pers_cntc_plac is "+acpn_chrg_pers_cntc_plac );
}
String acpn_chrg_pers_cmpy_cd = req.getParameter("acpn_chrg_pers_cmpy_cd");
if( acpn_chrg_pers_cmpy_cd == null){
	System.out.println(this.toString+" : acpn_chrg_pers_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : acpn_chrg_pers_cmpy_cd is "+acpn_chrg_pers_cmpy_cd );
}
String acpn_chrg_pers_dept_cd = req.getParameter("acpn_chrg_pers_dept_cd");
if( acpn_chrg_pers_dept_cd == null){
	System.out.println(this.toString+" : acpn_chrg_pers_dept_cd is null" );
}else{
	System.out.println(this.toString+" : acpn_chrg_pers_dept_cd is "+acpn_chrg_pers_dept_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String aplc_pers_nm = Util.checkString(req.getParameter("aplc_pers_nm"));
String aplc_pers_tel_no_1 = Util.checkString(req.getParameter("aplc_pers_tel_no_1"));
String aplc_pers_tel_no_2 = Util.checkString(req.getParameter("aplc_pers_tel_no_2"));
String aplc_pers_tel_no_3 = Util.checkString(req.getParameter("aplc_pers_tel_no_3"));
String aplc_pers_ptph_no_1 = Util.checkString(req.getParameter("aplc_pers_ptph_no_1"));
String aplc_pers_ptph_no_2 = Util.checkString(req.getParameter("aplc_pers_ptph_no_2"));
String aplc_pers_ptph_no_3 = Util.checkString(req.getParameter("aplc_pers_ptph_no_3"));
String dlv_zip_1 = Util.checkString(req.getParameter("dlv_zip_1"));
String dlv_zip_2 = Util.checkString(req.getParameter("dlv_zip_2"));
String dlv_dtls_addr = Util.checkString(req.getParameter("dlv_dtls_addr"));
String dlv_addr = Util.checkString(req.getParameter("dlv_addr"));
String stmt_issu_req_yn = Util.checkString(req.getParameter("stmt_issu_req_yn"));
String sell_clsf = Util.checkString(req.getParameter("sell_clsf"));
String setl_acct_no = Util.checkString(req.getParameter("setl_acct_no"));
String amt = Util.checkString(req.getParameter("amt"));
String arvl_clsf = Util.checkString(req.getParameter("arvl_clsf"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String ledt_cd = Util.checkString(req.getParameter("ledt_cd"));
String ecnt_cd = Util.checkString(req.getParameter("ecnt_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String acpn_chrg_pers = Util.checkString(req.getParameter("acpn_chrg_pers"));
String acpn_chrg_pers_nm = Util.checkString(req.getParameter("acpn_chrg_pers_nm"));
String acpn_chrg_pers_cntc_plac = Util.checkString(req.getParameter("acpn_chrg_pers_cntc_plac"));
String acpn_chrg_pers_cmpy_cd = Util.checkString(req.getParameter("acpn_chrg_pers_cmpy_cd"));
String acpn_chrg_pers_dept_cd = Util.checkString(req.getParameter("acpn_chrg_pers_dept_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String aplc_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_nm")));
String aplc_pers_tel_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_tel_no_1")));
String aplc_pers_tel_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_tel_no_2")));
String aplc_pers_tel_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_tel_no_3")));
String aplc_pers_ptph_no_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_ptph_no_1")));
String aplc_pers_ptph_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_ptph_no_2")));
String aplc_pers_ptph_no_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_pers_ptph_no_3")));
String dlv_zip_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlv_zip_1")));
String dlv_zip_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlv_zip_2")));
String dlv_dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlv_dtls_addr")));
String dlv_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlv_addr")));
String stmt_issu_req_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_issu_req_yn")));
String sell_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_clsf")));
String setl_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("setl_acct_no")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String arvl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("arvl_clsf")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String ledt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ledt_cd")));
String ecnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String acpn_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_chrg_pers")));
String acpn_chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_chrg_pers_nm")));
String acpn_chrg_pers_cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_chrg_pers_cntc_plac")));
String acpn_chrg_pers_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_chrg_pers_cmpy_cd")));
String acpn_chrg_pers_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_chrg_pers_dept_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setCmpy_cd(cmpy_cd);
dm.setReg_dt(reg_dt);
dm.setReg_seq(reg_seq);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setQty(qty);
dm.setAplc_pers_nm(aplc_pers_nm);
dm.setAplc_pers_tel_no_1(aplc_pers_tel_no_1);
dm.setAplc_pers_tel_no_2(aplc_pers_tel_no_2);
dm.setAplc_pers_tel_no_3(aplc_pers_tel_no_3);
dm.setAplc_pers_ptph_no_1(aplc_pers_ptph_no_1);
dm.setAplc_pers_ptph_no_2(aplc_pers_ptph_no_2);
dm.setAplc_pers_ptph_no_3(aplc_pers_ptph_no_3);
dm.setDlv_zip_1(dlv_zip_1);
dm.setDlv_zip_2(dlv_zip_2);
dm.setDlv_dtls_addr(dlv_dtls_addr);
dm.setDlv_addr(dlv_addr);
dm.setStmt_issu_req_yn(stmt_issu_req_yn);
dm.setSell_clsf(sell_clsf);
dm.setSetl_acct_no(setl_acct_no);
dm.setAmt(amt);
dm.setArvl_clsf(arvl_clsf);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setLedt_cd(ledt_cd);
dm.setEcnt_cd(ecnt_cd);
dm.setIssu_dt(issu_dt);
dm.setAcpn_chrg_pers(acpn_chrg_pers);
dm.setAcpn_chrg_pers_nm(acpn_chrg_pers_nm);
dm.setAcpn_chrg_pers_cntc_plac(acpn_chrg_pers_cntc_plac);
dm.setAcpn_chrg_pers_cmpy_cd(acpn_chrg_pers_cmpy_cd);
dm.setAcpn_chrg_pers_dept_cd(acpn_chrg_pers_dept_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 10:44:31 KST 2009 */