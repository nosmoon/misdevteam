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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1040_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rptv_route_cd;
	public String rptv_route_nm;
	public String rptv_route_clsf;

	public SE_SND_1040_LDM(){}
	public SE_SND_1040_LDM(String cmpy_cd, String rptv_route_cd, String rptv_route_nm, String rptv_route_clsf){
		this.cmpy_cd = cmpy_cd;
		this.rptv_route_cd = rptv_route_cd;
		this.rptv_route_nm = rptv_route_nm;
		this.rptv_route_clsf = rptv_route_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRptv_route_cd(String rptv_route_cd){
		this.rptv_route_cd = rptv_route_cd;
	}

	public void setRptv_route_nm(String rptv_route_nm){
		this.rptv_route_nm = rptv_route_nm;
	}

	public void setRptv_route_clsf(String rptv_route_clsf){
		this.rptv_route_clsf = rptv_route_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRptv_route_cd(){
		return this.rptv_route_cd;
	}

	public String getRptv_route_nm(){
		return this.rptv_route_nm;
	}

	public String getRptv_route_clsf(){
		return this.rptv_route_clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_1040_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1040_LDM dm = (SE_SND_1040_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rptv_route_cd);
		cstmt.setString(5, dm.rptv_route_nm);
		cstmt.setString(6, dm.rptv_route_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1040_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rptv_route_cd = [" + getRptv_route_cd() + "]");
		System.out.println("rptv_route_nm = [" + getRptv_route_nm() + "]");
		System.out.println("rptv_route_clsf = [" + getRptv_route_clsf() + "]");
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
String rptv_route_cd = req.getParameter("rptv_route_cd");
if( rptv_route_cd == null){
	System.out.println(this.toString+" : rptv_route_cd is null" );
}else{
	System.out.println(this.toString+" : rptv_route_cd is "+rptv_route_cd );
}
String rptv_route_nm = req.getParameter("rptv_route_nm");
if( rptv_route_nm == null){
	System.out.println(this.toString+" : rptv_route_nm is null" );
}else{
	System.out.println(this.toString+" : rptv_route_nm is "+rptv_route_nm );
}
String rptv_route_clsf = req.getParameter("rptv_route_clsf");
if( rptv_route_clsf == null){
	System.out.println(this.toString+" : rptv_route_clsf is null" );
}else{
	System.out.println(this.toString+" : rptv_route_clsf is "+rptv_route_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rptv_route_cd = Util.checkString(req.getParameter("rptv_route_cd"));
String rptv_route_nm = Util.checkString(req.getParameter("rptv_route_nm"));
String rptv_route_clsf = Util.checkString(req.getParameter("rptv_route_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rptv_route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_cd")));
String rptv_route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_nm")));
String rptv_route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rptv_route_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRptv_route_cd(rptv_route_cd);
dm.setRptv_route_nm(rptv_route_nm);
dm.setRptv_route_clsf(rptv_route_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 04 11:21:49 KST 2009 */