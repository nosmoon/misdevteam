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


public class MT_ETCCAR_4200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String use_dt_fr;
	public String use_dt_to;
	public String clam_item_kind;

	public MT_ETCCAR_4200_LDM(){}
	public MT_ETCCAR_4200_LDM(String cmpy_cd, String use_dt_fr, String use_dt_to, String clam_item_kind){
		this.cmpy_cd = cmpy_cd;
		this.use_dt_fr = use_dt_fr;
		this.use_dt_to = use_dt_to;
		this.clam_item_kind = clam_item_kind;
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

	public void setClam_item_kind(String clam_item_kind){
		this.clam_item_kind = clam_item_kind;
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

	public String getClam_item_kind(){
		return this.clam_item_kind;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_4200_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_4200_LDM dm = (MT_ETCCAR_4200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.use_dt_fr);
		cstmt.setString(5, dm.use_dt_to);
		cstmt.setString(6, dm.clam_item_kind);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_4200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("use_dt_fr = [" + getUse_dt_fr() + "]");
		System.out.println("use_dt_to = [" + getUse_dt_to() + "]");
		System.out.println("clam_item_kind = [" + getClam_item_kind() + "]");
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
String clam_item_kind = req.getParameter("clam_item_kind");
if( clam_item_kind == null){
	System.out.println(this.toString+" : clam_item_kind is null" );
}else{
	System.out.println(this.toString+" : clam_item_kind is "+clam_item_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String use_dt_fr = Util.checkString(req.getParameter("use_dt_fr"));
String use_dt_to = Util.checkString(req.getParameter("use_dt_to"));
String clam_item_kind = Util.checkString(req.getParameter("clam_item_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String use_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt_fr")));
String use_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dt_to")));
String clam_item_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_item_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUse_dt_fr(use_dt_fr);
dm.setUse_dt_to(use_dt_to);
dm.setClam_item_kind(clam_item_kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 20:36:12 KST 2009 */