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


package chosun.ciis.mt.commatr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.ds.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 *  
 */
 
 
public class MT_COMMATR_6610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{
 
	public String cmpy_cd;
	public String issu_yymm_fr;
	public String issu_yymm_to;
	public String issu_yy;
	public String search_gubun;

	public MT_COMMATR_6610_LDM(){}
	public MT_COMMATR_6610_LDM(String cmpy_cd, String issu_yymm_fr, String issu_yymm_to, String issu_yy, String search_gubun){
		this.cmpy_cd = cmpy_cd;
		this.issu_yymm_fr = issu_yymm_fr;
		this.issu_yymm_to = issu_yymm_to;
		this.issu_yy = issu_yy;
		this.search_gubun = search_gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_yymm_fr(String issu_yymm_fr){
		this.issu_yymm_fr = issu_yymm_fr;
	}

	public void setIssu_yymm_to(String issu_yymm_to){
		this.issu_yymm_to = issu_yymm_to;
	}

	public void setIssu_yy(String issu_yy){
		this.issu_yy = issu_yy;
	}

	public void setSearch_gubun(String search_gubun){
		this.search_gubun = search_gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_yymm_fr(){
		return this.issu_yymm_fr;
	}

	public String getIssu_yymm_to(){
		return this.issu_yymm_to;
	}

	public String getIssu_yy(){
		return this.issu_yy;
	}

	public String getSearch_gubun(){
		return this.search_gubun;
	}

	public String getSQL(){ 
		 return "{ call MISMAT.SP_MT_COMMATR_6610_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_6610_LDM dm = (MT_COMMATR_6610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_yymm_fr);
		cstmt.setString(5, dm.issu_yymm_to);
		cstmt.setString(6, dm.issu_yy);
		cstmt.setString(7, dm.search_gubun);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_6610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_yymm_fr = [" + getIssu_yymm_fr() + "]");
		System.out.println("issu_yymm_to = [" + getIssu_yymm_to() + "]");
		System.out.println("issu_yy = [" + getIssu_yy() + "]");
		System.out.println("search_gubun = [" + getSearch_gubun() + "]");
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
String issu_yymm_fr = req.getParameter("issu_yymm_fr");
if( issu_yymm_fr == null){
	System.out.println(this.toString+" : issu_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : issu_yymm_fr is "+issu_yymm_fr );
}
String issu_yymm_to = req.getParameter("issu_yymm_to");
if( issu_yymm_to == null){
	System.out.println(this.toString+" : issu_yymm_to is null" );
}else{
	System.out.println(this.toString+" : issu_yymm_to is "+issu_yymm_to );
}
String issu_yy = req.getParameter("issu_yy");
if( issu_yy == null){
	System.out.println(this.toString+" : issu_yy is null" );
}else{
	System.out.println(this.toString+" : issu_yy is "+issu_yy );
}
String search_gubun = req.getParameter("search_gubun");
if( search_gubun == null){
	System.out.println(this.toString+" : search_gubun is null" );
}else{
	System.out.println(this.toString+" : search_gubun is "+search_gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_yymm_fr = Util.checkString(req.getParameter("issu_yymm_fr"));
String issu_yymm_to = Util.checkString(req.getParameter("issu_yymm_to"));
String issu_yy = Util.checkString(req.getParameter("issu_yy"));
String search_gubun = Util.checkString(req.getParameter("search_gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yymm_fr")));
String issu_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yymm_to")));
String issu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yy")));
String search_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("search_gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_yymm_fr(issu_yymm_fr);
dm.setIssu_yymm_to(issu_yymm_to);
dm.setIssu_yy(issu_yy);
dm.setSearch_gubun(search_gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 07 16:11:34 KST 2013 */