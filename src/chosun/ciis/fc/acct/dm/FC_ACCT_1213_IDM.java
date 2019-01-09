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


public class FC_ACCT_1213_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String mode;
	public String slip_clsf_cd;
	public String dr;
	public String cr;

	public FC_ACCT_1213_IDM(){}
	public FC_ACCT_1213_IDM(String cmpy_cd, String incmg_pers, String incmg_pers_ipadd, String mode, String slip_clsf_cd, String dr, String cr){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.mode = mode;
		this.slip_clsf_cd = slip_clsf_cd;
		this.dr = dr;
		this.cr = cr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setDr(String dr){
		this.dr = dr;
	}

	public void setCr(String cr){
		this.cr = cr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getDr(){
		return this.dr;
	}

	public String getCr(){
		return this.cr;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1213_I(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1213_IDM dm = (FC_ACCT_1213_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.slip_clsf_cd);
		cstmt.setString(8, dm.dr);
		cstmt.setString(9, dm.cr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1213_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("mode = " + getMode());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("dr = " + getDr());
        System.out.println("cr = " + getCr());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String dr = req.getParameter("dr");
if( dr == null){
	System.out.println(this.toString+" : dr is null" );
}else{
	System.out.println(this.toString+" : dr is "+dr );
}
String cr = req.getParameter("cr");
if( cr == null){
	System.out.println(this.toString+" : cr is null" );
}else{
	System.out.println(this.toString+" : cr is "+cr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String mode = Util.checkString(req.getParameter("mode"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String dr = Util.checkString(req.getParameter("dr"));
String cr = Util.checkString(req.getParameter("cr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String dr = Util.Uni2Ksc(Util.checkString(req.getParameter("dr")));
String cr = Util.Uni2Ksc(Util.checkString(req.getParameter("cr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setMode(mode);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setDr(dr);
dm.setCr(cr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 02 16:49:19 KST 2009 */