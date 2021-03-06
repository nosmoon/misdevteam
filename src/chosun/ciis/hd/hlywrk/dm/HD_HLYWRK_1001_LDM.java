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


package chosun.ciis.hd.hlywrk.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.ds.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String aply_basi_dt;
	public String cmpy_cd;

	public HD_HLYWRK_1001_LDM(){}
	public HD_HLYWRK_1001_LDM(String aply_basi_dt, String cmpy_cd){
		this.aply_basi_dt = aply_basi_dt;
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_HLYWRK_1001_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_HLYWRK_1001_LDM dm = (HD_HLYWRK_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.aply_basi_dt);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.hlywrk.ds.HD_HLYWRK_1001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAply_basi_dt(aply_basi_dt);
dm.setCmpy_cd(cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 20:02:05 KST 2009 */