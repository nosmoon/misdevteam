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

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_3530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String dlco_clsf;
	public String dlco_no;
	public String eps_clsf;
	public String enty_clsf;
	public String pubc_dt;
	public String pubc_slip_no;
	public String pubc_tot_amt;
	public String rcpm_tot_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_DEP_3530_ADM(){}
	public AD_DEP_3530_ADM(String cmpy_cd, String medi_cd, String dlco_clsf, String dlco_no, String eps_clsf, String enty_clsf, String pubc_dt, String pubc_slip_no, String pubc_tot_amt, String rcpm_tot_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.eps_clsf = eps_clsf;
		this.enty_clsf = enty_clsf;
		this.pubc_dt = pubc_dt;
		this.pubc_slip_no = pubc_slip_no;
		this.pubc_tot_amt = pubc_tot_amt;
		this.rcpm_tot_amt = rcpm_tot_amt;
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

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setRcpm_tot_amt(String rcpm_tot_amt){
		this.rcpm_tot_amt = rcpm_tot_amt;
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

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getRcpm_tot_amt(){
		return this.rcpm_tot_amt;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_3530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_3530_ADM dm = (AD_DEP_3530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.dlco_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.eps_clsf);
		cstmt.setString(8, dm.enty_clsf);
		cstmt.setString(9, dm.pubc_dt);
		cstmt.setString(10, dm.pubc_slip_no);
		cstmt.setString(11, dm.pubc_tot_amt);
		cstmt.setString(12, dm.rcpm_tot_amt);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.registerOutParameter(15, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_3530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("eps_clsf = [" + getEps_clsf() + "]");
		System.out.println("enty_clsf = [" + getEnty_clsf() + "]");
		System.out.println("pubc_dt = [" + getPubc_dt() + "]");
		System.out.println("pubc_slip_no = [" + getPubc_slip_no() + "]");
		System.out.println("pubc_tot_amt = [" + getPubc_tot_amt() + "]");
		System.out.println("rcpm_tot_amt = [" + getRcpm_tot_amt() + "]");
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
String pubc_dt = req.getParameter("pubc_dt");
if( pubc_dt == null){
	System.out.println(this.toString+" : pubc_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_dt is "+pubc_dt );
}
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
String pubc_tot_amt = req.getParameter("pubc_tot_amt");
if( pubc_tot_amt == null){
	System.out.println(this.toString+" : pubc_tot_amt is null" );
}else{
	System.out.println(this.toString+" : pubc_tot_amt is "+pubc_tot_amt );
}
String rcpm_tot_amt = req.getParameter("rcpm_tot_amt");
if( rcpm_tot_amt == null){
	System.out.println(this.toString+" : rcpm_tot_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_tot_amt is "+rcpm_tot_amt );
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
String pubc_dt = Util.checkString(req.getParameter("pubc_dt"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
String pubc_tot_amt = Util.checkString(req.getParameter("pubc_tot_amt"));
String rcpm_tot_amt = Util.checkString(req.getParameter("rcpm_tot_amt"));
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
String pubc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_dt")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
String pubc_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_tot_amt")));
String rcpm_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_tot_amt")));
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
dm.setPubc_dt(pubc_dt);
dm.setPubc_slip_no(pubc_slip_no);
dm.setPubc_tot_amt(pubc_tot_amt);
dm.setRcpm_tot_amt(rcpm_tot_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 13:43:30 KST 2009 */