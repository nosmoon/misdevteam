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


public class IS_DEP_4010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aprv_dt_fr;
	public String aprv_dt_to;
	public String tmnl_no;
	public String card_cmpy_cd;
	public String proc_stat;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_no;
	public String incmg_pers;

	public IS_DEP_4010_LDM(){}
	public IS_DEP_4010_LDM(String cmpy_cd, String aprv_dt_fr, String aprv_dt_to, String tmnl_no, String card_cmpy_cd, String proc_stat, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_no, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.aprv_dt_fr = aprv_dt_fr;
		this.aprv_dt_to = aprv_dt_to;
		this.tmnl_no = tmnl_no;
		this.card_cmpy_cd = card_cmpy_cd;
		this.proc_stat = proc_stat;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_no = dlco_no;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAprv_dt_fr(String aprv_dt_fr){
		this.aprv_dt_fr = aprv_dt_fr;
	}

	public void setAprv_dt_to(String aprv_dt_to){
		this.aprv_dt_to = aprv_dt_to;
	}

	public void setTmnl_no(String tmnl_no){
		this.tmnl_no = tmnl_no;
	}

	public void setCard_cmpy_cd(String card_cmpy_cd){
		this.card_cmpy_cd = card_cmpy_cd;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAprv_dt_fr(){
		return this.aprv_dt_fr;
	}

	public String getAprv_dt_to(){
		return this.aprv_dt_to;
	}

	public String getTmnl_no(){
		return this.tmnl_no;
	}

	public String getCard_cmpy_cd(){
		return this.card_cmpy_cd;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4010_LDM dm = (IS_DEP_4010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aprv_dt_fr);
		cstmt.setString(5, dm.aprv_dt_to);
		cstmt.setString(6, dm.tmnl_no);
		cstmt.setString(7, dm.card_cmpy_cd);
		cstmt.setString(8, dm.proc_stat);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.sub_dept_cd);
		cstmt.setString(11, dm.chrg_pers);
		cstmt.setString(12, dm.dlco_no);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aprv_dt_fr = [" + getAprv_dt_fr() + "]");
		System.out.println("aprv_dt_to = [" + getAprv_dt_to() + "]");
		System.out.println("tmnl_no = [" + getTmnl_no() + "]");
		System.out.println("card_cmpy_cd = [" + getCard_cmpy_cd() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String aprv_dt_fr = req.getParameter("aprv_dt_fr");
if( aprv_dt_fr == null){
	System.out.println(this.toString+" : aprv_dt_fr is null" );
}else{
	System.out.println(this.toString+" : aprv_dt_fr is "+aprv_dt_fr );
}
String aprv_dt_to = req.getParameter("aprv_dt_to");
if( aprv_dt_to == null){
	System.out.println(this.toString+" : aprv_dt_to is null" );
}else{
	System.out.println(this.toString+" : aprv_dt_to is "+aprv_dt_to );
}
String tmnl_no = req.getParameter("tmnl_no");
if( tmnl_no == null){
	System.out.println(this.toString+" : tmnl_no is null" );
}else{
	System.out.println(this.toString+" : tmnl_no is "+tmnl_no );
}
String card_cmpy_cd = req.getParameter("card_cmpy_cd");
if( card_cmpy_cd == null){
	System.out.println(this.toString+" : card_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : card_cmpy_cd is "+card_cmpy_cd );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
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
String aprv_dt_fr = Util.checkString(req.getParameter("aprv_dt_fr"));
String aprv_dt_to = Util.checkString(req.getParameter("aprv_dt_to"));
String tmnl_no = Util.checkString(req.getParameter("tmnl_no"));
String card_cmpy_cd = Util.checkString(req.getParameter("card_cmpy_cd"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aprv_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_dt_fr")));
String aprv_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aprv_dt_to")));
String tmnl_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tmnl_no")));
String card_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("card_cmpy_cd")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAprv_dt_fr(aprv_dt_fr);
dm.setAprv_dt_to(aprv_dt_to);
dm.setTmnl_no(tmnl_no);
dm.setCard_cmpy_cd(card_cmpy_cd);
dm.setProc_stat(proc_stat);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_no(dlco_no);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 09 22:51:35 KST 2012 */