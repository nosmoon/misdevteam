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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4002_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String recp_dt;
	public String bgn_no;
	public String pch_count;
	public String curacct_clsf_cd;
	public String bank_cd;
	public String chg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_4002_IDM(){}
	public FC_FUNC_4002_IDM(String cmpy_cd, String recp_dt, String bgn_no, String pch_count, String curacct_clsf_cd, String bank_cd, String chg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.recp_dt = recp_dt;
		this.bgn_no = bgn_no;
		this.pch_count = pch_count;
		this.curacct_clsf_cd = curacct_clsf_cd;
		this.bank_cd = bank_cd;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRecp_dt(String recp_dt){
		this.recp_dt = recp_dt;
	}

	public void setBgn_no(String bgn_no){
		this.bgn_no = bgn_no;
	}

	public void setPch_count(String pch_count){
		this.pch_count = pch_count;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRecp_dt(){
		return this.recp_dt;
	}

	public String getBgn_no(){
		return this.bgn_no;
	}

	public String getPch_count(){
		return this.pch_count;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4002_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4002_IDM dm = (FC_FUNC_4002_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.recp_dt);
		cstmt.setString(5, dm.bgn_no);
		cstmt.setString(6, dm.pch_count);
		cstmt.setString(7, dm.curacct_clsf_cd);
		cstmt.setString(8, dm.bank_cd);
		cstmt.setString(9, dm.chg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4002_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("recp_dt = " + getRecp_dt());
        System.out.println("bgn_no = " + getBgn_no());
        System.out.println("pch_count = " + getPch_count());
        System.out.println("curacct_clsf_cd = " + getCuracct_clsf_cd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("chg_pers = " + getChg_pers());
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
String recp_dt = req.getParameter("recp_dt");
if( recp_dt == null){
	System.out.println(this.toString+" : recp_dt is null" );
}else{
	System.out.println(this.toString+" : recp_dt is "+recp_dt );
}
String bgn_no = req.getParameter("bgn_no");
if( bgn_no == null){
	System.out.println(this.toString+" : bgn_no is null" );
}else{
	System.out.println(this.toString+" : bgn_no is "+bgn_no );
}
String pch_count = req.getParameter("pch_count");
if( pch_count == null){
	System.out.println(this.toString+" : pch_count is null" );
}else{
	System.out.println(this.toString+" : pch_count is "+pch_count );
}
String curacct_clsf_cd = req.getParameter("curacct_clsf_cd");
if( curacct_clsf_cd == null){
	System.out.println(this.toString+" : curacct_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : curacct_clsf_cd is "+curacct_clsf_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
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
String recp_dt = Util.checkString(req.getParameter("recp_dt"));
String bgn_no = Util.checkString(req.getParameter("bgn_no"));
String pch_count = Util.checkString(req.getParameter("pch_count"));
String curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String recp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_dt")));
String bgn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_no")));
String pch_count = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_count")));
String curacct_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("curacct_clsf_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRecp_dt(recp_dt);
dm.setBgn_no(bgn_no);
dm.setPch_count(pch_count);
dm.setCuracct_clsf_cd(curacct_clsf_cd);
dm.setBank_cd(bank_cd);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 12:04:41 KST 2009 */