/***************************************************************************************************
* 파일명 : PS_L_DAY_SCHEDM.java
* 기능 : 출판국 일정-달력(일별)
* 작성일자 : 2004-03-09
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.share.ds.*;
import chosun.ciis.ps.pbs.share.rec.*;

/**
 * 출판국 일정-달력(일별)
 *
 */


public class PS_L_DAY_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String incmgpers;
	public String yyyymmdd;

	public PS_L_DAY_SCHEDM(){}
	public PS_L_DAY_SCHEDM(String deptcd, String incmgpers, String yyyymmdd){
		this.deptcd = deptcd;
		this.incmgpers = incmgpers;
		this.yyyymmdd = yyyymmdd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYyyymmdd(String yyyymmdd){
		this.yyyymmdd = yyyymmdd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYyyymmdd(){
		return this.yyyymmdd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_DAY_SCHE( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_DAY_SCHEDM dm = (PS_L_DAY_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.yyyymmdd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.share.ds.PS_L_DAY_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String yyyymmdd = req.getParameter("yyyymmdd");
if( yyyymmdd == null){
	System.out.println(this.toString+" : yyyymmdd is null" );
}else{
	System.out.println(this.toString+" : yyyymmdd is "+yyyymmdd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yyyymmdd = Util.checkString(req.getParameter("yyyymmdd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yyyymmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymmdd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setIncmgpers(incmgpers);
dm.setYyyymmdd(yyyymmdd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 21:43:44 KST 2004 */