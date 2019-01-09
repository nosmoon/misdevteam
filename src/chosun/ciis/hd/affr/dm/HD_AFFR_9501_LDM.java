/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String flnm;
	public String memb_clsf;
	public String dth_yn;
	public String lve_yn;

	public HD_AFFR_9501_LDM(){}
	public HD_AFFR_9501_LDM(String cmpy_cd, String flnm, String memb_clsf, String dth_yn, String lve_yn){
		this.cmpy_cd = cmpy_cd;
		this.flnm = flnm;
		this.memb_clsf = memb_clsf;
		this.dth_yn = dth_yn;
		this.lve_yn = lve_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setDth_yn(String dth_yn){
		this.dth_yn = dth_yn;
	}

	public void setLve_yn(String lve_yn){
		this.lve_yn = lve_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getDth_yn(){
		return this.dth_yn;
	}

	public String getLve_yn(){
		return this.lve_yn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9501_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9501_LDM dm = (HD_AFFR_9501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.flnm);
		cstmt.setString(5, dm.memb_clsf);
		cstmt.setString(6, dm.dth_yn);
		cstmt.setString(7, dm.lve_yn);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("memb_clsf = [" + getMemb_clsf() + "]");
		System.out.println("dth_yn = [" + getDth_yn() + "]");
		System.out.println("lve_yn = [" + getLve_yn() + "]");
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String memb_clsf = req.getParameter("memb_clsf");
if( memb_clsf == null){
	System.out.println(this.toString+" : memb_clsf is null" );
}else{
	System.out.println(this.toString+" : memb_clsf is "+memb_clsf );
}
String dth_yn = req.getParameter("dth_yn");
if( dth_yn == null){
	System.out.println(this.toString+" : dth_yn is null" );
}else{
	System.out.println(this.toString+" : dth_yn is "+dth_yn );
}
String lve_yn = req.getParameter("lve_yn");
if( lve_yn == null){
	System.out.println(this.toString+" : lve_yn is null" );
}else{
	System.out.println(this.toString+" : lve_yn is "+lve_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
String memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
String dth_yn = Util.checkString(req.getParameter("dth_yn"));
String lve_yn = Util.checkString(req.getParameter("lve_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String memb_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_clsf")));
String dth_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dth_yn")));
String lve_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lve_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFlnm(flnm);
dm.setMemb_clsf(memb_clsf);
dm.setDth_yn(dth_yn);
dm.setLve_yn(lve_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 06 17:31:09 KST 2017 */