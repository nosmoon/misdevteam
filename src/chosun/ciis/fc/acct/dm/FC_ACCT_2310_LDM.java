/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_yn;
	public String reserv_dt_fr;
	public String reserv_dt_to;

	public FC_ACCT_2310_LDM(){}
	public FC_ACCT_2310_LDM(String cmpy_cd, String pay_yn, String reserv_dt_fr, String reserv_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.pay_yn = pay_yn;
		this.reserv_dt_fr = reserv_dt_fr;
		this.reserv_dt_to = reserv_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_yn(String pay_yn){
		this.pay_yn = pay_yn;
	}

	public void setReserv_dt_fr(String reserv_dt_fr){
		this.reserv_dt_fr = reserv_dt_fr;
	}

	public void setReserv_dt_to(String reserv_dt_to){
		this.reserv_dt_to = reserv_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_yn(){
		return this.pay_yn;
	}

	public String getReserv_dt_fr(){
		return this.reserv_dt_fr;
	}

	public String getReserv_dt_to(){
		return this.reserv_dt_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2310_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2310_LDM dm = (FC_ACCT_2310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pay_yn);
		cstmt.setString(5, dm.reserv_dt_fr);
		cstmt.setString(6, dm.reserv_dt_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2310_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pay_yn = " + getPay_yn());
        System.out.println("reserv_dt_fr = " + getReserv_dt_fr());
        System.out.println("reserv_dt_to = " + getReserv_dt_to());
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
String pay_yn = req.getParameter("pay_yn");
if( pay_yn == null){
	System.out.println(this.toString+" : pay_yn is null" );
}else{
	System.out.println(this.toString+" : pay_yn is "+pay_yn );
}
String reserv_dt_fr = req.getParameter("reserv_dt_fr");
if( reserv_dt_fr == null){
	System.out.println(this.toString+" : reserv_dt_fr is null" );
}else{
	System.out.println(this.toString+" : reserv_dt_fr is "+reserv_dt_fr );
}
String reserv_dt_to = req.getParameter("reserv_dt_to");
if( reserv_dt_to == null){
	System.out.println(this.toString+" : reserv_dt_to is null" );
}else{
	System.out.println(this.toString+" : reserv_dt_to is "+reserv_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pay_yn = Util.checkString(req.getParameter("pay_yn"));
String reserv_dt_fr = Util.checkString(req.getParameter("reserv_dt_fr"));
String reserv_dt_to = Util.checkString(req.getParameter("reserv_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_yn")));
String reserv_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("reserv_dt_fr")));
String reserv_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("reserv_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPay_yn(pay_yn);
dm.setReserv_dt_fr(reserv_dt_fr);
dm.setReserv_dt_to(reserv_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 17 19:59:21 KST 2009 */