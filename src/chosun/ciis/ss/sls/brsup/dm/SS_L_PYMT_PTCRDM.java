/***************************************************************************************************
* 파일명 : SS_L_PYMT_PTCRDM.java
* 기능 : 지국업무지원-Billing자동이체-납부내역목록
* 작성일자 : 2004-03-18
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부내역목록
 *
 */


public class SS_L_PYMT_PTCRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String f_basidt;
	public String t_basidt;
	public String shftclsfcd;
	public String erryn;

	public SS_L_PYMT_PTCRDM(){}
	public SS_L_PYMT_PTCRDM(String f_basidt, String t_basidt, String shftclsfcd, String erryn){
		this.f_basidt = f_basidt;
		this.t_basidt = t_basidt;
		this.shftclsfcd = shftclsfcd;
		this.erryn = erryn;
	}

	public void setF_basidt(String f_basidt){
		this.f_basidt = f_basidt;
	}

	public void setT_basidt(String t_basidt){
		this.t_basidt = t_basidt;
	}

	public void setShftclsfcd(String shftclsfcd){
		this.shftclsfcd = shftclsfcd;
	}

	public void setErryn(String erryn){
		this.erryn = erryn;
	}

	public String getF_basidt(){
		return this.f_basidt;
	}

	public String getT_basidt(){
		return this.t_basidt;
	}

	public String getShftclsfcd(){
		return this.shftclsfcd;
	}

	public String getErryn(){
		return this.erryn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PYMT_PTCR( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PYMT_PTCRDM dm = (SS_L_PYMT_PTCRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.f_basidt);
		cstmt.setString(4, dm.t_basidt);
		cstmt.setString(5, dm.shftclsfcd);
		cstmt.setString(6, dm.erryn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PYMT_PTCRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String f_basidt = req.getParameter("f_basidt");
if( f_basidt == null){
	System.out.println(this.toString+" : f_basidt is null" );
}else{
	System.out.println(this.toString+" : f_basidt is "+f_basidt );
}
String t_basidt = req.getParameter("t_basidt");
if( t_basidt == null){
	System.out.println(this.toString+" : t_basidt is null" );
}else{
	System.out.println(this.toString+" : t_basidt is "+t_basidt );
}
String shftclsfcd = req.getParameter("shftclsfcd");
if( shftclsfcd == null){
	System.out.println(this.toString+" : shftclsfcd is null" );
}else{
	System.out.println(this.toString+" : shftclsfcd is "+shftclsfcd );
}
String erryn = req.getParameter("erryn");
if( erryn == null){
	System.out.println(this.toString+" : erryn is null" );
}else{
	System.out.println(this.toString+" : erryn is "+erryn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String f_basidt = Util.checkString(req.getParameter("f_basidt"));
String t_basidt = Util.checkString(req.getParameter("t_basidt"));
String shftclsfcd = Util.checkString(req.getParameter("shftclsfcd"));
String erryn = Util.checkString(req.getParameter("erryn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String f_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("f_basidt")));
String t_basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("t_basidt")));
String shftclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftclsfcd")));
String erryn = Util.Uni2Ksc(Util.checkString(req.getParameter("erryn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setF_basidt(f_basidt);
dm.setT_basidt(t_basidt);
dm.setShftclsfcd(shftclsfcd);
dm.setErryn(erryn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 22:04:30 KST 2004 */