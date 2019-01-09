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


public class HD_AFFR_2405_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chk_dt;
	public String faml_prn;

	public HD_AFFR_2405_LDM(){}
	public HD_AFFR_2405_LDM(String cmpy_cd, String chk_dt, String faml_prn){
		this.cmpy_cd = cmpy_cd;
		this.chk_dt = chk_dt;
		this.faml_prn = faml_prn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2405_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2405_LDM dm = (HD_AFFR_2405_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chk_dt);
		cstmt.setString(5, dm.faml_prn);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2405_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chk_dt = [" + getChk_dt() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
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
String chk_dt = req.getParameter("chk_dt");
if( chk_dt == null){
	System.out.println(this.toString+" : chk_dt is null" );
}else{
	System.out.println(this.toString+" : chk_dt is "+chk_dt );
}
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chk_dt = Util.checkString(req.getParameter("chk_dt"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_dt")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChk_dt(chk_dt);
dm.setFaml_prn(faml_prn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 03 15:26:24 KST 2009 */