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


public class HD_INFO_2202_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_yn;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String issu_tm;

	public HD_INFO_2202_LDM(){}
	public HD_INFO_2202_LDM(String cmpy_cd, String issu_yn, String occr_dt_fr, String occr_dt_to, String issu_tm){
		this.cmpy_cd = cmpy_cd;
		this.issu_yn = issu_yn;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.issu_tm = issu_tm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_yn(String issu_yn){
		this.issu_yn = issu_yn;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setIssu_tm(String issu_tm){
		this.issu_tm = issu_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_yn(){
		return this.issu_yn;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getIssu_tm(){
		return this.issu_tm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2202_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2202_LDM dm = (HD_INFO_2202_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_yn);
		cstmt.setString(5, dm.occr_dt_fr);
		cstmt.setString(6, dm.occr_dt_to);
		cstmt.setString(7, dm.issu_tm);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2202_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_yn = [" + getIssu_yn() + "]");
		System.out.println("occr_dt_fr = [" + getOccr_dt_fr() + "]");
		System.out.println("occr_dt_to = [" + getOccr_dt_to() + "]");
		System.out.println("issu_tm = [" + getIssu_tm() + "]");
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
String issu_yn = req.getParameter("issu_yn");
if( issu_yn == null){
	System.out.println(this.toString+" : issu_yn is null" );
}else{
	System.out.println(this.toString+" : issu_yn is "+issu_yn );
}
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String issu_tm = req.getParameter("issu_tm");
if( issu_tm == null){
	System.out.println(this.toString+" : issu_tm is null" );
}else{
	System.out.println(this.toString+" : issu_tm is "+issu_tm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_yn = Util.checkString(req.getParameter("issu_yn"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String issu_tm = Util.checkString(req.getParameter("issu_tm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_yn")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String issu_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_tm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_yn(issu_yn);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setIssu_tm(issu_tm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 17:08:13 KST 2009 */