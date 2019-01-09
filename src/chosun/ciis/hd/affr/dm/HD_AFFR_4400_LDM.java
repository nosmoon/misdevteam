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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_4400_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String use_dt_fr;
	public String use_dt_to;

	public HD_AFFR_4400_LDM(){}
	public HD_AFFR_4400_LDM(String cmpy_cd, String use_dt_fr, String use_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.use_dt_fr = use_dt_fr;
		this.use_dt_to = use_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUse_dt_fr(String use_dt_fr){
		this.use_dt_fr = use_dt_fr;
	}

	public void setUse_dt_to(String use_dt_to){
		this.use_dt_to = use_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUse_dt_fr(){
		return this.use_dt_fr;
	}

	public String getUse_dt_to(){
		return this.use_dt_to;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_4400_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_4400_LDM dm = (HD_AFFR_4400_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.use_dt_fr);
		cstmt.setString(5, dm.use_dt_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_4400_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("use_dt_fr = [" + getUse_dt_fr() + "]");
		System.out.println("use_dt_to = [" + getUse_dt_to() + "]");
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
String use_dt_fr = req.getParameter("use_dt_fr");
if( use_dt_fr == null){
	System.out.println(this.toString+" : use_dt_fr is null" );
}else{
	System.out.println(this.toString+" : use_dt_fr is "+use_dt_fr );
}
String use_dt_to = req.getParameter("use_dt_to");
if( use_dt_to == null){
	System.out.println(this.toString+" : use_dt_to is null" );
}else{
	System.out.println(this.toString+" : use_dt_to is "+use_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String use_dt_fr = Util.checkString(req.getParameter("use_dt_fr"));
String use_dt_to = Util.checkString(req.getParameter("use_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String use_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt_fr")));
String use_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUse_dt_fr(use_dt_fr);
dm.setUse_dt_to(use_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 11:41:22 KST 2009 */