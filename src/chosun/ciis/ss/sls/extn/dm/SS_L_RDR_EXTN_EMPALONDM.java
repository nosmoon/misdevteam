/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPALONDM.java
* 기능 : 사원확장 수당 목록을 위한 DM
* 작성일자 : 2003-12-15
* 작성자 : 김대섭
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_extncampno;
	public String empnm;
	public String frdt;
	public String todt;
	public String payyn;

	public SS_L_RDR_EXTN_EMPALONDM(){}
	public SS_L_RDR_EXTN_EMPALONDM(String rdr_extncampno, String empnm, String frdt, String todt, String payyn){
		this.rdr_extncampno = rdr_extncampno;
		this.empnm = empnm;
		this.frdt = frdt;
		this.todt = todt;
		this.payyn = payyn;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setPayyn(String payyn){
		this.payyn = payyn;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getPayyn(){
		return this.payyn;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_EMPALON( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_EMPALONDM dm = (SS_L_RDR_EXTN_EMPALONDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_extncampno);
		cstmt.setString(4, dm.empnm);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.payyn);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_EMPALONDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_extncampno = req.getParameter("rdr_extncampno");
if( rdr_extncampno == null){
	System.out.println(this.toString+" : rdr_extncampno is null" );
}else{
	System.out.println(this.toString+" : rdr_extncampno is "+rdr_extncampno );
}
String empnm = req.getParameter("empnm");
if( empnm == null){
	System.out.println(this.toString+" : empnm is null" );
}else{
	System.out.println(this.toString+" : empnm is "+empnm );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String payyn = req.getParameter("payyn");
if( payyn == null){
	System.out.println(this.toString+" : payyn is null" );
}else{
	System.out.println(this.toString+" : payyn is "+payyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.checkString(req.getParameter("rdr_extncampno"));
String empnm = Util.checkString(req.getParameter("empnm"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String payyn = Util.checkString(req.getParameter("payyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_extncampno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncampno")));
String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String payyn = Util.Uni2Ksc(Util.checkString(req.getParameter("payyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_extncampno(rdr_extncampno);
dm.setEmpnm(empnm);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setPayyn(payyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 16 11:53:45 KST 2003 */