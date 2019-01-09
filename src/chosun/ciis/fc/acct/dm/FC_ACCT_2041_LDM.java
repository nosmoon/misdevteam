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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2041_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_from;
	public String occr_dt_to;
	public String occr_acct_cd;
	public String dept_cd;
	public String combo1;
	public String combo2;

	public FC_ACCT_2041_LDM(){}
	public FC_ACCT_2041_LDM(String cmpy_cd, String occr_dt_from, String occr_dt_to, String occr_acct_cd, String dept_cd, String combo1, String combo2){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_from = occr_dt_from;
		this.occr_dt_to = occr_dt_to;
		this.occr_acct_cd = occr_acct_cd;
		this.dept_cd = dept_cd;
		this.combo1 = combo1;
		this.combo2 = combo2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_from(String occr_dt_from){
		this.occr_dt_from = occr_dt_from;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setOccr_acct_cd(String occr_acct_cd){
		this.occr_acct_cd = occr_acct_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setCombo1(String combo1){
		this.combo1 = combo1;
	}

	public void setCombo2(String combo2){
		this.combo2 = combo2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_from(){
		return this.occr_dt_from;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getOccr_acct_cd(){
		return this.occr_acct_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getCombo1(){
		return this.combo1;
	}

	public String getCombo2(){
		return this.combo2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2041_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2041_LDM dm = (FC_ACCT_2041_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_from);
		cstmt.setString(5, dm.occr_dt_to);
		cstmt.setString(6, dm.occr_acct_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.combo1);
		cstmt.setString(9, dm.combo2);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2041_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt_from = " + getOccr_dt_from());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
        System.out.println("occr_acct_cd = " + getOccr_acct_cd());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("combo1 = " + getCombo1());
        System.out.println("combo2 = " + getCombo2());
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
String occr_dt_from = req.getParameter("occr_dt_from");
if( occr_dt_from == null){
	System.out.println(this.toString+" : occr_dt_from is null" );
}else{
	System.out.println(this.toString+" : occr_dt_from is "+occr_dt_from );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
String occr_acct_cd = req.getParameter("occr_acct_cd");
if( occr_acct_cd == null){
	System.out.println(this.toString+" : occr_acct_cd is null" );
}else{
	System.out.println(this.toString+" : occr_acct_cd is "+occr_acct_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String combo1 = req.getParameter("combo1");
if( combo1 == null){
	System.out.println(this.toString+" : combo1 is null" );
}else{
	System.out.println(this.toString+" : combo1 is "+combo1 );
}
String combo2 = req.getParameter("combo2");
if( combo2 == null){
	System.out.println(this.toString+" : combo2 is null" );
}else{
	System.out.println(this.toString+" : combo2 is "+combo2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_from = Util.checkString(req.getParameter("occr_dt_from"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String occr_acct_cd = Util.checkString(req.getParameter("occr_acct_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String combo1 = Util.checkString(req.getParameter("combo1"));
String combo2 = Util.checkString(req.getParameter("combo2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_from = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_from")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String occr_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_acct_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String combo1 = Util.Uni2Ksc(Util.checkString(req.getParameter("combo1")));
String combo2 = Util.Uni2Ksc(Util.checkString(req.getParameter("combo2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_from(occr_dt_from);
dm.setOccr_dt_to(occr_dt_to);
dm.setOccr_acct_cd(occr_acct_cd);
dm.setDept_cd(dept_cd);
dm.setCombo1(combo1);
dm.setCombo2(combo2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */