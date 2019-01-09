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


public class FC_FUNC_2014_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String seci_no;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String yugaint2;
	public String intamt;
	public String yugagbcd;
	public String shcymd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_2014_DDM(){}
	public FC_FUNC_2014_DDM(String cmpy_cd, String seci_no, String cost_gain_stot, String rcpay_amt_stot, String yugaint2, String intamt, String yugagbcd, String shcymd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.seci_no = seci_no;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.yugaint2 = yugaint2;
		this.intamt = intamt;
		this.yugagbcd = yugagbcd;
		this.shcymd = shcymd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setYugaint2(String yugaint2){
		this.yugaint2 = yugaint2;
	}

	public void setIntamt(String intamt){
		this.intamt = intamt;
	}

	public void setYugagbcd(String yugagbcd){
		this.yugagbcd = yugagbcd;
	}

	public void setShcymd(String shcymd){
		this.shcymd = shcymd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
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

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getYugaint2(){
		return this.yugaint2;
	}

	public String getIntamt(){
		return this.intamt;
	}

	public String getYugagbcd(){
		return this.yugagbcd;
	}

	public String getShcymd(){
		return this.shcymd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_2014_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_2014_DDM dm = (FC_FUNC_2014_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.seci_no);
		cstmt.setString(5, dm.cost_gain_stot);
		cstmt.setString(6, dm.rcpay_amt_stot);
		cstmt.setString(7, dm.yugaint2);
		cstmt.setString(8, dm.intamt);
		cstmt.setString(9, dm.yugagbcd);
		cstmt.setString(10, dm.shcymd);
		cstmt.setString(11, dm.slip_occr_dt);
		cstmt.setString(12, dm.slip_clsf_cd);
		cstmt.setString(13, dm.slip_seq);
		cstmt.setString(14, dm.incmg_pers);
		cstmt.setString(15, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_2014_DDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("seci_no = " + getSeci_no());
        System.out.println("cost_gain_stot = " + getCost_gain_stot());
        System.out.println("rcpay_amt_stot = " + getRcpay_amt_stot());
        System.out.println("yugaint2 = " + getYugaint2());
        System.out.println("intamt = " + getIntamt());
        System.out.println("yugagbcd = " + getYugagbcd());
        System.out.println("shcymd = " + getShcymd());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_seq = " + getSlip_seq());
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
String seci_no = req.getParameter("seci_no");
if( seci_no == null){
	System.out.println(this.toString+" : seci_no is null" );
}else{
	System.out.println(this.toString+" : seci_no is "+seci_no );
}
String cost_gain_stot = req.getParameter("cost_gain_stot");
if( cost_gain_stot == null){
	System.out.println(this.toString+" : cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : cost_gain_stot is "+cost_gain_stot );
}
String rcpay_amt_stot = req.getParameter("rcpay_amt_stot");
if( rcpay_amt_stot == null){
	System.out.println(this.toString+" : rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt_stot is "+rcpay_amt_stot );
}
String yugaint2 = req.getParameter("yugaint2");
if( yugaint2 == null){
	System.out.println(this.toString+" : yugaint2 is null" );
}else{
	System.out.println(this.toString+" : yugaint2 is "+yugaint2 );
}
String intamt = req.getParameter("intamt");
if( intamt == null){
	System.out.println(this.toString+" : intamt is null" );
}else{
	System.out.println(this.toString+" : intamt is "+intamt );
}
String yugagbcd = req.getParameter("yugagbcd");
if( yugagbcd == null){
	System.out.println(this.toString+" : yugagbcd is null" );
}else{
	System.out.println(this.toString+" : yugagbcd is "+yugagbcd );
}
String shcymd = req.getParameter("shcymd");
if( shcymd == null){
	System.out.println(this.toString+" : shcymd is null" );
}else{
	System.out.println(this.toString+" : shcymd is "+shcymd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
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
String seci_no = Util.checkString(req.getParameter("seci_no"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String yugaint2 = Util.checkString(req.getParameter("yugaint2"));
String intamt = Util.checkString(req.getParameter("intamt"));
String yugagbcd = Util.checkString(req.getParameter("yugagbcd"));
String shcymd = Util.checkString(req.getParameter("shcymd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String seci_no = Util.Uni2Ksc(Util.checkString(req.getParameter("seci_no")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String yugaint2 = Util.Uni2Ksc(Util.checkString(req.getParameter("yugaint2")));
String intamt = Util.Uni2Ksc(Util.checkString(req.getParameter("intamt")));
String yugagbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("yugagbcd")));
String shcymd = Util.Uni2Ksc(Util.checkString(req.getParameter("shcymd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSeci_no(seci_no);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setYugaint2(yugaint2);
dm.setIntamt(intamt);
dm.setYugagbcd(yugagbcd);
dm.setShcymd(shcymd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 16:02:10 KST 2009 */