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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_3530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String sale_proc_dt;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;
	public String tot_rvord_amt;
	public String rcpm_tot_amt;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_3530_ADM(){}
	public IS_DEP_3530_ADM(String cmpy_cd, String dlco_no, String sale_proc_dt, String acwr_reg_dt, String acwr_reg_seq, String sale_dlco_li_seq, String tot_rvord_amt, String rcpm_tot_amt, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.sale_proc_dt = sale_proc_dt;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.sale_dlco_li_seq = sale_dlco_li_seq;
		this.tot_rvord_amt = tot_rvord_amt;
		this.rcpm_tot_amt = rcpm_tot_amt;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSale_proc_dt(String sale_proc_dt){
		this.sale_proc_dt = sale_proc_dt;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setSale_dlco_li_seq(String sale_dlco_li_seq){
		this.sale_dlco_li_seq = sale_dlco_li_seq;
	}

	public void setTot_rvord_amt(String tot_rvord_amt){
		this.tot_rvord_amt = tot_rvord_amt;
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

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSale_proc_dt(){
		return this.sale_proc_dt;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getSale_dlco_li_seq(){
		return this.sale_dlco_li_seq;
	}

	public String getTot_rvord_amt(){
		return this.tot_rvord_amt;
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
		 return "{ call MISISP.SP_IS_DEP_3530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_3530_ADM dm = (IS_DEP_3530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.sale_proc_dt);
		cstmt.setString(6, dm.acwr_reg_dt);
		cstmt.setString(7, dm.acwr_reg_seq);
		cstmt.setString(8, dm.sale_dlco_li_seq);
		cstmt.setString(9, dm.tot_rvord_amt);
		cstmt.setString(10, dm.rcpm_tot_amt);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_3530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sale_proc_dt = [" + getSale_proc_dt() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("sale_dlco_li_seq = [" + getSale_dlco_li_seq() + "]");
		System.out.println("tot_rvord_amt = [" + getTot_rvord_amt() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sale_proc_dt = req.getParameter("sale_proc_dt");
if( sale_proc_dt == null){
	System.out.println(this.toString+" : sale_proc_dt is null" );
}else{
	System.out.println(this.toString+" : sale_proc_dt is "+sale_proc_dt );
}
String acwr_reg_dt = req.getParameter("acwr_reg_dt");
if( acwr_reg_dt == null){
	System.out.println(this.toString+" : acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_dt is "+acwr_reg_dt );
}
String acwr_reg_seq = req.getParameter("acwr_reg_seq");
if( acwr_reg_seq == null){
	System.out.println(this.toString+" : acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : acwr_reg_seq is "+acwr_reg_seq );
}
String sale_dlco_li_seq = req.getParameter("sale_dlco_li_seq");
if( sale_dlco_li_seq == null){
	System.out.println(this.toString+" : sale_dlco_li_seq is null" );
}else{
	System.out.println(this.toString+" : sale_dlco_li_seq is "+sale_dlco_li_seq );
}
String tot_rvord_amt = req.getParameter("tot_rvord_amt");
if( tot_rvord_amt == null){
	System.out.println(this.toString+" : tot_rvord_amt is null" );
}else{
	System.out.println(this.toString+" : tot_rvord_amt is "+tot_rvord_amt );
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
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sale_proc_dt = Util.checkString(req.getParameter("sale_proc_dt"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String sale_dlco_li_seq = Util.checkString(req.getParameter("sale_dlco_li_seq"));
String tot_rvord_amt = Util.checkString(req.getParameter("tot_rvord_amt"));
String rcpm_tot_amt = Util.checkString(req.getParameter("rcpm_tot_amt"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sale_proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_proc_dt")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String sale_dlco_li_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dlco_li_seq")));
String tot_rvord_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_rvord_amt")));
String rcpm_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_tot_amt")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setSale_proc_dt(sale_proc_dt);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setSale_dlco_li_seq(sale_dlco_li_seq);
dm.setTot_rvord_amt(tot_rvord_amt);
dm.setRcpm_tot_amt(rcpm_tot_amt);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 18 19:33:38 KST 2012 */