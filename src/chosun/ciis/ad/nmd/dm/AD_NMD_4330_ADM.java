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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String payo_clsf;
	public String payo_slip_occr_dt;
	public String payo_slip_clsf_cd;
	public String payo_slip_seq;
	public String rcpm_slip_occr_dt;
	public String rcpm_slip_clsf_cd;
	public String rcpm_slip_seq;
	public String medi_cd;
	public String hndl_clsf;
	public String dlco_no;
	public String dlco_nm;
	public String precpt_amt_bal;
	public String occr_amt;
	public String drbk_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_NMD_4330_ADM(){}
	public AD_NMD_4330_ADM(String flag, String cmpy_cd, String payo_clsf, String payo_slip_occr_dt, String payo_slip_clsf_cd, String payo_slip_seq, String rcpm_slip_occr_dt, String rcpm_slip_clsf_cd, String rcpm_slip_seq, String medi_cd, String hndl_clsf, String dlco_no, String dlco_nm, String precpt_amt_bal, String occr_amt, String drbk_amt, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.payo_clsf = payo_clsf;
		this.payo_slip_occr_dt = payo_slip_occr_dt;
		this.payo_slip_clsf_cd = payo_slip_clsf_cd;
		this.payo_slip_seq = payo_slip_seq;
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
		this.rcpm_slip_seq = rcpm_slip_seq;
		this.medi_cd = medi_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.dlco_nm = dlco_nm;
		this.precpt_amt_bal = precpt_amt_bal;
		this.occr_amt = occr_amt;
		this.drbk_amt = drbk_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPayo_clsf(String payo_clsf){
		this.payo_clsf = payo_clsf;
	}

	public void setPayo_slip_occr_dt(String payo_slip_occr_dt){
		this.payo_slip_occr_dt = payo_slip_occr_dt;
	}

	public void setPayo_slip_clsf_cd(String payo_slip_clsf_cd){
		this.payo_slip_clsf_cd = payo_slip_clsf_cd;
	}

	public void setPayo_slip_seq(String payo_slip_seq){
		this.payo_slip_seq = payo_slip_seq;
	}

	public void setRcpm_slip_occr_dt(String rcpm_slip_occr_dt){
		this.rcpm_slip_occr_dt = rcpm_slip_occr_dt;
	}

	public void setRcpm_slip_clsf_cd(String rcpm_slip_clsf_cd){
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
	}

	public void setRcpm_slip_seq(String rcpm_slip_seq){
		this.rcpm_slip_seq = rcpm_slip_seq;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPrecpt_amt_bal(String precpt_amt_bal){
		this.precpt_amt_bal = precpt_amt_bal;
	}

	public void setOccr_amt(String occr_amt){
		this.occr_amt = occr_amt;
	}

	public void setDrbk_amt(String drbk_amt){
		this.drbk_amt = drbk_amt;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPayo_clsf(){
		return this.payo_clsf;
	}

	public String getPayo_slip_occr_dt(){
		return this.payo_slip_occr_dt;
	}

	public String getPayo_slip_clsf_cd(){
		return this.payo_slip_clsf_cd;
	}

	public String getPayo_slip_seq(){
		return this.payo_slip_seq;
	}

	public String getRcpm_slip_occr_dt(){
		return this.rcpm_slip_occr_dt;
	}

	public String getRcpm_slip_clsf_cd(){
		return this.rcpm_slip_clsf_cd;
	}

	public String getRcpm_slip_seq(){
		return this.rcpm_slip_seq;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPrecpt_amt_bal(){
		return this.precpt_amt_bal;
	}

	public String getOccr_amt(){
		return this.occr_amt;
	}

	public String getDrbk_amt(){
		return this.drbk_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4330_ADM dm = (AD_NMD_4330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.payo_clsf);
		cstmt.setString(6, dm.payo_slip_occr_dt);
		cstmt.setString(7, dm.payo_slip_clsf_cd);
		cstmt.setString(8, dm.payo_slip_seq);
		cstmt.setString(9, dm.rcpm_slip_occr_dt);
		cstmt.setString(10, dm.rcpm_slip_clsf_cd);
		cstmt.setString(11, dm.rcpm_slip_seq);
		cstmt.setString(12, dm.medi_cd);
		cstmt.setString(13, dm.hndl_clsf);
		cstmt.setString(14, dm.dlco_no);
		cstmt.setString(15, dm.dlco_nm);
		cstmt.setString(16, dm.precpt_amt_bal);
		cstmt.setString(17, dm.occr_amt);
		cstmt.setString(18, dm.drbk_amt);
		cstmt.setString(19, dm.incmg_pers_ip);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.registerOutParameter(21, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4330_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("payo_clsf = [" + getPayo_clsf() + "]");
		System.out.println("payo_slip_occr_dt = [" + getPayo_slip_occr_dt() + "]");
		System.out.println("payo_slip_clsf_cd = [" + getPayo_slip_clsf_cd() + "]");
		System.out.println("payo_slip_seq = [" + getPayo_slip_seq() + "]");
		System.out.println("rcpm_slip_occr_dt = [" + getRcpm_slip_occr_dt() + "]");
		System.out.println("rcpm_slip_clsf_cd = [" + getRcpm_slip_clsf_cd() + "]");
		System.out.println("rcpm_slip_seq = [" + getRcpm_slip_seq() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("precpt_amt_bal = [" + getPrecpt_amt_bal() + "]");
		System.out.println("occr_amt = [" + getOccr_amt() + "]");
		System.out.println("drbk_amt = [" + getDrbk_amt() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String payo_clsf = req.getParameter("payo_clsf");
if( payo_clsf == null){
	System.out.println(this.toString+" : payo_clsf is null" );
}else{
	System.out.println(this.toString+" : payo_clsf is "+payo_clsf );
}
String payo_slip_occr_dt = req.getParameter("payo_slip_occr_dt");
if( payo_slip_occr_dt == null){
	System.out.println(this.toString+" : payo_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : payo_slip_occr_dt is "+payo_slip_occr_dt );
}
String payo_slip_clsf_cd = req.getParameter("payo_slip_clsf_cd");
if( payo_slip_clsf_cd == null){
	System.out.println(this.toString+" : payo_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : payo_slip_clsf_cd is "+payo_slip_clsf_cd );
}
String payo_slip_seq = req.getParameter("payo_slip_seq");
if( payo_slip_seq == null){
	System.out.println(this.toString+" : payo_slip_seq is null" );
}else{
	System.out.println(this.toString+" : payo_slip_seq is "+payo_slip_seq );
}
String rcpm_slip_occr_dt = req.getParameter("rcpm_slip_occr_dt");
if( rcpm_slip_occr_dt == null){
	System.out.println(this.toString+" : rcpm_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_occr_dt is "+rcpm_slip_occr_dt );
}
String rcpm_slip_clsf_cd = req.getParameter("rcpm_slip_clsf_cd");
if( rcpm_slip_clsf_cd == null){
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is "+rcpm_slip_clsf_cd );
}
String rcpm_slip_seq = req.getParameter("rcpm_slip_seq");
if( rcpm_slip_seq == null){
	System.out.println(this.toString+" : rcpm_slip_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_seq is "+rcpm_slip_seq );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
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
String precpt_amt_bal = req.getParameter("precpt_amt_bal");
if( precpt_amt_bal == null){
	System.out.println(this.toString+" : precpt_amt_bal is null" );
}else{
	System.out.println(this.toString+" : precpt_amt_bal is "+precpt_amt_bal );
}
String occr_amt = req.getParameter("occr_amt");
if( occr_amt == null){
	System.out.println(this.toString+" : occr_amt is null" );
}else{
	System.out.println(this.toString+" : occr_amt is "+occr_amt );
}
String drbk_amt = req.getParameter("drbk_amt");
if( drbk_amt == null){
	System.out.println(this.toString+" : drbk_amt is null" );
}else{
	System.out.println(this.toString+" : drbk_amt is "+drbk_amt );
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
String payo_clsf = Util.checkString(req.getParameter("payo_clsf"));
String payo_slip_occr_dt = Util.checkString(req.getParameter("payo_slip_occr_dt"));
String payo_slip_clsf_cd = Util.checkString(req.getParameter("payo_slip_clsf_cd"));
String payo_slip_seq = Util.checkString(req.getParameter("payo_slip_seq"));
String rcpm_slip_occr_dt = Util.checkString(req.getParameter("rcpm_slip_occr_dt"));
String rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
String rcpm_slip_seq = Util.checkString(req.getParameter("rcpm_slip_seq"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String precpt_amt_bal = Util.checkString(req.getParameter("precpt_amt_bal"));
String occr_amt = Util.checkString(req.getParameter("occr_amt"));
String drbk_amt = Util.checkString(req.getParameter("drbk_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String payo_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_clsf")));
String payo_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_slip_occr_dt")));
String payo_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_slip_clsf_cd")));
String payo_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("payo_slip_seq")));
String rcpm_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_occr_dt")));
String rcpm_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_clsf_cd")));
String rcpm_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_seq")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String precpt_amt_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("precpt_amt_bal")));
String occr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_amt")));
String drbk_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("drbk_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setPayo_clsf(payo_clsf);
dm.setPayo_slip_occr_dt(payo_slip_occr_dt);
dm.setPayo_slip_clsf_cd(payo_slip_clsf_cd);
dm.setPayo_slip_seq(payo_slip_seq);
dm.setRcpm_slip_occr_dt(rcpm_slip_occr_dt);
dm.setRcpm_slip_clsf_cd(rcpm_slip_clsf_cd);
dm.setRcpm_slip_seq(rcpm_slip_seq);
dm.setMedi_cd(medi_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setDlco_nm(dlco_nm);
dm.setPrecpt_amt_bal(precpt_amt_bal);
dm.setOccr_amt(occr_amt);
dm.setDrbk_amt(drbk_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 04 11:46:03 KST 2014 */