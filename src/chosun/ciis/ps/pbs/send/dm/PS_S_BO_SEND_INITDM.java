/***************************************************************************************************
* 파일명 : PS_S_BO_SEND_INIT.java
* 기능   : 발송 - 초기화면
* 작성일자 : 2007-04-23
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송 - 초기화면
 */

public class PS_S_BO_SEND_INITDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String medicd;
	public String deptcd;

	public PS_S_BO_SEND_INITDM(){}
	public PS_S_BO_SEND_INITDM(String cmpycd, String medicd, String deptcd){
		this.cmpycd = cmpycd;
		this.medicd = medicd;
		this.deptcd = deptcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_BO_SEND_INIT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_BO_SEND_INITDM dm = (PS_S_BO_SEND_INITDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.medicd);
		cstmt.setString(5, dm.deptcd);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_S_BO_SEND_INITDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String medicd = Util.checkString(req.getParameter("medicd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setMedicd(medicd);
dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 16:33:14 KST 2007 */