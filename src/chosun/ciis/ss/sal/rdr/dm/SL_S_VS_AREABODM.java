/***************************************************************************************************
* 파일명 : SL_S_VS_AREABODM.java
* 기능 : 독자-VacationStop관리-휴가지배달지역 상세
* 작성일자 : 2004-04-01
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
 * 독자-VacationStop관리-휴가지배달지역 상세
 *
 */

public class SL_S_VS_AREABODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String vaca_arearegncd;
	public String vaca_areacd;

	public SL_S_VS_AREABODM(){}
	public SL_S_VS_AREABODM(String vaca_arearegncd, String vaca_areacd){
		this.vaca_arearegncd = vaca_arearegncd;
		this.vaca_areacd = vaca_areacd;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_areacd(String vaca_areacd){
		this.vaca_areacd = vaca_areacd;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getVaca_areacd(){
		return this.vaca_areacd;
	}

	public String getSQL(){
		 return "{ call SP_SL_S_VS_AREABO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_VS_AREABODM dm = (SL_S_VS_AREABODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.vaca_arearegncd);
		cstmt.setString(4, dm.vaca_areacd);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_S_VS_AREABODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
}
String vaca_areacd = req.getParameter("vaca_areacd");
if( vaca_areacd == null){
	System.out.println(this.toString+" : vaca_areacd is null" );
}else{
	System.out.println(this.toString+" : vaca_areacd is "+vaca_areacd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
String vaca_areacd = Util.checkString(req.getParameter("vaca_areacd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
String vaca_areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_areacd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setVaca_arearegncd(vaca_arearegncd);
dm.setVaca_areacd(vaca_areacd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 01 11:19:44 KST 2004 */