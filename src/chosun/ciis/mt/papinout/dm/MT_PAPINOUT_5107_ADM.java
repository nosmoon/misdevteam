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


public class MT_PAPINOUT_5107_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String dlco_no;
	public String dlco_nm;
	public String tax_stmt_seq;
	public String slip_proc_seq;
	public String slip_proc_occr_dt;
	public String cha_amt;
	public String dea_amt;
	public String vat_amt;
	public String ern;
	public String rcpm_dt;
	public String issu_dt_fr;
	public String issu_dt_to;
	public String mode;

	public MT_PAPINOUT_5107_ADM(){}
	public MT_PAPINOUT_5107_ADM(String cmpy_cd, String seq, String occr_dt, String incmg_pers_ipaddr, String incmg_pers, String dlco_no, String dlco_nm, String tax_stmt_seq, String slip_proc_seq, String slip_proc_occr_dt, String cha_amt, String dea_amt, String vat_amt, String ern, String rcpm_dt, String issu_dt_fr, String issu_dt_to, String mode){
		this.cmpy_cd = cmpy_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.tax_stmt_seq = tax_stmt_seq;
		this.slip_proc_seq = slip_proc_seq;
		this.slip_proc_occr_dt = slip_proc_occr_dt;
		this.cha_amt = cha_amt;
		this.dea_amt = dea_amt;
		this.vat_amt = vat_amt;
		this.ern = ern;
		this.rcpm_dt = rcpm_dt;
		this.issu_dt_fr = issu_dt_fr;
		this.issu_dt_to = issu_dt_to;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setCha_amt(String cha_amt){
		this.cha_amt = cha_amt;
	}

	public void setDea_amt(String dea_amt){
		this.dea_amt = dea_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setIssu_dt_fr(String issu_dt_fr){
		this.issu_dt_fr = issu_dt_fr;
	}

	public void setIssu_dt_to(String issu_dt_to){
		this.issu_dt_to = issu_dt_to;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getCha_amt(){
		return this.cha_amt;
	}

	public String getDea_amt(){
		return this.dea_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getErn(){
		return this.ern;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getIssu_dt_fr(){
		return this.issu_dt_fr;
	}

	public String getIssu_dt_to(){
		return this.issu_dt_to;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5107_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5107_ADM dm = (MT_PAPINOUT_5107_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seq);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.incmg_pers_ipaddr);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.dlco_nm);
		cstmt.setString(10, dm.tax_stmt_seq);
		cstmt.setString(11, dm.slip_proc_seq);
		cstmt.setString(12, dm.slip_proc_occr_dt);
		cstmt.setString(13, dm.cha_amt);
		cstmt.setString(14, dm.dea_amt);
		cstmt.setString(15, dm.vat_amt);
		cstmt.setString(16, dm.ern);
		cstmt.setString(17, dm.rcpm_dt);
		cstmt.setString(18, dm.issu_dt_fr);
		cstmt.setString(19, dm.issu_dt_to);
		cstmt.setString(20, dm.mode);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5107_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("tax_stmt_seq = [" + getTax_stmt_seq() + "]");
		System.out.println("slip_proc_seq = [" + getSlip_proc_seq() + "]");
		System.out.println("slip_proc_occr_dt = [" + getSlip_proc_occr_dt() + "]");
		System.out.println("cha_amt = [" + getCha_amt() + "]");
		System.out.println("dea_amt = [" + getDea_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("issu_dt_fr = [" + getIssu_dt_fr() + "]");
		System.out.println("issu_dt_to = [" + getIssu_dt_to() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String tax_stmt_seq = req.getParameter("tax_stmt_seq");
if( tax_stmt_seq == null){
	System.out.println(this.toString+" : tax_stmt_seq is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_seq is "+tax_stmt_seq );
}
String slip_proc_seq = req.getParameter("slip_proc_seq");
if( slip_proc_seq == null){
	System.out.println(this.toString+" : slip_proc_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_seq is "+slip_proc_seq );
}
String slip_proc_occr_dt = req.getParameter("slip_proc_occr_dt");
if( slip_proc_occr_dt == null){
	System.out.println(this.toString+" : slip_proc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_occr_dt is "+slip_proc_occr_dt );
}
String cha_amt = req.getParameter("cha_amt");
if( cha_amt == null){
	System.out.println(this.toString+" : cha_amt is null" );
}else{
	System.out.println(this.toString+" : cha_amt is "+cha_amt );
}
String dea_amt = req.getParameter("dea_amt");
if( dea_amt == null){
	System.out.println(this.toString+" : dea_amt is null" );
}else{
	System.out.println(this.toString+" : dea_amt is "+dea_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String issu_dt_fr = req.getParameter("issu_dt_fr");
if( issu_dt_fr == null){
	System.out.println(this.toString+" : issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : issu_dt_fr is "+issu_dt_fr );
}
String issu_dt_to = req.getParameter("issu_dt_to");
if( issu_dt_to == null){
	System.out.println(this.toString+" : issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : issu_dt_to is "+issu_dt_to );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String tax_stmt_seq = Util.checkString(req.getParameter("tax_stmt_seq"));
String slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
String slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
String cha_amt = Util.checkString(req.getParameter("cha_amt"));
String dea_amt = Util.checkString(req.getParameter("dea_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String ern = Util.checkString(req.getParameter("ern"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
String issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String tax_stmt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_seq")));
String slip_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_seq")));
String slip_proc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_occr_dt")));
String cha_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cha_amt")));
String dea_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dea_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_fr")));
String issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_to")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setTax_stmt_seq(tax_stmt_seq);
dm.setSlip_proc_seq(slip_proc_seq);
dm.setSlip_proc_occr_dt(slip_proc_occr_dt);
dm.setCha_amt(cha_amt);
dm.setDea_amt(dea_amt);
dm.setVat_amt(vat_amt);
dm.setErn(ern);
dm.setRcpm_dt(rcpm_dt);
dm.setIssu_dt_fr(issu_dt_fr);
dm.setIssu_dt_to(issu_dt_to);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 15:34:13 KST 2009 */