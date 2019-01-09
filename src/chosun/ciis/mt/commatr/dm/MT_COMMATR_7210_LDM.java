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


public class MT_COMMATR_7210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_dt_fr;
	public String search_dt_to;
	public String dlco_cd;

	public MT_COMMATR_7210_LDM(){}
	public MT_COMMATR_7210_LDM(String cmpy_cd, String search_dt_fr, String search_dt_to, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.dlco_cd = dlco_cd; 
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_7210_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_7210_LDM dm = (MT_COMMATR_7210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_dt_fr);
		cstmt.setString(5, dm.search_dt_to);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_7210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 27 17:22:31 KST 2013 */