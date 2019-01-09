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


public class FC_ACCT_5111_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clos_dt;
	public String clos_clsf1;
	public String clos_clsf2;

	public FC_ACCT_5111_LDM(){}
	public FC_ACCT_5111_LDM(String cmpy_cd, String clos_dt, String clos_clsf1, String clos_clsf2){
		this.cmpy_cd = cmpy_cd;
		this.clos_dt = clos_dt;
		this.clos_clsf1 = clos_clsf1;
		this.clos_clsf2 = clos_clsf2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setClos_clsf1(String clos_clsf1){
		this.clos_clsf1 = clos_clsf1;
	}

	public void setClos_clsf2(String clos_clsf2){
		this.clos_clsf2 = clos_clsf2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getClos_clsf1(){
		return this.clos_clsf1;
	}

	public String getClos_clsf2(){
		return this.clos_clsf2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5111_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5111_LDM dm = (FC_ACCT_5111_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clos_dt);
		cstmt.setString(5, dm.clos_clsf1);
		cstmt.setString(6, dm.clos_clsf2);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5111_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("clos_dt = " + getClos_dt());
        System.out.println("clos_clsf1 = " + getClos_clsf1());
        System.out.println("clos_clsf2 = " + getClos_clsf2());
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
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String clos_clsf1 = req.getParameter("clos_clsf1");
if( clos_clsf1 == null){
	System.out.println(this.toString+" : clos_clsf1 is null" );
}else{
	System.out.println(this.toString+" : clos_clsf1 is "+clos_clsf1 );
}
String clos_clsf2 = req.getParameter("clos_clsf2");
if( clos_clsf2 == null){
	System.out.println(this.toString+" : clos_clsf2 is null" );
}else{
	System.out.println(this.toString+" : clos_clsf2 is "+clos_clsf2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String clos_clsf1 = Util.checkString(req.getParameter("clos_clsf1"));
String clos_clsf2 = Util.checkString(req.getParameter("clos_clsf2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String clos_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_clsf1")));
String clos_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_clsf2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClos_dt(clos_dt);
dm.setClos_clsf1(clos_clsf1);
dm.setClos_clsf2(clos_clsf2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 20:36:19 KST 2009 */