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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_5012_PDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String clsf_cd_fr;
	public String clsf_cd_to;

	public FC_ACCT_5012_PDM(){}
	public FC_ACCT_5012_PDM(String cmpy_cd, String incmg_dt, String clsf_cd_fr, String clsf_cd_to){
		this.cmpy_cd = cmpy_cd;
		this.incmg_dt = incmg_dt;
		this.clsf_cd_fr = clsf_cd_fr;
		this.clsf_cd_to = clsf_cd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setClsf_cd_fr(String clsf_cd_fr){
		this.clsf_cd_fr = clsf_cd_fr;
	}

	public void setClsf_cd_to(String clsf_cd_to){
		this.clsf_cd_to = clsf_cd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getClsf_cd_fr(){
		return this.clsf_cd_fr;
	}

	public String getClsf_cd_to(){
		return this.clsf_cd_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5012_P(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5012_PDM dm = (FC_ACCT_5012_PDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_dt);
		cstmt.setString(5, dm.clsf_cd_fr);
		cstmt.setString(6, dm.clsf_cd_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5012_PDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_dt = " + getIncmg_dt());
        System.out.println("clsf_cd_fr = " + getClsf_cd_fr());
        System.out.println("clsf_cd_to = " + getClsf_cd_to());
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
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String clsf_cd_fr = req.getParameter("clsf_cd_fr");
if( clsf_cd_fr == null){
	System.out.println(this.toString+" : clsf_cd_fr is null" );
}else{
	System.out.println(this.toString+" : clsf_cd_fr is "+clsf_cd_fr );
}
String clsf_cd_to = req.getParameter("clsf_cd_to");
if( clsf_cd_to == null){
	System.out.println(this.toString+" : clsf_cd_to is null" );
}else{
	System.out.println(this.toString+" : clsf_cd_to is "+clsf_cd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String clsf_cd_fr = Util.checkString(req.getParameter("clsf_cd_fr"));
String clsf_cd_to = Util.checkString(req.getParameter("clsf_cd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String clsf_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd_fr")));
String clsf_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_dt(incmg_dt);
dm.setClsf_cd_fr(clsf_cd_fr);
dm.setClsf_cd_to(clsf_cd_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 09:52:20 KST 2009 */