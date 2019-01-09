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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_2031_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String end_dt;
	public String seci_clsf_cd;
	public String pay_bank_cd;

	public FC_FUNC_2031_LDM(){}
	public FC_FUNC_2031_LDM(String cmpy_cd, String end_dt, String seci_clsf_cd, String pay_bank_cd){
		this.cmpy_cd = cmpy_cd;
		this.end_dt = end_dt;
		this.seci_clsf_cd = seci_clsf_cd;
		this.pay_bank_cd = pay_bank_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setPay_bank_cd(String pay_bank_cd){
		this.pay_bank_cd = pay_bank_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getPay_bank_cd(){
		return this.pay_bank_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_2031_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_2031_LDM dm = (FC_FUNC_2031_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.end_dt);
		cstmt.setString(5, dm.seci_clsf_cd);
		cstmt.setString(6, dm.pay_bank_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_2031_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("end_dt = " + getEnd_dt());
        System.out.println("seci_clsf_cd = " + getSeci_clsf_cd());
        System.out.println("pay_bank_cd = " + getPay_bank_cd());
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
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String seci_clsf_cd = req.getParameter("seci_clsf_cd");
if( seci_clsf_cd == null){
	System.out.println(this.toString+" : seci_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : seci_clsf_cd is "+seci_clsf_cd );
}
String pay_bank_cd = req.getParameter("pay_bank_cd");
if( pay_bank_cd == null){
	System.out.println(this.toString+" : pay_bank_cd is null" );
}else{
	System.out.println(this.toString+" : pay_bank_cd is "+pay_bank_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String seci_clsf_cd = Util.checkString(req.getParameter("seci_clsf_cd"));
String pay_bank_cd = Util.checkString(req.getParameter("pay_bank_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String seci_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_clsf_cd")));
String pay_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_bank_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEnd_dt(end_dt);
dm.setSeci_clsf_cd(seci_clsf_cd);
dm.setPay_bank_cd(pay_bank_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 20:19:57 KST 2009 */