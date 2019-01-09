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


package chosun.ciis.ad.nmd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.nmd.ds.*;
import chosun.ciis.ad.nmd.rec.*;

/**
 * 
 */


public class AD_NMD_4310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String drbk_clsf;
	public String medi_cd;
	public String proc_frdt;
	public String proc_todt;
	public String hndl_clsf;
	public String dlco_no;

	public AD_NMD_4310_LDM(){}
	public AD_NMD_4310_LDM(String cmpy_cd, String drbk_clsf, String medi_cd, String proc_frdt, String proc_todt, String hndl_clsf, String dlco_no){
		this.cmpy_cd = cmpy_cd;
		this.drbk_clsf = drbk_clsf;
		this.medi_cd = medi_cd;
		this.proc_frdt = proc_frdt;
		this.proc_todt = proc_todt;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDrbk_clsf(String drbk_clsf){
		this.drbk_clsf = drbk_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setProc_frdt(String proc_frdt){
		this.proc_frdt = proc_frdt;
	}

	public void setProc_todt(String proc_todt){
		this.proc_todt = proc_todt;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDrbk_clsf(){
		return this.drbk_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getProc_frdt(){
		return this.proc_frdt;
	}

	public String getProc_todt(){
		return this.proc_todt;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_NMD_4310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_NMD_4310_LDM dm = (AD_NMD_4310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.drbk_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.proc_frdt);
		cstmt.setString(7, dm.proc_todt);
		cstmt.setString(8, dm.hndl_clsf);
		cstmt.setString(9, dm.dlco_no);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.nmd.ds.AD_NMD_4310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drbk_clsf = [" + getDrbk_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("proc_frdt = [" + getProc_frdt() + "]");
		System.out.println("proc_todt = [" + getProc_todt() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
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
String drbk_clsf = req.getParameter("drbk_clsf");
if( drbk_clsf == null){
	System.out.println(this.toString+" : drbk_clsf is null" );
}else{
	System.out.println(this.toString+" : drbk_clsf is "+drbk_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String proc_frdt = req.getParameter("proc_frdt");
if( proc_frdt == null){
	System.out.println(this.toString+" : proc_frdt is null" );
}else{
	System.out.println(this.toString+" : proc_frdt is "+proc_frdt );
}
String proc_todt = req.getParameter("proc_todt");
if( proc_todt == null){
	System.out.println(this.toString+" : proc_todt is null" );
}else{
	System.out.println(this.toString+" : proc_todt is "+proc_todt );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String drbk_clsf = Util.checkString(req.getParameter("drbk_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String proc_frdt = Util.checkString(req.getParameter("proc_frdt"));
String proc_todt = Util.checkString(req.getParameter("proc_todt"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String drbk_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drbk_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String proc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_frdt")));
String proc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_todt")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDrbk_clsf(drbk_clsf);
dm.setMedi_cd(medi_cd);
dm.setProc_frdt(proc_frdt);
dm.setProc_todt(proc_todt);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 04 11:44:02 KST 2014 */