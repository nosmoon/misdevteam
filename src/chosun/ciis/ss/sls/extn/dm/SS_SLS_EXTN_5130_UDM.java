/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5130_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String regdt;
	public String regno;
	public String rcpm_slip_no;
	public String proc_yn;
	public String proc_dt;

	public SS_SLS_EXTN_5130_UDM(){}
	public SS_SLS_EXTN_5130_UDM(String incmgpers, String regdt, String regno, String rcpm_slip_no, String proc_yn, String proc_dt){
		this.incmgpers = incmgpers;
		this.regdt = regdt;
		this.regno = regno;
		this.rcpm_slip_no = rcpm_slip_no;
		this.proc_yn = proc_yn;
		this.proc_dt = proc_dt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRcpm_slip_no(String rcpm_slip_no){
		this.rcpm_slip_no = rcpm_slip_no;
	}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRcpm_slip_no(){
		return this.rcpm_slip_no;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5130_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5130_UDM dm = (SS_SLS_EXTN_5130_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.regdt);
		cstmt.setString(5, dm.regno);
		cstmt.setString(6, dm.rcpm_slip_no);
		cstmt.setString(7, dm.proc_yn);
		cstmt.setString(8, dm.proc_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5130_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("regdt = [" + getRegdt() + "]");
		System.out.println("regno = [" + getRegno() + "]");
		System.out.println("rcpm_slip_no = [" + getRcpm_slip_no() + "]");
		System.out.println("proc_yn = [" + getProc_yn() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rcpm_slip_no = req.getParameter("rcpm_slip_no");
if( rcpm_slip_no == null){
	System.out.println(this.toString+" : rcpm_slip_no is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_no is "+rcpm_slip_no );
}
String proc_yn = req.getParameter("proc_yn");
if( proc_yn == null){
	System.out.println(this.toString+" : proc_yn is null" );
}else{
	System.out.println(this.toString+" : proc_yn is "+proc_yn );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rcpm_slip_no = Util.checkString(req.getParameter("rcpm_slip_no"));
String proc_yn = Util.checkString(req.getParameter("proc_yn"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rcpm_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_no")));
String proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yn")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRcpm_slip_no(rcpm_slip_no);
dm.setProc_yn(proc_yn);
dm.setProc_dt(proc_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 05 14:05:56 KST 2016 */