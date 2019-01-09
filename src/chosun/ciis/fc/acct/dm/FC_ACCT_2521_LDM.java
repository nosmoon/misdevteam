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


public class FC_ACCT_2521_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acctcdfr;
	public String acctcdto;
	public String acntcymfr;
	public String acntcymto;

	public FC_ACCT_2521_LDM(){}
	public FC_ACCT_2521_LDM(String cmpy_cd, String acctcdfr, String acctcdto, String acntcymfr, String acntcymto){
		this.cmpy_cd = cmpy_cd;
		this.acctcdfr = acctcdfr;
		this.acctcdto = acctcdto;
		this.acntcymfr = acntcymfr;
		this.acntcymto = acntcymto;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcctcdfr(String acctcdfr){
		this.acctcdfr = acctcdfr;
	}

	public void setAcctcdto(String acctcdto){
		this.acctcdto = acctcdto;
	}

	public void setAcntcymfr(String acntcymfr){
		this.acntcymfr = acntcymfr;
	}

	public void setAcntcymto(String acntcymto){
		this.acntcymto = acntcymto;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcctcdfr(){
		return this.acctcdfr;
	}

	public String getAcctcdto(){
		return this.acctcdto;
	}

	public String getAcntcymfr(){
		return this.acntcymfr;
	}

	public String getAcntcymto(){
		return this.acntcymto;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2521_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2521_LDM dm = (FC_ACCT_2521_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acctcdfr);
		cstmt.setString(5, dm.acctcdto);
		cstmt.setString(6, dm.acntcymfr);
		cstmt.setString(7, dm.acntcymto);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2521_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acctcdfr = [" + getAcctcdfr() + "]");
		System.out.println("acctcdto = [" + getAcctcdto() + "]");
		System.out.println("acntcymfr = [" + getAcntcymfr() + "]");
		System.out.println("acntcymto = [" + getAcntcymto() + "]");
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
String acctcdfr = req.getParameter("acctcdfr");
if( acctcdfr == null){
	System.out.println(this.toString+" : acctcdfr is null" );
}else{
	System.out.println(this.toString+" : acctcdfr is "+acctcdfr );
}
String acctcdto = req.getParameter("acctcdto");
if( acctcdto == null){
	System.out.println(this.toString+" : acctcdto is null" );
}else{
	System.out.println(this.toString+" : acctcdto is "+acctcdto );
}
String acntcymfr = req.getParameter("acntcymfr");
if( acntcymfr == null){
	System.out.println(this.toString+" : acntcymfr is null" );
}else{
	System.out.println(this.toString+" : acntcymfr is "+acntcymfr );
}
String acntcymto = req.getParameter("acntcymto");
if( acntcymto == null){
	System.out.println(this.toString+" : acntcymto is null" );
}else{
	System.out.println(this.toString+" : acntcymto is "+acntcymto );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acctcdfr = Util.checkString(req.getParameter("acctcdfr"));
String acctcdto = Util.checkString(req.getParameter("acctcdto"));
String acntcymfr = Util.checkString(req.getParameter("acntcymfr"));
String acntcymto = Util.checkString(req.getParameter("acntcymto"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acctcdfr = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcdfr")));
String acctcdto = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcdto")));
String acntcymfr = Util.Uni2Ksc(Util.checkString(req.getParameter("acntcymfr")));
String acntcymto = Util.Uni2Ksc(Util.checkString(req.getParameter("acntcymto")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcctcdfr(acctcdfr);
dm.setAcctcdto(acctcdto);
dm.setAcntcymfr(acntcymfr);
dm.setAcntcymto(acntcymto);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 13 15:38:11 KST 2009 */