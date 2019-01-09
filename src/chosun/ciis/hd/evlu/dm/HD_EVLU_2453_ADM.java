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


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_2453_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String emp_no;
	public String prz_pnsh_cd;
	public String prz_pnsh_nm;
	public String case_nm;
	public String point;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;

	public HD_EVLU_2453_ADM(){}
	public HD_EVLU_2453_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String emp_no, String prz_pnsh_cd, String prz_pnsh_nm, String case_nm, String point, String incmg_pers_ipadd, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.emp_no = emp_no;
		this.prz_pnsh_cd = prz_pnsh_cd;
		this.prz_pnsh_nm = prz_pnsh_nm;
		this.case_nm = case_nm;
		this.point = point;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setPrz_pnsh_cd(String prz_pnsh_cd){
		this.prz_pnsh_cd = prz_pnsh_cd;
	}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setPoint(String point){
		this.point = point;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getPrz_pnsh_cd(){
		return this.prz_pnsh_cd;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getPoint(){
		return this.point;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_2453_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_2453_ADM dm = (HD_EVLU_2453_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evlu_yy);
		cstmt.setString(5, dm.tms_clsf);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.prz_pnsh_cd);
		cstmt.setString(8, dm.prz_pnsh_nm);
		cstmt.setString(9, dm.case_nm);
		cstmt.setString(10, dm.point);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.evlu.ds.HD_EVLU_2453_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("prz_pnsh_cd = [" + getPrz_pnsh_cd() + "]");
		System.out.println("prz_pnsh_nm = [" + getPrz_pnsh_nm() + "]");
		System.out.println("case_nm = [" + getCase_nm() + "]");
		System.out.println("point = [" + getPoint() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String prz_pnsh_cd = req.getParameter("prz_pnsh_cd");
if( prz_pnsh_cd == null){
	System.out.println(this.toString+" : prz_pnsh_cd is null" );
}else{
	System.out.println(this.toString+" : prz_pnsh_cd is "+prz_pnsh_cd );
}
String prz_pnsh_nm = req.getParameter("prz_pnsh_nm");
if( prz_pnsh_nm == null){
	System.out.println(this.toString+" : prz_pnsh_nm is null" );
}else{
	System.out.println(this.toString+" : prz_pnsh_nm is "+prz_pnsh_nm );
}
String case_nm = req.getParameter("case_nm");
if( case_nm == null){
	System.out.println(this.toString+" : case_nm is null" );
}else{
	System.out.println(this.toString+" : case_nm is "+case_nm );
}
String point = req.getParameter("point");
if( point == null){
	System.out.println(this.toString+" : point is null" );
}else{
	System.out.println(this.toString+" : point is "+point );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String prz_pnsh_cd = Util.checkString(req.getParameter("prz_pnsh_cd"));
String prz_pnsh_nm = Util.checkString(req.getParameter("prz_pnsh_nm"));
String case_nm = Util.checkString(req.getParameter("case_nm"));
String point = Util.checkString(req.getParameter("point"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String prz_pnsh_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_pnsh_cd")));
String prz_pnsh_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("prz_pnsh_nm")));
String case_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("case_nm")));
String point = Util.Uni2Ksc(Util.checkString(req.getParameter("point")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEmp_no(emp_no);
dm.setPrz_pnsh_cd(prz_pnsh_cd);
dm.setPrz_pnsh_nm(prz_pnsh_nm);
dm.setCase_nm(case_nm);
dm.setPoint(point);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 27 15:06:16 KST 2014 */