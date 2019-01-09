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


package chosun.ciis.en.comm.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.comm.ds.*;
import chosun.ciis.en.comm.rec.*;

/**
 * 
 */


public class EN_COMM_1201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;
	public String rcpm_unit_clsf;
	public String rcpm_proc_yn;
	public String rcpm_frdt;
	public String rcpm_todt;

	public EN_COMM_1201_LDM(){}
	public EN_COMM_1201_LDM(String cmpy_cd, String evnt_cd, String rcpm_unit_clsf, String rcpm_proc_yn, String rcpm_frdt, String rcpm_todt){
		this.cmpy_cd = cmpy_cd;
		this.evnt_cd = evnt_cd;
		this.rcpm_unit_clsf = rcpm_unit_clsf;
		this.rcpm_proc_yn = rcpm_proc_yn;
		this.rcpm_frdt = rcpm_frdt;
		this.rcpm_todt = rcpm_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setRcpm_unit_clsf(String rcpm_unit_clsf){
		this.rcpm_unit_clsf = rcpm_unit_clsf;
	}

	public void setRcpm_proc_yn(String rcpm_proc_yn){
		this.rcpm_proc_yn = rcpm_proc_yn;
	}

	public void setRcpm_frdt(String rcpm_frdt){
		this.rcpm_frdt = rcpm_frdt;
	}

	public void setRcpm_todt(String rcpm_todt){
		this.rcpm_todt = rcpm_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getRcpm_unit_clsf(){
		return this.rcpm_unit_clsf;
	}

	public String getRcpm_proc_yn(){
		return this.rcpm_proc_yn;
	}

	public String getRcpm_frdt(){
		return this.rcpm_frdt;
	}

	public String getRcpm_todt(){
		return this.rcpm_todt;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_COMM_1201_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_COMM_1201_LDM dm = (EN_COMM_1201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_cd);
		cstmt.setString(5, dm.rcpm_unit_clsf);
		cstmt.setString(6, dm.rcpm_proc_yn);
		cstmt.setString(7, dm.rcpm_frdt);
		cstmt.setString(8, dm.rcpm_todt);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.comm.ds.EN_COMM_1201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("rcpm_unit_clsf = [" + getRcpm_unit_clsf() + "]");
		System.out.println("rcpm_proc_yn = [" + getRcpm_proc_yn() + "]");
		System.out.println("rcpm_frdt = [" + getRcpm_frdt() + "]");
		System.out.println("rcpm_todt = [" + getRcpm_todt() + "]");
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String rcpm_unit_clsf = req.getParameter("rcpm_unit_clsf");
if( rcpm_unit_clsf == null){
	System.out.println(this.toString+" : rcpm_unit_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_unit_clsf is "+rcpm_unit_clsf );
}
String rcpm_proc_yn = req.getParameter("rcpm_proc_yn");
if( rcpm_proc_yn == null){
	System.out.println(this.toString+" : rcpm_proc_yn is null" );
}else{
	System.out.println(this.toString+" : rcpm_proc_yn is "+rcpm_proc_yn );
}
String rcpm_frdt = req.getParameter("rcpm_frdt");
if( rcpm_frdt == null){
	System.out.println(this.toString+" : rcpm_frdt is null" );
}else{
	System.out.println(this.toString+" : rcpm_frdt is "+rcpm_frdt );
}
String rcpm_todt = req.getParameter("rcpm_todt");
if( rcpm_todt == null){
	System.out.println(this.toString+" : rcpm_todt is null" );
}else{
	System.out.println(this.toString+" : rcpm_todt is "+rcpm_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String rcpm_unit_clsf = Util.checkString(req.getParameter("rcpm_unit_clsf"));
String rcpm_proc_yn = Util.checkString(req.getParameter("rcpm_proc_yn"));
String rcpm_frdt = Util.checkString(req.getParameter("rcpm_frdt"));
String rcpm_todt = Util.checkString(req.getParameter("rcpm_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String rcpm_unit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_unit_clsf")));
String rcpm_proc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_proc_yn")));
String rcpm_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_frdt")));
String rcpm_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_cd(evnt_cd);
dm.setRcpm_unit_clsf(rcpm_unit_clsf);
dm.setRcpm_proc_yn(rcpm_proc_yn);
dm.setRcpm_frdt(rcpm_frdt);
dm.setRcpm_todt(rcpm_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 18 16:23:48 KST 2009 */