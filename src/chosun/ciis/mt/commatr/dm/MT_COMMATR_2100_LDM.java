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


public class MT_COMMATR_2100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd;
	public String uprc_meda_dt_fr;
	public String uprc_meda_dt_to;

	public MT_COMMATR_2100_LDM(){}
	public MT_COMMATR_2100_LDM(String cmpy_cd, String matr_cd, String uprc_meda_dt_fr, String uprc_meda_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd = matr_cd;
		this.uprc_meda_dt_fr = uprc_meda_dt_fr;
		this.uprc_meda_dt_to = uprc_meda_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setUprc_meda_dt_fr(String uprc_meda_dt_fr){
		this.uprc_meda_dt_fr = uprc_meda_dt_fr;
	}

	public void setUprc_meda_dt_to(String uprc_meda_dt_to){
		this.uprc_meda_dt_to = uprc_meda_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getUprc_meda_dt_fr(){
		return this.uprc_meda_dt_fr;
	}

	public String getUprc_meda_dt_to(){
		return this.uprc_meda_dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_2100_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_2100_LDM dm = (MT_COMMATR_2100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd);
		cstmt.setString(5, dm.uprc_meda_dt_fr);
		cstmt.setString(6, dm.uprc_meda_dt_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_2100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("uprc_meda_dt_fr = [" + getUprc_meda_dt_fr() + "]");
		System.out.println("uprc_meda_dt_to = [" + getUprc_meda_dt_to() + "]");
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
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String uprc_meda_dt_fr = req.getParameter("uprc_meda_dt_fr");
if( uprc_meda_dt_fr == null){
	System.out.println(this.toString+" : uprc_meda_dt_fr is null" );
}else{
	System.out.println(this.toString+" : uprc_meda_dt_fr is "+uprc_meda_dt_fr );
}
String uprc_meda_dt_to = req.getParameter("uprc_meda_dt_to");
if( uprc_meda_dt_to == null){
	System.out.println(this.toString+" : uprc_meda_dt_to is null" );
}else{
	System.out.println(this.toString+" : uprc_meda_dt_to is "+uprc_meda_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String uprc_meda_dt_fr = Util.checkString(req.getParameter("uprc_meda_dt_fr"));
String uprc_meda_dt_to = Util.checkString(req.getParameter("uprc_meda_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String uprc_meda_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_meda_dt_fr")));
String uprc_meda_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_meda_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd(matr_cd);
dm.setUprc_meda_dt_fr(uprc_meda_dt_fr);
dm.setUprc_meda_dt_to(uprc_meda_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 10 19:13:59 KST 2009 */