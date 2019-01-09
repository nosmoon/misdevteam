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


public class FC_ACCT_5311_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_fisc_dt;
	public String to_fisc_dt;
	public String fr_medi_cd;
	public String to_medi_cd;
	public String fisc_mm;

	public FC_ACCT_5311_LDM(){}
	public FC_ACCT_5311_LDM(String cmpy_cd, String fr_fisc_dt, String to_fisc_dt, String fr_medi_cd, String to_medi_cd, String fisc_mm){
		this.cmpy_cd = cmpy_cd;
		this.fr_fisc_dt = fr_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.fr_medi_cd = fr_medi_cd;
		this.to_medi_cd = to_medi_cd;
		this.fisc_mm = fisc_mm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_fisc_dt(String fr_fisc_dt){
		this.fr_fisc_dt = fr_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setFr_medi_cd(String fr_medi_cd){
		this.fr_medi_cd = fr_medi_cd;
	}

	public void setTo_medi_cd(String to_medi_cd){
		this.to_medi_cd = to_medi_cd;
	}

	public void setFisc_mm(String fisc_mm){
		this.fisc_mm = fisc_mm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_fisc_dt(){
		return this.fr_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getFr_medi_cd(){
		return this.fr_medi_cd;
	}

	public String getTo_medi_cd(){
		return this.to_medi_cd;
	}

	public String getFisc_mm(){
		return this.fisc_mm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5311_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5311_LDM dm = (FC_ACCT_5311_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_fisc_dt);
		cstmt.setString(5, dm.to_fisc_dt);
		cstmt.setString(6, dm.fr_medi_cd);
		cstmt.setString(7, dm.to_medi_cd);
		cstmt.setString(8, dm.fisc_mm);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5311_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_fisc_dt = [" + getFr_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("fr_medi_cd = [" + getFr_medi_cd() + "]");
		System.out.println("to_medi_cd = [" + getTo_medi_cd() + "]");
		System.out.println("fisc_mm = [" + getFisc_mm() + "]");
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
String fr_fisc_dt = req.getParameter("fr_fisc_dt");
if( fr_fisc_dt == null){
	System.out.println(this.toString+" : fr_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fr_fisc_dt is "+fr_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
}
String fr_medi_cd = req.getParameter("fr_medi_cd");
if( fr_medi_cd == null){
	System.out.println(this.toString+" : fr_medi_cd is null" );
}else{
	System.out.println(this.toString+" : fr_medi_cd is "+fr_medi_cd );
}
String to_medi_cd = req.getParameter("to_medi_cd");
if( to_medi_cd == null){
	System.out.println(this.toString+" : to_medi_cd is null" );
}else{
	System.out.println(this.toString+" : to_medi_cd is "+to_medi_cd );
}
String fisc_mm = req.getParameter("fisc_mm");
if( fisc_mm == null){
	System.out.println(this.toString+" : fisc_mm is null" );
}else{
	System.out.println(this.toString+" : fisc_mm is "+fisc_mm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_fisc_dt = Util.checkString(req.getParameter("fr_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String fr_medi_cd = Util.checkString(req.getParameter("fr_medi_cd"));
String to_medi_cd = Util.checkString(req.getParameter("to_medi_cd"));
String fisc_mm = Util.checkString(req.getParameter("fisc_mm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String fr_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_medi_cd")));
String to_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_medi_cd")));
String fisc_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_mm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_fisc_dt(fr_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setFr_medi_cd(fr_medi_cd);
dm.setTo_medi_cd(to_medi_cd);
dm.setFisc_mm(fisc_mm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 16:15:52 KST 2009 */