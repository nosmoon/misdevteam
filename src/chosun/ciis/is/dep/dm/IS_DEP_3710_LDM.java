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


public class IS_DEP_3710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String eps_clsf;
	public String enty_clsf;
	public String frdt;
	public String todt;
	public String fpymt_yn;
	public String prog_yn;

	public IS_DEP_3710_LDM(){}
	public IS_DEP_3710_LDM(String cmpy_cd, String eps_clsf, String enty_clsf, String frdt, String todt, String fpymt_yn, String prog_yn){
		this.cmpy_cd = cmpy_cd;
		this.eps_clsf = eps_clsf;
		this.enty_clsf = enty_clsf;
		this.frdt = frdt;
		this.todt = todt;
		this.fpymt_yn = fpymt_yn;
		this.prog_yn = prog_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEps_clsf(String eps_clsf){
		this.eps_clsf = eps_clsf;
	}

	public void setEnty_clsf(String enty_clsf){
		this.enty_clsf = enty_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFpymt_yn(String fpymt_yn){
		this.fpymt_yn = fpymt_yn;
	}

	public void setProg_yn(String prog_yn){
		this.prog_yn = prog_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEps_clsf(){
		return this.eps_clsf;
	}

	public String getEnty_clsf(){
		return this.enty_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFpymt_yn(){
		return this.fpymt_yn;
	}

	public String getProg_yn(){
		return this.prog_yn;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_3710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_3710_LDM dm = (IS_DEP_3710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.eps_clsf);
		cstmt.setString(5, dm.enty_clsf);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.fpymt_yn);
		cstmt.setString(9, dm.prog_yn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_3710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("eps_clsf = [" + getEps_clsf() + "]");
		System.out.println("enty_clsf = [" + getEnty_clsf() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("fpymt_yn = [" + getFpymt_yn() + "]");
		System.out.println("prog_yn = [" + getProg_yn() + "]");
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
String eps_clsf = req.getParameter("eps_clsf");
if( eps_clsf == null){
	System.out.println(this.toString+" : eps_clsf is null" );
}else{
	System.out.println(this.toString+" : eps_clsf is "+eps_clsf );
}
String enty_clsf = req.getParameter("enty_clsf");
if( enty_clsf == null){
	System.out.println(this.toString+" : enty_clsf is null" );
}else{
	System.out.println(this.toString+" : enty_clsf is "+enty_clsf );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String fpymt_yn = req.getParameter("fpymt_yn");
if( fpymt_yn == null){
	System.out.println(this.toString+" : fpymt_yn is null" );
}else{
	System.out.println(this.toString+" : fpymt_yn is "+fpymt_yn );
}
String prog_yn = req.getParameter("prog_yn");
if( prog_yn == null){
	System.out.println(this.toString+" : prog_yn is null" );
}else{
	System.out.println(this.toString+" : prog_yn is "+prog_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String eps_clsf = Util.checkString(req.getParameter("eps_clsf"));
String enty_clsf = Util.checkString(req.getParameter("enty_clsf"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String fpymt_yn = Util.checkString(req.getParameter("fpymt_yn"));
String prog_yn = Util.checkString(req.getParameter("prog_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String eps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_clsf")));
String enty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("enty_clsf")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String fpymt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fpymt_yn")));
String prog_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("prog_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEps_clsf(eps_clsf);
dm.setEnty_clsf(enty_clsf);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setFpymt_yn(fpymt_yn);
dm.setProg_yn(prog_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 09:22:16 KST 2012 */