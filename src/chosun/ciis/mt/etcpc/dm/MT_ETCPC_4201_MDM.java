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


package chosun.ciis.mt.etcpc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.ds.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_4201_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String swnm;
	public String make_cmpy;

	public MT_ETCPC_4201_MDM(){}
	public MT_ETCPC_4201_MDM(String cmpy_cd, String swnm, String make_cmpy){
		this.cmpy_cd = cmpy_cd;
		this.swnm = swnm;
		this.make_cmpy = make_cmpy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSwnm(String swnm){
		this.swnm = swnm;
	}

	public void setMake_cmpy(String make_cmpy){
		this.make_cmpy = make_cmpy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSwnm(){
		return this.swnm;
	}

	public String getMake_cmpy(){
		return this.make_cmpy;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_4201_M(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_4201_MDM dm = (MT_ETCPC_4201_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.swnm);
		cstmt.setString(5, dm.make_cmpy);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_4201_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("swnm = [" + getSwnm() + "]");
		System.out.println("make_cmpy = [" + getMake_cmpy() + "]");
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
String swnm = req.getParameter("swnm");
if( swnm == null){
	System.out.println(this.toString+" : swnm is null" );
}else{
	System.out.println(this.toString+" : swnm is "+swnm );
}
String make_cmpy = req.getParameter("make_cmpy");
if( make_cmpy == null){
	System.out.println(this.toString+" : make_cmpy is null" );
}else{
	System.out.println(this.toString+" : make_cmpy is "+make_cmpy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String swnm = Util.checkString(req.getParameter("swnm"));
String make_cmpy = Util.checkString(req.getParameter("make_cmpy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String swnm = Util.Uni2Ksc(Util.checkString(req.getParameter("swnm")));
String make_cmpy = Util.Uni2Ksc(Util.checkString(req.getParameter("make_cmpy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSwnm(swnm);
dm.setMake_cmpy(make_cmpy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 18:15:39 KST 2009 */