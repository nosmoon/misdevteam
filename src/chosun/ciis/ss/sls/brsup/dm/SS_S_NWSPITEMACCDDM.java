/***************************************************************************************************
* 파일명 : SS_S_NWSPITEMACCDDM.java
* 기능 : 지국지원-신문지원물품-사고-상세를 위한 DM
* 작성일자 : 2004-01-24
* 작성자 : 김대섭
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
 * 지국지원-신문지원물품-사고-상세를 위한 DM
 */

public class SS_S_NWSPITEMACCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String aplcdt;
	public String aplcno;
	public String itemcd;
	public String accdno;

	public SS_S_NWSPITEMACCDDM(){}
	public SS_S_NWSPITEMACCDDM(String aplcdt, String aplcno, String itemcd, String accdno){
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
		this.itemcd = itemcd;
		this.accdno = accdno;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setAccdno(String accdno){
		this.accdno = accdno;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getAccdno(){
		return this.accdno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_NWSPITEMACCD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_NWSPITEMACCDDM dm = (SS_S_NWSPITEMACCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.aplcdt);
		cstmt.setString(4, dm.aplcno);
		cstmt.setString(5, dm.itemcd);
		cstmt.setString(6, dm.accdno);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_NWSPITEMACCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String accdno = req.getParameter("accdno");
if( accdno == null){
	System.out.println(this.toString+" : accdno is null" );
}else{
	System.out.println(this.toString+" : accdno is "+accdno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String accdno = Util.checkString(req.getParameter("accdno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String accdno = Util.Uni2Ksc(Util.checkString(req.getParameter("accdno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
dm.setItemcd(itemcd);
dm.setAccdno(accdno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 16:18:34 KST 2004 */