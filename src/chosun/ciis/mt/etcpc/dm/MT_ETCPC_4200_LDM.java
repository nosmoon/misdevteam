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


public class MT_ETCPC_4200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String use_pers_flnm;
	public String use_pers;
	public String swlics_no;
	public String swmang_no;

	public MT_ETCPC_4200_LDM(){}
	public MT_ETCPC_4200_LDM(String cmpy_cd, String use_pers_flnm, String use_pers, String swlics_no, String swmang_no){
		this.cmpy_cd = cmpy_cd;
		this.use_pers_flnm = use_pers_flnm;
		this.use_pers = use_pers;
		this.swlics_no = swlics_no;
		this.swmang_no = swmang_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUse_pers_flnm(String use_pers_flnm){
		this.use_pers_flnm = use_pers_flnm;
	}

	public void setUse_pers(String use_pers){
		this.use_pers = use_pers;
	}

	public void setSwlics_no(String swlics_no){
		this.swlics_no = swlics_no;
	}

	public void setSwmang_no(String swmang_no){
		this.swmang_no = swmang_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUse_pers_flnm(){
		return this.use_pers_flnm;
	}

	public String getUse_pers(){
		return this.use_pers;
	}

	public String getSwlics_no(){
		return this.swlics_no;
	}

	public String getSwmang_no(){
		return this.swmang_no;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCPC_4200_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCPC_4200_LDM dm = (MT_ETCPC_4200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.use_pers_flnm);
		cstmt.setString(5, dm.use_pers);
		cstmt.setString(6, dm.swlics_no);
		cstmt.setString(7, dm.swmang_no);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etcpc.ds.MT_ETCPC_4200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("use_pers_flnm = [" + getUse_pers_flnm() + "]");
		System.out.println("use_pers = [" + getUse_pers() + "]");
		System.out.println("swlics_no = [" + getSwlics_no() + "]");
		System.out.println("swmang_no = [" + getSwmang_no() + "]");
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
String use_pers_flnm = req.getParameter("use_pers_flnm");
if( use_pers_flnm == null){
	System.out.println(this.toString+" : use_pers_flnm is null" );
}else{
	System.out.println(this.toString+" : use_pers_flnm is "+use_pers_flnm );
}
String use_pers = req.getParameter("use_pers");
if( use_pers == null){
	System.out.println(this.toString+" : use_pers is null" );
}else{
	System.out.println(this.toString+" : use_pers is "+use_pers );
}
String swlics_no = req.getParameter("swlics_no");
if( swlics_no == null){
	System.out.println(this.toString+" : swlics_no is null" );
}else{
	System.out.println(this.toString+" : swlics_no is "+swlics_no );
}
String swmang_no = req.getParameter("swmang_no");
if( swmang_no == null){
	System.out.println(this.toString+" : swmang_no is null" );
}else{
	System.out.println(this.toString+" : swmang_no is "+swmang_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String use_pers_flnm = Util.checkString(req.getParameter("use_pers_flnm"));
String use_pers = Util.checkString(req.getParameter("use_pers"));
String swlics_no = Util.checkString(req.getParameter("swlics_no"));
String swmang_no = Util.checkString(req.getParameter("swmang_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String use_pers_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers_flnm")));
String use_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("use_pers")));
String swlics_no = Util.Uni2Ksc(Util.checkString(req.getParameter("swlics_no")));
String swmang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("swmang_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUse_pers_flnm(use_pers_flnm);
dm.setUse_pers(use_pers);
dm.setSwlics_no(swlics_no);
dm.setSwmang_no(swmang_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 18:00:57 KST 2009 */