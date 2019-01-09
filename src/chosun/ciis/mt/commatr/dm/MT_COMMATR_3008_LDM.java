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


public class MT_COMMATR_3008_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_cd;
	public String dt_fr;
	public String dt_to;

	public MT_COMMATR_3008_LDM(){}
	public MT_COMMATR_3008_LDM(String cmpy_cd, String dlco_cd, String dt_fr, String dt_to){
		this.cmpy_cd = cmpy_cd;
		this.dlco_cd = dlco_cd;
		this.dt_fr = dt_fr;
		this.dt_to = dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDt_fr(String dt_fr){
		this.dt_fr = dt_fr;
	}

	public void setDt_to(String dt_to){
		this.dt_to = dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDt_fr(){
		return this.dt_fr;
	}

	public String getDt_to(){
		return this.dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_3008_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_3008_LDM dm = (MT_COMMATR_3008_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_cd);
		cstmt.setString(5, dm.dt_fr);
		cstmt.setString(6, dm.dt_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_3008_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dt_fr = [" + getDt_fr() + "]");
		System.out.println("dt_to = [" + getDt_to() + "]");
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
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String dt_fr = req.getParameter("dt_fr");
if( dt_fr == null){
	System.out.println(this.toString+" : dt_fr is null" );
}else{
	System.out.println(this.toString+" : dt_fr is "+dt_fr );
}
String dt_to = req.getParameter("dt_to");
if( dt_to == null){
	System.out.println(this.toString+" : dt_to is null" );
}else{
	System.out.println(this.toString+" : dt_to is "+dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dt_fr = Util.checkString(req.getParameter("dt_fr"));
String dt_to = Util.checkString(req.getParameter("dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_fr")));
String dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_cd(dlco_cd);
dm.setDt_fr(dt_fr);
dm.setDt_to(dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 02 17:24:48 KST 2009 */