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


public class HD_AFFR_2600_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chk_yy;
	public String in_cmpy_dt;
	public String faml_prn;
	public String lvcmpy_dt;

	public HD_AFFR_2600_LDM(){}
	public HD_AFFR_2600_LDM(String cmpy_cd, String chk_yy, String in_cmpy_dt, String faml_prn, String lvcmpy_dt){
		this.cmpy_cd = cmpy_cd;
		this.chk_yy = chk_yy;
		this.in_cmpy_dt = in_cmpy_dt;
		this.faml_prn = faml_prn;
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChk_yy(String chk_yy){
		this.chk_yy = chk_yy;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setFaml_prn(String faml_prn){
		this.faml_prn = faml_prn;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChk_yy(){
		return this.chk_yy;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getFaml_prn(){
		return this.faml_prn;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2600_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2600_LDM dm = (HD_AFFR_2600_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chk_yy);
		cstmt.setString(5, dm.in_cmpy_dt);
		cstmt.setString(6, dm.faml_prn);
		cstmt.setString(7, dm.lvcmpy_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2600_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chk_yy = [" + getChk_yy() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("faml_prn = [" + getFaml_prn() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
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
String chk_yy = req.getParameter("chk_yy");
if( chk_yy == null){
	System.out.println(this.toString+" : chk_yy is null" );
}else{
	System.out.println(this.toString+" : chk_yy is "+chk_yy );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
}
String faml_prn = req.getParameter("faml_prn");
if( faml_prn == null){
	System.out.println(this.toString+" : faml_prn is null" );
}else{
	System.out.println(this.toString+" : faml_prn is "+faml_prn );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chk_yy = Util.checkString(req.getParameter("chk_yy"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String faml_prn = Util.checkString(req.getParameter("faml_prn"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chk_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_yy")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String faml_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("faml_prn")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChk_yy(chk_yy);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setFaml_prn(faml_prn);
dm.setLvcmpy_dt(lvcmpy_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 08:52:56 KST 2009 */