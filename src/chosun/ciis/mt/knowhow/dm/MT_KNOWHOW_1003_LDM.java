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


package chosun.ciis.mt.knowhow.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.knowhow.ds.*;
import chosun.ciis.mt.knowhow.rec.*;

/**
 * 
 */


public class MT_KNOWHOW_1003_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_dt;
	public String lcls;
	public String reg_seq;

	public MT_KNOWHOW_1003_LDM(){}
	public MT_KNOWHOW_1003_LDM(String cmpy_cd, String reg_dt, String lcls, String reg_seq){
		this.cmpy_cd = cmpy_cd;
		this.reg_dt = reg_dt;
		this.lcls = lcls;
		this.reg_seq = reg_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setLcls(String lcls){
		this.lcls = lcls;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getLcls(){
		return this.lcls;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_KNOWHOW_1003_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_KNOWHOW_1003_LDM dm = (MT_KNOWHOW_1003_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.reg_dt);
		cstmt.setString(5, dm.lcls);
		cstmt.setString(6, dm.reg_seq);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.knowhow.ds.MT_KNOWHOW_1003_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("lcls = [" + getLcls() + "]");
		System.out.println("reg_seq = [" + getReg_seq() + "]");
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
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String lcls = req.getParameter("lcls");
if( lcls == null){
	System.out.println(this.toString+" : lcls is null" );
}else{
	System.out.println(this.toString+" : lcls is "+lcls );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String lcls = Util.checkString(req.getParameter("lcls"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String lcls = Util.Uni2Ksc(Util.checkString(req.getParameter("lcls")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setReg_dt(reg_dt);
dm.setLcls(lcls);
dm.setReg_seq(reg_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 10 16:29:15 KST 2009 */