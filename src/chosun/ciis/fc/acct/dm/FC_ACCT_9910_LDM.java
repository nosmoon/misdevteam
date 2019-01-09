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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_9910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_no;
	public String search_dt_fr;
	public String search_dt_to;
	public String dlco_clsf;
	public String dlco_no;
	public String patr_chrg_pers;
	public String chrg_pers;
	public String search_wd;
	public String search_opt;
	public String list_grd;

	public FC_ACCT_9910_LDM(){}
	public FC_ACCT_9910_LDM(String cmpy_cd, String dept_no, String search_dt_fr, String search_dt_to, String dlco_clsf, String dlco_no, String patr_chrg_pers, String chrg_pers, String search_wd, String search_opt, String list_grd){
		this.cmpy_cd = cmpy_cd;
		this.dept_no = dept_no;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.dlco_clsf = dlco_clsf;
		this.dlco_no = dlco_no;
		this.patr_chrg_pers = patr_chrg_pers;
		this.chrg_pers = chrg_pers;
		this.search_wd = search_wd;
		this.search_opt = search_opt;
		this.list_grd = list_grd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_no(String dept_no){
		this.dept_no = dept_no;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPatr_chrg_pers(String patr_chrg_pers){
		this.patr_chrg_pers = patr_chrg_pers;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSearch_wd(String search_wd){
		this.search_wd = search_wd;
	}

	public void setSearch_opt(String search_opt){
		this.search_opt = search_opt;
	}

	public void setList_grd(String list_grd){
		this.list_grd = list_grd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_no(){
		return this.dept_no;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPatr_chrg_pers(){
		return this.patr_chrg_pers;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSearch_wd(){
		return this.search_wd;
	}

	public String getSearch_opt(){
		return this.search_opt;
	}

	public String getList_grd(){
		return this.list_grd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_9910_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_9910_LDM dm = (FC_ACCT_9910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_no);
		cstmt.setString(5, dm.search_dt_fr);
		cstmt.setString(6, dm.search_dt_to);
		cstmt.setString(7, dm.dlco_clsf);
		cstmt.setString(8, dm.dlco_no);
		cstmt.setString(9, dm.patr_chrg_pers);
		cstmt.setString(10, dm.chrg_pers);
		cstmt.setString(11, dm.search_wd);
		cstmt.setString(12, dm.search_opt);
		cstmt.setString(13, dm.list_grd);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_9910_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_no = [" + getDept_no() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("patr_chrg_pers = [" + getPatr_chrg_pers() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("search_wd = [" + getSearch_wd() + "]");
		System.out.println("search_opt = [" + getSearch_opt() + "]");
		System.out.println("list_grd = [" + getList_grd() + "]");
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
String dept_no = req.getParameter("dept_no");
if( dept_no == null){
	System.out.println(this.toString+" : dept_no is null" );
}else{
	System.out.println(this.toString+" : dept_no is "+dept_no );
}
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
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
String patr_chrg_pers = req.getParameter("patr_chrg_pers");
if( patr_chrg_pers == null){
	System.out.println(this.toString+" : patr_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : patr_chrg_pers is "+patr_chrg_pers );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String search_wd = req.getParameter("search_wd");
if( search_wd == null){
	System.out.println(this.toString+" : search_wd is null" );
}else{
	System.out.println(this.toString+" : search_wd is "+search_wd );
}
String search_opt = req.getParameter("search_opt");
if( search_opt == null){
	System.out.println(this.toString+" : search_opt is null" );
}else{
	System.out.println(this.toString+" : search_opt is "+search_opt );
}
String list_grd = req.getParameter("list_grd");
if( list_grd == null){
	System.out.println(this.toString+" : list_grd is null" );
}else{
	System.out.println(this.toString+" : list_grd is "+list_grd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_no = Util.checkString(req.getParameter("dept_no"));
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String search_wd = Util.checkString(req.getParameter("search_wd"));
String search_opt = Util.checkString(req.getParameter("search_opt"));
String list_grd = Util.checkString(req.getParameter("list_grd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_no")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String patr_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_chrg_pers")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String search_wd = Util.Uni2Ksc(Util.checkString(req.getParameter("search_wd")));
String search_opt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_opt")));
String list_grd = Util.Uni2Ksc(Util.checkString(req.getParameter("list_grd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_no(dept_no);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_no(dlco_no);
dm.setPatr_chrg_pers(patr_chrg_pers);
dm.setChrg_pers(chrg_pers);
dm.setSearch_wd(search_wd);
dm.setSearch_opt(search_opt);
dm.setList_grd(list_grd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 14 15:25:40 KST 2014 */