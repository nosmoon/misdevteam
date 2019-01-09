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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4303_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acpn_yy;
	public String acpn_seq;
	public String st_repay_dt;
	public String et_repay_dt;

	public HD_SALY_4303_LDM(){}
	public HD_SALY_4303_LDM(String cmpy_cd, String acpn_yy, String acpn_seq, String st_repay_dt, String et_repay_dt){
		this.cmpy_cd = cmpy_cd;
		this.acpn_yy = acpn_yy;
		this.acpn_seq = acpn_seq;
		this.st_repay_dt = st_repay_dt;
		this.et_repay_dt = et_repay_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcpn_yy(String acpn_yy){
		this.acpn_yy = acpn_yy;
	}

	public void setAcpn_seq(String acpn_seq){
		this.acpn_seq = acpn_seq;
	}

	public void setSt_repay_dt(String st_repay_dt){
		this.st_repay_dt = st_repay_dt;
	}

	public void setEt_repay_dt(String et_repay_dt){
		this.et_repay_dt = et_repay_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcpn_yy(){
		return this.acpn_yy;
	}

	public String getAcpn_seq(){
		return this.acpn_seq;
	}

	public String getSt_repay_dt(){
		return this.st_repay_dt;
	}

	public String getEt_repay_dt(){
		return this.et_repay_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4303_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4303_LDM dm = (HD_SALY_4303_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acpn_yy);
		cstmt.setString(5, dm.acpn_seq);
		cstmt.setString(6, dm.st_repay_dt);
		cstmt.setString(7, dm.et_repay_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4303_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acpn_yy = [" + getAcpn_yy() + "]");
		System.out.println("acpn_seq = [" + getAcpn_seq() + "]");
		System.out.println("st_repay_dt = [" + getSt_repay_dt() + "]");
		System.out.println("et_repay_dt = [" + getEt_repay_dt() + "]");
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
String acpn_yy = req.getParameter("acpn_yy");
if( acpn_yy == null){
	System.out.println(this.toString+" : acpn_yy is null" );
}else{
	System.out.println(this.toString+" : acpn_yy is "+acpn_yy );
}
String acpn_seq = req.getParameter("acpn_seq");
if( acpn_seq == null){
	System.out.println(this.toString+" : acpn_seq is null" );
}else{
	System.out.println(this.toString+" : acpn_seq is "+acpn_seq );
}
String st_repay_dt = req.getParameter("st_repay_dt");
if( st_repay_dt == null){
	System.out.println(this.toString+" : st_repay_dt is null" );
}else{
	System.out.println(this.toString+" : st_repay_dt is "+st_repay_dt );
}
String et_repay_dt = req.getParameter("et_repay_dt");
if( et_repay_dt == null){
	System.out.println(this.toString+" : et_repay_dt is null" );
}else{
	System.out.println(this.toString+" : et_repay_dt is "+et_repay_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acpn_yy = Util.checkString(req.getParameter("acpn_yy"));
String acpn_seq = Util.checkString(req.getParameter("acpn_seq"));
String st_repay_dt = Util.checkString(req.getParameter("st_repay_dt"));
String et_repay_dt = Util.checkString(req.getParameter("et_repay_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acpn_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_yy")));
String acpn_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_seq")));
String st_repay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_repay_dt")));
String et_repay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_repay_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcpn_yy(acpn_yy);
dm.setAcpn_seq(acpn_seq);
dm.setSt_repay_dt(st_repay_dt);
dm.setEt_repay_dt(et_repay_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 16 20:36:59 KST 2009 */