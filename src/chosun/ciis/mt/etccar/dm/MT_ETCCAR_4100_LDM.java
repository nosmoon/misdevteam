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


public class MT_ETCCAR_4100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clam_dt_fr;
	public String clam_dt_to;

	public MT_ETCCAR_4100_LDM(){}
	public MT_ETCCAR_4100_LDM(String cmpy_cd, String clam_dt_fr, String clam_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.clam_dt_fr = clam_dt_fr;
		this.clam_dt_to = clam_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClam_dt_fr(String clam_dt_fr){
		this.clam_dt_fr = clam_dt_fr;
	}

	public void setClam_dt_to(String clam_dt_to){
		this.clam_dt_to = clam_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClam_dt_fr(){
		return this.clam_dt_fr;
	}

	public String getClam_dt_to(){
		return this.clam_dt_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_4100_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_4100_LDM dm = (MT_ETCCAR_4100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clam_dt_fr);
		cstmt.setString(5, dm.clam_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_4100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clam_dt_fr = [" + getClam_dt_fr() + "]");
		System.out.println("clam_dt_to = [" + getClam_dt_to() + "]");
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
String clam_dt_fr = req.getParameter("clam_dt_fr");
if( clam_dt_fr == null){
	System.out.println(this.toString+" : clam_dt_fr is null" );
}else{
	System.out.println(this.toString+" : clam_dt_fr is "+clam_dt_fr );
}
String clam_dt_to = req.getParameter("clam_dt_to");
if( clam_dt_to == null){
	System.out.println(this.toString+" : clam_dt_to is null" );
}else{
	System.out.println(this.toString+" : clam_dt_to is "+clam_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clam_dt_fr = Util.checkString(req.getParameter("clam_dt_fr"));
String clam_dt_to = Util.checkString(req.getParameter("clam_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clam_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_fr")));
String clam_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClam_dt_fr(clam_dt_fr);
dm.setClam_dt_to(clam_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 20:36:46 KST 2009 */