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


package chosun.ciis.tn.dns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.dns.ds.*;
import chosun.ciis.tn.dns.rec.*;

/**
 * 
 */


public class TN_DNS_3130_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String startpaydate;
	public String endpaydate;
	public String deptidx;
	public String includeissued;


	public TN_DNS_3130_LDM(){}
	public TN_DNS_3130_LDM(String cmpy_cd, String startpaydate, String endpaydate, String deptidx, String includeissued){
		this.cmpy_cd = cmpy_cd;
		this.startpaydate = startpaydate;
		this.endpaydate = endpaydate;
		this.deptidx = deptidx;
		this.includeissued = includeissued;
		
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStartpaydate(String startpaydate){
		this.startpaydate = startpaydate;
	}

	public void setEndpaydate(String endpaydate){
		this.endpaydate = endpaydate;
	}
	
	public void setDeptidx(String deptidx) {
		this.deptidx = deptidx;
	}
	
	public void setIncludeissued(String includeissued) {
		this.includeissued = includeissued;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStartpaydate(){
		return this.startpaydate;
	}

	public String getEndpaydate(){
		return this.endpaydate;
	}

	public String getDeptidx() {
		return deptidx;
	}

	public String getIncludeissued() {
		return includeissued;
	}
	
	public String getSQL(){
		 return "{ call MISTNN.SP_TN_DNS_3130_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_DNS_3130_LDM dm = (TN_DNS_3130_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deptidx);
		cstmt.setString(5, dm.includeissued);
		cstmt.setString(6, dm.startpaydate);
		cstmt.setString(7, dm.endpaydate);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.dns.ds.TN_DNS_3130_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("startpaydate = [" + getStartpaydate() + "]");
		System.out.println("endpaydate = [" + getEndpaydate() + "]");
		System.out.println("deptidx = [" + getDeptidx() + "]");
		System.out.println("includeissued = [" + getIncludeissued() + "]");
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
String paydate_fr = req.getParameter("paydate_fr");
if( paydate_fr == null){
	System.out.println(this.toString+" : paydate_fr is null" );
}else{
	System.out.println(this.toString+" : paydate_fr is "+paydate_fr );
}
String paydate_to = req.getParameter("paydate_to");
if( paydate_to == null){
	System.out.println(this.toString+" : paydate_to is null" );
}else{
	System.out.println(this.toString+" : paydate_to is "+paydate_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String paydate_fr = Util.checkString(req.getParameter("paydate_fr"));
String paydate_to = Util.checkString(req.getParameter("paydate_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String paydate_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("paydate_fr")));
String paydate_to = Util.Uni2Ksc(Util.checkString(req.getParameter("paydate_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPaydate_fr(paydate_fr);
dm.setPaydate_to(paydate_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 16 17:58:33 KST 2016 */