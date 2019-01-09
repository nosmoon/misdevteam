/***************************************************************************************************
* 파일명 : SE_COMM_1220_SDM.java
* 기능 :  노선구분코드 팝업 목록 조회
* 작성일자 : 2009.01.23
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.comm.ds.*;
import chosun.ciis.se.comm.rec.*;

/**
 * 
 */


public class SE_COMM_1220_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String route_cd;
	public String route_nm;
	public String route_clsf;

	public SE_COMM_1220_SDM(){}
	public SE_COMM_1220_SDM(String cmpy_cd, String route_cd, String route_nm, String route_clsf){
		this.cmpy_cd 	= cmpy_cd;
		this.route_cd 	= route_cd;
		this.route_nm	= route_nm;
		this.route_clsf = route_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_nm() {
		return route_nm;
	}
	public void setRoute_nm(String route_nm) {
		this.route_nm = route_nm;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_COMM_1220_S( ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_COMM_1220_SDM dm = (SE_COMM_1220_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.route_cd);
		cstmt.setString(5, dm.route_nm);
		cstmt.setString(6, dm.route_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.comm.ds.SE_COMM_1220_SDataSet();
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
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String route_nm = req.getParameter("route_nm");
if( route_nm == null){
	System.out.println(this.toString+" : route_nm is null" );
}else{
	System.out.println(this.toString+" : route_nm is "+route_nm );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String route_nm = Util.checkString(req.getParameter("route_nm"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("route_nm")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoute_cd(route_cd);
dm.setRoute_nm(route_nm);
dm.setRoute_clsf(route_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 20 16:50:11 KST 2009 */