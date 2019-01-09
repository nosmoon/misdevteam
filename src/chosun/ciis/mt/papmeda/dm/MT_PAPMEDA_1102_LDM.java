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


package chosun.ciis.mt.papmeda.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papmeda.ds.*;
import chosun.ciis.mt.papmeda.rec.*;

/**
 * 
 */


public class MT_PAPMEDA_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String meda_yymm;
	public String slip_proc_occr_dt;

	public MT_PAPMEDA_1102_LDM(){}
	public MT_PAPMEDA_1102_LDM(String cmpy_cd, String meda_yymm, String slip_proc_occr_dt){
		this.cmpy_cd = cmpy_cd;
		this.meda_yymm = meda_yymm;
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMeda_yymm(String meda_yymm){
		this.meda_yymm = meda_yymm;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMeda_yymm(){
		return this.meda_yymm;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPMEDA_1102_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPMEDA_1102_LDM dm = (MT_PAPMEDA_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.meda_yymm);
		cstmt.setString(5, dm.slip_proc_occr_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papmeda.ds.MT_PAPMEDA_1102_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("meda_yymm = [" + getMeda_yymm() + "]");
		System.out.println("slip_proc_occr_dt = [" + getSlip_proc_occr_dt() + "]");
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
String meda_yymm = req.getParameter("meda_yymm");
if( meda_yymm == null){
	System.out.println(this.toString+" : meda_yymm is null" );
}else{
	System.out.println(this.toString+" : meda_yymm is "+meda_yymm );
}
String slip_proc_occr_dt = req.getParameter("slip_proc_occr_dt");
if( slip_proc_occr_dt == null){
	System.out.println(this.toString+" : slip_proc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_occr_dt is "+slip_proc_occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String meda_yymm = Util.checkString(req.getParameter("meda_yymm"));
String slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String meda_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_yymm")));
String slip_proc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMeda_yymm(meda_yymm);
dm.setSlip_proc_occr_dt(slip_proc_occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 14:20:42 KST 2009 */