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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_5200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String driv_dt_fr;
	public String driv_dt_to;
	public String oil_kind;

	public MT_ETCCAR_5200_LDM(){}
	public MT_ETCCAR_5200_LDM(String cmpy_cd, String driv_dt_fr, String driv_dt_to, String oil_kind){
		this.cmpy_cd = cmpy_cd;
		this.driv_dt_fr = driv_dt_fr;
		this.driv_dt_to = driv_dt_to;
		this.oil_kind = oil_kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDriv_dt_fr(String driv_dt_fr){
		this.driv_dt_fr = driv_dt_fr;
	}

	public void setDriv_dt_to(String driv_dt_to){
		this.driv_dt_to = driv_dt_to;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDriv_dt_fr(){
		return this.driv_dt_fr;
	}

	public String getDriv_dt_to(){
		return this.driv_dt_to;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_5200_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_5200_LDM dm = (MT_ETCCAR_5200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.driv_dt_fr);
		cstmt.setString(5, dm.driv_dt_to);
		cstmt.setString(6, dm.oil_kind);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_5200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("driv_dt_fr = [" + getDriv_dt_fr() + "]");
		System.out.println("driv_dt_to = [" + getDriv_dt_to() + "]");
		System.out.println("oil_kind = [" + getOil_kind() + "]");
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
String driv_dt_fr = req.getParameter("driv_dt_fr");
if( driv_dt_fr == null){
	System.out.println(this.toString+" : driv_dt_fr is null" );
}else{
	System.out.println(this.toString+" : driv_dt_fr is "+driv_dt_fr );
}
String driv_dt_to = req.getParameter("driv_dt_to");
if( driv_dt_to == null){
	System.out.println(this.toString+" : driv_dt_to is null" );
}else{
	System.out.println(this.toString+" : driv_dt_to is "+driv_dt_to );
}
String oil_kind = req.getParameter("oil_kind");
if( oil_kind == null){
	System.out.println(this.toString+" : oil_kind is null" );
}else{
	System.out.println(this.toString+" : oil_kind is "+oil_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String driv_dt_fr = Util.checkString(req.getParameter("driv_dt_fr"));
String driv_dt_to = Util.checkString(req.getParameter("driv_dt_to"));
String oil_kind = Util.checkString(req.getParameter("oil_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String driv_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt_fr")));
String driv_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt_to")));
String oil_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDriv_dt_fr(driv_dt_fr);
dm.setDriv_dt_to(driv_dt_to);
dm.setOil_kind(oil_kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 16:34:47 KST 2009 */