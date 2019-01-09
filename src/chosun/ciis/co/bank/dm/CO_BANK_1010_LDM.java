/***************************************************************************************************
* 파일명 : .java
* 기능 :  공통 - 통장 입출금 내역조회
* 작성일자 : 2011-04-27
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.bank.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.bank.ds.*;
import chosun.ciis.co.bank.rec.*;

/**
 * 공통 - 통장 입출금 내역조회
 */

public class CO_BANK_1010_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sys_clsf;
	public String acct_mang_cd;
	public String frdt;
	public String todt;
	public String tran_content;
	public String tran_amt;
	public String tran_clsfy;

	public CO_BANK_1010_LDM(){}
	public CO_BANK_1010_LDM(String cmpy_cd, String sys_clsf, String acct_mang_cd, String frdt, String todt, String tran_content, String tran_amt, String tran_clsfy){
		this.cmpy_cd = cmpy_cd;
		this.sys_clsf = sys_clsf;
		this.acct_mang_cd = acct_mang_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.tran_content = tran_content;
		this.tran_amt = tran_amt;
		this.tran_clsfy = tran_clsfy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSys_clsf(String sys_clsf){
		this.sys_clsf = sys_clsf;
	}

	public void setAcct_mang_cd(String acct_mang_cd){
		this.acct_mang_cd = acct_mang_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setTran_content(String tran_content){
		this.tran_content = tran_content;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setTran_clsfy(String tran_clsfy){
		this.tran_clsfy = tran_clsfy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSys_clsf(){
		return this.sys_clsf;
	}

	public String getAcct_mang_cd(){
		return this.acct_mang_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getTran_content(){
		return this.tran_content;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getTran_clsfy(){
		return this.tran_clsfy;
	}

	public String getSQL(){
		 return "{ call MISCOM.SP_CO_BANK_1010_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_BANK_1010_LDM dm = (CO_BANK_1010_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sys_clsf);
		cstmt.setString(5, dm.acct_mang_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.tran_content);
		cstmt.setString(9, dm.tran_amt);
		cstmt.setString(10, dm.tran_clsfy);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.bank.ds.CO_BANK_1010_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("sys_clsf = [" + getSys_clsf() + "]");
		System.out.println("acct_mang_cd = [" + getAcct_mang_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("tran_content = [" + getTran_content() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
		System.out.println("tran_clsfy = [" + getTran_clsfy() + "]");
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
String sys_clsf = req.getParameter("sys_clsf");
if( sys_clsf == null){
	System.out.println(this.toString+" : sys_clsf is null" );
}else{
	System.out.println(this.toString+" : sys_clsf is "+sys_clsf );
}
String acct_mang_cd = req.getParameter("acct_mang_cd");
if( acct_mang_cd == null){
	System.out.println(this.toString+" : acct_mang_cd is null" );
}else{
	System.out.println(this.toString+" : acct_mang_cd is "+acct_mang_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String tran_content = req.getParameter("tran_content");
if( tran_content == null){
	System.out.println(this.toString+" : tran_content is null" );
}else{
	System.out.println(this.toString+" : tran_content is "+tran_content );
}
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String tran_clsfy = req.getParameter("tran_clsfy");
if( tran_clsfy == null){
	System.out.println(this.toString+" : tran_clsfy is null" );
}else{
	System.out.println(this.toString+" : tran_clsfy is "+tran_clsfy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String sys_clsf = Util.checkString(req.getParameter("sys_clsf"));
String acct_mang_cd = Util.checkString(req.getParameter("acct_mang_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String tran_content = Util.checkString(req.getParameter("tran_content"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String tran_clsfy = Util.checkString(req.getParameter("tran_clsfy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sys_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sys_clsf")));
String acct_mang_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_mang_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String tran_content = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_content")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String tran_clsfy = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_clsfy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSys_clsf(sys_clsf);
dm.setAcct_mang_cd(acct_mang_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setTran_content(tran_content);
dm.setTran_amt(tran_amt);
dm.setTran_clsfy(tran_clsfy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 22 16:40:56 KST 2011 */