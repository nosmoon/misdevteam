

package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_4000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_yymm;
	public String flnm;
	public String prn;

	public HD_DDEMP_4000_LDM(){}
	public HD_DDEMP_4000_LDM(String cmpy_cd, String duty_yymm, String flnm, String prn){
		this.cmpy_cd = cmpy_cd;
		this.duty_yymm = duty_yymm;
		this.flnm = flnm;
		this.prn = prn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_yymm(String duty_yymm){
		this.duty_yymm = duty_yymm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_yymm(){
		return this.duty_yymm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_4000_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_4000_LDM dm = (HD_DDEMP_4000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.duty_yymm);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.prn);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_DDEMP_4000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("duty_yymm = [" + getDuty_yymm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
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
String duty_yymm = req.getParameter("duty_yymm");
if( duty_yymm == null){
	System.out.println(this.toString+" : duty_yymm is null" );
}else{
	System.out.println(this.toString+" : duty_yymm is "+duty_yymm );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String duty_yymm = Util.checkString(req.getParameter("duty_yymm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String prn = Util.checkString(req.getParameter("prn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String duty_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_yymm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDuty_yymm(duty_yymm);
dm.setFlnm(flnm);
dm.setPrn(prn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 29 11:24:06 KST 2010 */