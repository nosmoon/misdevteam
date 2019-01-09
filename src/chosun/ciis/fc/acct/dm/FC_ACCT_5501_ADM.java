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


public class FC_ACCT_5501_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_fryy;
	public String fisc_tomm;
	public String pch_x;
	public String pch_x2;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_5501_ADM(){}
	public FC_ACCT_5501_ADM(String cmpy_cd, String fisc_fryy, String fisc_tomm, String pch_x, String pch_x2, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_fryy = fisc_fryy;
		this.fisc_tomm = fisc_tomm;
		this.pch_x = pch_x;
		this.pch_x2 = pch_x2;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_fryy(String fisc_fryy){
		this.fisc_fryy = fisc_fryy;
	}

	public void setFisc_tomm(String fisc_tomm){
		this.fisc_tomm = fisc_tomm;
	}

	public void setPch_x(String pch_x){
		this.pch_x = pch_x;
	}

	public void setPch_x2(String pch_x2){
		this.pch_x2 = pch_x2;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_fryy(){
		return this.fisc_fryy;
	}

	public String getFisc_tomm(){
		return this.fisc_tomm;
	}

	public String getPch_x(){
		return this.pch_x;
	}

	public String getPch_x2(){
		return this.pch_x2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5501_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5501_ADM dm = (FC_ACCT_5501_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_fryy);
		cstmt.setString(5, dm.fisc_tomm);
		cstmt.setString(6, dm.pch_x);
		cstmt.setString(7, dm.pch_x2);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5501_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fisc_fryy = " + getFisc_fryy());
        System.out.println("fisc_tomm = " + getFisc_tomm());
        System.out.println("pch_x = " + getPch_x());
        System.out.println("pch_x2 = " + getPch_x2());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
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
String fisc_fryy = req.getParameter("fisc_fryy");
if( fisc_fryy == null){
	System.out.println(this.toString+" : fisc_fryy is null" );
}else{
	System.out.println(this.toString+" : fisc_fryy is "+fisc_fryy );
}
String fisc_tomm = req.getParameter("fisc_tomm");
if( fisc_tomm == null){
	System.out.println(this.toString+" : fisc_tomm is null" );
}else{
	System.out.println(this.toString+" : fisc_tomm is "+fisc_tomm );
}
String pch_x = req.getParameter("pch_x");
if( pch_x == null){
	System.out.println(this.toString+" : pch_x is null" );
}else{
	System.out.println(this.toString+" : pch_x is "+pch_x );
}
String pch_x2 = req.getParameter("pch_x2");
if( pch_x2 == null){
	System.out.println(this.toString+" : pch_x2 is null" );
}else{
	System.out.println(this.toString+" : pch_x2 is "+pch_x2 );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_fryy = Util.checkString(req.getParameter("fisc_fryy"));
String fisc_tomm = Util.checkString(req.getParameter("fisc_tomm"));
String pch_x = Util.checkString(req.getParameter("pch_x"));
String pch_x2 = Util.checkString(req.getParameter("pch_x2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_fryy = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_fryy")));
String fisc_tomm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_tomm")));
String pch_x = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_x")));
String pch_x2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_x2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_fryy(fisc_fryy);
dm.setFisc_tomm(fisc_tomm);
dm.setPch_x(pch_x);
dm.setPch_x2(pch_x2);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 12 13:20:31 KST 2009 */