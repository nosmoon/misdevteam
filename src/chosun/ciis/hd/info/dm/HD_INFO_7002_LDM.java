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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chrg_posk_cd;
	public String medi_cd;
	public String thrw_pgm;
	public String flnm;
	public String basic_dt;
	public String clsf;

	public HD_INFO_7002_LDM(){}
	public HD_INFO_7002_LDM(String cmpy_cd, String chrg_posk_cd, String medi_cd, String thrw_pgm, String flnm, String basic_dt, String clsf){
		this.cmpy_cd = cmpy_cd;
		this.chrg_posk_cd = chrg_posk_cd;
		this.medi_cd = medi_cd;
		this.thrw_pgm = thrw_pgm;
		this.flnm = flnm;
		this.basic_dt = basic_dt;
		this.clsf = clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBasic_dt(String basic_dt){
		this.basic_dt = basic_dt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBasic_dt(){
		return this.basic_dt;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7002_LDM dm = (HD_INFO_7002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chrg_posk_cd);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.thrw_pgm);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.basic_dt);
		cstmt.setString(9, dm.clsf);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chrg_posk_cd = [" + getChrg_posk_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("thrw_pgm = [" + getThrw_pgm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("basic_dt = [" + getBasic_dt() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
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
String chrg_posk_cd = req.getParameter("chrg_posk_cd");
if( chrg_posk_cd == null){
	System.out.println(this.toString+" : chrg_posk_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_cd is "+chrg_posk_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String thrw_pgm = req.getParameter("thrw_pgm");
if( thrw_pgm == null){
	System.out.println(this.toString+" : thrw_pgm is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm is "+thrw_pgm );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String basic_dt = req.getParameter("basic_dt");
if( basic_dt == null){
	System.out.println(this.toString+" : basic_dt is null" );
}else{
	System.out.println(this.toString+" : basic_dt is "+basic_dt );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String basic_dt = Util.checkString(req.getParameter("basic_dt"));
String clsf = Util.checkString(req.getParameter("clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chrg_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String thrw_pgm = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String basic_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basic_dt")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChrg_posk_cd(chrg_posk_cd);
dm.setMedi_cd(medi_cd);
dm.setThrw_pgm(thrw_pgm);
dm.setFlnm(flnm);
dm.setBasic_dt(basic_dt);
dm.setClsf(clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 13 17:50:51 KST 2012 */