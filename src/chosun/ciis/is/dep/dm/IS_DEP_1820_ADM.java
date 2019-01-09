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


public class IS_DEP_1820_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String sale_dlco_li_seq;
	public String aft_dept_cd;
	public String aft_sub_dept_cd;
	public String aft_chrg_pers;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_1820_ADM(){}
	public IS_DEP_1820_ADM(String cmpy_cd, String acwr_reg_dt, String acwr_reg_seq, String sale_dlco_li_seq, String aft_dept_cd, String aft_sub_dept_cd, String aft_chrg_pers, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.acwr_reg_dt = acwr_reg_dt;
		this.acwr_reg_seq = acwr_reg_seq;
		this.sale_dlco_li_seq = sale_dlco_li_seq;
		this.aft_dept_cd = aft_dept_cd;
		this.aft_sub_dept_cd = aft_sub_dept_cd;
		this.aft_chrg_pers = aft_chrg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setAft_dept_cd(String aft_dept_cd){
		this.aft_dept_cd = aft_dept_cd;
	}

	public void setAft_sub_dept_cd(String aft_sub_dept_cd){
		this.aft_sub_dept_cd = aft_sub_dept_cd;
	}

	public void setAft_chrg_pers(String aft_chrg_pers){
		this.aft_chrg_pers = aft_chrg_pers;
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

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getSale_dlco_li_seq(){
		return this.sale_dlco_li_seq;
	}

	public String getAft_dept_cd(){
		return this.aft_dept_cd;
	}

	public String getAft_sub_dept_cd(){
		return this.aft_sub_dept_cd;
	}

	public String getAft_chrg_pers(){
		return this.aft_chrg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1820_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1820_ADM dm = (IS_DEP_1820_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acwr_reg_dt);
		cstmt.setString(5, dm.acwr_reg_seq);
		cstmt.setString(6, dm.sale_dlco_li_seq);
		cstmt.setString(7, dm.aft_dept_cd);
		cstmt.setString(8, dm.aft_sub_dept_cd);
		cstmt.setString(9, dm.aft_chrg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
		cstmt.setString(11, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1820_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acwr_reg_dt = [" + getAcwr_reg_dt() + "]");
		System.out.println("acwr_reg_seq = [" + getAcwr_reg_seq() + "]");
		System.out.println("sale_dlco_li_seq = [" + getSale_dlco_li_seq() + "]");
		System.out.println("aft_dept_cd = [" + getAft_dept_cd() + "]");
		System.out.println("aft_sub_dept_cd = [" + getAft_sub_dept_cd() + "]");
		System.out.println("aft_chrg_pers = [" + getAft_chrg_pers() + "]");
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
String aft_dept_cd = req.getParameter("aft_dept_cd");
if( aft_dept_cd == null){
	System.out.println(this.toString+" : aft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : aft_dept_cd is "+aft_dept_cd );
}
String aft_sub_dept_cd = req.getParameter("aft_sub_dept_cd");
if( aft_sub_dept_cd == null){
	System.out.println(this.toString+" : aft_sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : aft_sub_dept_cd is "+aft_sub_dept_cd );
}
String aft_chrg_pers = req.getParameter("aft_chrg_pers");
if( aft_chrg_pers == null){
	System.out.println(this.toString+" : aft_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : aft_chrg_pers is "+aft_chrg_pers );
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
String acwr_reg_dt = Util.checkString(req.getParameter("acwr_reg_dt"));
String acwr_reg_seq = Util.checkString(req.getParameter("acwr_reg_seq"));
String sale_dlco_li_seq = Util.checkString(req.getParameter("sale_dlco_li_seq"));
String aft_dept_cd = Util.checkString(req.getParameter("aft_dept_cd"));
String aft_sub_dept_cd = Util.checkString(req.getParameter("aft_sub_dept_cd"));
String aft_chrg_pers = Util.checkString(req.getParameter("aft_chrg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_dt")));
String acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_reg_seq")));
String sale_dlco_li_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dlco_li_seq")));
String aft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("aft_dept_cd")));
String aft_sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("aft_sub_dept_cd")));
String aft_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("aft_chrg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcwr_reg_dt(acwr_reg_dt);
dm.setAcwr_reg_seq(acwr_reg_seq);
dm.setSale_dlco_li_seq(sale_dlco_li_seq);
dm.setAft_dept_cd(aft_dept_cd);
dm.setAft_sub_dept_cd(aft_sub_dept_cd);
dm.setAft_chrg_pers(aft_chrg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 23 09:54:30 KST 2012 */