/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2550_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String callgb;
	public String area_cd;
	public String occr_dt;
	public String slip_clsf;
	public String seq;
	public String rcpm_dt;
	public String slip_clsf_cd;
	public String make_dt;
	public String slip_seq;
	public String mode_ar;
	public String bo_cdseq_ar;
	public String acpt_rcpm_reg_tot_amt_ar;
	public String rcpm_amt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_SAL_2550_ADM(){}
	public SE_SAL_2550_ADM(String cmpy_cd, String callgb, String area_cd, String occr_dt, String slip_clsf, String seq, String rcpm_dt, String slip_clsf_cd, String make_dt, String slip_seq, String mode_ar, String bo_cdseq_ar, String acpt_rcpm_reg_tot_amt_ar, String rcpm_amt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.callgb = callgb;
		this.area_cd = area_cd;
		this.occr_dt = occr_dt;
		this.slip_clsf = slip_clsf;
		this.seq = seq;
		this.rcpm_dt = rcpm_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.make_dt = make_dt;
		this.slip_seq = slip_seq;
		this.mode_ar = mode_ar;
		this.bo_cdseq_ar = bo_cdseq_ar;
		this.acpt_rcpm_reg_tot_amt_ar = acpt_rcpm_reg_tot_amt_ar;
		this.rcpm_amt_ar = rcpm_amt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCallgb(String callgb){
		this.callgb = callgb;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setBo_cdseq_ar(String bo_cdseq_ar){
		this.bo_cdseq_ar = bo_cdseq_ar;
	}

	public void setAcpt_rcpm_reg_tot_amt_ar(String acpt_rcpm_reg_tot_amt_ar){
		this.acpt_rcpm_reg_tot_amt_ar = acpt_rcpm_reg_tot_amt_ar;
	}

	public void setRcpm_amt_ar(String rcpm_amt_ar){
		this.rcpm_amt_ar = rcpm_amt_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCallgb(){
		return this.callgb;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getBo_cdseq_ar(){
		return this.bo_cdseq_ar;
	}

	public String getAcpt_rcpm_reg_tot_amt_ar(){
		return this.acpt_rcpm_reg_tot_amt_ar;
	}

	public String getRcpm_amt_ar(){
		return this.rcpm_amt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_2550_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_2550_ADM dm = (SE_SAL_2550_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.callgb);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.slip_clsf);
		cstmt.setString(8, dm.seq);
		cstmt.setString(9, dm.rcpm_dt);
		cstmt.setString(10, dm.slip_clsf_cd);
		cstmt.setString(11, dm.make_dt);
		cstmt.setString(12, dm.slip_seq);
		cstmt.setString(13, dm.mode_ar);
		cstmt.setString(14, dm.bo_cdseq_ar);
		cstmt.setString(15, dm.acpt_rcpm_reg_tot_amt_ar);
		cstmt.setString(16, dm.rcpm_amt_ar);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_2550_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("callgb = " + getCallgb());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("slip_clsf = " + getSlip_clsf());
        System.out.println("seq = " + getSeq());
        System.out.println("rcpm_dt = " + getRcpm_dt());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("make_dt = " + getMake_dt());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("bo_cdseq_ar = " + getBo_cdseq_ar());
        System.out.println("acpt_rcpm_reg_tot_amt_ar = " + getAcpt_rcpm_reg_tot_amt_ar());
        System.out.println("rcpm_amt_ar = " + getRcpm_amt_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String callgb = req.getParameter("callgb");
if( callgb == null){
	System.out.println(this.toString+" : callgb is null" );
}else{
	System.out.println(this.toString+" : callgb is "+callgb );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String slip_clsf = req.getParameter("slip_clsf");
if( slip_clsf == null){
	System.out.println(this.toString+" : slip_clsf is null" );
}else{
	System.out.println(this.toString+" : slip_clsf is "+slip_clsf );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String bo_cdseq_ar = req.getParameter("bo_cdseq_ar");
if( bo_cdseq_ar == null){
	System.out.println(this.toString+" : bo_cdseq_ar is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq_ar is "+bo_cdseq_ar );
}
String acpt_rcpm_reg_tot_amt_ar = req.getParameter("acpt_rcpm_reg_tot_amt_ar");
if( acpt_rcpm_reg_tot_amt_ar == null){
	System.out.println(this.toString+" : acpt_rcpm_reg_tot_amt_ar is null" );
}else{
	System.out.println(this.toString+" : acpt_rcpm_reg_tot_amt_ar is "+acpt_rcpm_reg_tot_amt_ar );
}
String rcpm_amt_ar = req.getParameter("rcpm_amt_ar");
if( rcpm_amt_ar == null){
	System.out.println(this.toString+" : rcpm_amt_ar is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt_ar is "+rcpm_amt_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String callgb = Util.checkString(req.getParameter("callgb"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String slip_clsf = Util.checkString(req.getParameter("slip_clsf"));
String seq = Util.checkString(req.getParameter("seq"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String bo_cdseq_ar = Util.checkString(req.getParameter("bo_cdseq_ar"));
String acpt_rcpm_reg_tot_amt_ar = Util.checkString(req.getParameter("acpt_rcpm_reg_tot_amt_ar"));
String rcpm_amt_ar = Util.checkString(req.getParameter("rcpm_amt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String callgb = Util.Uni2Ksc(Util.checkString(req.getParameter("callgb")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String bo_cdseq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq_ar")));
String acpt_rcpm_reg_tot_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("acpt_rcpm_reg_tot_amt_ar")));
String rcpm_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setCallgb(callgb);
dm.setArea_cd(area_cd);
dm.setOccr_dt(occr_dt);
dm.setSlip_clsf(slip_clsf);
dm.setSeq(seq);
dm.setRcpm_dt(rcpm_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setMake_dt(make_dt);
dm.setSlip_seq(slip_seq);
dm.setMode_ar(mode_ar);
dm.setBo_cdseq_ar(bo_cdseq_ar);
dm.setAcpt_rcpm_reg_tot_amt_ar(acpt_rcpm_reg_tot_amt_ar);
dm.setRcpm_amt_ar(rcpm_amt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jul 21 11:55:59 KST 2009 */