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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5102_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String rcpm_dt;
	public String dlco_no;
	public String cnsm_frdt;
	public String cnsm_todt;
	public String bank_cd;
	public String acct_no;
	public String rcpm_nm;
	public String mode;
	public String pj_kind;
	public String pj_qunt;
	public String pj_wgt;
	public String uprc;
	public String amt;

	public MT_PAPINOUT_5102_IDM(){}
	public MT_PAPINOUT_5102_IDM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String rcpm_dt, String dlco_no, String cnsm_frdt, String cnsm_todt, String bank_cd, String acct_no, String rcpm_nm, String mode, String pj_kind, String pj_qunt, String pj_wgt, String uprc, String amt){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.rcpm_dt = rcpm_dt;
		this.dlco_no = dlco_no;
		this.cnsm_frdt = cnsm_frdt;
		this.cnsm_todt = cnsm_todt;
		this.bank_cd = bank_cd;
		this.acct_no = acct_no;
		this.rcpm_nm = rcpm_nm;
		this.mode = mode;
		this.pj_kind = pj_kind;
		this.pj_qunt = pj_qunt;
		this.pj_wgt = pj_wgt;
		this.uprc = uprc;
		this.amt = amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCnsm_frdt(String cnsm_frdt){
		this.cnsm_frdt = cnsm_frdt;
	}

	public void setCnsm_todt(String cnsm_todt){
		this.cnsm_todt = cnsm_todt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setRcpm_nm(String rcpm_nm){
		this.rcpm_nm = rcpm_nm;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_qunt(String pj_qunt){
		this.pj_qunt = pj_qunt;
	}

	public void setPj_wgt(String pj_wgt){
		this.pj_wgt = pj_wgt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCnsm_frdt(){
		return this.cnsm_frdt;
	}

	public String getCnsm_todt(){
		return this.cnsm_todt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getRcpm_nm(){
		return this.rcpm_nm;
	}

	public String getMode(){
		return this.mode;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_qunt(){
		return this.pj_qunt;
	}

	public String getPj_wgt(){
		return this.pj_wgt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5102_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5102_IDM dm = (MT_PAPINOUT_5102_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.rcpm_dt);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.cnsm_frdt);
		cstmt.setString(9, dm.cnsm_todt);
		cstmt.setString(10, dm.bank_cd);
		cstmt.setString(11, dm.acct_no);
		cstmt.setString(12, dm.rcpm_nm);
		cstmt.setString(13, dm.mode);
		cstmt.setString(14, dm.pj_kind);
		cstmt.setString(15, dm.pj_qunt);
		cstmt.setString(16, dm.pj_wgt);
		cstmt.setString(17, dm.uprc);
		cstmt.setString(18, dm.amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5102_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("cnsm_frdt = [" + getCnsm_frdt() + "]");
		System.out.println("cnsm_todt = [" + getCnsm_todt() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("rcpm_nm = [" + getRcpm_nm() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("pj_kind = [" + getPj_kind() + "]");
		System.out.println("pj_qunt = [" + getPj_qunt() + "]");
		System.out.println("pj_wgt = [" + getPj_wgt() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String cnsm_frdt = req.getParameter("cnsm_frdt");
if( cnsm_frdt == null){
	System.out.println(this.toString+" : cnsm_frdt is null" );
}else{
	System.out.println(this.toString+" : cnsm_frdt is "+cnsm_frdt );
}
String cnsm_todt = req.getParameter("cnsm_todt");
if( cnsm_todt == null){
	System.out.println(this.toString+" : cnsm_todt is null" );
}else{
	System.out.println(this.toString+" : cnsm_todt is "+cnsm_todt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String rcpm_nm = req.getParameter("rcpm_nm");
if( rcpm_nm == null){
	System.out.println(this.toString+" : rcpm_nm is null" );
}else{
	System.out.println(this.toString+" : rcpm_nm is "+rcpm_nm );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
String pj_qunt = req.getParameter("pj_qunt");
if( pj_qunt == null){
	System.out.println(this.toString+" : pj_qunt is null" );
}else{
	System.out.println(this.toString+" : pj_qunt is "+pj_qunt );
}
String pj_wgt = req.getParameter("pj_wgt");
if( pj_wgt == null){
	System.out.println(this.toString+" : pj_wgt is null" );
}else{
	System.out.println(this.toString+" : pj_wgt is "+pj_wgt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String cnsm_frdt = Util.checkString(req.getParameter("cnsm_frdt"));
String cnsm_todt = Util.checkString(req.getParameter("cnsm_todt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String rcpm_nm = Util.checkString(req.getParameter("rcpm_nm"));
String mode = Util.checkString(req.getParameter("mode"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
String pj_qunt = Util.checkString(req.getParameter("pj_qunt"));
String pj_wgt = Util.checkString(req.getParameter("pj_wgt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String amt = Util.checkString(req.getParameter("amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String cnsm_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnsm_frdt")));
String cnsm_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("cnsm_todt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String rcpm_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_nm")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
String pj_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_qunt")));
String pj_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_wgt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setRcpm_dt(rcpm_dt);
dm.setDlco_no(dlco_no);
dm.setCnsm_frdt(cnsm_frdt);
dm.setCnsm_todt(cnsm_todt);
dm.setBank_cd(bank_cd);
dm.setAcct_no(acct_no);
dm.setRcpm_nm(rcpm_nm);
dm.setMode(mode);
dm.setPj_kind(pj_kind);
dm.setPj_qunt(pj_qunt);
dm.setPj_wgt(pj_wgt);
dm.setUprc(uprc);
dm.setAmt(amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 18 12:20:57 KST 2009 */