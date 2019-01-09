/***************************************************************************************************
* 파일명 : .java
* 기능 : 통합정보지원시스템-판촉물재고현황-조회화면
* 작성일자 : 2009-05-06
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 통합정보지원시스템-판촉물재고현황-조회화면
 */

public class SS_L_TASLM_BNSITEMINOUTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String itemclsf;
	public String itemcd;
	public String itemnm;

	public SS_L_TASLM_BNSITEMINOUTDM(){}
	public SS_L_TASLM_BNSITEMINOUTDM(String itemclsf, String itemcd, String itemnm){
		this.itemclsf = itemclsf;
		this.itemcd = itemcd;
		this.itemnm = itemnm;
	}

	public void setItemclsf(String itemclsf){
		this.itemclsf = itemclsf;
	}

	public void setItemcd(String itemcd){
		this.itemcd = itemcd;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public String getItemclsf(){
		return this.itemclsf;
	}

	public String getItemcd(){
		return this.itemcd;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_TASLM_BNSITEMINOUT( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_TASLM_BNSITEMINOUTDM dm = (SS_L_TASLM_BNSITEMINOUTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.itemclsf);
		cstmt.setString(4, dm.itemcd);
		cstmt.setString(5, dm.itemnm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_TASLM_BNSITEMINOUTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String itemclsf = req.getParameter("itemclsf");
if( itemclsf == null){
	System.out.println(this.toString+" : itemclsf is null" );
}else{
	System.out.println(this.toString+" : itemclsf is "+itemclsf );
}
String itemcd = req.getParameter("itemcd");
if( itemcd == null){
	System.out.println(this.toString+" : itemcd is null" );
}else{
	System.out.println(this.toString+" : itemcd is "+itemcd );
}
String itemnm = req.getParameter("itemnm");
if( itemnm == null){
	System.out.println(this.toString+" : itemnm is null" );
}else{
	System.out.println(this.toString+" : itemnm is "+itemnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.checkString(req.getParameter("itemclsf"));
String itemcd = Util.checkString(req.getParameter("itemcd"));
String itemnm = Util.checkString(req.getParameter("itemnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String itemclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("itemclsf")));
String itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("itemcd")));
String itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("itemnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setItemclsf(itemclsf);
dm.setItemcd(itemcd);
dm.setItemnm(itemnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 06 16:46:30 PDT 2009 */