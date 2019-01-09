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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dept_cd;
	public String cmpy_cd;
	public String proc_stat_clsf;
	public String now_date;

	public HD_HLYWRK_1103_LDM(){}
	public HD_HLYWRK_1103_LDM(String dept_cd, String cmpy_cd, String proc_stat_clsf, String now_date){
		this.dept_cd = dept_cd;
		this.cmpy_cd = cmpy_cd;
		this.proc_stat_clsf = proc_stat_clsf;
		this.now_date = now_date;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_stat_clsf(String proc_stat_clsf){
		this.proc_stat_clsf = proc_stat_clsf;
	}

	public void setNow_date(String now_date){
		this.now_date = now_date;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_stat_clsf(){
		return this.proc_stat_clsf;
	}

	public String getNow_date(){
		return this.now_date;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1103_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1103_LDM dm = (HD_HLYWRK_1103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dept_cd);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.proc_stat_clsf);
		cstmt.setString(6, dm.now_date);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proc_stat_clsf = [" + getProc_stat_clsf() + "]");
		System.out.println("now_date = [" + getNow_date() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String proc_stat_clsf = req.getParameter("proc_stat_clsf");
if( proc_stat_clsf == null){
	System.out.println(this.toString+" : proc_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : proc_stat_clsf is "+proc_stat_clsf );
}
String now_date = req.getParameter("now_date");
if( now_date == null){
	System.out.println(this.toString+" : now_date is null" );
}else{
	System.out.println(this.toString+" : now_date is "+now_date );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String proc_stat_clsf = Util.checkString(req.getParameter("proc_stat_clsf"));
String now_date = Util.checkString(req.getParameter("now_date"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_clsf")));
String now_date = Util.Uni2Ksc(Util.checkString(req.getParameter("now_date")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDept_cd(dept_cd);
dm.setCmpy_cd(cmpy_cd);
dm.setProc_stat_clsf(proc_stat_clsf);
dm.setNow_date(now_date);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Oct 01 14:10:53 KST 2009 */