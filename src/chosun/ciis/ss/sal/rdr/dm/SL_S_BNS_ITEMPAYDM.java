/***************************************************************************************************
* 파일명 : SL_S_BNS_ITEMPAYDM.java
* 기능 : 독자정보관리(판촉물내역팝업-상세조회)
* 작성일자 : 2004-06-03
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(판촉물내역팝업-상세조회)
 *
 */

public class SL_S_BNS_ITEMPAYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no;
	public String payno;

	public SL_S_BNS_ITEMPAYDM(){}
	public SL_S_BNS_ITEMPAYDM(String rdr_no, String payno){
		this.rdr_no = rdr_no;
		this.payno = payno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setPayno(String payno){
		this.payno = payno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getPayno(){
		return this.payno;
	}

	public String getSQL(){
		 return "{ call SP_SL_S_BNS_ITEMPAY( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_BNS_ITEMPAYDM dm = (SL_S_BNS_ITEMPAYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.payno);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_S_BNS_ITEMPAYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String payno = req.getParameter("payno");
if( payno == null){
	System.out.println(this.toString+" : payno is null" );
}else{
	System.out.println(this.toString+" : payno is "+payno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String payno = Util.checkString(req.getParameter("payno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String payno = Util.Uni2Ksc(Util.checkString(req.getParameter("payno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no(rdr_no);
dm.setPayno(payno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 04 11:50:56 KST 2004 */