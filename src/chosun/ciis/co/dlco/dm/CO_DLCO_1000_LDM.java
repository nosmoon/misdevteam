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


package chosun.ciis.co.dlco.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.dlco.ds.*;
import chosun.ciis.co.dlco.rec.*;

/**
 * 
 */


public class CO_DLCO_1000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_clsf;
	public String search_key_1;
	public String search_key_2;

	public CO_DLCO_1000_LDM(){}
	public CO_DLCO_1000_LDM(String cmpy_cd, String search_clsf, String search_key_1, String search_key_2){
		this.cmpy_cd = cmpy_cd;
		this.search_clsf = search_clsf;
		this.search_key_1 = search_key_1;
		this.search_key_2 = search_key_2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_clsf(String search_clsf){
		this.search_clsf = search_clsf;
	}

	public void setSearch_key_1(String search_key_1){
		this.search_key_1 = search_key_1;
	}

	public void setSearch_key_2(String search_key_2){
		this.search_key_2 = search_key_2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_clsf(){
		return this.search_clsf;
	}

	public String getSearch_key_1(){
		return this.search_key_1;
	}

	public String getSearch_key_2(){
		return this.search_key_2;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_DLCO_1000_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DLCO_1000_LDM dm = (CO_DLCO_1000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_clsf);
		cstmt.setString(5, dm.search_key_1);
		cstmt.setString(6, dm.search_key_2);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.dlco.ds.CO_DLCO_1000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_clsf = [" + getSearch_clsf() + "]");
		System.out.println("search_key_1 = [" + getSearch_key_1() + "]");
		System.out.println("search_key_2 = [" + getSearch_key_2() + "]");
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
String search_clsf = req.getParameter("search_clsf");
if( search_clsf == null){
	System.out.println(this.toString+" : search_clsf is null" );
}else{
	System.out.println(this.toString+" : search_clsf is "+search_clsf );
}
String search_key_1 = req.getParameter("search_key_1");
if( search_key_1 == null){
	System.out.println(this.toString+" : search_key_1 is null" );
}else{
	System.out.println(this.toString+" : search_key_1 is "+search_key_1 );
}
String search_key_2 = req.getParameter("search_key_2");
if( search_key_2 == null){
	System.out.println(this.toString+" : search_key_2 is null" );
}else{
	System.out.println(this.toString+" : search_key_2 is "+search_key_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_clsf = Util.checkString(req.getParameter("search_clsf"));
String search_key_1 = Util.checkString(req.getParameter("search_key_1"));
String search_key_2 = Util.checkString(req.getParameter("search_key_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("search_clsf")));
String search_key_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("search_key_1")));
String search_key_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("search_key_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_clsf(search_clsf);
dm.setSearch_key_1(search_key_1);
dm.setSearch_key_2(search_key_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 19 17:20:45 KST 2013 */