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


public class FC_ACCT_5303_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String slip_clsf_cd;
	public String slip_dtls_clas;
	public String clos_mm;
	public String bgn_dt;
	public String end_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_5303_ADM(){}
	public FC_ACCT_5303_ADM(String cmpy_cd, String mode, String slip_clsf_cd, String slip_dtls_clas, String clos_mm, String bgn_dt, String end_dt, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_dtls_clas = slip_dtls_clas;
		this.clos_mm = clos_mm;
		this.bgn_dt = bgn_dt;
		this.end_dt = end_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_dtls_clas(String slip_dtls_clas){
		this.slip_dtls_clas = slip_dtls_clas;
	}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
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

	public String getMode(){
		return this.mode;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_dtls_clas(){
		return this.slip_dtls_clas;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5303_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5303_ADM dm = (FC_ACCT_5303_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_dtls_clas);
		cstmt.setString(7, dm.clos_mm);
		cstmt.setString(8, dm.bgn_dt);
		cstmt.setString(9, dm.end_dt);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5303_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_dtls_clas = " + getSlip_dtls_clas());
        System.out.println("clos_mm = " + getClos_mm());
        System.out.println("bgn_dt = " + getBgn_dt());
        System.out.println("end_dt = " + getEnd_dt());
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
String slip_dtls_clas = req.getParameter("slip_dtls_clas");
if( slip_dtls_clas == null){
	System.out.println(this.toString+" : slip_dtls_clas is null" );
}else{
	System.out.println(this.toString+" : slip_dtls_clas is "+slip_dtls_clas );
}
String clos_mm = req.getParameter("clos_mm");
if( clos_mm == null){
	System.out.println(this.toString+" : clos_mm is null" );
}else{
	System.out.println(this.toString+" : clos_mm is "+clos_mm );
}
String bgn_dt = req.getParameter("bgn_dt");
if( bgn_dt == null){
	System.out.println(this.toString+" : bgn_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_dt is "+bgn_dt );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
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
String mode = Util.checkString(req.getParameter("mode"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_dtls_clas = Util.checkString(req.getParameter("slip_dtls_clas"));
String clos_mm = Util.checkString(req.getParameter("clos_mm"));
String bgn_dt = Util.checkString(req.getParameter("bgn_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_dtls_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_dtls_clas")));
String clos_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_mm")));
String bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_dtls_clas(slip_dtls_clas);
dm.setClos_mm(clos_mm);
dm.setBgn_dt(bgn_dt);
dm.setEnd_dt(end_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 13 10:41:02 KST 2009 */