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


public class FC_FUNC_8043_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String pay_cost_clsf;
	public String hsty_seq;

	public FC_FUNC_8043_LDM(){}
	public FC_FUNC_8043_LDM(String cmpy_cd, String leas_clsf_cd, String leas_no, String pay_cost_clsf, String hsty_seq){
		this.cmpy_cd = cmpy_cd;
		this.leas_clsf_cd = leas_clsf_cd;
		this.leas_no = leas_no;
		this.pay_cost_clsf = pay_cost_clsf;
		this.hsty_seq = hsty_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setPay_cost_clsf(String pay_cost_clsf){
		this.pay_cost_clsf = pay_cost_clsf;
	}

	public void setHsty_seq(String hsty_seq){
		this.hsty_seq = hsty_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getPay_cost_clsf(){
		return this.pay_cost_clsf;
	}

	public String getHsty_seq(){
		return this.hsty_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_8043_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_8043_LDM dm = (FC_FUNC_8043_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_clsf_cd);
		cstmt.setString(5, dm.leas_no);
		cstmt.setString(6, dm.pay_cost_clsf);
		cstmt.setString(7, dm.hsty_seq);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_8043_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_clsf_cd = [" + getLeas_clsf_cd() + "]");
		System.out.println("leas_no = [" + getLeas_no() + "]");
		System.out.println("pay_cost_clsf = [" + getPay_cost_clsf() + "]");
		System.out.println("hsty_seq = [" + getHsty_seq() + "]");
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
String leas_clsf_cd = req.getParameter("leas_clsf_cd");
if( leas_clsf_cd == null){
	System.out.println(this.toString+" : leas_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : leas_clsf_cd is "+leas_clsf_cd );
}
String leas_no = req.getParameter("leas_no");
if( leas_no == null){
	System.out.println(this.toString+" : leas_no is null" );
}else{
	System.out.println(this.toString+" : leas_no is "+leas_no );
}
String pay_cost_clsf = req.getParameter("pay_cost_clsf");
if( pay_cost_clsf == null){
	System.out.println(this.toString+" : pay_cost_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_cost_clsf is "+pay_cost_clsf );
}
String hsty_seq = req.getParameter("hsty_seq");
if( hsty_seq == null){
	System.out.println(this.toString+" : hsty_seq is null" );
}else{
	System.out.println(this.toString+" : hsty_seq is "+hsty_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_clsf_cd = Util.checkString(req.getParameter("leas_clsf_cd"));
String leas_no = Util.checkString(req.getParameter("leas_no"));
String pay_cost_clsf = Util.checkString(req.getParameter("pay_cost_clsf"));
String hsty_seq = Util.checkString(req.getParameter("hsty_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf_cd")));
String leas_no = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_no")));
String pay_cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cost_clsf")));
String hsty_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("hsty_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_clsf_cd(leas_clsf_cd);
dm.setLeas_no(leas_no);
dm.setPay_cost_clsf(pay_cost_clsf);
dm.setHsty_seq(hsty_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 15:11:08 KST 2009 */