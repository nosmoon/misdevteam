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


public class IS_DEP_1510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String drbk_clsf;
	public String proc_frdt;
	public String proc_todt;
	public String dlco_no;

	public IS_DEP_1510_LDM(){}
	public IS_DEP_1510_LDM(String cmpy_cd, String drbk_clsf, String proc_frdt, String proc_todt, String dlco_no){
		this.cmpy_cd = cmpy_cd;
		this.drbk_clsf = drbk_clsf;
		this.proc_frdt = proc_frdt;
		this.proc_todt = proc_todt;
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDrbk_clsf(String drbk_clsf){
		this.drbk_clsf = drbk_clsf;
	}

	public void setProc_frdt(String proc_frdt){
		this.proc_frdt = proc_frdt;
	}

	public void setProc_todt(String proc_todt){
		this.proc_todt = proc_todt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDrbk_clsf(){
		return this.drbk_clsf;
	}

	public String getProc_frdt(){
		return this.proc_frdt;
	}

	public String getProc_todt(){
		return this.proc_todt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_1510_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_1510_LDM dm = (IS_DEP_1510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.drbk_clsf);
		cstmt.setString(5, dm.proc_frdt);
		cstmt.setString(6, dm.proc_todt);
		cstmt.setString(7, dm.dlco_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_1510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drbk_clsf = [" + getDrbk_clsf() + "]");
		System.out.println("proc_frdt = [" + getProc_frdt() + "]");
		System.out.println("proc_todt = [" + getProc_todt() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String drbk_clsf = req.getParameter("drbk_clsf");
if( drbk_clsf == null){
	System.out.println(this.toString+" : drbk_clsf is null" );
}else{
	System.out.println(this.toString+" : drbk_clsf is "+drbk_clsf );
}
String proc_frdt = req.getParameter("proc_frdt");
if( proc_frdt == null){
	System.out.println(this.toString+" : proc_frdt is null" );
}else{
	System.out.println(this.toString+" : proc_frdt is "+proc_frdt );
}
String proc_todt = req.getParameter("proc_todt");
if( proc_todt == null){
	System.out.println(this.toString+" : proc_todt is null" );
}else{
	System.out.println(this.toString+" : proc_todt is "+proc_todt );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
String proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
String proc_todt = Util.checkString(req.getParameter("proc_todt"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String drbk_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drbk_clsf")));
String proc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_frdt")));
String proc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_todt")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDrbk_clsf(drbk_clsf);
dm.setProc_frdt(proc_frdt);
dm.setProc_todt(proc_todt);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 20:13:07 KST 2012 */