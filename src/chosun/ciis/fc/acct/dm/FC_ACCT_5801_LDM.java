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


public class FC_ACCT_5801_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd_fr;
	public String acct_cd_to;
	public String incmg_dt;
	public String kind;

	public FC_ACCT_5801_LDM(){}
	public FC_ACCT_5801_LDM(String cmpy_cd, String acct_cd_fr, String acct_cd_to, String incmg_dt, String kind){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd_fr = acct_cd_fr;
		this.acct_cd_to = acct_cd_to;
		this.incmg_dt = incmg_dt;
		this.kind = kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd_fr(String acct_cd_fr){
		this.acct_cd_fr = acct_cd_fr;
	}

	public void setAcct_cd_to(String acct_cd_to){
		this.acct_cd_to = acct_cd_to;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setKind(String kind){
		this.kind = kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd_fr(){
		return this.acct_cd_fr;
	}

	public String getAcct_cd_to(){
		return this.acct_cd_to;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getKind(){
		return this.kind;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5801_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5801_LDM dm = (FC_ACCT_5801_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd_fr);
		cstmt.setString(5, dm.acct_cd_to);
		cstmt.setString(6, dm.incmg_dt);
		cstmt.setString(7, dm.kind);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5801_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("acct_cd_fr = " + getAcct_cd_fr());
        System.out.println("acct_cd_to = " + getAcct_cd_to());
        System.out.println("incmg_dt = " + getIncmg_dt());
        System.out.println("kind = " + getKind());
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
String acct_cd_fr = req.getParameter("acct_cd_fr");
if( acct_cd_fr == null){
	System.out.println(this.toString+" : acct_cd_fr is null" );
}else{
	System.out.println(this.toString+" : acct_cd_fr is "+acct_cd_fr );
}
String acct_cd_to = req.getParameter("acct_cd_to");
if( acct_cd_to == null){
	System.out.println(this.toString+" : acct_cd_to is null" );
}else{
	System.out.println(this.toString+" : acct_cd_to is "+acct_cd_to );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String kind = req.getParameter("kind");
if( kind == null){
	System.out.println(this.toString+" : kind is null" );
}else{
	System.out.println(this.toString+" : kind is "+kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd_fr = Util.checkString(req.getParameter("acct_cd_fr"));
String acct_cd_to = Util.checkString(req.getParameter("acct_cd_to"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String kind = Util.checkString(req.getParameter("kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_fr")));
String acct_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd_to")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String kind = Util.Uni2Ksc(Util.checkString(req.getParameter("kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd_fr(acct_cd_fr);
dm.setAcct_cd_to(acct_cd_to);
dm.setIncmg_dt(incmg_dt);
dm.setKind(kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 10 20:37:48 KST 2009 */