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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proc_yymm;
	public String slip_clsf_cd;
	public String basi_dt;

	public IS_DEP_2510_LDM(){}
	public IS_DEP_2510_LDM(String cmpy_cd, String proc_yymm, String slip_clsf_cd, String basi_dt){
		this.cmpy_cd = cmpy_cd;
		this.proc_yymm = proc_yymm;
		this.slip_clsf_cd = slip_clsf_cd;
		this.basi_dt = basi_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_2510_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_2510_LDM dm = (IS_DEP_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proc_yymm);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.basi_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proc_yymm = [" + getProc_yymm() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("basi_dt = [" + getBasi_dt() + "]");
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
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProc_yymm(proc_yymm);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setBasi_dt(basi_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 22 14:37:31 KST 2012 */