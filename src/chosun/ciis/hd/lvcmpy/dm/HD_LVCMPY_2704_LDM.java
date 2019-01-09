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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2704_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String in_slip_occr_dt;
	public String in_slip_seq;
	public String in_slip_clsf_cd;

	public HD_LVCMPY_2704_LDM(){}
	public HD_LVCMPY_2704_LDM(String cmpy_cd, String in_slip_occr_dt, String in_slip_seq, String in_slip_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.in_slip_occr_dt = in_slip_occr_dt;
		this.in_slip_seq = in_slip_seq;
		this.in_slip_clsf_cd = in_slip_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIn_slip_occr_dt(String in_slip_occr_dt){
		this.in_slip_occr_dt = in_slip_occr_dt;
	}

	public void setIn_slip_seq(String in_slip_seq){
		this.in_slip_seq = in_slip_seq;
	}

	public void setIn_slip_clsf_cd(String in_slip_clsf_cd){
		this.in_slip_clsf_cd = in_slip_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIn_slip_occr_dt(){
		return this.in_slip_occr_dt;
	}

	public String getIn_slip_seq(){
		return this.in_slip_seq;
	}

	public String getIn_slip_clsf_cd(){
		return this.in_slip_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2704_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2704_LDM dm = (HD_LVCMPY_2704_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.in_slip_occr_dt);
		cstmt.setString(5, dm.in_slip_seq);
		cstmt.setString(6, dm.in_slip_clsf_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2704_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("in_slip_occr_dt = [" + getIn_slip_occr_dt() + "]");
		System.out.println("in_slip_seq = [" + getIn_slip_seq() + "]");
		System.out.println("in_slip_clsf_cd = [" + getIn_slip_clsf_cd() + "]");
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
String in_slip_occr_dt = req.getParameter("in_slip_occr_dt");
if( in_slip_occr_dt == null){
	System.out.println(this.toString+" : in_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : in_slip_occr_dt is "+in_slip_occr_dt );
}
String in_slip_seq = req.getParameter("in_slip_seq");
if( in_slip_seq == null){
	System.out.println(this.toString+" : in_slip_seq is null" );
}else{
	System.out.println(this.toString+" : in_slip_seq is "+in_slip_seq );
}
String in_slip_clsf_cd = req.getParameter("in_slip_clsf_cd");
if( in_slip_clsf_cd == null){
	System.out.println(this.toString+" : in_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : in_slip_clsf_cd is "+in_slip_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
String in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
String in_slip_clsf_cd = Util.checkString(req.getParameter("in_slip_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String in_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_occr_dt")));
String in_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_seq")));
String in_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIn_slip_occr_dt(in_slip_occr_dt);
dm.setIn_slip_seq(in_slip_seq);
dm.setIn_slip_clsf_cd(in_slip_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 09 17:10:26 KST 2009 */