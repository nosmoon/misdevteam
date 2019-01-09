/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_1110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bitem_cd;
	public String bitem_nm;
	public String bitem_clas;

	public SE_BNS_1110_LDM(){}
	public SE_BNS_1110_LDM(String cmpy_cd, String bitem_cd, String bitem_nm, String bitem_clas){
		this.cmpy_cd = cmpy_cd;
		this.bitem_cd = bitem_cd;
		this.bitem_nm = bitem_nm;
		this.bitem_clas = bitem_clas;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBitem_cd(String bitem_cd){
		this.bitem_cd = bitem_cd;
	}

	public void setBitem_nm(String bitem_nm){
		this.bitem_nm = bitem_nm;
	}

	public void setBitem_clas(String bitem_clas){
		this.bitem_clas = bitem_clas;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBitem_cd(){
		return this.bitem_cd;
	}

	public String getBitem_nm(){
		return this.bitem_nm;
	}

	public String getBitem_clas(){
		return this.bitem_clas;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BNS_1110_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_1110_LDM dm = (SE_BNS_1110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bitem_cd);
		cstmt.setString(5, dm.bitem_nm);
		cstmt.setString(6, dm.bitem_clas);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_1110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bitem_cd = [" + getBitem_cd() + "]");
		System.out.println("bitem_nm = [" + getBitem_nm() + "]");
		System.out.println("bitem_clas = [" + getBitem_clas() + "]");
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
String bitem_cd = req.getParameter("bitem_cd");
if( bitem_cd == null){
	System.out.println(this.toString+" : bitem_cd is null" );
}else{
	System.out.println(this.toString+" : bitem_cd is "+bitem_cd );
}
String bitem_nm = req.getParameter("bitem_nm");
if( bitem_nm == null){
	System.out.println(this.toString+" : bitem_nm is null" );
}else{
	System.out.println(this.toString+" : bitem_nm is "+bitem_nm );
}
String bitem_clas = req.getParameter("bitem_clas");
if( bitem_clas == null){
	System.out.println(this.toString+" : bitem_clas is null" );
}else{
	System.out.println(this.toString+" : bitem_clas is "+bitem_clas );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bitem_cd = Util.checkString(req.getParameter("bitem_cd"));
String bitem_nm = Util.checkString(req.getParameter("bitem_nm"));
String bitem_clas = Util.checkString(req.getParameter("bitem_clas"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bitem_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bitem_cd")));
String bitem_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bitem_nm")));
String bitem_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("bitem_clas")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBitem_cd(bitem_cd);
dm.setBitem_nm(bitem_nm);
dm.setBitem_clas(bitem_clas);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 28 13:46:24 KST 2017 */