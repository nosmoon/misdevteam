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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1114_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt_fr;
	public String ewh_dt_to;
	public String fac_clsf;
	public String ewh_clsf;

	public MT_SUBMATRIN_1114_LDM(){}
	public MT_SUBMATRIN_1114_LDM(String cmpy_cd, String ewh_dt_fr, String ewh_dt_to, String fac_clsf, String ewh_clsf){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt_fr = ewh_dt_fr;
		this.ewh_dt_to = ewh_dt_to;
		this.fac_clsf = fac_clsf;
		this.ewh_clsf = ewh_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt_fr(String ewh_dt_fr){
		this.ewh_dt_fr = ewh_dt_fr;
	}

	public void setEwh_dt_to(String ewh_dt_to){
		this.ewh_dt_to = ewh_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setEwh_clsf(String ewh_clsf) {
		this.ewh_clsf = ewh_clsf;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt_fr(){
		return this.ewh_dt_fr;
	}

	public String getEwh_dt_to(){
		return this.ewh_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}
	
	public String getEwh_clsf() {
		return ewh_clsf;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1114_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1114_LDM dm = (MT_SUBMATRIN_1114_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt_fr);
		cstmt.setString(5, dm.ewh_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.ewh_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1114_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt_fr = [" + getEwh_dt_fr() + "]");
		System.out.println("ewh_dt_to = [" + getEwh_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
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
String ewh_dt_fr = req.getParameter("ewh_dt_fr");
if( ewh_dt_fr == null){
	System.out.println(this.toString+" : ewh_dt_fr is null" );
}else{
	System.out.println(this.toString+" : ewh_dt_fr is "+ewh_dt_fr );
}
String ewh_dt_to = req.getParameter("ewh_dt_to");
if( ewh_dt_to == null){
	System.out.println(this.toString+" : ewh_dt_to is null" );
}else{
	System.out.println(this.toString+" : ewh_dt_to is "+ewh_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt_fr = Util.checkString(req.getParameter("ewh_dt_fr"));
String ewh_dt_to = Util.checkString(req.getParameter("ewh_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt_fr")));
String ewh_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt_fr(ewh_dt_fr);
dm.setEwh_dt_to(ewh_dt_to);
dm.setFac_clsf(fac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 19 21:58:32 KST 2009 */