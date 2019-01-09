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


package chosun.ciis.mt.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.common.ds.*;
import chosun.ciis.mt.common.rec.*;

/**
 * 
 */


public class MT_COMMON_MATR_0005_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_occr_dt;
	public String ewh_seq;
	public String matr_cd;

	public MT_COMMON_MATR_0005_LDM(){}
	public MT_COMMON_MATR_0005_LDM(String cmpy_cd, String ewh_occr_dt, String ewh_seq, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.ewh_occr_dt = ewh_occr_dt;
		this.ewh_seq = ewh_seq;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_occr_dt(String ewh_occr_dt){
		this.ewh_occr_dt = ewh_occr_dt;
	}

	public void setEwh_seq(String ewh_seq){
		this.ewh_seq = ewh_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_occr_dt(){
		return this.ewh_occr_dt;
	}

	public String getEwh_seq(){
		return this.ewh_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_COMMON_MATR_0005_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_COMMON_MATR_0005_LDM dm = (MT_COMMON_MATR_0005_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_occr_dt);
		cstmt.setString(5, dm.ewh_seq);
		cstmt.setString(6, dm.matr_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.common.ds.MT_COMMON_MATR_0005_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_occr_dt = [" + getEwh_occr_dt() + "]");
		System.out.println("ewh_seq = [" + getEwh_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
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
String ewh_occr_dt = req.getParameter("ewh_occr_dt");
if( ewh_occr_dt == null){
	System.out.println(this.toString+" : ewh_occr_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_occr_dt is "+ewh_occr_dt );
}
String ewh_seq = req.getParameter("ewh_seq");
if( ewh_seq == null){
	System.out.println(this.toString+" : ewh_seq is null" );
}else{
	System.out.println(this.toString+" : ewh_seq is "+ewh_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_occr_dt = Util.checkString(req.getParameter("ewh_occr_dt"));
String ewh_seq = Util.checkString(req.getParameter("ewh_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_occr_dt")));
String ewh_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_occr_dt(ewh_occr_dt);
dm.setEwh_seq(ewh_seq);
dm.setMatr_cd(matr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 30 02:07:13 KST 2009 */