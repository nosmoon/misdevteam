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


public class MT_COMMATR_6520_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_yymm_fr;
	public String issu_yymm_to;
	public String comp_yymm_fr;
	public String comp_yymm_to;

	public MT_COMMATR_6520_LDM(){}
	public MT_COMMATR_6520_LDM(String cmpy_cd, String issu_yymm_fr, String issu_yymm_to, String comp_yymm_fr, String comp_yymm_to){
		this.cmpy_cd = cmpy_cd;
		this.issu_yymm_fr = issu_yymm_fr;
		this.issu_yymm_to = issu_yymm_to;
		this.comp_yymm_fr = comp_yymm_fr;
		this.comp_yymm_to = comp_yymm_to;
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

	public void setComp_yymm_fr(String comp_yymm_fr){
		this.comp_yymm_fr = comp_yymm_fr;
	}

	public void setComp_yymm_to(String comp_yymm_to){
		this.comp_yymm_to = comp_yymm_to;
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

	public String getComp_yymm_fr(){
		return this.comp_yymm_fr;
	}

	public String getComp_yymm_to(){
		return this.comp_yymm_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMATR_6520_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMATR_6520_LDM dm = (MT_COMMATR_6520_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_yymm_fr);
		cstmt.setString(5, dm.issu_yymm_to);
		cstmt.setString(6, dm.comp_yymm_fr);
		cstmt.setString(7, dm.comp_yymm_to);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.commatr.ds.MT_COMMATR_6520_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_yymm_fr = [" + getIssu_yymm_fr() + "]");
		System.out.println("issu_yymm_to = [" + getIssu_yymm_to() + "]");
		System.out.println("comp_yymm_fr = [" + getComp_yymm_fr() + "]");
		System.out.println("comp_yymm_to = [" + getComp_yymm_to() + "]");
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
String comp_yymm_fr = req.getParameter("comp_yymm_fr");
if( comp_yymm_fr == null){
	System.out.println(this.toString+" : comp_yymm_fr is null" );
}else{
	System.out.println(this.toString+" : comp_yymm_fr is "+comp_yymm_fr );
}
String comp_yymm_to = req.getParameter("comp_yymm_to");
if( comp_yymm_to == null){
	System.out.println(this.toString+" : comp_yymm_to is null" );
}else{
	System.out.println(this.toString+" : comp_yymm_to is "+comp_yymm_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_yymm_fr = Util.checkString(req.getParameter("issu_yymm_fr"));
String issu_yymm_to = Util.checkString(req.getParameter("issu_yymm_to"));
String comp_yymm_fr = Util.checkString(req.getParameter("comp_yymm_fr"));
String comp_yymm_to = Util.checkString(req.getParameter("comp_yymm_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yymm_fr")));
String issu_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yymm_to")));
String comp_yymm_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_yymm_fr")));
String comp_yymm_to = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_yymm_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_yymm_fr(issu_yymm_fr);
dm.setIssu_yymm_to(issu_yymm_to);
dm.setComp_yymm_fr(comp_yymm_fr);
dm.setComp_yymm_to(comp_yymm_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 18:09:14 KST 2015 */