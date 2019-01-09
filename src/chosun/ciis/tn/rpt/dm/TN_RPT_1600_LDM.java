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


package chosun.ciis.tn.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.ds.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String srch_startdate;
	public String srch_enddate;
	public String srch_proofstatus;
	public String srch_defaultmonth;

	public TN_RPT_1600_LDM(){}
	public TN_RPT_1600_LDM(String srch_startdate, String srch_enddate, String srch_proofstatus, String srch_defaultmonth){
		this.srch_startdate = srch_startdate;
		this.srch_enddate = srch_enddate;
		this.srch_proofstatus = srch_proofstatus;
		this.srch_defaultmonth = srch_defaultmonth;
	}

	public void setSrch_startdate(String srch_startdate){
		this.srch_startdate = srch_startdate;
	}

	public void setSrch_enddate(String srch_enddate){
		this.srch_enddate = srch_enddate;
	}

	public void setSrch_proofstatus(String srch_proofstatus){
		this.srch_proofstatus = srch_proofstatus;
	}

	public void setSrch_defaultmonth(String srch_defaultmonth){
		this.srch_defaultmonth = srch_defaultmonth;
	}

	public String getSrch_startdate(){
		return this.srch_startdate;
	}

	public String getSrch_enddate(){
		return this.srch_enddate;
	}

	public String getSrch_proofstatus(){
		return this.srch_proofstatus;
	}

	public String getSrch_defaultmonth(){
		return this.srch_defaultmonth;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_RPT_1600_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_RPT_1600_LDM dm = (TN_RPT_1600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.srch_startdate);
		cstmt.setString(4, dm.srch_enddate);
		cstmt.setString(5, dm.srch_proofstatus);
		cstmt.setString(6, dm.srch_defaultmonth);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.rpt.ds.TN_RPT_1600_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("srch_startdate = [" + getSrch_startdate() + "]");
		System.out.println("srch_enddate = [" + getSrch_enddate() + "]");
		System.out.println("srch_proofstatus = [" + getSrch_proofstatus() + "]");
		System.out.println("srch_defaultmonth = [" + getSrch_defaultmonth() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String srch_startdate = req.getParameter("srch_startdate");
if( srch_startdate == null){
	System.out.println(this.toString+" : srch_startdate is null" );
}else{
	System.out.println(this.toString+" : srch_startdate is "+srch_startdate );
}
String srch_enddate = req.getParameter("srch_enddate");
if( srch_enddate == null){
	System.out.println(this.toString+" : srch_enddate is null" );
}else{
	System.out.println(this.toString+" : srch_enddate is "+srch_enddate );
}
String srch_proofstatus = req.getParameter("srch_proofstatus");
if( srch_proofstatus == null){
	System.out.println(this.toString+" : srch_proofstatus is null" );
}else{
	System.out.println(this.toString+" : srch_proofstatus is "+srch_proofstatus );
}
String srch_defaultmonth = req.getParameter("srch_defaultmonth");
if( srch_defaultmonth == null){
	System.out.println(this.toString+" : srch_defaultmonth is null" );
}else{
	System.out.println(this.toString+" : srch_defaultmonth is "+srch_defaultmonth );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String srch_startdate = Util.checkString(req.getParameter("srch_startdate"));
String srch_enddate = Util.checkString(req.getParameter("srch_enddate"));
String srch_proofstatus = Util.checkString(req.getParameter("srch_proofstatus"));
String srch_defaultmonth = Util.checkString(req.getParameter("srch_defaultmonth"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String srch_startdate = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_startdate")));
String srch_enddate = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_enddate")));
String srch_proofstatus = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_proofstatus")));
String srch_defaultmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_defaultmonth")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSrch_startdate(srch_startdate);
dm.setSrch_enddate(srch_enddate);
dm.setSrch_proofstatus(srch_proofstatus);
dm.setSrch_defaultmonth(srch_defaultmonth);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Nov 24 18:18:48 KST 2016 */