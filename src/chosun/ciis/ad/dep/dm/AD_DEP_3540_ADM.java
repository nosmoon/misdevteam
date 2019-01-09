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


package chosun.ciis.ad.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.dep.ds.*;
import chosun.ciis.ad.dep.rec.*;

/**
 * 
 */


public class AD_DEP_3540_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String dlco_clsf;
	public String dlco_no;
	public String eps_clsf;
	public String enty_clsf;
	public String rcpm_slip_no;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String dhon_occr_dt;
	public String dhon_amt;
	public String dhon_bal;
	public String issu_pers_nm;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_3540_ADM(){}
	public AD_DEP_3540_ADM(String cmpy_cd, String medi_cd, String dlco_clsf, String dlco_no, String eps_clsf, String enty_clsf, String rcpm_slip_no, String bank_cd, String note_no, String note_seq, String dhon_occr_dt, String dhon_amt, String dhon_bal, String issu_pers_nm, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.eps_clsf = eps_clsf;
		this.enty_clsf = enty_clsf;
		this.rcpm_slip_no = rcpm_slip_no;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.dhon_occr_dt = dhon_occr_dt;
		this.dhon_amt = dhon_amt;
		this.dhon_bal = dhon_bal;
		this.issu_pers_nm = issu_pers_nm;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setEps_clsf(String eps_clsf){
		this.eps_clsf = eps_clsf;
	}

	public void setEnty_clsf(String enty_clsf){
		this.enty_clsf = enty_clsf;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public void setDhon_bal(String dhon_bal){
		this.dhon_bal = dhon_bal;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getEps_clsf(){
		return this.eps_clsf;
	}

	public String getEnty_clsf(){
		return this.enty_clsf;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}

	public String getDhon_bal(){
		return this.dhon_bal;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_3540_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_3540_ADM dm = (AD_DEP_3540_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.dlco_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.eps_clsf);
		cstmt.setString(8, dm.enty_clsf);
		cstmt.setString(9, dm.rcpm_slip_no);
		cstmt.setString(10, dm.bank_cd);
		cstmt.setString(11, dm.note_no);
		cstmt.setString(12, dm.note_seq);
		cstmt.setString(13, dm.dhon_occr_dt);
		cstmt.setString(14, dm.dhon_amt);
		cstmt.setString(15, dm.dhon_bal);
		cstmt.setString(16, dm.issu_pers_nm);
		cstmt.setString(17, dm.incmg_pers_ip);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.registerOutParameter(19, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_3540_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("eps_clsf = [" + getEps_clsf() + "]");
		System.out.println("enty_clsf = [" + getEnty_clsf() + "]");
		System.out.println("rcpm_slip_no = [" + getRcpm_slip_no() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("dhon_occr_dt = [" + getDhon_occr_dt() + "]");
		System.out.println("dhon_amt = [" + getDhon_amt() + "]");
		System.out.println("dhon_bal = [" + getDhon_bal() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String eps_clsf = req.getParameter("eps_clsf");
if( eps_clsf == null){
	System.out.println(this.toString+" : eps_clsf is null" );
}else{
	System.out.println(this.toString+" : eps_clsf is "+eps_clsf );
}
String enty_clsf = req.getParameter("enty_clsf");
if( enty_clsf == null){
	System.out.println(this.toString+" : enty_clsf is null" );
}else{
	System.out.println(this.toString+" : enty_clsf is "+enty_clsf );
}
String rcpm_slip_no = req.getParameter("rcpm_slip_no");
if( rcpm_slip_no == null){
	System.out.println(this.toString+" : rcpm_slip_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no is "+rcpm_slip_no );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String dhon_occr_dt = req.getParameter("dhon_occr_dt");
if( dhon_occr_dt == null){
	System.out.println(this.toString+" : dhon_occr_dt is null" );
}else{
	System.out.println(this.toString+" : dhon_occr_dt is "+dhon_occr_dt );
}
String dhon_amt = req.getParameter("dhon_amt");
if( dhon_amt == null){
	System.out.println(this.toString+" : dhon_amt is null" );
}else{
	System.out.println(this.toString+" : dhon_amt is "+dhon_amt );
}
String dhon_bal = req.getParameter("dhon_bal");
if( dhon_bal == null){
	System.out.println(this.toString+" : dhon_bal is null" );
}else{
	System.out.println(this.toString+" : dhon_bal is "+dhon_bal );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
String enty_clsf = Util.checkString(req.getParameter("enty_clsf"));
String rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));
String dhon_amt = Util.checkString(req.getParameter("dhon_amt"));
String dhon_bal = Util.checkString(req.getParameter("dhon_bal"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String eps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_clsf")));
String enty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("enty_clsf")));
String rcpm_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String dhon_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_occr_dt")));
String dhon_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_amt")));
String dhon_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_bal")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
dm.setEps_clsf(eps_clsf);
dm.setEnty_clsf(enty_clsf);
dm.setRcpm_slip_no(rcpm_slip_no);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setDhon_occr_dt(dhon_occr_dt);
dm.setDhon_amt(dhon_amt);
dm.setDhon_bal(dhon_bal);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 27 17:01:41 KST 2009 */