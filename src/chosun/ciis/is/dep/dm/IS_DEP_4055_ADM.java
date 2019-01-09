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


public class IS_DEP_4055_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String card_rcpm_reg_dt;
	public String card_rcpm_reg_seq;
	public String setoff_yn;
	public String setoff_suply_amt;
	public String setoff_vat_amt;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_4055_ADM(){}
	public IS_DEP_4055_ADM(String flag, String cmpy_cd, String card_rcpm_reg_dt, String card_rcpm_reg_seq, String setoff_yn, String setoff_suply_amt, String setoff_vat_amt, String acwr_reg_dt, String acwr_reg_seq, String sale_dlco_li_seq, String incmg_pers_ip, String incmg_pers){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
		this.setoff_yn = setoff_yn;
		this.setoff_suply_amt = setoff_suply_amt;
		this.setoff_vat_amt = setoff_vat_amt;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.sale_dlco_li_seq = sale_dlco_li_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_rcpm_reg_dt(String card_rcpm_reg_dt){
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
	}

	public void setCard_rcpm_reg_seq(String card_rcpm_reg_seq){
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setSetoff_suply_amt(String setoff_suply_amt){
		this.setoff_suply_amt = setoff_suply_amt;
	}

	public void setSetoff_vat_amt(String setoff_vat_amt){
		this.setoff_vat_amt = setoff_vat_amt;
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

	public String getCard_rcpm_reg_dt(){
		return this.card_rcpm_reg_dt;
	}

	public String getCard_rcpm_reg_seq(){
		return this.card_rcpm_reg_seq;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getSetoff_suply_amt(){
		return this.setoff_suply_amt;
	}

	public String getSetoff_vat_amt(){
		return this.setoff_vat_amt;
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

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4055_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4055_ADM dm = (IS_DEP_4055_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.card_rcpm_reg_dt);
		cstmt.setString(6, dm.card_rcpm_reg_seq);
		cstmt.setString(7, dm.setoff_yn);
		cstmt.setString(8, dm.setoff_suply_amt);
		cstmt.setString(9, dm.setoff_vat_amt);
		cstmt.setString(10, dm.acwr_reg_dt);
		cstmt.setString(11, dm.acwr_reg_seq);
		cstmt.setString(12, dm.sale_dlco_li_seq);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4055_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("card_rcpm_reg_dt = [" + getCard_rcpm_reg_dt() + "]");
		System.out.println("card_rcpm_reg_seq = [" + getCard_rcpm_reg_seq() + "]");
		System.out.println("setoff_yn = [" + getSetoff_yn() + "]");
		System.out.println("setoff_suply_amt = [" + getSetoff_suply_amt() + "]");
		System.out.println("setoff_vat_amt = [" + getSetoff_vat_amt() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("sale_dlco_li_seq = [" + getSale_dlco_li_seq() + "]");
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
String card_rcpm_reg_dt = req.getParameter("card_rcpm_reg_dt");
if( card_rcpm_reg_dt == null){
	System.out.println(this.toString+" : card_rcpm_reg_dt is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_dt is "+card_rcpm_reg_dt );
}
String card_rcpm_reg_seq = req.getParameter("card_rcpm_reg_seq");
if( card_rcpm_reg_seq == null){
	System.out.println(this.toString+" : card_rcpm_reg_seq is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_seq is "+card_rcpm_reg_seq );
}
String setoff_yn = req.getParameter("setoff_yn");
if( setoff_yn == null){
	System.out.println(this.toString+" : setoff_yn is null" );
}else{
	System.out.println(this.toString+" : setoff_yn is "+setoff_yn );
}
String setoff_suply_amt = req.getParameter("setoff_suply_amt");
if( setoff_suply_amt == null){
	System.out.println(this.toString+" : setoff_suply_amt is null" );
}else{
	System.out.println(this.toString+" : setoff_suply_amt is "+setoff_suply_amt );
}
String setoff_vat_amt = req.getParameter("setoff_vat_amt");
if( setoff_vat_amt == null){
	System.out.println(this.toString+" : setoff_vat_amt is null" );
}else{
	System.out.println(this.toString+" : setoff_vat_amt is "+setoff_vat_amt );
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
String card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
String card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
String setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
String setoff_suply_amt = Util.checkString(req.getParameter("setoff_suply_amt"));
String setoff_vat_amt = Util.checkString(req.getParameter("setoff_vat_amt"));
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String sale_dlco_li_seq = Util.checkString(req.getParameter("sale_dlco_li_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_rcpm_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_dt")));
String card_rcpm_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_seq")));
String setoff_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_yn")));
String setoff_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_suply_amt")));
String setoff_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_vat_amt")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String sale_dlco_li_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dlco_li_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
dm.setSetoff_yn(setoff_yn);
dm.setSetoff_suply_amt(setoff_suply_amt);
dm.setSetoff_vat_amt(setoff_vat_amt);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setSale_dlco_li_seq(sale_dlco_li_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 10 17:25:03 KST 2012 */