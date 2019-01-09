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


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fee_pay_yn;
	public String pay_clsf;
	public String rcpm_slip_no;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_TAX_1820_ADM(){}
	public AD_TAX_1820_ADM(String cmpy_cd, String fee_pay_yn, String pay_clsf, String rcpm_slip_no, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.fee_pay_yn = fee_pay_yn;
		this.pay_clsf = pay_clsf;
		this.rcpm_slip_no = rcpm_slip_no;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFee_pay_yn(String fee_pay_yn){
		this.fee_pay_yn = fee_pay_yn;
	}

	public void setPay_clsf(String pay_clsf){
		this.pay_clsf = pay_clsf;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
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

	public String getFee_pay_yn(){
		return this.fee_pay_yn;
	}

	public String getPay_clsf(){
		return this.pay_clsf;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_TAX_1820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1820_ADM dm = (AD_TAX_1820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fee_pay_yn);
		cstmt.setString(5, dm.pay_clsf);
		cstmt.setString(6, dm.rcpm_slip_no);
		cstmt.setString(7, dm.slip_clsf_cd);
		cstmt.setString(8, dm.slip_occr_dt);
		cstmt.setString(9, dm.slip_seq);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1820_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fee_pay_yn = [" + getFee_pay_yn() + "]");
		System.out.println("pay_clsf = [" + getPay_clsf() + "]");
		System.out.println("rcpm_slip_no = [" + getRcpm_slip_no() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
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
String fee_pay_yn = req.getParameter("fee_pay_yn");
if( fee_pay_yn == null){
	System.out.println(this.toString+" : fee_pay_yn is null" );
}else{
	System.out.println(this.toString+" : fee_pay_yn is "+fee_pay_yn );
}
String pay_clsf = req.getParameter("pay_clsf");
if( pay_clsf == null){
	System.out.println(this.toString+" : pay_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_clsf is "+pay_clsf );
}
String rcpm_slip_no = req.getParameter("rcpm_slip_no");
if( rcpm_slip_no == null){
	System.out.println(this.toString+" : rcpm_slip_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no is "+rcpm_slip_no );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
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
String fee_pay_yn = Util.checkString(req.getParameter("fee_pay_yn"));
String pay_clsf = Util.checkString(req.getParameter("pay_clsf"));
String rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fee_pay_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fee_pay_yn")));
String pay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_clsf")));
String rcpm_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFee_pay_yn(fee_pay_yn);
dm.setPay_clsf(pay_clsf);
dm.setRcpm_slip_no(rcpm_slip_no);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 19:56:36 KST 2009 */