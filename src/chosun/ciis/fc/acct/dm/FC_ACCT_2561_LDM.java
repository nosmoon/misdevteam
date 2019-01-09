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


public class FC_ACCT_2561_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_clsf_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;
	public String evnt_cd;
	public String vat_flag;

	public FC_ACCT_2561_LDM(){}
	public FC_ACCT_2561_LDM(String cmpy_cd, String evnt_clsf_cd, String from_fisc_dt, String to_fisc_dt, String evnt_cd, String vat_flag){
		this.cmpy_cd = cmpy_cd;
		this.evnt_clsf_cd = evnt_clsf_cd;
		this.from_fisc_dt = from_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.evnt_cd = evnt_cd;
		this.vat_flag = vat_flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_clsf_cd(String evnt_clsf_cd){
		this.evnt_clsf_cd = evnt_clsf_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setVat_flag(String vat_flag){
		this.vat_flag = vat_flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_clsf_cd(){
		return this.evnt_clsf_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getVat_flag(){
		return this.vat_flag;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2561_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2561_LDM dm = (FC_ACCT_2561_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_clsf_cd);
		cstmt.setString(5, dm.from_fisc_dt);
		cstmt.setString(6, dm.to_fisc_dt);
		cstmt.setString(7, dm.evnt_cd);
		cstmt.setString(8, dm.vat_flag);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2561_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_clsf_cd = [" + getEvnt_clsf_cd() + "]");
		System.out.println("from_fisc_dt = [" + getFrom_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("vat_flag = [" + getVat_flag() + "]");
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
String evnt_clsf_cd = req.getParameter("evnt_clsf_cd");
if( evnt_clsf_cd == null){
	System.out.println(this.toString+" : evnt_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_clsf_cd is "+evnt_clsf_cd );
}
String from_fisc_dt = req.getParameter("from_fisc_dt");
if( from_fisc_dt == null){
	System.out.println(this.toString+" : from_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : from_fisc_dt is "+from_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String vat_flag = req.getParameter("vat_flag");
if( vat_flag == null){
	System.out.println(this.toString+" : vat_flag is null" );
}else{
	System.out.println(this.toString+" : vat_flag is "+vat_flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_clsf_cd = Util.checkString(req.getParameter("evnt_clsf_cd"));
String from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String vat_flag = Util.checkString(req.getParameter("vat_flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_clsf_cd")));
String from_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String vat_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_clsf_cd(evnt_clsf_cd);
dm.setFrom_fisc_dt(from_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setEvnt_cd(evnt_cd);
dm.setVat_flag(vat_flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 16:35:06 KST 2015 */