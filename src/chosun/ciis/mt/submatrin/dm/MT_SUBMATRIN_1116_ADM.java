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


public class MT_SUBMATRIN_1116_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String magam_dt;
	public String per_id;
	public String per_addr;

	public MT_SUBMATRIN_1116_ADM(){}
	public MT_SUBMATRIN_1116_ADM(String cmpy_cd, String ewh_dt, String magam_dt, String per_id, String per_addr){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.magam_dt = magam_dt;
		this.per_id = per_id;
		this.per_addr = per_addr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setMagam_dt(String magam_dt){
		this.magam_dt = magam_dt;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public void setPer_addr(String per_addr){
		this.per_addr = per_addr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getMagam_dt(){
		return this.magam_dt;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getPer_addr(){
		return this.per_addr;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1116_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1116_ADM dm = (MT_SUBMATRIN_1116_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.magam_dt);
		cstmt.setString(6, dm.per_id);
		cstmt.setString(7, dm.per_addr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1116_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("magam_dt = [" + getMagam_dt() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
		System.out.println("per_addr = [" + getPer_addr() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String magam_dt = req.getParameter("magam_dt");
if( magam_dt == null){
	System.out.println(this.toString+" : magam_dt is null" );
}else{
	System.out.println(this.toString+" : magam_dt is "+magam_dt );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
String per_addr = req.getParameter("per_addr");
if( per_addr == null){
	System.out.println(this.toString+" : per_addr is null" );
}else{
	System.out.println(this.toString+" : per_addr is "+per_addr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String magam_dt = Util.checkString(req.getParameter("magam_dt"));
String per_id = Util.checkString(req.getParameter("per_id"));
String per_addr = Util.checkString(req.getParameter("per_addr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String magam_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("magam_dt")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
String per_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_addr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setMagam_dt(magam_dt);
dm.setPer_id(per_id);
dm.setPer_addr(per_addr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 18:30:49 KST 2009 */